
import java.util.Scanner;

public class SavingSchedule{
  
  public static void theSchudle(){
    Scanner in = new Scanner(System.in);
    int i =0; 
     //first coulmn save the number of month and the second column save the cost of this month
      int [][] revenueArray = new int[12][2];
      System.out.println("Hi print the number of the months you want start with");// ex : 12 7 4 6 8 arrange the month it's up to you
      for ( i = 0; i < revenueArray.length; i++) {
        revenueArray[i][0] = in.nextInt();
      }
      /*
      * Enter the number you want to save in the month ex: 
      * 388 the first number save in the first months you enter above ^
      */
     System.out.println("Now Enter the money you want save in this month");
     for (i = 0; i < revenueArray.length; i++) {
      revenueArray[i][1] = in.nextInt();
     }
      
      for ( i = 0; i < revenueArray.length; i++) {
        System.out.println("The number of month is " +   revenueArray[i][0] + " The cost of this month is " + revenueArray[i][1] );
      }
  }
    public static void main(String[] args) {
     theSchudle();
      }
      
    }
      
    
    
  
   
      
