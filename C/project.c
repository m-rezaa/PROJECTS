// MADE BY:
// MUHAMMAD REZA SE-241014
// MARIAM FATIMA SE-241015
// MAHUM AFTAB SE-241019
#include <stdio.h>
#include <string.h>
#include "project.h" 

int main()
{
    int price[12] = {550, 700, 350, 100, 400, 500, 300, 120, 200, 500, 250, 70};
    int i, quantity, choice, item_total;
    char another;
    float total_bill = 0, AfterGST, Overall_Total;

    for (i = 0; i <= 18; i++)
    {
        printf("~*");
    }
    printf("\nWelcome To Restaurant Billing System!\n");
    for (i = 0; i <= 18; i++)
    {
        printf("~*");
    }

    printf("\n%20s\n", "MENU:");
    printf(" 1.ZINGER BURGER \t RS 550\n 2.PIZZA \t\t RS 700\n 3.CHOWMEIN  \t\t RS 350\n 4.SALAD \t\t RS 100\n 5.CLUB SANDWICH \t RS 400\n 6.PASTA \t\t RS 500\n 7.FRIED RICE \t\t RS 300\n 8.DRINK \t\t RS 120\n 9.FRENCH FRIES \t RS 200\n 10.LASAGNA \t\t RS 500\n 11.BIRYANI \t\t RS 250\n 12.DIP SAUCES \t\t RS 70\n");

    do
    {
        printf("\nEnter the item number to order (1-12): ");
        scanf("%d", &choice);

        if (choice >= 1 && choice <= 12)
        {
            printf("Enter The Quantity For Selected Item: ");
            scanf("%d", &quantity);
            switch (choice)
            {
            case 1:
                item_total = TotalBill(price[0], quantity);
                printf("ZINGER BURGER: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[0], quantity, item_total);
                break;

            case 2:
                item_total = TotalBill(price[1], quantity);
                printf("PIZZA: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[1], quantity, item_total);
                break;

            case 3:
                item_total = TotalBill(price[2], quantity);
                printf("CHOWMEIN: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[2], quantity, item_total);
                break;

            case 4:
                item_total = TotalBill(price[3], quantity);
                printf("SALAD: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[3], quantity, item_total);
                break;

            case 5:
                item_total = TotalBill(price[4], quantity);
                printf("CLUB SANDWICH: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[4], quantity, item_total);
                break;

            case 6:
                item_total = TotalBill(price[5], quantity);
                printf("PASTA: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[5], quantity, item_total);
                break;

            case 7:
                item_total = TotalBill(price[6], quantity);
                printf("FRIED RICE: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[6], quantity, item_total);
                break;

            case 8:
                item_total = TotalBill(price[7], quantity);
                printf("DRINKS: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[7], quantity, item_total);
                break;

            case 9:
                item_total = TotalBill(price[8], quantity);
                printf("FRENCH FRIES: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[8], quantity, item_total);
                break;

            case 10:
                item_total = TotalBill(price[9], quantity);
                printf("LASAGNA: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[9], quantity, item_total);
                break;

            case 11:
                item_total = TotalBill(price[10], quantity);
                printf("BIRYANI: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[10], quantity, item_total);
                break;

            case 12:
                item_total = TotalBill(price[11], quantity);
                printf("DIP SAUCES: \t");
                printf("Price: %d, Quantity: %d, Total: %d\n", price[11], quantity, item_total);
                break;

            default:
                printf("This Item Is Currently Unavailable,");
                break;
            }
            total_bill = CalculateBill(total_bill, item_total);
        }
        else
        {
            printf("Invalid choice. Please try again.\n");
        }

        printf("Would you like to order another item? (y/n): ");
        scanf(" %c", &another);

    } while ((another == 'y' || another == 'Y'));

    printf("\nCalculating Your Bill:\n");
    printf("\nYour Total Bill = RS %.2f\n", total_bill);
    AfterGST = BillAfterGST(total_bill);
    printf("GST = RS %.2f\n", AfterGST);
    Overall_Total = OverallTotal(total_bill, AfterGST);
    printf("%.2f + %.2f = RS %.2f\n\n", total_bill, AfterGST, Overall_Total);
    printf("Thank you For Dining With Us!\n\n");
    printf("MADE BY;\n");
    printf("MUHAMMAD REZA SE-241014\n");
    printf("MARIAM FATIMA SE-241015\n");
    printf("MAHUM AFTAB SE-241019\n");
    return 0;
}