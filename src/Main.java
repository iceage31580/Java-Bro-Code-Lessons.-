import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import Tools.Toolbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;
import java.io.File; 
import java.io.FileWriter; 
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.FileReader; 

import javax.sound.sampled.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout; 

import java.io.Serializable; 

 
public class Main {
 
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		
		Scanner scanner = new Scanner(System.in); 
		
		// TODO Auto-generated method stub
		//Main Method 
		//Think of the main method as a spell or incantation that we have to say 
		//in order to get this program to run 
		
		System.out.println("Hello World"); //Adds a space
		System.out.print("Hello World 2\n"); //Adds a space using a new line sequence
		System.out.println("Hello world 3\n"); //Should skip 2 spaces
		System.out.println("\tHello World 4"); //tab escape sequence
		System.out.println("\"Hello World\""); //Printing out double quotes 
		System.out.print("Hello World 5");
		System.out.println(); 
		/*
		 * This is a multi-line comment
		 * sysout space is a shortcut for System.out.print...
		 * CTRL-/CTRL+ for different zoom effects
		 */
		
		//Variables in Java
		
		//Variable: A placeholder for a value that behaves as the value it contains
		
		//boolean 1 bit primitive (true or false)
		//int 4 bytes primitive -2 billion to 2 billion
		//double 8 bytes primitive fractional number up to 15 digits 
		//char 2 bytes primitive Single letter, character, ASCII value
		//String varies reference a sequence of characters
		
		
		//floats 3.1345f <- needs to have f at the end
		
		//Primitive vs Reference 
		
		//Primitive: 8 types (boolean, byte, etc.)
		//Stores data
		//can only hold 1 value
		//less memory
		//fast
		
		//Reference: Unlimited: User Defined
		//stores an address
		//could hold more than one value
		//more memory 
		//slow
		
		//how to create a variable 
		
		//declaration 
		
		int x; 
		
		//assignment 
		
		x = 123; 
		
		//initialization
		
		int y = 124; 
		
		//floats need an f at the end. 
		
		float z = 3.14f;
		
		//You don't need to put an f, and can store 
		//up to 15 digits after the decimal point
		
		double a = 3.14;
		
		//boolean will print what it is storing
		
		boolean b = false;
		
		//characters, symbol that holds @
		
		char symbol = '@'; 
		
		//reference data type, begins with capital letter
		
		String name = "Bro"; 
		
		
		System.out.println(y); 
		System.out.println("My number is " + x); 
		
		//String cat
		
		System.out.println("Hello " + name); 
		
		//Swapping two variables using Java
		
		String W = "Water"; 
		String K = "Kool-Aid"; 
		String temp; 
		
		System.out.println("W: "+W); 
		System.out.println("K: "+K); 
		
		temp = W; 
		W = K; 
		K = temp; 
		
		System.out.println("W: "+W); 
		System.out.println("K: "+K); 
		
		System.out.println("What is your name? "); 
		String name1 = scanner.nextLine(); 
		
		System.out.println("How old are you? "); 
		int age = scanner.nextInt(); 
		scanner.nextLine(); 
		
		System.out.println("What is your favorite food?"); 
		String food = scanner.nextLine(); 
		
		System.out.println("Hello "+name); 
		System.out.println("You are  "+age+" years old"); 
		System.out.println("You like  "+food);
		
		//expression = operands & operators
		//operands = values, variables, numbers, quantity
		//operators = + - * / %
		
		int friends = 10; 
		
		friends--; 
		
		System.out.println(friends); 
		
		//Basic gui Application 
		
		String name2 = JOptionPane.showInputDialog("Enter Your Name"); 
		JOptionPane.showMessageDialog(null, "Hello "+name); 
		
		int age2 = Integer.parseInt(JOptionPane.showInputDialog("Enter you age")); 
		JOptionPane.showMessageDialog(null, "You are "+age2+" years old"); 
		
