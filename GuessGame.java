import java.util.Random;
import java.util.Scanner;



public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random k = new Random();
        int num = k.nextInt(0, 100);
        System.out.println("Guess Number from 0 to 100 ");
        int n=0;
        while(true){
            
            System.out.print("Guess: ");
            int userI = sc.nextInt();
            n++;

            if (userI == num){
                System.out.println("You guess the number correct.");
                System.out.printf("You guessed %d times\n",n);
                System.out.println("Do you want to play again.");
                System.out.println("1->Yes\n0->No");
                int s = sc.nextInt();
                if (s == 1){
                    num = k.nextInt(0, 100);
                }
                else{
                    break;
                }
                
            }
            else if(userI>num && userI<=100){
                System.out.println("Your guess is greater than the number.\nGuess Again!");
            }
            else if(userI<num && userI>=0){
                System.out.println("Your guess is smaller than the number.\nGuess Again!");
            }
            else{
                break;
            }
        }
        sc.close();
        System.out.printf("You guessed %d times",n);
        
    }
}
