import java.util.Scanner;

public class program
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generate a Random Number Between 1 - 100");
        // code for generating a random number
        int randomNumber = 1 + (int)(100 * Math.random()); 
        int randomCopy = randomNumber;
        int number;
        while (true)
        {
            System.out.println("Enter a Number");
            number = sc.nextInt();
            if (randomCopy == number)
            {
                System.out.println("Correct! Congratulation.");
                break;
            } // end of if 
            

            else if (randomCopy > number)
            System.out.println(" Greater than " + number);
                
            
            else if (randomCopy < number)
            System.out.println(" Less than " + number);
                
        } // end of while
        
        sc.close();

    } // end of main()
} // end of class