		double height2 = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); 
		JOptionPane.showMessageDialog(null, "You are "+height2+" cm tall"); 
		
		//Useful methods of the math class
		
		double one;
		double two; 
		double three; 
		
		System.out.println("Enter side one: "); 
		one = scanner.nextDouble(); 
		
		System.out.println("Enter side two: "); 
		two = scanner.nextDouble(); 
		
		three = Math.sqrt((x*x)+(y*y)); 
		
		System.out.println("The hypotenuse is: "+three); 
		
		//scanner.close(); 
		
		
		
		double valueOne = 3.14; 
		double valueTwo = -10; 
		
		double valueThree = Math.max(valueOne, valueTwo);
		double valueFour = Math.min(valueOne, valueTwo); 
		double valueFive = Math.abs(valueTwo); 
		double valueSix = Math.abs(valueTwo); 
		double valueSeven = Math.round(valueOne); 	
		double valueEight = Math.ceil(valueOne); 
		double valueNine = Math.floor(valueOne); 
		
		
		System.out.println(valueThree); 
		System.out.println(valueFour);
		System.out.println(valueFive);
		System.out.println(valueSix); 
		System.out.println(valueSeven);
		System.out.println(valueEight);
		System.out.println(valueNine); 
		
		//Random class
		
		Random random = new Random(); 
		
		//This is the function that will limit the numbers
		int amountOne = random.nextInt(6) +1;
		double amountTwo = random.nextDouble(); 
		boolean amountThree = random.nextBoolean(); 
		
		System.out.println(amountOne);
		System.out.println(amountTwo);
		System.out.println(amountThree); 
		
		//if statements in Java
		
		//if statement = performs a block of code if it's condition 
		//evaluates to true
		
		int personAge = 75; 
		
		if(personAge==75){
			System.out.println("Ok Boomer"); 
		}
		else if (age>=18) {
			System.out.println("You are an adult"); 
		}
		else if (age>=13) {
			System.out.println("You are a teenager"); 
		}
		else {
			System.out.println("You are not an adult"); 
		}
		
		//Switch = statement that allows a variable to
		//be tested for equality against a list of values
		
		String day = "Friday"; 
		
		switch(day) {
		
		case  "Sunday": System.out.println("It is Sunday"); 
		break; 
		
		case  "Monday": System.out.println("It is Monday");
		break;
		
		case "Tuesday": System.out.println("It is Tuesday"); 
		break; 
		
		case "Wednesday": System.out.println("It is Wednesday"); 
		break; 
		
		case "Thursday": System.out.println("It is Thusday"); 
		break;
		
		case "Friday": System.out.println("It is Friday"); 
		break; 
		
		case "Saturday": System.out.println("It is Saturday"); 
		break; 
		
		default: System.out.println("This is not a day"); 
		
		}
		
		// logical operators = used to connect two or more operators
		// && = (AND) both conditions must be true
		// || = (OR) either condition must be true
		// !  = (NOT) reverse boolean value of a condition 
		
		Scanner scanner1 = new Scanner(System.in); 
		
		System.out.println(); 
		
		int temp1 = 25;
		
		if(temp1>30) {
			System.out.println("It is hot outside"); 
		}
		else if(temp1>=20 && temp1<=30) {
			System.out.println("It is warm outside"); 
		}
		else {
			System.out.println("It is cold outside"); 
		}
		
		Scanner scanner2 = new  Scanner(System.in); 
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next(); 
		
		if(response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game"); 
		}
		else {
			System.out.println("You are still playing the game *pew pew*"); 
		}
		
		// while loop = executes a block of code as long as 
		// it's condition remains true
		
		//while(1==1)
			//System.out.println("Help, I'm stuck in a while loop"); 
		
		Scanner scanner3 = new Scanner(System.in); 
		String nameTwo = ""; 
		
		while(nameTwo.isBlank()) {
			System.out.println("Enter you name: "); 
			nameTwo = scanner.nextLine(); 
		}
		
		System.out.println("Hello "+nameTwo); 
		
		//do 
		//always perform block of code once, then check condition 
		
		//do {} while 
		
		//for loop 
		
		for(int i = 10; i>=0; i--) {
			System.out.println(i); 
		}
		
		System.out.println("Happy New Year"); 
		
		//nested loops 1:32:37
		//nested loop = a loop inside a loop
		
		Scanner scanner4 = new Scanner(System.in); 
		int rows; 
		int cols; 
		String symbol2 = ""; 
		
		System.out.println("Enter the number of rows: "); 
		rows = scanner.nextInt(); 
		System.out.println("Enter number of columns: "); 
		cols = scanner.nextInt(); 
		System.out.println("Enter your symbol to use: "); 
		symbol2 = scanner4.next(); 
		
		for(int i=1; i<rows; i++) {
			System.out.println(); 
			for(int j=1; j<=cols; j++) {
				System.out.print(symbol2); 
			}
		}
		
		//array = used to store multiple values in a single variable 
		
		String[] cars = new String[3]; 
		//String[][] cars = new string [3][3];
		
		cars[0] = "Camaro"; 
		cars[1] = "Corvette"; 
		cars[2] = "Tesla"; 
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]); 
		}
		
		
		String[][] cars2 = {
				{"Camaro", "Corvette", "Silverado"},
				{"Mustang","Ranger","F-150"},
				{"Ferrari", "Lambo", "Tesla"}
		};
		
		//cars2[0]][0] = "Camaro";
		//cars2[0][1] = "Corvette"; 
		//cars2[0][2] = "Silverado"; 
		
		//cars2[1][0] = "Mustang"; 
		//cars2[1][1] = "Ranger"; 
		//cars2[1][2] = "F-150"; 
		
		//cars2[2][0] = "Ferrari"; 
		//cars2[2][1] = "Lambo"; 
		//cars2[2][2] = "Tesla"; 
		
		for(int i=0; i<cars2.length; i++ ) {
			System.out.println(); 
			for(int j = 0; j <cars2[i].length; j++) 
				{
				System.out.println(cars2[i][j]+" "); 
				}
		}
		
		//String = a reference data type that can store one or more characters
		//		   reference data types have access to useful methods
		
		String name3 = "bro";
		//name.equals(anObject); returns a boolean value
		
		// boolean result10 = name.equals("Bro"); 
		boolean result = name3.equalsIgnoreCase("bro"); //ignores case
		int result2= name3.length(); // returns integer 
		char result3 = name.charAt(0); //returns single character, lists index 
		int result4 = name.indexOf("o"); //returns an integer, finds character and returns the index position
		boolean result5 = name.isEmpty(); // checks to see if string is empty, and returns boolean 
		String result6 = name.toUpperCase(); //change all the letters in a string to uppercase
		String result7 = name.toLowerCase();  //same as uppercase, but in lowercase
		String result8 = name.trim(); //trims empty space before and empty characters
		String result9 = name.replace('o',  'a'); //replaces character between a string 
		
		//Wrapper class = provides a way to use primitive data types as reference data types 
		//				  reference data types contain useful methods
		//				  can be used with collections (ex. arraylist)
		
		//primitive 	  //wrapper 
		//---------		  //-------
		//boolean		  //Boolean
		//char 	          //Character
		//int			  //Integer
		//double 	      //Double 
		
		//autoboxing = the automatic conversion that the Java compiler makes between the primitive typ4es and their corresponding object wrapper classes 
		//unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive 
		
		Boolean a1 = true; 
		
		Character b2 = '@'; 
		
		Integer c = 123; 
		
		Double d = 3.14; 
		
		String e = "Bro"; 
		
		if(a1==true) {
			System.out.println("This is true"); 
		}
		
		//ArrayList = a resizable array
		//			  Elements can be added and removed after the compilation phase
		//			  Store reference data types
		
		ArrayList<String> food2 = new ArrayList<String>(); 
		
		food2.add("Pizza");
		food2.add("Hamburger");
		food2.add("Hotdog");
		
		food2.set(0, "Sushi");
		food2.remove(2); 
		food2.clear(); 
		
		for(int i=0; i < food2.size(); i++) {
				System.out.println(food2.get(i)); 
		}
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList(); 
		
		ArrayList<String> bakeryList = new ArrayList(); 
		bakeryList.add("Pasta"); 
		bakeryList.add("Garlic Bread"); 
		bakeryList.add("Donuts"); 
		
		ArrayList<String> produceList = new ArrayList(); 
		produceList.add("Tomatoes"); 
		produceList.add("Zucchini"); 
		produceList.add("Peppers"); 
		
		ArrayList<String> drinksList = new ArrayList(); 
		drinksList.add("Soda"); 
		drinksList.add("Coffee"); 
		
		groceryList.add(bakeryList); 
		groceryList.add(produceList);
		groceryList.add(drinksList); 
		
		System.out.println(groceryList.get(0).get(0));
		
		//for-each = traversing technique to iterate through the elements in an array/collection
		//less steps, more readable
		//less flexible
		
		//String[] animals = {"cat","dog","rat","bird"}; 
		
		ArrayList<String> animals = new ArrayList<String>(); 
		
		animals.add("cat"); 
		animals.add("dog"); 
		animals.add("rat"); 
		animals.add("bird"); 
		
		for(String i : animals) {
			System.out.println(i); 
		}
		
		//for-each = traversing technique to iterate through the elements in an array/collection
		//less steps, more readable
		//less flexible 
		
		String[] animals2 = {"cat", "dog", "rat", "bird"}; 
		
		for(String i : animals2) {
				System.out.println(i); 
			}
		
		ArrayList<String> animals3 = new ArrayList<String>(); 
		
		animals3.add("cat"); 
		animals3.add("dog"); 
		animals3.add("rat"); 
		animals3.add("bird"); 
		
		for(String i :animals3) {
			System.out.println(i); 
		}
		
		//method = a block of code that is executed whenever it is called upon 
		
		String aName = "Bro"; 
		int howOldAreYou = 21; 
		
		hello(); 
		hello2(aName); 
		
		int numberOne = 3; 
		int numberTwo = 4;
		
		int numberThree = add(x,y); 
		
		System.out.println(numberThree); 
 
		// Overloaded methods = methods that share the same name but have different parameters
		// method name + parameters = method signature
 
		int testValueOne = addNumbers(1,2); 
 
		System.out.println(testValueOne); 
 
		//printf() = an optional method to control, format, and display text to the console window 
		//			 two arguments = format string + (object/variable/value)
		//			 % [flags] [precision] [width] [conversion-character]
 
		boolean myFirstBoolean = true; 
		char myFirstChar = '@'; 
		String myString = "Bro"; 
		int yetAnotherInt = 50; 
		double yetAnotherDouble = 1000.0; 
		
		//System.out.print("This is a format string", 123);
		
		// [conversion character]
		System.out.printf("%b%n", myFirstBoolean); 
		System.out.printf("%c%n", myFirstChar); 
		System.out.printf("%s%n", myString); 
		System.out.printf("%d%n", yetAnotherInt); 
		System.out.printf("%f%n", yetAnotherDouble); 
		
		boolean mySecondBoolean = true; 
		char mySecondChar = '@'; 
		String mySecondString = "Bro2"; 
		int evenAnotherInt = 51; 
		double evenAnotherDouble = 1000; 
		
		//[width]
		//minimum number of characters to be written as output
		//System.out.printf("Hello %s", myString); 
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		//System.out.println("You have much money %.2f ", yetAnotherDouble); 
		
		//[flags]
		//adds an effect to output based on the flag added to format specifier 
		//- : left-justify
		//+ : output a plus (+) or minus ( - ) sign for a numeric value
		//0 : numeric values are zero-padded
		//, : comma grouping separator if numbers > 1000
		
		//final keyword in Java
		
		final double PI = 3.14159; 
		
		//System.out.println(PI); 
		
		//Object Oriented Programming in Java
		
		//object = an instance of a class that may contain attributes[characteristics of an object] and methods[actions that it can perform]
		//example: (phone, desk, computer, coffee cup) 
		
		Car myCar1 = new Car(); 
		Car myCar2 = new Car(); 
		
		System.out.println(myCar1.make);
		System.out.println(myCar2.model); 
		System.out.println(); 
		System.out.println(myCar2.make);
		System.out.println(myCar2.model);
		
		// constructor = special method that is called when an object is instantiated (created)
		
		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty",16, 50 ); 
		
		System.out.println(human2.name); 
		
		human2.eat(); 
		
		human1.drink(); 
		
		//local = declared inside a method
		// visible only to that method
		
		//global = declared outside a method, but within a class
		// visible to all parts of all class
		
		DiceRoller diceroller = new DiceRoller(); 
		
		//Overloaded constructors = multiple constructors within a class with the same name, 
		// but have different parameters
		// name + parameters = signature
		
		Pizza pizza = new Pizza("Thick Crust", "Tomatoe", "Pepperjack", "Pepporoni"); 
		
		System.out.println("Here are the ingredients of your pizza: "); 
		System.out.println(pizza.bread); 
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		//toString() = special method that all objects inherit, 
		//			   that returns a string that "textually represents" an object.
		//			   can be used both implicitly and explicitly 
		
		Car2 car = new Car2(); 
		
		System.out.println(car.make); 
		System.out.println(car.model); 
		System.out.println(car.color); 
		System.out.println(car.year); 
		
		//System.out.println(car.toString()); this will print out where it is in memory. 
		
		System.out.println(car); //implicitly using it after the toString method was added in Car2 class
		
		//array of objects 
		
		//int[] numbers = new int[3]; 
		//char[] characters = new char[3]; 
		//String[] strings = new String[5]; 
		
		//Food[] refrigerator = new Food[3];
		
		Food foodOne = new Food("pizza"); 
		Food foodTwo = new Food("hamburger");
		Food foodThree = new Food("hotdog"); 
		
		Food[] refrigerator = {foodOne, foodTwo, foodThree}; 
		
		//refrigerator[0] = food1; 
		//refrigerator[1] = food2; 
		//refrigerator[2] = food3; 
		
		System.out.println(refrigerator[0].name); 
		System.out.println(refrigerator[1].name); 
		System.out.println(refrigerator[2].name); 
		
		//Object Passing 
		
		Garage garage = new Garage(); 
		
		Wheels wheelsOne = new Wheels ("BMW"); 
		Wheels wheelsTwo = new Wheels ("Tesla"); 
		
		garage.park(wheelsOne); 
		garage.park(wheelsTwo); 
		
		// static = modifier. A single copy of variable /method is created and shared
		// The class "owns" the static member
		
		Friend friend1 = new Friend("Spongebob"); 
		Friend friend2 = new Friend("Patrick"); 
		Friend friend3 = new Friend("Squidward"); 
		Friend friend4 = new Friend("Sandy"); 
		
		//System.out.println(Friend.numberOfFriends);
		
		Friend.displayFriends();
		
		//inheritance = the process where once class acquires
		//			    the attributes and methods of another
		
		Automobile automobile = new Automobile(); 
		
		automobile.go(); 
		
		Velocipede bike = new Velocipede();
				
		bike.stop(); 
		
		System.out.println(automobile.doors); 
		System.out.println(bike.pedals); 
		
		// method overriding = Declaring a method in sub class
		//					   which is already present in parent class. 
		//					   done so that a child class can give its own implementation 
		
		Animal animal = new Animal(); 
		Dog dog = new Dog(); 
		dog.speak(); 
		
		// super = keyword refers to the superclass (parent) of an object
		//		   very familiar to the "this" keyword
		
		Hero hero1 = new Hero("Batman", 42, "$$$"); 
		Hero hero2 = new Hero("Superman", 43, "everything"); 
		
		System.out.println(hero1.name); 
		System.out.println(hero1.age); 
		System.out.println(hero1.power); 
		
		//abstract = abstract classes cannot be instantiated, but they can have a subclass
		//			 abstract methods are declared without an implementation
		
		//VehicleTwo vehicle = new VehicleTwo(); 
		CarTwo anotherCar = new CarTwo(); 
		
		anotherCar.go(); 
		
		//Encapsulation = attributes of a class will be hidden or private
		// 				  Can be accessed only through methods (getters & setters)
		//				  You should make attributes private if you don't have a reason to make them 
		
		
		WheelsTwo wheelsDuesx = new WheelsTwo("Cheverolet", "Camaro", 2021); 
		
		wheelsDuesx.setYear(2022); 
		
		System.out.println(wheelsDuesx.getMake()); 
		System.out.println(wheelsDuesx.getModel());
		System.out.println(wheelsDuesx.getYear());
		
		WheelsThree AutomobileThree = new WheelsThree("Chevrolet", "Camaro", 2021); 
		WheelsThree AutomobileFour = new WheelsThree("Ford", "Mustang", 2022); 
		
		System.out.println(AutomobileThree); 
		System.out.println(AutomobileFour); 
		System.out.println(); 
		System.out.println(AutomobileThree.getMake()); 
		System.out.println(AutomobileThree.getModel());
		System.out.println(AutomobileThree.getYear()); 
		System.out.println(); 
		System.out.println(AutomobileFour.getMake()); 
		System.out.println(AutomobileFour.getModel());
		System.out.println(AutomobileFour.getYear()); 
		
		//car2 = car1 just makes car2 point to the same place in memory as car1
		
		//AutomobileThree.copy(AutomobileFour); 
		
		WheelsThree AutomobileFive = new WheelsThree(AutomobileThree); 
		
		//interface = a template that can be applied to a class
		//	similar to inheritance, but specifies what a class has/must do
		//	classes can apply more than one interface, inheritance is limited to one super 
		
		Rabbit rabbit = new Rabbit(); 
		rabbit.flee(); 
		
		Hawk hawk = new Hawk(); 
		hawk.hunt(); 
		
		Fish fish = new Fish(); 
		fish.hunt(); 
		fish.flee(); 
		
		//Polymorphism = greek word for poly-"many", morph-"form"
		//	The ability of an object to identify as more than one type 
		
		CarThree carThree = new CarThree(); 
		Bicycle bicycleTwo = new Bicycle(); 
		Boat boat = new Boat(); 
		
		VehicleThree[] racers = {carThree, bicycleTwo, boat}; 
		
		for(VehicleThree x1 : racers) {
			x1.go(); 
		}
		
		//Dynamic Polymorphism
		
		//polymorphism = many shapes/forms
		//dynamic = after compilation (during runtime)
		
		// ex: A corvette is a: corvette, and a car, and a vehicle, and an object 
		
		Scanner scanner5 = new Scanner(System.in); 
		AnimalTwo animalTwo; 
		
		System.out.println("What animal do you want?"); 
		System.out.println("(1=dog) or (2=cat): ");
		int choice = scanner.nextInt(); 
		
		if(choice==1) {
			animalTwo = new DogTwo(); 
			animal.speak(); 
		}
		
		else if(choice==2) {
			animalTwo = new CatTwo(); 
			animal.speak(); 
		}
		else {
			animalTwo = new AnimalTwo();
			System.out.println("That choice was invalid");
			animal.speak(); 
		}
		
		
		//exception = an event that occurs during the execution of a program that, 
		//			  disrupts the normal flow of instructions 
		
		Scanner scanner6 = new Scanner(System.in); 
		
		try {
			
			System.out.println("Enter a whole number to divide: "); 
			int x2 = scanner6.nextInt(); 
			
			System.out.println("Enter a whole number to divide by: "); 
			int y2 = scanner6.nextInt(); 
			
			int z2 = x2/y2;
			
			System.out.println("Result: " + z2); 
		}
		catch(ArithmeticException arithmeticEx) {
			System.out.println("You cannot divide by zero!"); 
		}
		catch(InputMismatchException inputEx) {
			System.out.println("Please enter a number");
		}
		catch(Exception generalEx) {
			System.out.println("Something went wrong"); 
		}
		finally {
			scanner6.close(); 
		}
		
		//file = an abstract representation of file and directory pathnames
		
		File file = new File("secret_message.txt"); 
		
		if(file.exists()) {
			System.out.println("That file exists! :0!"); 
			System.out.println(file.getPath()); 
			System.out.println(file.getAbsolutePath()); 
			System.out.println(file.isFile()); 
			file.delete(); 
		}
		else {
			System.out.println("That file doesn't exist :C"); 
		}
		
		File file2 = new File("\"C:\\Users\\Isaac\\OneDrive\\Desktop\\BJ-6.txt\""); 
		
		if(file.exists())
		{
			System.out.println("That file exists!"); 
		}
		else {
			System.out.println("That file doesn't exist"); 
		}
		
		//writing to a file in Java
		
		try {
			FileWriter writer = new FileWriter("poem.txt"); 
			writer.write("Hello");
			writer.append("How are you?");
			writer.close(); 
			
		}
		catch(IOException InputOutputException)
		{
			InputOutputException.printStackTrace(); 
		}
		
		//FileReader = read the contents of a file as a stream of characters. One by one
		//			   read() returns an int value which contains the byte value
		// 			   when read() returns -1, there is no more data to be read
		
		//ASCII Art Archive 
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read(); 
			while(data != -1) 
			{
				System.out.print((char)data); 
				data = reader.read(); 
			}
			reader.close();; 
		}
		catch (FileNotFoundException FileNotFoundError)
		{
			FileNotFoundError.printStackTrace(); 
		}
		catch (IOException InputOutputException2)
		{
			InputOutputException2.printStackTrace(); 
		}
		
		
		File file3 = new File("sample.wav"); //sample wave doesn't exist 
		
		Scanner scanner7 = new Scanner(System.in); //waits for user input to terminate audio file 
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file); 
		Clip clip = AudioSystem.getClip(); 
		clip.open(audioStream); 
		
		 
		String response2 = ""; 		
		
		while (!response2.equals("Q"))
		{
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter your choice"); 
			
			String response3 = scanner.next(); 
			response2 = response2.toUpperCase(); 
			
			switch(response3)
			{
			case("P"): clip.start(); 
			break; 
			case("S"): clip.stop(); 
			break;
			case("R"): clip.setMicrosecondPosition(0);
			break; 
			default: System.out.println("Not a valid response"); 
			case("Q"): clip.close(); 
			break; 
			}
			
			System.out.println("Bye"); 
			
			clip.start();
			
			
			// JFrame = a gui window to add components to 
			
			JFrame frame = new JFrame(); //creates frame 
			frame.setTitle("JFrame title goes here"); //sets title of frame
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application 
			frame.setResizable(false); //prevent frame from being resized
			frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
			frame.setVisible(true); //make from visible 
			
			ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
			frame.setIconImage(image.getImage()); // change icon of frame
			frame.getContentPane().setBackground(new Color(0x123456)); // change color of background
		}
		
		
			MyFrame myFrame = new MyFrame(); 
			//you can do it: as new MyFrame(); 
			
			//JLabel = a GUI display area for a string of text, an image, or both
			
			ImageIcon image2 = new ImageIcon("dude.png"); 
			Border border = BorderFactory.createLineBorder(Color.green,3); 
			
			
			JLabel label = new JLabel(); //create a label
			label.setText("Bro do you even code?"); //set text of label
			label.setIcon(image2);
			label.setHorizontalTextPosition(JLabel.CENTER); //set text, LEFT, CENTER, RIGHT of imageicon
			label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of imageicon
			label.setForeground(new Color(0x00FF00)); //set font color of text
			label.setFont(new Font("MV Boli",Font.PLAIN,50)); //set font of text
			label.setIconTextGap(-25); //set gap of text to image
			label.setBackground(Color.black); //set background color
			label.setOpaque(true); //display background color
			label.setBorder(border); //sets border of label(not image+text)
			label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
			label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text of label
			//label.setBounds(0,0,250,250); //set x, y positions within frame as well as dimensions 
			
			
			JFrame frame2 = new JFrame(); 
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//frame2.setSize(500,500);
			//frame2.setLayout(null); 
			frame2.setVisible(true);
			frame2.add(label);
			frame2.pack(); 
			
			
			//JPanel =  a GUI component that functions as a container to hold other components 
			
			ImageIcon icon2 = new ImageIcon("thumbsup.png");
			
			JLabel label2 = new JLabel(); 
			label2.setText("Hi"); 
			label2.setIcon(icon2);
			label2.setVerticalAlignment(JLabel.TOP);
			label2.setHorizontalAlignment(JLabel.RIGHT);
			label2.setBounds(0,0,75,75); 
			
			JPanel redPanel = new JPanel();
			redPanel.setBackground(Color.red); 
			redPanel.setBounds(0,0,250,250);//x,y, width, height
			redPanel.setLayout(new BorderLayout());
			
			JPanel bluePanel = new JPanel(); 
			bluePanel.setBackground(Color.blue); 
			bluePanel.setBounds(250,0,250,250);
			bluePanel.setLayout(new BorderLayout());
			
			JPanel greenPanel = new JPanel(); 
			greenPanel.setBackground(Color.green); 
			greenPanel.setBounds(0,250,500,250); 
			greenPanel.setLayout(new BorderLayout());
			
			JFrame frame3 = new JFrame(); 
			frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame3.setLayout(null);
			frame3.setSize(750,750);
			frame3.setVisible(true); 
			greenPanel.add(label); 
			frame3.add(redPanel); 
			frame3.add(bluePanel); 
			frame3.add(greenPanel); 	
			
			//JButton = a button that performs an action when clicked on 
			
			new MyFrame2(); 
			
			//Layout Manager = Defines the natural layout for components within a container
			
			//3 common managers
			
			//BorderLayout = A BorderLayout places components in five areas: NORTH, SOUTH, WEST, EAST, CENTER
			//				 All extra space is placed in the center area
			
			JFrame frame4 = new JFrame(); 
			frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame4.setSize(500,500);
			frame4.setLayout(new BorderLayout(10,10));
			frame4.setVisible(true);

			JPanel panel1 = new JPanel(); 
			JPanel panel2 = new JPanel(); 
			JPanel panel3 = new JPanel(); 
			JPanel panel4 = new JPanel(); 
			JPanel panel5 = new JPanel(); 
			
			panel1.setBackground(Color.red); //can be used for titles, etc 
			panel2.setBackground(Color.green); // can be used for side bars /navigation bars
			panel3.setBackground(Color.yellow); // same as green 
			panel4.setBackground(Color.magenta); // can be used for footers
			panel5.setBackground(Color.blue); //used for main body
			
			panel5.setLayout(new BorderLayout());
			
			panel1.setPreferredSize(new Dimension(100,100));
			panel2.setPreferredSize(new Dimension(100,100));
			panel3.setPreferredSize(new Dimension(100,100));
			panel4.setPreferredSize(new Dimension(100,100));
			panel5.setPreferredSize(new Dimension(100,100));
			
			//----------------- sub panels -----------------
			
			JPanel panel6 = new JPanel(); 
			JPanel panel7 = new JPanel(); 
			JPanel panel8 = new JPanel(); 
			JPanel panel9 = new JPanel(); 
			JPanel panel10 = new JPanel(); 
			
			panel6.setBackground(Color.black); 
			panel7.setBackground(Color.darkGray); 
			panel8.setBackground(Color.gray);  
			panel9.setBackground(Color.lightGray);
			panel10.setBackground(Color.white);
			
			panel6.setPreferredSize(new Dimension(50,50));
			panel7.setPreferredSize(new Dimension(50,50));
			panel8.setPreferredSize(new Dimension(50,50));
			panel9.setPreferredSize(new Dimension(50,50));
			panel10.setPreferredSize(new Dimension(50,50));
			
			panel5.add(panel6, BorderLayout.NORTH);
			panel5.add(panel7, BorderLayout.SOUTH);
			panel5.add(panel8, BorderLayout.WEST);
			panel5.add(panel9, BorderLayout.EAST);
			panel5.add(panel10, BorderLayout.CENTER);
			
			frame4.add(panel1, BorderLayout.NORTH);
			frame4.add(panel2, BorderLayout.WEST);
			frame4.add(panel3, BorderLayout.EAST);
			frame4.add(panel4, BorderLayout.SOUTH);
			frame4.add(panel5, BorderLayout.CENTER); //6:25:32
			
			// Layout Manager = Defines the natural layout for components within a container
			
			// FlowLayout = places components in a row, sized at their preferred size.
			//				If the horizontal space in the container is too small, 
			//				the FlowLayout class uses the next available row. 
			
			JFrame frame5 = new JFrame(); //6:37:14
			frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame5.setSize(500,500);
			frame5.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));//there is also trailing and leading
			//first number is horizontal spacing and the second number is vertical spacing 
			
			JPanel panel16 = new JPanel(); 
			panel16.setPreferredSize(new Dimension(100,250));
			panel16.setBackground(Color.lightGray);
			panel16.setLayout(new FlowLayout());
			
			frame5.add(new JButton("1")); 
			frame5.add(new JButton("2")); 
			frame5.add(new JButton("3")); 
			frame5.add(new JButton("4")); 
			frame5.add(new JButton("5")); 
			frame5.add(new JButton("6")); 
			frame5.add(new JButton("7")); 
			frame5.add(new JButton("8")); 
			frame5.add(new JButton("9")); 
			
			frame5.add(panel16); 
			frame5.setVisible(true); 
			
			//Layout Manager = Defines the natural layout for components within a container
			
			//GridLayout = places components in a grid of cells.
			//			   each component takes all the available space within its cell
			// 			   and each cell is the same size
			
			JFrame frame6 = new JFrame(); 
			frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame6.setSize(500,500);
			frame6.setLayout(new GridLayout(3,3,10,10)); //3 rows, 3 columns, 
														//horizontal margins, vertical margins
			
			frame6.add(new JButton("1")); 
			frame6.add(new JButton("2")); 
			frame6.add(new JButton("3")); 
			frame6.add(new JButton("4")); 
			frame6.add(new JButton("5")); 
			frame6.add(new JButton("6")); 
			frame6.add(new JButton("7")); 
			frame6.add(new JButton("8")); 
			frame6.add(new JButton("9"));
			
			frame6.setVisible(true);
			
			//JLayered Pane = Swing container that provides a 
			//				  third dimension for positioning components
			//				  ex. depth, Z-index
			
			JLabel label3 = new JLabel(); 
			label3.setOpaque(true);
			label3.setBackground(Color.RED);
			label3.setBounds(50,50,200,200); //6:50:48
			
			JLabel label4 = new JLabel(); 
			label4.setOpaque(true);
			label4.setBackground(Color.GREEN);
			label4.setBounds(100,100,200,200);
			
			JLabel label5 = new JLabel(); 
			label5.setOpaque(true);
			label5.setBackground(Color.BLUE);
			label5.setBounds(150,150,200,200);
			
			JLayeredPane layeredPane = new JLayeredPane(); 
			layeredPane.setBounds(0,0,500,500);
			
			layeredPane.add(label3, Integer.valueOf(0)); //this is another way of doing default layer  
			layeredPane.add(label4, JLayeredPane.DEFAULT_LAYER);
			layeredPane.add(label5, JLayeredPane.DRAG_LAYER); 
			
			//layers of pane: Default, Palette, Modal, PopUp & Drag
			
			JFrame frame7 = new JFrame("JLayeredPane"); 
			frame7.add(layeredPane); 
			frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame7.setSize(new Dimension(500,500)); 
			frame7.setLayout(null);
			frame7.setVisible(true);
			
			//Open a new gui window 6:55:20
			
			LaunchPage launchPage = new LaunchPage(); 
			
			//JOption Pane = pop up a standard dialog box that prompts users for a value or 
			//				 informs them of something
			
			
			
			JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE); //parentComponent, message, title, messageType
			JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.QUESTION_MESSAGE); 
			JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.WARNING_MESSAGE); 
			JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.ERROR_MESSAGE); //7:08:44
			
			//fake tech support scams: 
			
			/*while(true) {
			*JOptionPane.showMessageDialog(null, "Your computer has a virus!", "title", JOptionPane.WARNING_MESSAGE); 
			*}
			*/
			
			JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
			
			System.out.println(JOptionPane.showConfirmDialog(null, "Bro do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION));
			
			String name4 = JOptionPane.showInputDialog("What is your name?: "); 
			
			System.out.println("Hello "+name4); 
			
			//show option dialog: parentComponent, message, title, optionType, messageType, icon, options, initialValue
			
			String[] responses = {"No, you're awesome", "Thank you", "*blush*"}; 
			
			ImageIcon icon = new ImageIcon("smile.png"); 
			
			JOptionPane.showOptionDialog(null, 
										"You are awesome", 
										"Secret Message", 
										JOptionPane.YES_NO_CANCEL_OPTION, 
										JOptionPane.INFORMATION_MESSAGE, 
										icon, 
										responses, 
										0);
			
			//textfields
			
			//JTextfield = A GUI textbox component that can be used to add,set, or get text
			
			
			MyFrame3 frame8 = new MyFrame3(); 
			
			//JCheckBox = A GUI component that can be selected or deselected
			
			MyFrame4 frame9 = new MyFrame4(); 
			
			//JRadioButton = one or more buttons in a grouping in which only 1 may be selected
			
			MyFrame5 frame10 = new MyFrame5(); 
			
			//JComboBox = A component that combines a button or editable filed and a drop-down list 
			
			MyFrame6 frame11 = new MyFrame6(); 
			
			//JSliders = GUI component that lets user enter a value
			//			 by using an adjustable sliding knob on a track
			
			SliderDemo sliderDemo = new SliderDemo(); 
			
			//JProgressBars
			//progress bar = Visual aid to let user know that an operation is processing 
			
			ProgressBarDemo demo = new ProgressBarDemo(); 
			
			//
			//
			
			MyFrame7 frame12 = new MyFrame7(); 
			
			//JFileChooser =  A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
			
			MyFrame8 frame13 = new MyFrame8(); //8:37:59
			
			//JColorChooser = A GUI mechanism that let's a user choose a color 
			
			MyFrame9 frame14 = new MyFrame9(); //8:42:25
			
			//Key Listener
			
			MyFrame10 frame15 = new MyFrame10(); 
			
			//Mouse Listener
			
			MyFrame11 frame16 = new MyFrame11(); 
			
			//Drag and drop 
			
			MyFrame12 frame17 = new MyFrame12(); //9:15:02
			
			//Key Bindings = bind an action to a Keystroke
			//				 don't require you to click a component to give it focus
			//				 all Swing components use Key Bindings
			//				 increased flexibility compared to KeyListeners
			//				 can assign key strokes to individual Swing components
			//				 more difficult to utilize and set up :(
			
			MyFrame13 frame18 = new MyFrame13(); 
			
			//2D graphics 
			
			MyFrame14 frame19 = new MyFrame14(); 
			
			//creating 2D animations 
			
			MyFrame15 frame20 = new MyFrame15(); 
			
			//generics 
			//bounded types = you can create the objects of a generic class to have 
			
			//generics = enable types (classes and interfaces) to be parameters when defining:
			//			 classes, interfaces and methods
			//			 a benefit to eliminate the need to create multiple versions 
			// 			 of methods or classes for various data types
			//			 Use 1 version for all reference data types 
			
			MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9); 
			MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1.01); 
			MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$'); 
			MyGenericClass<String, Character> myString1 = new MyGenericClass<>("Hello", '!'); 
			
			ArrayList<String> myFriends = new ArrayList<>();
			
			System.out.println(myInt.getValue()); 
			System.out.println(myDouble.getValue()); 
			System.out.println(myChar.getValue()); 
			System.out.println(myString1.getValue()); 
			
			Integer[] intArray = {1,2,3,4,5}; 
			Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1}; 
			Character[] charArray = {'H', 'E', 'L', 'L', 'O'}; 
			String[] stringArray = {"B", "Y", "E"}; 
			
			//note to self when I come back to this do both the top part and the long functions method shown for better understanding
			
			displayArray(intArray); 
			displayArray(doubleArray); 
			displayArray(charArray); 
			displayArray(stringArray); 
			
			System.out.println(getFirst(intArray)); 
			System.out.println(getFirst(doubleArray)); 
			System.out.println(getFirst(charArray)); 
			System.out.println(getFirst(stringArray)); 
			
			//Generic Classes: 10:23:19
			
			MyIntegerClass myInt1 = new MyIntegerClass(1); 
			MyDoubleClass myDouble1  = new MyDoubleClass(3.14); 
			MyCharacterClass myChar1 = new MyCharacterClass('@'); 
			MyStringClass myString2 = new MyStringClass("Hello"); 
			
			System.out.println(myInt1.getValue()); 
			System.out.println(myDouble1.getValue());
			System.out.println(myChar1.getValue());
			System.out.println(myString2.getValue());
			
			//bounded types = you can create the objects of a generic class to have data of specific derived types ex.Number
			
			//Steps to serialize
			//------------------
			//1. Your object class should implement Serializable interface
			//2. add import java.io.Serializable
			//3. FileOutputStream fileOut = new FileOutputStream(filepath)
			//4. ObjectOutputStream out = new ObjectOutputStream(fileOut)
			//5. out.writeObject(objectName)
			//6.out.close(); fileOut.close(); 
			
			//Serialization = The process of converting an object into a byte stream
			//				  Persists (saves the state) the object after program exits
			//				  This byte stream can be saved as a file or sent over a network
			//				  Can be sent to a different machine
			//				  Byte stream can be saved as a file (.ser) which is platform independent 
			//				  (think of this as if you're saving a file with the object's information)
			
			//Deserialization = The reverse process of converting a byte stream into an object 
			//					(think of this as if you're loading a saved file
			
			User user = new User(); 
			
			user.name = "Bro"; 
			user.password = "I<3Pizza"; 
			
			user.sayHello(); 
			
			FileOutputStream fileOut = new FileOutputStream("UserInfo.ser"); 
			ObjectOutputStream out= new ObjectOutputStream(fileOut); 
			out.writeObject(user); 
			out.close(); 
			fileOut.close(); 
			
			System.out.println("Object info saved! :)"); 
			
