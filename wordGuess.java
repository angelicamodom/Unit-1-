import java.util.Scanner;

class wordGuess {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello!");
    String reply = input.nextLine();
    System.out.println("We are going to play a game!");
    System.out.println("I'm thinking of a word that starts with A and ends with O.");
    System.out.println("Make your guess: ");
    String guess = input.nextLine();
    String correctWord = "Armadillo";

    while(! guess.equals(correctWord)) {
      guess = input.nextLine();
      if(! guess.equals(correctWord)) {
        System.out.println("Wrong! Try again!");
        }
      else {
        System.out.println("Nice job! You got it!");
        }
  }





}
                                              }
