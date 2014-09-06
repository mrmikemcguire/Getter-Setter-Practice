import java.util.ArrayList;
import java.util.Scanner;


public class Scorer
	{
	static ArrayList <Student> results = new ArrayList <Student>();


	public static void main(String[] args)
		{
		results.add(new Student("Smith", 47));
		results.add(new Student("Rodriguez", 97));
		results.add(new Student("Nguyen", 79));
		results.add(new Student("Jenkins", 21));
		results.add(new Student("Jackson", 88));
		
		displayScores();
		addScore();
		displayScores();
		adjustScores();
		displayScores();
		}
	
	public static void addScore()
		{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please input the student's name: ");
		String newName = userInput.nextLine();
		System.out.println("Please input his or her score (1-100): ");
		int newScore = userInput.nextInt();
		
		results.add (new Student(newName, newScore));
		}
	
	public static void displayScores()
		{
		for (Student s : results)
			{
			System.out.println("Name: " + s.getName() + "\tScore: " + s.getScore());
			}
		System.out.println();
		}
	
	public static void adjustScores()
		{
		for (int i = 0; i < results.size(); i++)
			{
			if (results.get(i).getScore() < 55)
				{
				results.get(i).setScore(55);
				}
			}
		}
	}
