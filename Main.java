import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

//        int a;
//        int b;
//        int choice=0;
//        Scanner scan= new Scanner(System.in);
//
//
//
//while(choice!=5){
//        System.out.println("Enter an integer");
//        a=scan.nextInt();
//        System.out.println("Enter an integer");
//        b=scan.nextInt();
//        System.out.println("Select Operator \n1. + \n2. - \n3. X \n4. / \n5. Exit");
//
//
//        choice=scan.nextInt();
//    if(choice==1) {
//        int sum= Add(a,b);
//        System.out.println("Sum is "+sum);
//    }
//    if(choice==2) {
//        int sum= Sub(a,b);
//        System.out.println("Difference is "+sum);
//    }
//    if(choice==3) {
//        int sum= Mul(a,b);
//        System.out.println("Product is "+sum);
//    }
//    if(choice==4) {
//        int sum= Div(a,b);
//        System.out.println("Division is "+sum);
//    }
//    if(choice==5) {
//        System.out.println("Exit");
//    }
//
//}}
//
//
//
//    public static int Add(int a,int b){
//        return a+b;
//    }
//    public static int Sub(int a,int b){
//        return a-b;
//    }
//    public static int Mul(int a,int b){
//        return a*b;
//
//    }
//    public static int Div(int a,int b){
//        return a/b;
//    }



//      Man man = new Man();
//        System.out.println("Enter the name of the man: ");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        System.out.println("Enter the age of the man: ");
//        int age = scanner.nextInt();
//        man.setName(name);
//        man.setAge(age);
//        System.out.println("Enter the height of the man: ");
//        int height = scanner.nextInt();
//      man.setHeight(height);
//
//      System.out.println("Enter the weight of the man: ");
//      int weight = scanner.nextInt();
//      man.setWeight(weight);
//
// Consume the leftover newline
//      scanner.nextLine();
//
//      System.out.println("Enter the address of the man: ");
//      String address = scanner.nextLine();
//      man.setAddress(address);
//
//      System.out.println("Enter the occupation of the man: ");
//      String occupation = scanner.nextLine();
//      man.setOccupation(occupation);
//
//      System.out.println("\nYou made an object of Man");
//      System.out.println("Here are Details:");
//
//      System.out.println("Name: " + man.getName());
//      System.out.println("Age: " + man.getAge());
//      System.out.println("Height: " + man.getHeight());
//      System.out.println("Weight: " + man.getWeight());
//      System.out.println("Address: " + man.getAddress());
//      System.out.println("Occupation: " + man.getOccupation());
//      man.Eat();
//
//}

//Day2


      //Basic Ops
      Scanner sc = new Scanner(System.in);
      System.out.println(44%3);
      System.out.println(34+4);
      System.out.println(45-3);
      System.out.println(4*5);



      //Relational Operator and If Statements

      int a, b;
      System.out.println("Enter an integer");
      a = sc.nextInt();
      System.out.println("Enter an integer");
      b = sc.nextInt();
      if(a>b)
        System.out.println(a+" A is greater than b " +b);
      if(a<b)
        System.out.println(a+" A is less than b " +b);
      if(a==b)
        System.out.println(a+" A is equal to " +b);
      int streak=3;


//Swapping between two numbers using no extra variable
      int a1=1;
      int b1=2;
      System.out.println("A "+a1);
      System.out.println("B "+b1);

      a1=a1+b1;
      b1=a1-b1;
      a1=a1-b1;
      System.out.println("Swapping");
      System.out.println("A "+a1);
      System.out.println("B "+b1);

//Swapping using temp variable;
      int n1=10;
      int n2=20;
      int temp;
      System.out.println("Number1 is: "+n1);
      System.out.println("Number2 is: "+n2);
      System.out.println("Swapping using temp");
      temp=n1;
      n1=n2;
      n2=temp;
      System.out.println("Number1 is: "+n1);
      System.out.println("Number2 is: "+n2);






}}

//its sunday the commit is to keep the streak ang git
