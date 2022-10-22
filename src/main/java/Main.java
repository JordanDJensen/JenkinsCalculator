import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    String function;

    Calculator cal = new Calculator();
    Scanner scan = new Scanner(System.in);

   System.out.println("Choose a function:");
   function = scan.next();

    int a;
    int b;
    switch(function){
     case "add":
        a = scan.nextInt();
        b = scan.nextInt();

       System.out.println("Result: " + cal.add(a, b));
       break;
     case "subtract":
        a = scan.nextInt();
        b = scan.nextInt();

       System.out.println("Result: " + cal.subtract(a, b));
       break;
     case "multiply":
       a = scan.nextInt();
       b = scan.nextInt();

       System.out.println("Result: " + cal.multiply(a, b));
       break;
     case "divide":
       a = scan.nextInt();
       b = scan.nextInt();

       System.out.println("Result: " + cal.divide(a, b));
       break;
     case "fibonacci":
       a = scan.nextInt();

       System.out.println("Result: " + cal.fibonacciNumberFinder(a));
       break;
     case "binary":
       a = scan.nextInt();

       System.out.println("Result: " + cal.intToBinaryNumber(a));
       break;

      default:
        System.out.println("Goodbye");
        break;
   }


  }
}