//1. Children classes of a parent class that implements Serializable will do so as well
//2. static fields are not serialized (they belong to the class, not an individual object
//3. the class's definition ("class file") itself is not recorded, cast it as the object type
//4. Fields declared as a "transient" aren't serialized, they're ignored
//5. serialVersionUID is a unique version ID
			
//serialVerionUID = serialVersionUID is a unique ID that functions like a version #
//					verifies that the sender and receiver of a serialized object
// 					have laded classes for that object that match 
//				    Ensures object will be compatible between machines 
//					Number must match. Otherwise will cause a InvalidClassException
//					A SerialVersionUID will be calculated based on class properties 
//					A serializable class can declare its own serialVersionUID explicitly 
			
			long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID(); 
			System.out.println(serialVersionUID); 
			
			//Timer = A facility for threads to schedule tasks 
			//		  for future execution in a background thread
			
			//TimerTask = A task that can be scheduled for one-time
			//			  or repeated execution 
			
			Timer timer = new Timer();
			
			int counter = 10; 
			TimerTask task = new TimerTask() {
			    @Override
			    public void run() {
			        System.out.println("Task executed!");
			        if(counter>0)
			        {
			        		System.out.println(counter+" seconds"); 
			        }
			        else {
			        		System.out.println("Happy New Year"); 
			        		timer.cancel(); 
			        }
			    }
			};

			Calendar date = Calendar.getInstance(); 
			date.set(Calendar.YEAR, 2020); 
			date.set(Calendar.MONTH, Calendar.JUNE);
			date.set(Calendar.DAY_OF_MONTH, 20);
			date.set(Calendar.HOUR_OF_DAY, 0);
			date.set(Calendar.MINUTE, 0); 
			date.set(Calendar.SECOND, 0); 
			date.set(Calendar.MILLISECOND, 0); 
			
			timer.schedule(task, 3000); // runs after 3 seconds
			timer.schedule(task, date.getTime()); 
			
			timer.scheduleAtFixedRate(task, 0, 1000);
			timer.scheduleAtFixedRate(task, date.getTime(), 1000); //scheduled for whatever date.getTime() is passing through

			/*
			 * 	thread = A thread of execution in a program (kind of like a virtual CPU)
			 * 
			 * 			 The JVM allows an application to have multiple threads running concurrently 
			 * 			 
			 * 			 Each thread can execute parts of your code in parallel with the main thread
			 * 
			 * 			 Each thread has a priority
			 * 
			 * 			 Threads with higher priority are executed in preference compared to threads with a lower priority 
			 * 
			 * 			 The Java Virtual Machine continues to execute threads until either of the following occurs 
			 * 			 	1. The exit method of class Runtime has been called
			 * 				2. All user threads have died
			 * 				
			 * 			 When a JVM starts up, there is thread which calls the main method. 
			 * 
			 * 			 This thread is called main. 11:08:52 	
			 */
			
			 System.out.println(Thread.activeCount());
			 
			 Thread.currentThread().setName("Main2"); 
			 
			 System.out.println(Thread.currentThread().getName()); 
			
			 Thread.currentThread().setPriority(10); //scaled from 1 to 10, with 10 having the highest priority 
			 
			 System.out.println(Thread.currentThread().getPriority()); //gets the priority of the current thread
			 
			 System.out.println(Thread.currentThread().isAlive());
			 
			 //
			 
			 for(int i = 3; i > 0; i--)
			 {
				 System.out.println(i); 
				 Thread.sleep(1000); 
			 }
			 
			 System.out.println("You are Done"); 
			 
			 //Creating another thread
			 
			 MyThread thread2 = new MyThread(); 
			 
			 thread2.start(); 
			 
			 System.out.println(thread2.isAlive()); 
			 
			 thread2.setName("2nd Thread");
			 
			 System.out.println(thread2.getName()); 
			 
			 thread2.setPriority(9); 
			 System.out.println(thread2.getPriority()); 
			 
			 System.out.println(Thread.activeCount()); 
			 
			 //Daemon threads is a low priority thread that runs in the background to perform 
			 //JVm terminates itslef when all user threads (non-daemon threads) finish their execution 
			 
			 System.out.println(thread2.isDaemon()); // checks to see if it is a daemon
			 thread2.setDaemon(true); //sets thread to be a daemon
			 
			 //Multi-threading:
			 
			 //Multi-threading is the process of executing multiple threads simultaneously 
			 // Helps maximum utilization of CPU
			 //Threads are independent, they don't affect the execution of other threads
			 //An exception in one thread will not interrupt other threads
			 //useful for serving multiple clients, multiplayer games, or other mutually independent tasks 
			 
			 
			 
			 //Creating a subclass of Thread: 11:25:04
			 
			 MyThread2 thread3 = new MyThread2(); 
			 
			 //or 
			 
			 //implements runnable interface and pass instance as an arugment to Thread
			 
			 MyRunnable runnable1 = new MyRunnable(); 
			 Thread thread4 = new Thread(runnable1); 
			 
			 thread3.start();
			 thread3.join(); 
			 thread4.start(); 
			 
			 //instance of toolbox class
			 
			 Toolbox toolbox = new Toolbox(); 
			 
			 //Compile and run Java with Command Prompt 
			 
			 //1. Make sure you have a Java JDK installed
			 //2. (optional) use a text editor and save a file as .java
			 //3. Open Command Prompt (windows) or Terminal(Mac) on your computer
			 //4. set=pathC:\\Cakow\Desktop (or wherever your Java File is
			 //5. javac HelloWorld.Java (to compile) 
			 //6. Java HellowWorld (to run a .class file, it's portable
			 
			 //Create an Executable jar with Eclipse IDE
			 //-----------------------------------------
			 //Right clock on Java Project
			 //Export 
			 //Java > Runnable JAR File
			 //At Launch Configuration, select your project
			 //At Export Destination, select where want this jar file exported to
			 //Finish
			 
			 //Create an executable jar with IntelliJ
			 //File > Project Structure > Artifacts > (+) > JAR > jar from module with dependencies 
			 //Main Class: select the class containing your method
			 //ok 
			 
			 //If you want an icon, convert an image to a .ico file
			 //----------------------------------------------------
			 //https://icoconvert.com/this is a decent site
			 //Choose your image
			 //Upload
			 //Convert to ICO
			 //Download your icon
			 
			 //Use Launch4 to create an .exe with custom icon
			 //Install Launch4 http://launch4j.sourceforge.net
			 //Jar: Browse for where you saved your jar or executable jar file
			 
			 
			 
			 
			 
			 
	} // end of main
 
