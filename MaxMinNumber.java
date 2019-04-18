import java.util.*;
public class MaxMinNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int n1 = in.nextInt();
    System.out.println("Enter second number: ");
    int n2 = in.nextInt();
    System.out.println("Enter third number: ");
    int n3 = in.nextInt();
 
    int largest = n1;
    if (n2 > largest) {
        largest = n2;
    } 
    if (n3 > largest) {
        largest = n3;
    }
 
    System.out.println("Largest among (" + n1 + ", " + n2 + ", " + n3 + ") is: " 
                            + largest);
    int smallest = n1;
    if (n2 < smallest) {
        smallest = n2;
    } 
    if (n3 < smallest) {
        smallest = n3;
    }
    System.out.println("Smallest among (" + n1 + ", " + n2 + ", " + n3 + ") is: " 
                            + smallest);
    in.close();
  }
}