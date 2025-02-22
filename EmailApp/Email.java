package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 8;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    Scanner sc = new Scanner(System.in);

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        // System.out.println("Email created for: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        // System.out.println("Department: " + this.department);

        this.password = setPassword(defaultPasswordLength);
        // System.out.println("Password is: " + this.password);

        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + "." + "xyz.com";
        // System.out.println("Your Email: " + this.email);
    }

    //ask for the department
    private String setDepartment(){
        System.out.println("Choose your department: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none : ");
        int departmentcode = sc.nextInt();
        if(departmentcode == 1){return "sales";}
        else if(departmentcode == 2){return "dev";}
        else if(departmentcode == 3){return "Accounts";}
        else{return "";}
    }

    //generate a password
    private String setPassword(int length){
        String randomPass = "j7v$sNeF#l8A2gB1zy*0tCqPnk6mJ9hQXU@a5DkW3IuYrZfLwoTcVbR";
        char[] pass = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int) (Math.random() * randomPass.length());
            pass[i] = randomPass.charAt(random);
        }
        return new String(pass);
    }

    //to print the current mailbox capacity
    public void mailBoxCapacity(){
        System.out.println(this.mailBoxCapacity);
    }
    
    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void alternateEmail(){
        System.out.println(this.alternateEmail);
    }

    //set an alternate email
    public void setAlternateEmail(String alternate){
        this.alternateEmail = alternate;
    }

    public void getPass(){
        System.out.println(this.password);
    }
    //change the password
    public void changePass(String newpass){
        this.password = newpass;
    }

    public String showInfo(){
        return "Name: " + this.firstName + " " + this.lastName +
        "\nDepartment: " + this.department +
        "\nCompany Email: " + this.email +
        "\nPassword: " + this.password +
        "\nMailbox Capacity: " + this.mailBoxCapacity;
    }
}