import java.util.Scanner;
public class Lab2Taksk2 {
    // The programme lines were not arranged in sequence  task was to arrange them in sequence.
    //concept of ipo (input ,processing and output)
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int length;
        System.out.println("Enter the length =");
        length= sc.nextInt();
        int width;
        System.out.println("Enter the Width=");
        width=sc.nextInt();
        int area= length * width ;
        int perimeter= 2 * ( length * width ) ;
        System.out.println("The area is ="+  area );
        System.out.println("The perimeter is ="+ perimeter);


    }
}