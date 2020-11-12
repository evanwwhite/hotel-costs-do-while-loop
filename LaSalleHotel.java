//Evan White

import java.util.Scanner;

public class LaSalleHotel
{
    public static void main(String[] args)
    {
 Scanner kb = new Scanner(System.in);
    	//===== Declaration section =====
		int roomChoice = -1, numDays = -1;
		char mealPlan = '?';
		double roomCost = 0, mealCost = 0, totalCost = 0;
		String roomName = "", mealName = ""; 
		
		double accumRoomCost = 0;
		double accumMealCost = 0;
		double accumTotalCost = 0;
		int counter = 0;
char again = 'y';
do {
		//===== Input section =====
		System.out.print("\nWelcome to the LaSalle Hotel: \n\n");
		System.out.print("Number of days in the hotel:        ");
		numDays = kb.nextInt();

		System.out.println("\nSelect a room from the following:");
		System.out.println("  1] Suite          200.00");
		System.out.println("  2] Tower Room     300.00");
		System.out.print  ("  3] Louvre         500.00          ");
		roomChoice = kb.nextInt();

		System.out.println("\nSelect a meal plan from the following:");
		System.out.println("  N] No meal plan      0.00");
		System.out.println("  B] Breakfast only   25.00");
		System.out.print  ("  D] Deluxe plan     100.00         ");
		mealPlan = kb.next().toLowerCase().charAt(0);
		System.out.println();

		//===== Process section =====\\
		switch(roomChoice)
		{
			case 1:  roomCost = 200 * numDays;
			         roomName = "Suite";
			          break;
			case 2:  roomCost = 300 * numDays;
			         roomName = "Tower Room";
			          break;
			case 3:  roomCost = 500 * numDays;
			         roomName = "Louvre";
			          break;
			default: System.out.println("No room selected.");
		}

	if(mealPlan == 'n')
		{
			mealCost = 0;
			mealName = "No meal plan";
		}
	else if(mealPlan == 'b')
		{
			mealCost = 25 * numDays;
			mealName = "Breakfast only";
		}
	else if(mealPlan == 'd')
		{
			mealCost = 100 * numDays;
			mealName = "Deluxe plan";
		}
	else
		{
			System.out.println("No meal plan selected.");
		}

		totalCost = roomCost + mealCost;

		//===== Output section =====\\
		System.out.println("\n\n      Lasalle Hotel\n");
		System.out.printf ("Number of Days:    %-10d\n", numDays);
		System.out.printf ("Room:              %-10s\n", roomName);
		System.out.printf ("Meal Plan:         %-10s\n", mealName);
		
		System.out.println();

		System.out.printf ("Room cost:         %10.2f\n", roomCost);
		System.out.printf ("Meal cost:         %10.2f\n\n", mealCost);
		System.out.printf ("Total cost:        %10.2f\n\n", totalCost);

		System.out.println("Thank you for choosing the LaSalle Hotel.\n\n");
		
		accumRoomCost  += roomCost;
		accumMealCost  += mealCost;
		accumTotalCost += totalCost;
		counter++;
		
		System.out.print("Next Customer? Yes(y) or No(n)");
		again = kb.next().toLowerCase().charAt(0);
		
      }while(again == 'y');
System.out.println("\n\nSummary:");
System.out.println(String.format("%-20s %8d","Number of customers", counter));
System.out.println(String.format("%-20s %8.2f", "Total room cost", accumRoomCost));
System.out.println(String.format("%-20s %8.2f", "Total meal cost", accumMealCost));
System.out.println(String.format("%-20s %8.2f", "Total costs", accumTotalCost));

    }
}

/*

Welcome to the LaSalle Hotel: 

Number of days in the hotel:        3

Select a room from the following:
  1] Suite          200.00
  2] Tower Room     300.00
  3] Louvre         500.00          3

Select a meal plan from the following:
  N] No meal plan      0.00
  B] Breakfast only   25.00
  D] Deluxe plan     100.00         d



      Lasalle Hotel

Number of Days:    3         
Room:              Louvre    
Meal Plan:         Deluxe plan

Room cost:            1500.00
Meal cost:             300.00

Total cost:           1800.00

Thank you for choosing the LaSalle Hotel.


Next Customer? Yes(y) or No(n)y

Welcome to the LaSalle Hotel: 

Number of days in the hotel:        2

Select a room from the following:
  1] Suite          200.00
  2] Tower Room     300.00
  3] Louvre         500.00          2

Select a meal plan from the following:
  N] No meal plan      0.00
  B] Breakfast only   25.00
  D] Deluxe plan     100.00         b



      Lasalle Hotel

Number of Days:    2         
Room:              Tower Room
Meal Plan:         Breakfast only

Room cost:             600.00
Meal cost:              50.00

Total cost:            650.00

Thank you for choosing the LaSalle Hotel.


Next Customer? Yes(y) or No(n)n


Summary:
Number of customers         2
Total room cost       2100.00
Total meal cost        350.00
Total costs           2450.00
*/
