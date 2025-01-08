import java.util.Scanner;
public class Q7 {
public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter lenth: ");
double l=sc.nextDouble();
System.out.print("Enter width: ");
double w=sc.nextDouble();
double p= 2*(l+w);
System.out.print("Perimeter of a Rectangle: " +p);
}
}