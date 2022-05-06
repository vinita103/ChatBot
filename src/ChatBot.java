import java.util.Scanner;

public class ChatBot {
    final static Scanner data = new Scanner (System.in);
    public static void main(String[] args)  {
              
        greeting();
        
        repeatname();
     
        guessAge();

        count();

        test();
    }

    public static void greeting() {
        
        System.out.println("Hello!");
        String greet = data.nextLine();
      
    }
    
    public static void repeatname() {
        System.out.println("Can you please repeat your name?");
        String name = data.nextLine();
        
    }

    public static void guessAge() {
        System.out.println("Let me guess your age?");
        System.out.println("Tell me remainder of dividing your age by 3. ");
        int rem3 = data.nextInt();
        System.out.println("Tell me remainder of dividing your age by 5. ");
        int rem5 = data.nextInt();
        System.out.println("Tell me remainder of dividing your age by 7. ");
        int rem7 = data.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age ) ;
        
    }

    public static void count() {
        System.out.println("I can count to any number you want, please enter a number.");
        int num = data.nextInt();
        for (int i = 0; i<= num; i++) {
            System.out.println(i);
        }

    }

        public static void test() {
            System.out.println("Let's test your programming knowledge.");
            System.out.println(" What is the purpose of a continue statement?");
            System.out.println(" 1. Stop the loop from executing");
            System.out.println(" 2. Continue the current execution of the loop");
            System.out.println(" 3. Move to the next iteration of the loop immediately");
            System.out.println(" 4. Execute the loop infinitely");
            int ans = data.nextInt();
            while( ans != 3){
                System.out.println("Please,try again");
                ans = data.nextInt();
            }
                
                
            }
            
        }   
        
    
    



