/*
Program lets customers order through switch cases. 
Switch cases construct drink objects and append them to order array.
Sums up order array and outputs drink order at the end.
Ask customer for delivery time (switch case)
Confirm information
Output receipt to file
*/

package bobadelivery;											//package declaration

import java.util.*;											//import utilities
import java.io.*;											//import input/output

interface Schedule											//interface for scheduling pickup time
{
	public void in15Mins();										//declare function for pick up in 15 mins
	public void in30Mins();										//declare function for pick up in 30 mins
	public void in60Mins();										//declare function for pick up in 1 hr
	public void in120Mins(); 									//declare function for pick up in 2 hours
}

class PickUp implements Schedule									
{
	public String pickupTime;									//holds the value of our pickup time as a string

	public void in15Mins()										//define function for 15 min pickup
	{
		Calendar now = Calendar.getInstance();							//create calendar instance at current time
		now.add(Calendar.MINUTE,15);								//add 15 minutes to current time
		pickupTime = (now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));		//set pickup time to its variable
	}

	public void in30Mins()										//define function for 30 min pickup
	{
		Calendar now = Calendar.getInstance();							//create calendar instance at current time
		now.add(Calendar.MINUTE,30);								//add 30 minutes to current time
		pickupTime = (now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));		//set pickup time to its variable
	}

	public void in60Mins()										//define function for 1 hour pickup
	{	
		Calendar now = Calendar.getInstance();							//create calendar instance at current time
		now.add(Calendar.MINUTE,60);								//add 1 hour to current time
		pickupTime = (now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));		//set pickup time to its variable
	}

	public void in120Mins()										//define funciton for 2 hour pickup
	{			
		Calendar now = Calendar.getInstance();							//create calendar instance at current time
		now.add(Calendar.MINUTE,120);								//add 2 hour to current time
		pickupTime = (now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE));		//set pickup time to its variable
	}
}

