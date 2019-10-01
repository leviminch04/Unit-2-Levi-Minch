import java.util.Scanner;
import java.text.DecimalFormat;

public class floatCode{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.prinln("First Number: ");
    String num1Str = scan.next();
    Float num1 = Float.valueOf(num1Str);

    System.out.prinln("Second Number: ");
    String num2Str = scan.next();
    Float num2 = Float.valueOf(num2Str);


  }
}
