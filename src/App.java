import java.util.Scanner;

public class App {
    public static String getNameHint(String name) {
        if (name != null && name.length() >= 2) {
            return name.substring(0, 1); // Returns the first two characters
        } else {
            return ""; // Return an empty string if the name is null or too short
        }
    }
        public static void main(String[] args) throws Exception {
        String input1;
        String input2;
        input1 = " ";
        String name;
        name = "Tommy";
        Scanner in = new Scanner(System.in);
        int count = 0; 
        String hint = getNameHint(name);
        while (true)
        {
            System.out.println("Guess my name, please ? ");
            input1 = in.nextLine();
            count++;
            System.out.println("Hint: " + hint);
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
            if (count == 2)
            {
                System.out.println("The 2 first letters of the name is TO");
            }        
            
        }      
        
    }

    }

