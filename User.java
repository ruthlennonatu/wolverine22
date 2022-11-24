
public class User {

    int userId = 0;
    String firstName = ""; 
    String lastName = "";
    boolean userIsActive = true;
    int emailId = 0;
    String emailAddress = "";
    int phoneId = 0;
    String phoneNumber = "";

    // default constructor
    public User(){

    }

    // overload constructor
    public User(int userId, String firstName, String lastName,
                    boolean userIsActive, int emailId, String emailAddress, 
                    int phoneId, String phoneNumber){
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userIsActive = userIsActive;
        this.emailId = emailId;
        this.emailAddress = emailAddress;
        this.phoneId = phoneId;
        this.phoneNumber = phoneNumber;
    }

    // ***********************************************
    // getters
    public int getuserId() {
        return userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean getUserIsActive(){
        return userIsActive;
    }
    public int getEmailId(){
        return emailId;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public int getPhoneId(){
        return phoneId;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    // **********************************************
    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setCustomerIsActive(boolean userIsActive) {
        this.userIsActive = userIsActive;
    }
    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setuserId(int userId) {
        this.userId = userId;
    }

}