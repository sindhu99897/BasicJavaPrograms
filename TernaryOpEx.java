public class TernaryOpEx{
      public static void main(String args[]){
           int num1=10;
           int num2=30;
           int num3=50;
           int min=(num1<num2)?(num1<num2?num1:num3):(num2<num3?num2:num3);  
           int max=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
           System.out.println(min); 
           System.out.println(max);   
   }
}