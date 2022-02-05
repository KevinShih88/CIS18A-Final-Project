/*
package class for drink
*/

package bobadelivery;								//declare package

class Drink									//Drink class
{
	public String drinkName;						//string for drink name
	public int sugarLevel;							//int for sugar level		
	public String iceLevel;							//string for ice level
	public String topping;							//string for topping
	
	public void show()							//method to display information
	{
		System.out.println(drinkName);
		System.out.println("Sugar Level: " + sugarLevel + "%");
		System.out.println("Ice Level: " + iceLevel);
		System.out.println("Topping: " + topping);
		System.out.println();
	}

	public void setDrink(String n)						//method to set drink name
	{
		drinkName = n;
	}
	public void setSugar(int x)						//method to set drink sugar level
	{
		sugarLevel = x;
	}

	public void setIce(String i)						//method to set drink ice level
	{
		iceLevel = i;
	}

	public void setTopping(String t)					//method to set desired topping
	{
		topping = t;
	}
}

public class Tea extends Drink							//Tea class inherits from Drink class
{
	private double drinkPrice = 5.00;					//double holder for drink price

	void setPrice(double p)							//method to set drink price
	{
		drinkPrice = p;
	}

	double getPrice()							//method to get drink 
	{
		return drinkPrice;
	}
}	