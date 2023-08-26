import java.util.Random;

public class Guessthenumber {
    public static void main(String[] args) {
        Random rng = new Random();
        int num = rng.nextInt(1001);
        int i = 0;
        int attempts = 0;
        int j = 1000;
        while(i <= j){
            int guess = i + (j-i)/2;
            System.out.println("My guess is " + guess);
            if(guess < num){
                System.out.println("Hmm, your guess is too small!");
                i = guess+1;
                attempts++;
            }
            else if(guess > num){
                System.out.println("Hmm, your guess is too large!");
                j = guess-1;
                attempts++;
            }
            else{
                System.out.println("Bingo! You got it!");
                System.out.println("You were " + 100*attempts/(Math.log(1001)/Math.log(2)) + "% to the worst case!");
                break;
            }
        }
    }
}