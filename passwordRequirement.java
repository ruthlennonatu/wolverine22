//imports java library
import java.io.*;
import java.util.*;
import java.util.regex.*;
  
public class passwordRequirement {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        //password requirments to be checked
        String specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        String digit = "0123456789";
        String upperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String lwrCase = "qwertyuiopasdfghjklzxcvbnm";


        
        //user enters password
        System.out.println("Enter a password: ");
        String usrPswrd = scanner.nextLine();
        System.out.println("Password is: "+ usrPswrd);
        
       

         //lowercasecheck
         String pwrdchar[]=usrPswrd.split("");
         for (int i=0;i<pwrdchar.length;i++)
          {
          if (lwrCase.contains(pwrdchar[i]))
          {
              System.out.println("contains lowercase character");
              
              break;
          }
          else
              System.out.println("doesnt contain lowercase character");
              break;
          }
          
          //uppercasecheck
          
          for (int l=0;l<pwrdchar.length;l++)
          {
          if (upperCase.contains(pwrdchar[l]))
          {
              System.out.println("contains uppercase character");
              
              break;
          }
          else
              System.out.println("doesnt contain uppercase character");
              break;
          }
          
          //special character check
         
         for (int x=0;x<pwrdchar.length;x++)
          {
          if (specialCharacters.contains(pwrdchar[x]))
          {
              System.out.println("contains special character");
              
              break;
          }
          else
              System.out.println("doesnt contain special character");
              break;
          }
          
          //number check
      
         for (int y=0;y<pwrdchar.length;y++)
          {
          if (digit.contains(pwrdchar[y]))
          {
              System.out.println("contains numerical character");
              break;
              
          }
          else
              System.out.println("doesnt contain numerical character");
              break;
          }

      
}}