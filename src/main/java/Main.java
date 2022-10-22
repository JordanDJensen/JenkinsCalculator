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

       System.out.println(cal.add(a, b));
       break;
     case "subtract":
        a = scan.nextInt();
        b = scan.nextInt();

       System.out.println(cal.subtract(a, b));
       break;
     case "multiply":
       a = scan.nextInt();
       b = scan.nextInt();

       System.out.println(cal.multiply(a, b));
       break;
     case "divide":
       a = scan.nextInt();
       b = scan.nextInt();

       System.out.println(cal.divide(a, b));
       break;
     case "fibonacciNumberFinder":
       a = scan.nextInt();

       System.out.println(cal.fibonacciNumberFinder(a));
       break;
     case "intToBinaryNumber":
       a = scan.nextInt();

       System.out.println(cal.intToBinaryNumber(a));
       break;

      default:
        System.out.println("Goodbye");
        break;
   }


  }
}
