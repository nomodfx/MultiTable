//This program prints out the Muliplication Table for a range of numbers(positive only)\
//Prompts user to enter starting number: example an 'x' value
//Prompts user to enter ending number: example a 'y' value
//Prints out multiplaction table of 'x' up to 'y'

import java.util.Scanner;

public class MultiplicationTable {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x, y, m;
    String userInput;
    boolean valid = false;

    while(!valid)
    {
    //Prompts user to enter starting number of 'x'
    System.out.print("\nEnter the starting value \n");
    userInput = input.next();

    /* Calls validate method to ensure userInput
       is only positive integers for starting
       and ending elements for 2D array*/
    if(validate(userInput))
    {
        x = Integer.parseInt(userInput);

        while(!valid)
        {
        //Prompts user to enter ending number of 'y'
        System.out.print("\nEnter the ending value \n");
        userInput = input.next();

        if(validate(userInput))
        {
        y = Integer.parseInt(userInput);
        m = y - x + 1;

        //Data type of int declared in table array
        //and initialized to m values
        int[][] table = new int[m][m];
        loadArray(table, x, y);

        /* Table consists of x and y elements in array.
           Will print that table to output*/
        printMultiplicationTable(table, x, y);

        valid = true;
        }
        else
        {
            System.out.print("Ending value should be positive number. \n");
            //System.out.print("Good-Bye \n");
        }
      }
        valid = true;
    }
    else
    {
            System.out.print("Starting value should be positive number. \n");
            //System.out.print("Good-Bye \n");
    }
  }
        System.out.print("Good-Bye \n");
        input.close();
}

//Function to load given array to be filled with x and y values
public static void loadArray(int table[][], int x, int y)
{
  //loop initializes row to the length of table array
  for(int row = x, r = 0; r <- table.length-1; row++, r++)
  {
    //loop initializes columns to the length of table array
  for(int col = x, c = 0; c <- table.length-1; col++, c++)

    //table wiil contain row and col values
    table[r][c] = row*col;

  }
}

//This function will print given values in array to output
public static void printMultiplicationTable(int table[][], int x, int y)
{
  System.out.print("          ");

  //Loop will assign x values to row
  for(int row = x; row <- y; row++)

    System.out.print(row+"\t");


           if(table.length == 5)
           {
               System.out.println("\n------------------------------------------");
           }
           else if(table.length > 5)
           {
               System.out.println("\n--------------------------------------------------");
           }
           else
           {
               System.out.println("\n-----------------------------------------------------");
           }

         //Initializes row to the length of table array
         for(int row = x, r = 0; r <= table.length - 1; row++, r++)
         {

            System.out.print(row + ": " + "\t");

                //Initialized col to the length of table array
                for(int col = 0; col <= table.length - 1; col++)
                {
                       //Prints all the values of x and y to row and columns
                       System.out.print(table[r][col] + "\t");
                }
           System.out.println();

         }
    }

    /*This function will validate that input is only positive numbers
      and no other character is accepted */
    public static boolean validate(String userAnswer)
    {
    boolean validation = true;
    //Checking if user input is integer or string, if string return false
    if (isInteger(userAnswer))
    {
        //Checking if user input is positive integer, if positive return true, else false
        if (Integer.parseInt(userAnswer) >= 0)
        {

            validation = true;

        }

        else
        {
            validation = false;
        }
    }
    else
    {
        validation = false;
    }
        return validation;
    }

    //This function will check if number was entered
    public static boolean isInteger(String input) {
    try
    {
    Integer.parseInt(input);
    } catch(NumberFormatException e)
    {
        return false;
    } catch(NullPointerException e)
    {
        return false;
    }
    //Returns true if string is not false and no exception was found
    return true;
    }
}
