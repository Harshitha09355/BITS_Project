// This program calculates the Armstrong series up to 1000
public class ArmstrongSeries {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}