package practiceQuestions2;
import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0 ;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


    game(){
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Guess Is: ");
        this.inputNumber = sc.nextInt();

    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(this.number == this.inputNumber){
            System.out.printf("Yes! You guessed the correct number. it was %d.\nYou guessed it in %d attempts.", this.number, this.noOfGuesses);
            return true;
        }
        else if(this.number < this.inputNumber){
            System.out.println("Too much!");
        }
        else if(this.number > this.inputNumber){
            System.out.println("Too low!");
        }
        return false;
    }

}

public class Q2_guessTheNumber {
    public static void main(String[] args) {
        game game = new game();
        boolean b = false;
        while(!b){
            game.takeUserInput();
            b = game.isCorrectNumber();
        }
    }
}
