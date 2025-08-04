package Task_01;

public class Calculator {
   public double addition(double a, double b){
       return a + b;
   }
   public double subtraction(double a, double b){
       return a - b;
   }
   public double multiplication(double a, double b){
       return a * b;
   }
   public double division(double a, double b){
       if(b == 0){
           throw new ArithmeticException("Cannot divide by 0");
       }
       return a / b;
   }

}
