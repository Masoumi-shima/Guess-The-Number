import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        guessTheNumber();
    }

    private static int getMiddleNumber(int min, int max)
    {
        return (min + max) / 2;
    }

    private static void guessTheNumber()
    {
        int min = 0;
        int max = Integer.MAX_VALUE;

        String answer;
        int guessedNumber;
        do
        {
            guessedNumber = getMiddleNumber(min, max);
            System.out.printf("Is this the number %s? Type Y, L for Less or M for More", guessedNumber);
            answer = getUserInput();
            switch (answer)
            {
                case "L" -> max = guessedNumber;
                case "M" -> min = guessedNumber + 1;
            }
        }
        while (!answer.equals("Y"));

        System.out.println("The number is: " + guessedNumber);
    }

    private static String getUserInput()
    {
        Scanner readerAnswer = new Scanner(System.in);
        return readerAnswer.next();
    }
}
