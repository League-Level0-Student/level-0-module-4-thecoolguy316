package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickles = JOptionPane.showInputDialog(null, "How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int N = Integer.parseInt(Nickles);
		// Ask the user how many dimes they have, and convert their answer
String Dimes = JOptionPane.showInputDialog(null, "How many Dimes do you have?");
int D = Integer.parseInt(Dimes);
		// Ask the user how many quarters they have, and convert their answer
String Quarters = JOptionPane.showInputDialog(null, "How many Quarters do you have?");
int Q = Integer.parseInt(Quarters);
		// Calculate how much money the user has and save it in a double variable 
Double First_Number, Second_Number, Third_Number, Answer;
		// Tell the user how much money they have
First_Number = N * 0.05;
Second_Number = D * 0.10;
Third_Number = Q * 0.25;
Answer = First_Number + Second_Number + Third_Number;
System.out.println(Answer);
	}
}

