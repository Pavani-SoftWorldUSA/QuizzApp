package com.pav.app.quizz;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		String q1= "What is super class for every class in java?\n"
				+"(a)String\n(b)Object\n(c)Math\n(d)System\n";
		
		String q2= "Which of the following is not a java.lang.String class method?\n"
				+"(a)trim\n(b)length\n(c)reverse\n(d)split\n";
		
		String q3= "What is the output of 10 >>  1?\n"
				+"(a)10\n(b)5\n(c)20\n(d)1\n";
		
		String q4= "Which of following is not true about Java?\n"
				+"(a)Platform Independent\n(b)Uses Byte code\n(c)When compile generates.exe file\n(d)Java has interfaces\n";
		
		String q5= "Which of the following is not a valid data types in Java?\n"
				+"(a)int\n(b)byte\n(c)short\n(d)array\n";
		
		
		
		Question [] questions= {
				
				new Question(q1,"b"),
				new Question(q2,"c"),
				new Question(q3,"d"),
				new Question(q4,"c"),
				new Question(q5,"d")
				
		};
		
		takeTest(questions);
	}
	
	public static void takeTest(Question[] questions)
	{
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		for(int i=0; i<questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
	        if(answer.equals(questions[i].answer)) {
	            score++;
	        }
	    }
	    System.out.println("You got " + score + "/" + questions.length);
	}
	
		
		
	}


