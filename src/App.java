import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String input1;
        String input2;
        input1 = " ";
        String name;
        name = "Tommy";
        Scanner in = new Scanner(System.in);
        int count = 0; 
               
        while (true)
        {
            System.out.println("Guess my name, please ? ");
            input1 = in.nextLine();
            count++;
            System.out.println("Do you want to quit? ");
            input2 = in.nextLine(); 
            
            if (input2.equalsIgnoreCase("Y"))             
            
            {
                System.out.println("You guessed " + count + " times.");
                break; 
            }           

            if (input1.equalsIgnoreCase(name))
            {
                System.out.println("Congratulations! ");
                System.out.println("You guessed " + count + " times.");
                break;

            }          
            
            
        }      
        
    }

    }

