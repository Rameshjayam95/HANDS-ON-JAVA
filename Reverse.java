import java.util.Scanner;
class Reverse
{
     public static void main(String args[])
     {
     String str;
     Scanner scannerObj=new Scanner(System.in);
     System.out.println("Enter the charater");
     str=scannerObj.next();
     String str2="";
     for(int i=str.length()-1;i>=0;i--)
     {
     str2=str2+str.charAt(i);
     }
     System.out.println(str2);
     }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      