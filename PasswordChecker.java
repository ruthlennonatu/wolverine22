//imports java library
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PasswordChecker {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //password requirments to be checked
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String digit = "0123456789";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lwrCase = "qwertyuiopasdfghjklzxcvbnm";
        
        //Conditions to be met
         Boolean safe = false;
         Boolean uc = false;
         Boolean lc = false;
         Boolean sc = false;
         Boolean nc = false;
         Boolean length = false;
     while(safe == false)
     {   
        //user enters password
        System.out.println("Enter a password: ");
        String usrPswrd = scanner.nextLine();
        System.out.println("Password is: "+ usrPswrd);
        
        //lengthcheck
         String pwrdchar[]=usrPswrd.split("");
         for (int i=0;i<pwrdchar.length;i++)
          {
          if (i>8)
          {
             // System.out.println("contains over 8 characters");
              
              length = true;
          }}

        
        //lowercasecheck

         for (int i=0;i<pwrdchar.length;i++)
          {
          if (lwrCase.contains(pwrdchar[i]))
          {
              //System.out.println("contains lowercase character");
              
              lc = true;
          }}
          
          
          //uppercasecheck
          
          for (int l=0;l<pwrdchar.length;l++)
          {
          if (upperCase.contains(pwrdchar[l]))
          {
              //System.out.println("contains uppercase character");
              
              uc = true;
          }}
          
         //special character check
         
         for (int x=0;x<pwrdchar.length;x++)
          {
          if (specialCharacters.contains(pwrdchar[x]))
          {
              //System.out.println("contains special character");
              
              sc = true;
          }}
         
          
          //number check
      
         for (int y=0;y<pwrdchar.length;y++)
          {
          if (digit.contains(pwrdchar[y]))
          {
              //System.out.println("contains numerical character");
              nc = true;
              
          }}

         //Checks all conditions are met
         if (lc && nc && uc && sc && length){
            System.out.println("Password Is SECURE");
            safe = true;
         }
         else{
            System.out.println("Password Is UNSECURE.");
            System.out.println("Please use a password with a minimum length of 8 character that contains upper, lower, numerical and special characters");
         }
     
     }

   }
}
