import java.util.Scanner;

public class ChatBot {
    final static Scanner data = new Scanner (System.in);
   

    public static void main(String[] args)  {

                     
        greeting();
        
        repeatname();
     
        guessAge();

        count();

        test();

        
        weekPhrase();
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
        // calculating age of the user based on input- level2 (optional)
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

            // Switch statement for phrase - level 3(optional)
            

            public static void weekPhrase() {
                System.out.println("Enter a number from 1 to 7");
                int day = data.nextInt();
                switch (day) {
                    case 1:
                        System.out.println("I'm  bit moody on Mondays!");
                        break;
                    case 2:
                        System.out.println("I'm terrific on Tuesdays!");
                        break;
                    case 3:
                        System.out.println("I'm  grumpy on Wednesdays!");
                        break;
                    case 4:
                        System.out.println("I'm energetic on Thursdays!");
                        break;
                    case 5:
                        System.out.println("I'm at my best on Fridays!");
                        break;
                    case 6:
                        System.out.println("I'm super excited on Saturdays!");
                        break;
                    case 7:
                        System.out.println("I'm  sleepy on Sundays!");
                        break;
                                    
                }
                
            }
            
        }   
        
    
    



