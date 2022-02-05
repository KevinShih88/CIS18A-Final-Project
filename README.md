# CIS18A-Final-Project
**24/7 Boba Shop Order/Pickup System Summary**
  This program allows customers to declare the amount of drinks they desire, modify and tailor each drink to their specifications, and select a time to pick up their drinks. Within the code, boba shops can easily add switch cases for more drink bases, topping, and other selections to fit their needs. Lastly, the program also writes the order summary, total price, and pick-up time to a receipt text file. Other than basic functionality, the goal of this program is to provide a simple example of a system that can be employed by beverage shops or even restaurants with small menus to have an order/pickup system in place to provide food and drinks prepared fresh for customers with minimal wait time. 
  For functionality, the program mainly employs 3 key components: a class to create drink objects and tailor those specific drinks , an array that serves as a cart, and multiple switch cases to allow selection through various options for each type of modifiable field. Furthermore, the program uses Java’s scanner to accept customer input, FileWriter to output receipt to a text file, and Java’s Calendar utility to get the current time. However, this program has some limitations and drawbacks. For example, using an array is very clear and easy to use, however, it requires the customer to declare the amount of drinks desired first, instead of adding to the array each time the customer creates a new drink. This is because arrays need to be declared in size. This could be solved in the future through the use of Java’s JList utility. However, this makes it more complicated to access the objects within the list. Furthermore, in the future the program should be turned into either a website or app to allow customers to have access and use the system. Lastly an order processing system should be implemented to accept payment before delivery. 
  In conclusion, this program is a very simple system aimed at beverage shop owners, restaurant owners, or even owners of any small retail or service industry. The main strengths of the program is the ability for the customer to tailor the order to their specifications and set a time in the near future where they wish to pick up or receive their item or service. A prime example for this program other than a beverage shop would be a ramen shop that only has take out. Customers would be able to modify their ramen, schedule a time for pick up, and pick up their order while the soup is still hot. Moreover, this also makes it easier on the restaurant to better prepare for rushes or just demand in general. 

**PSEUDOCODE:**
Tea.java:
Declare package
Drink class
{
	Variable for drink name
	Variable for sugar level
	Variable for ice level
	Variable for topping
	Method to display drink information
	Method to set drink name
	Method to set sugar level 
	Method to set ice level
	Method to set topping
}
Tea class inherits from Drink class
{
	Variable for tea price
	Method to set tea price
	Method to get tea price
}
BobaShop.java
Declare package
Import utilities
Interface for scheduling
{
	Declare methods for scheduling
}
Pickup Class implements scheduling interface
{
	Define functions first declared in interface
}
BobaShop class
Main declaration
Variable for total price of order
Variable for the order quantity
Variable for order incrementation
Variable for order count down to 0
Declare scanner for input
Print out introduction
Print out request for number of drinks, allow customers to input
Create array to hold number of drinks
Start while loop as long as drinks countdown does not equal zero
Display options for drinks menu
Allow user to input drink number
Switch case for drink
{
	Use class method to set drink name
	Use class method to set drink price
}
Display sugar level options
Allow user to enter number for desired sugar level
Switch case for sugar level
{
	Use class method to set sugar level
}
Display ice level options
Allow user to enter number for desired ice level
Switch case for ice level
{
	Use class method to set ice level
}
Display topping level options 
{
	Use class method to set topping
}
Increment drink counter
Decrement drink countdown counter
If countdown does not equal 0
{
	Display next drink line break
}
Display order summary
	Use class method
Sum up drinks in array
	Use class method to get
Display options for pickup time
Allow user to enter number of desired pick up time
Switch case for pick up time
	Use class methods to set pick up time
Display pick up time
Write order summary, total price, and pick up time to receipt text file
