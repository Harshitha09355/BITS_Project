import java.util.Scanner;
public class NaturalNum{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n =sc.nextInt();
        System.out.println("First "+ n +"Natural numbers are :");
        for(int i = 1 ;i<=n;i++){
            System.out.println(i + " ");

        }
    }
}