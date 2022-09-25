// Zareef Amyeen
// 1.26.2022
// CSE 142 Section BS
// TA: Michelle Jose Morris
// Take Home Assessment 4
// Program that calculates total income, total expense, and net income and tells user
// how they are budgeting with different custom messages

import java.util.*;

//Class that takes calculates total income and expenses, tells user how well they are budgeting
public class Budgeter{
   public static final int DAYS_IN_MONTH = 31;
   //Summary/table of contents
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      introductionMessage();
      double totalIncome = totalInput(console, "income");
      double totalExpense = expenseInput(console);
      printTotals(totalIncome, totalExpense);
      budgetCategory(totalIncome, totalExpense);
   }
  
   /**
   * Prints the introductory messsage for the program
   */
   public static void introductionMessage(){
      System.out.println("This program asks for your monthly income and");
      System.out.println("expenses, then tells you your net monthly income.");
      System.out.println();
   }
   
   /**
   * Takes in the categories of income and income amounts and returns the total income amounts
   * @param console - scanner
   * @param type - either income or expenses
   * @return returns total income or total expenses as a double
   */
   public static double totalInput(Scanner console, String type){
      System.out.print("How many categories of " + type + "? ");
      int categories = console.nextInt();
      double total = 0.0;
      for (int i = 1; i <= categories; i++){
         System.out.print("    Next " + type + " amount? $");
         total += console.nextDouble();
      }
      System.out.println();
      return total;
   }
   
   /**
   * Sums the total expense amounts (and accounts for monthly or daily expenses)
   * @param console - Scanner
   * @return total MONTHLY expenses
   */
   public static double expenseInput(Scanner console){
      System.out.print("Enter 1) monthly or 2) daily expenses? ");
      int mod = console.nextInt();
      double totalMonthlyExpense = 0.0;
      if (mod == 1){
         totalMonthlyExpense = totalInput(console, "expense");
      } else if (mod == 2){
         totalMonthlyExpense = totalInput(console, "expense") * DAYS_IN_MONTH;
      }
      return totalMonthlyExpense;
   }
   
   /**
   * Prints the total income and total expenses
   * @param totalIncome - the total income of the user
   * @param totalExpense - the total expense of the user
   */
   public static void printTotals (double totalIncome, double totalExpense){
      System.out.print("Total income = $" + totalIncome + " ($" + round(totalIncome / DAYS_IN_MONTH) + "/day)");
      double dailyExpense = round(totalExpense / DAYS_IN_MONTH);
      totalExpense = round(totalExpense);
      System.out.println("Total expenses = $" + totalExpense + " ($" + dailyExpense + "/day)");
      System.out.println();
   }
   
   /**
   * Rounds a given number to the hundredth place
   * @param value - the number to be rounded
   * @return the rounded double
   */
   public static double round(double value){
      return Math.round(value * 100.0) / 100.0;
   }
   
   /**
   * Prints the net income category and the messages depending on whichever category
   * @param totalIncome - the total income of the user
   * @param totalExpense - the total expense of the user
   */
   public static void budgetCategory(double totalIncome, double totalExpense){
      double netIncome = totalIncome - totalExpense;
      if (netIncome > 0){
         double roundedIncome = round(netIncome);
         System.out.println("You earned $" + roundedIncome + " more than you spent this month.");
         if (netIncome > 250){
            System.out.println("You're a big saver.");
            System.out.println("Congratulations! You should treat yourself (:");
         } else{
            System.out.println("You're a saver.");
            System.out.println("Keep up the good work!");
         }
      } else{
         double roundedIncome = Math.abs(round(netIncome));
         System.out.println("You spent $" + roundedIncome + " more than you earned this month.");
         if (netIncome > -250){
            System.out.println("You're a spender.");
            System.out.println("Not too bad. Try to cut down on expenses!");
         } else{
            System.out.println("You're a big spender.");
            System.out.println("Try to cut down on expenses!");
         }
      }
   }
} 