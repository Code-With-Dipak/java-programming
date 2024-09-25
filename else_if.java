// else if

import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>50)
        {
            System.out.println("you are experienced !");
        }

        else if(age>46)
        {
            System.out.println("you are semi experienced");
        }
        else if(age>36)
        {
            System.out.println("you are semi-semi experienced");
        }
        else if(age>20)
        {
            System.out.println("you are semi-semi-semi experienced");
        }
        else
        {
            System.out.println("you are not experienced !!!");
            // Enter your age
            //19
            //you are not experienced !!!

        }

    }
}
