package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.MonsterDisplay;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Fred", 1,2,2,true);
		
		System.out.println(realMonster);
		System.out.println("Brittney is hungry, so he is going to eat a tentacle");
		realMonster.setTentacleAmount(2);
		System.out.println(realMonster);
		
		interactWithTheMonster(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggest arms, they have " + currentMonster.getArmCount());
		System.out.println("How many do you want to eat?");
		Scanner myScanner = new Scanner(System.in);
		int consumed = myScanner.nextInt();
		
		if(consumed < 0)
		{
			System.out.println("You cannot eat a negative amount silly human.");
		
		}
		else if (consumed == 0)
		{
			System.out.println("Not that hungry are you");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			System.out.println("that is impossible - I only have" + currentMonster.getArmCount()+"arms!!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("Thank you I only havve this many arms now: " + currentMonster.getArmCount());
		}
		
		System.out.println("How many eyes do you Want to eat - I only have " + currentMonster.getEyeCount());
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
		{	
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
		
		popup.displayText("Hey look at me  !!!!");
		String answer = popup.getResponse("How many meals are you eating today");
		System.out.println(answer);
		popup.displayText(answer);
	}

}
