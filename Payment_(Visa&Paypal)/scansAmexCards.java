@Test(timeout = 30000)
public void scansAmexCards() 
{
  CardScannerTester.setCardAsset("amex.png");
  startScan();
  waitForActivityToFinish();
  CreditCard result = getActivityResultIntent().getParcelableExtra(CardIOActivity.EXTRA_SCAN_RESULT);
  assertEquals("3743 260055 74998", result.getFormattedCardNumber());
}