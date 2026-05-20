import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        System.out.println("enter marks of 5 subjects ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        int sum = m1 + m2 + m3 + m4 + m5;
        int perrcentage = sum / 5;

        System.out.println(perrcentage);

        if(perrcentage > 90 && perrcentage <=100){
            System.out.println("Grade A");
        }else if(perrcentage > 80 && perrcentage <= 90){
        System.out.println("Grade B");
    }else if(perrcentage > 60 && perrcentage <= 80){
        System.out.println("Grade c");
    }else{
        System.out.println("Grade D");
    }

    }
}