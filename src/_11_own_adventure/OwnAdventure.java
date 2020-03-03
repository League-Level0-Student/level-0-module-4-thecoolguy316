package _11_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "HEEYY!!");
	JOptionPane.showMessageDialog(null, "A man has fallen into the river in LEGO CITY!");
String Start = JOptionPane.showInputDialog(null, "In the scene you find 3 people. His mom, girfriend, and his dog.");
  if (Start.equalsIgnoreCase("his mom")) {
	  JOptionPane.showMessageDialog(null, "Build a HELICOPTER, pick up his mom, drop from 1000 meters in the air, and SAVE the day!!");  
  }
  else if (Start.equalsIgnoreCase("his girlfriend")) {
	  JOptionPane.showMessageDialog(null, "Build a POLICE CAR, aim straight for his girlfriend, run her over, and SAVE the day!!");
  }
  else if (Start.equalsIgnoreCase("his dog")) {
	  JOptionPane.showMessageDialog(null, "Build a BOAT, get his dog, throw the dog into a strong river, and SAVE the day!!");
  }
  else if (Start.equalsIgnoreCase("Nobody")) {
	  JOptionPane.showMessageDialog(null, "ok");
  }
}
}
