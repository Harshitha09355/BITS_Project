import java.util.Scanner;
public class Number{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(a% 3 == 0 && a % 5 == 0) {
            System.out.println("zoom");
        }
        else if(a % 5 == 0){
       System.out.println("zap");
        }
        else if(a % 3 == 0){
       System.out.println("zip");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
    }
}