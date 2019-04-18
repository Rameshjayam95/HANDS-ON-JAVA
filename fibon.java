class fibon
{
     public static void main(String args[])
     {
     int num1,num2;
     for(num1=1;num1<=52;num1=num2)
     {
     for(num2=num1+num1;num2<=52;num2=num1+num2)
     System.out.println("Values:" +num2);
     }
     }
}
