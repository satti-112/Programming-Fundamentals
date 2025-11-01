import java.util.Scanner;
public class Lab2Activitytwo {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);

            int width;
            int length;
            int area;
            int perimeter;
            System.out.print("Enter the length: ");
            length = console.nextInt();
            System.out.print("length you entered is "+length);

            System.out.print("Enter the width: ");
            width = console.nextInt();
            System.out.print("Width you entered is "+width);
            area = length * width;
            System.out.println("Area = " + area);
            perimeter = 2 * (length + width);
            System.out.println("Perimeter = " + perimeter);
            System.out.println();


        }
    }


