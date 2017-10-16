package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {
	
	public static void main(String[] args) {
		
		String messanger = "";
		Boolean keepGoingCheck = true;
		
		do {
			
			String varWord = "";
			
			varWord = JOptionPane.showInputDialog("Enter Word:");
			
			stringDissect(varWord);
			
			keepGoingCheck = checkForContinue();
			
		} while(keepGoingCheck == true);
		
		messanger = ("Thank you for using my program.");
		JOptionPane.showMessageDialog(null, messanger);
		
	} //main
	
	private static boolean checkForContinue() { //This method is a pile of trash, but it's a functional pile of trash.

		String keepGoing = "y";
		String messanger = "";
		Boolean errorCheck = false;
		Boolean localKeepGoingCheck = true;
		
		while(errorCheck == false) {
			
			messanger = ("Would you like to continue? (y/n)");
			keepGoing = JOptionPane.showInputDialog(messanger);
			keepGoing = keepGoing.toLowerCase(); 
			
			if (keepGoing.equals("y") || keepGoing.equals("yes") || keepGoing.equals("true") || keepGoing.equals("continue")) {
				localKeepGoingCheck = true;
				errorCheck = true;
			} else if (keepGoing.equals("n") || keepGoing.equals("no") || keepGoing.equals("false") || keepGoing.equals("exit")) {
				localKeepGoingCheck = false;
				errorCheck = true;
			} else {
				messanger = ("I'm sorry, '" + keepGoing + "' is not a valid answer.");
				JOptionPane.showMessageDialog(null, messanger);
				errorCheck = false;
			} //else
			
		} //while
		return localKeepGoingCheck;
	}
	
	private static void stringDissect(String word) { //The primary function of the program, to dissect the string inputted by the user.
		
		String messanger = "";
		
		LearnStrings getIt = new LearnStrings(word);
		
		try {
			messanger = ("First Letter: " + getIt.getFirstLetter());
			JOptionPane.showMessageDialog(null, messanger);
		} catch(Exception Err) {
			JOptionPane.showMessageDialog(null, "Cannot find first letter. " + Err, "Mr. McDebug", JOptionPane.WARNING_MESSAGE);
		}
		
		try {
			messanger = ("Last Letter: " + getIt.getLastLetter());
			JOptionPane.showMessageDialog(null, messanger);
		} catch(Exception Err) {
			JOptionPane.showMessageDialog(null, "Cannot find last letter. " + Err, "Mr. McDebug", JOptionPane.WARNING_MESSAGE);
		}
		
		try {
			messanger = ("Mid Letters: " + getIt.getMidLetters());
			JOptionPane.showMessageDialog(null, messanger);
		} catch(Exception Err) {
			JOptionPane.showMessageDialog(null, "Cannot find middle letters. " + Err, "Mr. McDebug", JOptionPane.WARNING_MESSAGE);
		}
		
		
		messanger = ("Length: " + getIt.getLength() + " characters");
		JOptionPane.showMessageDialog(null, messanger);
	} //
} //class
