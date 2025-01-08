import java.util.Scanner;
public class Q3 {
public static void main(String[]args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter temperature: ");
float t=sc.nextFloat();
System.out.println("Fahrenheit: " + (t*9/5)+32);
}
}