@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) 
{
  super.onActivityResult(requestCode, resultCode, data);
  Log.v(TAG, "onActivityResult(" + requestCode + ", " + resultCode + ", " + data + ")");
  String outStr = new String();
  Bitmap cardTypeImage = null;
  
  if ((requestCode == REQUEST_SCAN || requestCode == REQUEST_AUTOTEST) && data != null
      && data.hasExtra(CardIOActivity.EXTRA_SCAN_RESULT)) 
      {
    CreditCard result = data.getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
    if (result != null) 
    {
      outStr += "Card number: " + result.getRedactedCardNumber() + "\n";
      CardType cardType = result.getCardType();
      cardTypeImage = cardType.imageBitmap(this);
      outStr += "Card type: " + cardType.name() + " cardType.getDisplayName(null)=" + cardType.getDisplayName(null) + "\n";
      if (mEnableExpiryToggle.isChecked()) 
      {
        outStr += "Expiry: " + result.expiryMonth + "/" + result.expiryYear + "\n";
      }
      if (mCvvToggle.isChecked()) 
      {
        outStr += "CVV: " + result.cvv + "\n";
      }
      if (mPostalCodeToggle.isChecked()) {
        outStr += "Postal Code: " + result.postalCode + "\n";
      }
      if (mCardholderNameToggle.isChecked()) 
      {
        outStr += "Cardholder Name: " + result.cardholderName + "\n";
      }
    }
    if (autotestMode) 
    {
      numAutotestsPassed++;
      new Handler().postDelayed(new Runnable() 
      {
        @Override
        public void run() 
        {
          onAutotest(null);
        }
      }, 500);
    }
  } else if (resultCode == Activity.RESULT_CANCELED) 
  {
    autotestMode = false;
  }
  Bitmap card = CardIOActivity.getCapturedCardImage(data);
  mResultImage.setImageBitmap(card);
  mResultCardTypeImage.setImageBitmap(cardTypeImage);
  Log.i(TAG, "Set result: " + outStr);
  mResultLabel.setText(outStr);
}