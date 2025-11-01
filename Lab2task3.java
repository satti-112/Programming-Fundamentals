import java.util.Scanner;

public class Lab2task3 {
    /*TO get output like told in statements ,first we took all inputs from user and then arrange the inputs and print them in sequence to get the same output pattern
    and we run it twice to on givendata*/
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int num1 ;
            System.out.println("Enter num1 =" );
            num1= input.nextInt();
            int num2;
            System.out.println("Enter num2 =" );
            num2=input.nextInt();

            double hoursWorked ;
            System.out.println("Enter the hours worked = ");
            hoursWorked = input.nextDouble();
            input.nextLine();

            String name ;
            System.out.println("enter name of person = ");
            name=input.next();
//it will get out put as given in question num1 = 13,num2 = 28 ;name ="Mustafa"; hoursWorked =48.30
//used escape sequence to make name in qoutation marks
            System.out.println("num1 = "+ num1 +" ,num2 = "+ num2  +"; name =\" "+ name + " \"; hoursWorked ="+ hoursWorked);



        }
    }


