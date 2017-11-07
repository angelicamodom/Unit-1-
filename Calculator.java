import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please type a number and I will tell you if it is even: ");
    int userNum = input.nextInt();
    System.out.println(userNum + " is even: " + isEven(userNum));
    // System.out.println("8 is divisible by 5:" + isDivisibleBy(8,5));
    System.out.println("Now, input two numbers and I will tell you the average of them: ");
    double averageNumberX = input.nextDouble();
    double averageNumberY = input.nextDouble();
    System.out.println("The average of "
                        + averageNumberX
                        + "and "
                        + averageNumberY
                        + " equals "
                        + average(averageNumberX, averageNumberY));
    System.out.println("Give me another integer and I will square it");
    int userSquare = input.nextInt();
    System.out.println(userSquare + " squared equals " + squareNumber());
    System.out.println("Now I will double that squared number! ")
   System.out.println( squared + " doubled equals " + doubleSquare);

  }

    public static boolean isEven(int n) {
    if(n%2==0){
       return true;
    }
    else{
       return false;
    }
  }
    public static double average(double averageNumberX, double averageNumberY) {
     double addedTogether = averageNumberX + averageNumberY;
     return addedTogether/2;
   }

   public static int squareNumber(int userSquare) {
      int squared = userSquare * userSquare;
      return squared;
    }

    public static int doubleSquare(int userSquare) {
      return userSquare * 2;
    }



}
