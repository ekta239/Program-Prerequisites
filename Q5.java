import java.util.Scanner;
public class Q5 {
public static void main(String[]args) {
Scanner sc= new Scanner (System.in);
System.out.print("Enter radius: ");
double r=sc.nextDouble();
System.out.print("Enter height: ");
double h=sc.nextDouble();
double v=3.14*r*r*h;
System.out.print("Volume of a Cylinder: " + v);
}
}

