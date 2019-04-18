import java.util.*;
class bigno
{
    public static void main(String arg[]){
    int num1,num2,num3;
    Scanner obj = new Scanner(System.in);
    num1 = obj.nextInt();
    num2 = obj.nextInt();
    num3 = obj.nextInt();
    int biggest = num1;
    if(num2>num1)
    {
     biggest = num2;
    }
    if(num3>num2)
    {
     biggest = num3;
    }
System.out.println(+biggest);
} 
}