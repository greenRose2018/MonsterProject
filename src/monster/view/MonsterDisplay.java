package monster.view;

import javax.swing.JOptionPane;


public class MonsterDisplay
{	
	public void displayText(String textToDisplay)
	{
		JOptionPane.showMessageDialog(null, textToDisplay);
	}// needs import (look at the top), To be able to show popup display.
	
	
	public String getResponse(String questionAsked)
	{	//To be able to get a response through the popup, have to do to be able to return
		String response = "";
		
		response += JOptionPane.showInputDialog(null, questionAsked);
		
		return response;
		
	}

}
