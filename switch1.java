//switch
   /* switch (var){
    case 1:
        code
        break;

     case 2:
        code
        break;

        } */


import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age");
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();

        switch(age) {
            case 11:
                System.out.println("age is 11");
                break;
            case 22:
                System.out.println("age is 22");
                break;
            case 33:
                System.out.println("age is 33");
                break;
            default:
                System.out.println("this is not age in between case");
                /*
                Enter your age
                50
                this is not age in between case
                 */

        }



    }
}
