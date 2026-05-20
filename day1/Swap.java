import java.util.Scanner;
class Swap
{
    public static void main(String[] args){
     int a = 10;
     int b = 15;
     System.out.println("Before  swapping: a = " + a + ",b = "+ b);
     //using temporary var
     int temp = a;
     a=b;
     b=temp;
     System.out.println("After swapping: a = " + a + ",b = "+ b);
     //without temporary var
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swapping without temporary var: a = " + a + ",b = "+ b);
     
    }
    }