//https://github.com/maxkratz/How-to-Eclipse-with-Github
//Currently on Link Eclipse with your repository step 
 
	static void hello() {
		System.out.println("Hello"); 
	} 
	
	static void hello2(String name) {
		System.out.println("Hello"+name); 
	} 
	
	static void hello3(String name, int howOldAreYou) {
		System.out.println("Hello"+name);
		System.out.println("You are "+howOldAreYou); 
	} 
	
	static int add(int numberOne, int numberTwo){
		int numberThree = numberOne + numberTwo; 
		return numberThree;
	}
 
	// Overloaded methods = methods that share the same name but have different parameters
	// method name + parameters = method signature
 
	static int addNumbers (int digitOne, int digitTwo) {
		System.out.println("This is overloaded method #1");
		return digitOne + digitTwo; 
	}
 
	static int addNumbers (int digitOne, int digitTwo, int digitThree) {
		System.out.println("This is overloaded method #2");
		return digitOne + digitTwo + digitThree; 
	}
 
	static int addNumbers (int digitOne, int digitTwo, int digitThree, int digitFour) {
		System.out.println("This is overloaded method #3");
		return digitOne + digitTwo + digitThree + digitFour; 
	}
 
	static double addNumbers (double digitOne, double digitTwo) {
		System.out.println("This is overloaded method #4");
		return digitOne + digitTwo; 
	}
 
	static double addNumbers (double digitOne, double digitTwo, double digitThree) {
		System.out.println("This is overloaded method #5");
		return digitOne + digitTwo + digitThree; 
	}
 
	static double addNumbers (double digitOne, double digitTwo, double digitThree, double digitFour) {
		System.out.println("This is overloaded method #6");
		return digitOne + digitTwo + digitThree + digitFour; 
	}
	
	public static void displayArray(Integer[] array)
	{
		for(Integer x : array)
		{
			System.out.println(x+" "); 
		}
		System.out.println(); 
	}
	
	public static void displayArray(Double[] array)
	{
		for(Double x : array)
		{
			System.out.println(x+" "); 
		}
		System.out.println(); 
	}
	
	public static void displayArray(Character[] array)
	{
		for(Character x : array)
		{
			System.out.println(x+" "); 
		}
		System.out.println(); 
	}
	
	public static void displayArray(String[] array)
	{
		for(String x : array)
		{
			System.out.println(x+" "); 
		}
		System.out.println(); 
	}
 
	public static <Thing> void displayArray(Thing[] array)
	{
		for(Thing x : array)
		{
			System.out.println(x+" "); 
		}
		System.out.println(); 
	}
	
	public static <Thing> Thing getFirst(Thing[] array)
	{
		return array[0]; 
	}
}