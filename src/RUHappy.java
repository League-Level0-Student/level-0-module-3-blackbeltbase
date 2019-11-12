import javax.swing.JOptionPane;

public class RUHappy {
public static void main(String[] args) {
	String userHappyOrNot = JOptionPane.showInputDialog("Are You Happy?");
	if(userHappyOrNot.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if(userHappyOrNot.equalsIgnoreCase("no")) {
		String wantsHappy = JOptionPane.showInputDialog("Do you want to be happy?");
		if(wantsHappy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, " Change something.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
}
}
