package johnny;
import java.util.Scanner;
public class PrimeNumbers { //Program to show the prime numbers until the number entered
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int num2 = read.nextInt();
        System.out.println("These are the prime numbers up to "+num2);
        for(int num=1;num<num2;num++){
            int prime = 0;
            for(int i = 2; i < num; i++){
                if(num % i == 0){
                    prime = 1;
                }
            }
            if(prime == 0){
                System.out.println(num);
            }
            prime = 0;
        }
    }
}
