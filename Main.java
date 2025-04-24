import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        int a;
        int b;
        int choice=0;
        Scanner scan= new Scanner(System.in);



while(choice!=5){
        System.out.println("Enter an integer");
        a=scan.nextInt();
        System.out.println("Enter an integer");
        b=scan.nextInt();
        System.out.println("Select Operator \n1. + \n2. - \n3. X \n4. / \n5. Exit");


        choice=scan.nextInt();
    if(choice==1) {
        int sum= Add(a,b);
        System.out.println("Sum is "+sum);
    }
    if(choice==2) {
        int sum= Sub(a,b);
        System.out.println("Difference is "+sum);
    }
    if(choice==3) {
        int sum= Mul(a,b);
        System.out.println("Product is "+sum);
    }
    if(choice==4) {
        int sum= Div(a,b);
        System.out.println("Division is "+sum);
    }
    if(choice==5) {
        System.out.println("Exit");
    }

}}



    public static int Add(int a,int b){
        return a+b;
    }
    public static int Sub(int a,int b){
        return a-b;
    }
    public static int Mul(int a,int b){
        return a*b;

    }
    public static int Div(int a,int b){
        return a/b;
    }
}