public class BobaShop											//Main class
{
	public static void main(String args[])
	{
		double orderTotal = 0.00;								//variable to hold total price of order
		
		int orderQuant = 0;									//number of drinks
		int orderCountUp = 0;									//increment counter for array
		int orderCountDown = 0;									//decrement counter for array
		int pickupNum = 0;									//number holder for pickup time switch case

		Scanner sc = new Scanner(System.in);							//New scanner instance to input

		System.out.println("*****Welcome to the 24/7 Boba Shop*****");				//Welcome Intro
		System.out.println("To ensure quality, our ordering system schedules when to pick-up your drink");
		System.out.println("Please follow the instructions to place your pick-up order");
		System.out.println();

		System.out.print("Enter NUMBER OF DRINKS you wish to order: ");				//Customer Input of amount of drinks to order
		if(sc.hasNextInt())
		{
			orderQuant = sc.nextInt();
			orderCountDown = orderQuant;							//set decrement counter to same as order quantity
			sc.nextLine();
		}
		else
		{
			System.out.print("Invalid input. Try again");
			System.exit(0);
		}
		
		Tea order [] = new Tea[orderQuant];							//create array with amount of drinks customer wishes to order

		System.out.println("******************************************");
		while(orderCountDown != 0)								//While loop that iterates the amount of times equalled to number of drinks
		{
			int drinkNum = 0;								//number holder for drink switch case
			int sugLvlNum = 0;								//number holder for sugar level switch case
			int iceLvlNum = 0;								//number holder for ice level switch case
			int toppingNum = 0;								//number holder for topping switch case

			double adjustPrice = 0.00;							//temporary number for price adjustments for addint toppings
			
			System.out.println("DRINK MENU:");						//display drinks menu
			System.out.println("1. Green Milk Tea");
			System.out.println("2. Green Tea");
			System.out.println("3. Wintermelon Milk Tea");
			System.out.println("4. Wintermelon Tea");
			System.out.println();
			System.out.print("Please enter number for desired drink: ");			//Customer input for desired drink
			if(sc.hasNextInt())
			{
				drinkNum = sc.nextInt();
				sc.nextLine();			
			}

			switch(drinkNum)
			{
				case 1:
				{
					order[orderCountUp] = new Tea();				//Create object
					order[orderCountUp].setDrink("Green Milk Tea");			//Set drink name to object
					order[orderCountUp].setPrice(5.99);				//Set drink price to object
				}
				break;
				case 2:
				{
					order[orderCountUp] = new Tea();				//Create object
					order[orderCountUp].setDrink("Green Tea");			//Set drink name to object
					order[orderCountUp].setPrice(4.99);				//Set drink price to object
				}
				break;
				case 3:
				{
					order[orderCountUp] = new Tea();				//Create object
					order[orderCountUp].setDrink("Wintermelon Milk Tea");		//Set drink name to object
					order[orderCountUp].setPrice(5.99);				//Set drink price to object
				}
				break;
				case 4:
				{
					order[orderCountUp] = new Tea();				//Create object
					order[orderCountUp].setDrink("Wintermelon Tea");		//Set drink name object
					order[orderCountUp].setPrice(4.99);				//Set drink price to object
				}
				break;
				default:
				{
					System.out.println("Invalid Input. Try again");
				}
			}
//SUGAR LEVEL
			System.out.println("SUGAR LEVEL:");						//Prompt customer to enter desired sugar level
			System.out.println("1. 100%");
			System.out.println("2. 75%");
			System.out.println("3. 50%");
			System.out.println("4. 25%");
			System.out.println("5. 0%");
			System.out.print("Select number for desired sugar level: ");			//Let customer enter desired sugar level
			if(sc.hasNextInt())
			{
				sugLvlNum = sc.nextInt();						
				sc.nextLine();
			}
			switch(sugLvlNum)
			{
				case 1:
				{
					order[orderCountUp].setSugar(100);				//use method to set sugar level to 100
				}
				break;
				case 2:
				{
					order[orderCountUp].setSugar(75);				//use method to set sugar level to 75
				}
				break;
				case 3:
				{
					order[orderCountUp].setSugar(50);				//use method to set sugar level to 50
				}
				break;
				case 4:
				{
					order[orderCountUp].setSugar(25);				//use method to set sugar level to 25
				}
				break;
				case 5:
				{
					order[orderCountUp].setSugar(0);				//use method to set sugar level to 0
				}
				break;
				default:
				{
					System.out.println("Invalid Input. Try again");
				}
			}
					
			//ICE LEVEL
			System.out.println("ICE AMOUNT:");						//Prompt customer to enter desired ice level
			System.out.println("1. Normal Ice");
			System.out.println("2. Less Ice");
			System.out.println("3. No Ice");
			System.out.print("Select number for desired ice amount: ");			//Let customer enter desired ice level
			if(sc.hasNextInt())
			{
				iceLvlNum = sc.nextInt();
				sc.nextLine();
			}
			switch(iceLvlNum)
			{
				case 1:
				{
					order[orderCountUp].setIce("Normal Ice");			//Use method to set ice level to normal
				}
				break;
				case 2:
				{
					order[orderCountUp].setIce("Less Ice");				//use method to set ice level to less
				}
				break;
				case 3:
				{
					order[orderCountUp].setIce("No Ice");				//use method to set ice level to no ice
				}
				break;
				default:
				{
					System.out.println("Invalid Input. Try again");
				}
			}

			//TOPPING
			System.out.println("TOPPING:");						//Prompt customer to enter desired topping
			System.out.println("1. Boba");
			System.out.println("2. Lychee Jelly");
			System.out.println("3. None");
			System.out.print("Select number for desired ice amount: ");		//Let customer enter desired topping
			if(sc.hasNextInt())
			{
				toppingNum = sc.nextInt();
				sc.nextLine();
			}
			switch(toppingNum)
			{
				case 1:
				{
					order[orderCountUp].setTopping("Boba");			//Use method to set topping to boba
					adjustPrice = order[orderCountUp].getPrice() + .50;	//Add 50 cents to price of drink and assign to adjustPrice holder
					order[orderCountUp].setPrice(adjustPrice);		//Use method to set adjustPrice to Price of the drink
				}
				break;
				case 2:
				{
					order[orderCountUp].setTopping("Lychee Jelly");		//Use method to set topping to lychee jelly
					adjustPrice = order[orderCountUp].getPrice() + .50;	//Add 50 cents to price of drink and assign to adjustPrice holder
					order[orderCountUp].setPrice(adjustPrice);		//Use method to set adjustPrice to Price of the drink	
				}
				break;
				case 3:
				{
					order[orderCountUp].setTopping("None");			//Use method to set topping to none
				}
				break;
				default:
				{
					System.out.println("Invalid Input. Try again");
				}
			}
						
			orderCountUp++;								//Increase counter to move to next drink in array
			orderCountDown--;							//Decrease countdown to reach 0

			if(orderCountDown != 0)							//If all drinks in orders have not been fulfilled
			{	
				System.out.println();
				System.out.println("***********NEXT DRINK**********");
				System.out.println();
			}

		}	

		System.out.println();
		System.out.println("********ORDER SUMMARY********");
		for(int i = 0; i < order.length; i++)						//iterate through array and show details of all drinks
		{
			order[i].show();							//use method to show details
		}

			
		for(int i = 0; i < order.length; i++)						//iterate through array to sum up order total
		{
			orderTotal += order[i].getPrice();					//use method to get drink prices and sum to orderTotal
		}	
		
		System.out.println("Total Price: $" + orderTotal);				//display order total

		PickUp pickup = new PickUp();							//Create pickup object
		System.out.println();
		System.out.println("********SCHEDULE PICK-UP TIME********");
		System.out.println("1. 15 minutes from now");
		System.out.println("2. 30 minutes from now");
		System.out.println("3. 1 hour from now");
		System.out.println("4. 2 hours from now");
		System.out.print("Please enter number for desired pick-up time: ");		//Let user enter desired pickup time
		if(sc.hasNextInt())
		{
			pickupNum = sc.nextInt();
			sc.nextLine();
		}
		switch(pickupNum)
		{
			case 1:
			{
				pickup.in15Mins();						//use method to set 15 minutes
			}
			break;
			case 2:
			{
				pickup.in30Mins();						//use method to set 30 minutes
			}
			break;
			case 3:
			{
				pickup.in60Mins();						//use method to set 1 hour
			}
			break;
			case 4:
			{
				pickup.in120Mins();						//use method to set 2 hours
			}
			break;
			default:
			{
				System.out.println("Invalid Input. Try again");
			}
		}
		System.out.println();
		System.out.println("Your pick-up time is: " + pickup.pickupTime);		//display pickup time

		//WRITE FILE TO RECEIPT
		try
		{
			File receipt = new File("Receipt.txt");						//Create new file for receipt
			FileWriter receiptWriter = new FileWriter("Receipt.txt");
			receiptWriter.write("********ORDER SUMMARY********");
			receiptWriter.write("\n");
			for(int i = 0; i < order.length; i++)						//iterate through array of drinks
			{
				receiptWriter.write("\n" + order[i].drinkName);				//write drink name
				receiptWriter.write("\nSugar Level: " + order[i].sugarLevel);		//write sugar level
				receiptWriter.write("\nIce Level: " + order[i].iceLevel);		//write ice level
				receiptWriter.write("\nTopping: " + order[i].topping);			//write topping
				receiptWriter.write("\n");
			}
			receiptWriter.write("\nTotal: $" + orderTotal);					//write order total
			receiptWriter.write("\n*****************************");
			receiptWriter.write("\n");
			receiptWriter.write("\nYour pick-up time is: " + pickup.pickupTime);		//write pickup time
			receiptWriter.close();
			System.out.println("Your receipt will be in the Receipt.txt file");		//confirm file has been created
		}
		catch(IOException e)
		{
			System.out.println("An error occurred");
		}
	}
}
