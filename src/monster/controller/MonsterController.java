package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup; //enable popup,also import MonsterDisplay;
	
	
	public MonsterController()
	{
		popup = new MonsterDisplay(); //to be able to be shown
	}
	public void start()
	{
		// commented out System.out.println() because to practice the popup.displayText
		MarshmallowMonster sample = new MarshmallowMonster();
		//System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Fred", 1,2,2,true);
		
	//	System.out.println(realMonster);
		popup.displayText(realMonster.toString());
	//	System.out.println("Brittney is hungry, so he is going to eat a tentacle");
		popup.displayText("Brittney is hungry, so she is going to eat a tentacle");
		realMonster.setTentacleAmount(2);
	//	System.out.println(realMonster);
		popup.displayText(realMonster.toString());		
		interactWithTheMonster(realMonster);
	}
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	//commented out System.out.println() to practice popup.displayText
	{	
//		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + " wants to know what to eat next");
//		System.out.println(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
//		System.out.println("How many do you want to eat?");
		//Learning to use getResponse, Valid, try/catch, and unconverted
		int specialAnswer = 0;
		String unconverted = popup.getResponse("How many do you want to eat?");
		if(isValidInteger(unconverted))
		{
			specialAnswer =  Integer.parseInt(unconverted);
		}
		
		Scanner myScanner = new Scanner(System.in);
		
		int consumed = 0;
		consumed = specialAnswer;
		
		//Learning to use if statement for eating body parts off the monster
		if(consumed < 0)
		{
			//System.out.println("You cannot eat a negative amount silly human.");
			popup.displayText("You cannot eat a negative amount silly human.");
		
		}
		else if (consumed == 0)
		{
			//System.out.println("Not that hungry are you");
			popup.displayText("Not that hungry are you");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			//System.out.println("that is impossible - I only have" + currentMonster.getArmCount()+"arms!!!");
			popup.displayText("that is impossible - I only have " + currentMonster.getArmCount()+ "arms!!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			//System.out.println("Thank you I only have this many arms now: " + currentMonster.getArmCount());
			popup.displayText("Thank you I only havve this many arms now: " + currentMonster.getArmCount());
		}
		//To practice the if Statements on my own
		//System.out.println("How many eyes do you Want to eat - I only have " + currentMonster.getEyeCount());
		popup.displayText("How many eyes do you Want to eat - I only have " + currentMonster.getEyeCount());
		int consumedEyes = myScanner.nextInt();
		
		if (consumedEyes == 0)
		{
			System.out.println("Not that hungry, huh");
		}
		else if (consumedEyes > currentMonster.getEyeCount())
		{
			System.out.println("that is impossible - I only have" + currentMonster.getEyeCount()+"eyes!!!");
		}
		else if (consumedEyes < 0)
		{	//I nested an if statement but didn't finish , but not important just to practice
			System.out.println("You can't eat a negative amount silly.");
			System.out.println("Again, how many do you want to eat again.");
			int newconsumedEyes = myScanner.nextInt();
			
			if (newconsumedEyes == 1 )
			{
				currentMonster.setEyeCount(currentMonster.getEyeCount() - newconsumedEyes);
				System.out.println("Now I only have " + currentMonster.getEyeCount() + " eyes left.");
			}
						
		}	
		else
		{
			currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
			System.out.println("Now I only have this many " + currentMonster.getEyeCount() +" eyes left.");
		}
		//first use of popup display
		popup.displayText("Hey look at me  !!!!");
		String answer = popup.getResponse("How many meals are you eating today");
		System.out.println(answer);
		popup.displayText(answer);
	}

	//Helper methods
	// learning to use a helper methods and how they work and same layout for Integer, Boolean, and Double only works on this for Valid
	private boolean isValidInteger(String sample)
	{  
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only integervalues are valid: " + sample + " is not");
		}
		
		return valid;
	}
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only doble values are valid: " + sampleDouble + " is not. ");
		}
		return valid;
	}
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Only true or False is valid: " + sampleBoolean + " is not. ");
		}
		return valid;
	}
}
