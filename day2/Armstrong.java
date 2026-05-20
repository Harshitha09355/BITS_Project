import java.util.Scanner;

public class Armstrong {
    public static boolean solution(int num) {
        //get count
        int temp = num;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        //calculate sumof all
        temp = num;
        double result = 0;
        while (temp !=0) {
            int digit = temp % 10;
            result = result + Math.pow(digit,count);
            temp /= 10;
        }
        //check for equavalent of 
        System.out.println(result +" "+ num);
        return result == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean res = solution(num);
        if(res){
            System.out.println("It is armstrong");
        }else{
            System.out.println("not a armstrong");
        }
        for(int i = 1;i<=num;i++){
            if(solution(i)){
                System.out.print(i + " ");
            }
        }

    }
}
