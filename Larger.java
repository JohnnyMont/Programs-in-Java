import java.util.Scanner;
public class Larger { //Simple program to calculate the larger number
public static Scanner read = new Scanner(System.in);
public static void main(String args[]){
    int n1,n2,n3;
        System.out.println("Enter the first number:");
    n1 = read.nextInt();
        System.out.println("Enter the secund number: ");
    n2 = read.nextInt();
    if(n1>n2){
        System.out.println("The larger is "+n1);
    }else if(n2>n1){
        System.out.println("The larger is "+n2);
    }else{
        System.out.println("The numbers are equals");
    }
    
}
}
