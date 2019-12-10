package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_Score {
public static void main(String[] args) {
	
	String Score = JOptionPane.showInputDialog(null, "What was your Test Score?");
	Double TScore = Double.parseDouble(Score);
	
	if (TScore >= 75) {
		JOptionPane.showMessageDialog(null, "Good job, next time do better or die.");
	}
	else if (TScore <= 74) {
		JOptionPane.showMessageDialog(null, "Pathetic, Die.");
	}
}
}
