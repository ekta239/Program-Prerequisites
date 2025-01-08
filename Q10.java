import java.util.Scanner;
public class Q10{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter kilometers: ");
double k=sc.nextDouble();
double m=k*0.621371;
System.out.println("kilometers to Miles: " + m);
}
}