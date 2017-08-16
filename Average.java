import java.util.Scanner;
public class Average { //Simple program to calculate the average
public static Scanner read = new Scanner(System.in);
public static float average(float proof1,float proof2){
    return (proof1 + proof2)/2;
}
public static void main(String args[]){
    System.out.println("Enter student's grades: ");
    float p1, p2;
    System.out.println("Enter the partial test note: ");
        p1=read.nextFloat();
    System.out.println("Enter the bi-monthly test note: ");
        p2=read.nextFloat();
    System.out.print("The average is: "+average(p1,p2));
}
}
