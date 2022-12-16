import java.util.*;

public class CustomerBalance {
   public static void main(String[] args) {
   
   int balance = 0;
   int grantValue = 0;
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter your current balance: ");
   balance = scan.nextInt();
   
   System.out.println("Did you get get a grant approval(Y/N): ");
   String ans = scan.next();
   if(ans.equals("Y") || ans.equals("y")){
   System.out.println("Enter your grant value: ");
   grantValue = scan.nextInt();
   int newBalance = balance +grantValue;
   System.out.println("Your previous balance was: "+ balance+ ", your new balance is: "+newBalance);
   }
   else if(ans.equals("N") || ans.equals("n")){
   System.out.println("Im sorry to hear that");
   }
   else{
      System.out.println("Invalid option");
      }}
   }
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privac