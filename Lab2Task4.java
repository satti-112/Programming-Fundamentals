//it is given in program statament to import Scanner class
import java.util.Scanner;
public class Lab2Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);//given in program to add Scanner object console
        final int SECRET = 11 ;//constant, final is added because it varible name style shows it is constant(all leters are capatil)
        double RATE = 12.50 ;
        int num1, num2 , newNum ;// declaring three variables
        String name ;//declaring string varible ,stirng has non-premitive datatype
        double hoursWorked , wages ;
        System.out.println( " Enter ist integer " ) ;
        num1= console.nextInt() ;
        System.out.println( " enter 2nd integer " ) ;
        num2= console.nextInt();
        System.out.println( " The value of num1 = "+ num1 +" and The value of num2 = "+ num2 );
        newNum= (num1 * 2) + num2 ;
        System.out.println( " Value of newNum " + newNum ) ;
        newNum=+SECRET;

        System.out.println( " New value of newNum is = " +  newNum ) ;
        System.out.println( " Enter the last name of person = " );
        name = console.next();//for just taking single token beacuse we just want to take name

        System.out.println( " Enter a decimal number between 0 and 70 " ) ;
        hoursWorked=console.nextDouble();
        wages= RATE *hoursWorked;
        System.out.println("Name :" + name );
        System.out.println("Pay rate : $" + RATE );
    }
}
