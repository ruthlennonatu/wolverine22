// Add User Class to Booking system

//User.java
public class User 
{
    private String name;
    private String email;
    
    public User (String name, String email) 
    {
        this.name = name;
        this.email = email;
        
    }
  
    public int getCount() 
    {
    return this.users.size();
    }
 }


