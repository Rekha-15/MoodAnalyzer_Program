/***************************************************************
 *@purpose Implementing Mood Analyzer Problem.
 *ability to analyse and respond Happy or Sad Mood.
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 **************************************************************/

package com.MoodAnalyzer_Program;

/**
 * MoodAnalyser is a class of public type.
 * In this class we are just analyzing weather user mood is sad or happy.
 *
 */
public class MoodAnalyser {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Mood Analyzer Program");
	}
         
	     /**
		 * analyseMood is a method to check if sad message
		 * then contain sad if happy then return happy
		 * @param message
		 * @return string value
		 */
	
		public String analyseMood(String message) {
	        if(message.contains("Sad"))
	            return "SAD";
	        return "HAPPY";
	    }
}
