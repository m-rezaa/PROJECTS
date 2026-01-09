#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int target = 20;
    int balls = 6;
    int score = 0;
    int runs, randomnumber;
    int repeat = 1;

    srand(time(0));

    while (repeat != 0)
    {
        score = 0;

        printf("Welcome to the Simple Cricket Game!\n");
        printf("You need to score %d runs in %d balls to win.\n", target, balls);
        printf("Enter a number between 1 and 6 to score runs on each ball.\n");

        for (int i = 1; i <= balls; i++)
        {
            printf("\nBall %d: Enter your run guess (1-6): ", i);
            scanf("%d", &runs);

            if (runs < 1 || runs > 6)
            {
                printf("Invalid input! Please enter a number between 1 and 6.\n");
                i--;
                continue;
            }

            randomnumber = (rand() % 6) + 1;
            printf("My Guess: %d\n", randomnumber);

            if (runs == randomnumber)
            {
                printf("You're out!\n");
                break;
            }
            else
            {
                score += runs;
                printf("Your score so far: %d\n", score);
            }
        }

        printf("\nYour final score is: %d\n", score);

        if (score >= target)
        {
            printf("Congratulations! You win!\n");
        }
        else
        {
            printf("You lost. Better luck next time!\n");
        }
        printf("If you want to play again enter any number, else enter 0: ");
        scanf("%d", &repeat);

        if (repeat == 0)
        {
            printf("Thanks for playing!\n");
        }
    }

    return 0;
}
