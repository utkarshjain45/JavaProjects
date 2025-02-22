package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your first Name: ");
        String first = sc.next();
        System.out.println("Enter Your Last Name: ");
        String last = sc.next();
        
        Email employee1 = new Email(first, last);
        System.out.println(employee1.showInfo());

        sc.close();
    }
}
