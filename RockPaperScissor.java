import java.util.Random;
import java.util.Scanner;



public class RockPaperScissor {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter 0 -> Rock; 1 -> Paper; 2-> Scissor; any key for exit");
            int userInput = sc.nextInt();

            if (userInput == 0){
                System.out.println("You chose Rock");
            }
            else if(userInput == 1){
                System.out.println("You chose Paper");
            }
            else if(userInput == 2){
                System.out.println("You chose Scissor");
            }
            else{
                break;
            }

            Random random = new Random();
            int compInput = random.nextInt(3);

            if (compInput == 0){
                System.out.println("Computer chose Rock");
            }
            else if(compInput == 1){
                System.out.println("Computer chose Paper");
            }
            else if(compInput == 2){
                System.out.println("Computer chose Scissor");
            }

            if (userInput == 0 && compInput == 1 || userInput == 1 && compInput == 2 || userInput == 2 && compInput == 0){
                System.out.println("Computer Won");
            }
            else if (userInput == 1 && compInput == 0 || userInput == 2 && compInput == 1 || userInput == 0 && compInput == 2){
                System.out.println("You Won");
            }
            else if (userInput == compInput){
                System.out.println("Theirs a draw");
            }
        }
        sc.close();
    }
    
}
