import javax.swing.JOptionPane;

public class GotHoroscope {
public static void main(String[] args) {
	String userStarSign = JOptionPane.showInputDialog("What is your star sign?");
	if(userStarSign.equals("Aries")) {
		JOptionPane.showMessageDialog(null, "The symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge.");
	}
	else if(userStarSign.equals("Taurus")) {
		JOptionPane.showMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical.");
	}
	else {
		JOptionPane.showMessageDialog(null, "Invalid sign or is not in database.");
	}
}
}
