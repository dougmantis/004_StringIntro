package StringPack;

import javax.swing.JOptionPane;

public class LearnStrings {
	
	private String messanger = "";
	private String word = "";
	
	public LearnStrings(String s) {
		setString(s);
	} //end of constructor

	public void setString(String s) {
		
		word = s;
		//System.out.println(word);
		messanger = ("String entered is: " + word);
		JOptionPane.showMessageDialog(null, messanger);
	} //end setString
	
	public char getFirstLetter() {
		return word.charAt(0);
	}
	
	public char getLastLetter() {
		return word.charAt(word.length() - 1);
	}
	
	public String getMidLetters() {
		return word.substring(1, word.length() - 1);
	}
	
	public int getLength() {
		return word.length();
	}

} //end of LearnStrings

/*

int	indexOf(int ch)

int indexOf(String int)

String.toUpperCase() and String.toLowerCase()		self-explanatory


'setters', 'modifiers' - control setting vars

'getters', 'accessors' - retrieve vars

*/

// to allow for jar access: 								sudo chmod 771 StringIntro004.jar 

