/***************************************************************
 *@purpose Implementing Mood Analyzer Problem.
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 **************************************************************/

package com.MoodAnalyzer_Program;

/**
 * MoodAnalyser is a class of public type. In this class, 
 * Handling Exception if User Provides Invalid Mood, like Null
 */
public class MoodAnalyser {

	public String message;

	/**
	 * analyseMood is a method to check if sad message then return sad .
	 * if happy message then return happy
	 * 
	 * @param message
	 * @return string value
	 */
	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		return "HAPPY";
	}

	/**
	 * Parameterized constructor of the class
	 * 
	 * @param message
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * Default constructor
	 */
	public MoodAnalyser() {
		this.message = message;
	}

	/**
	 * exceptionAnalyseMood is a function check if message contain sad then return sad. 
	 * if contain happy then return happy if contain null then also return happy
	 * 
	 * @return string value
	 * @throws MoodAnalysisException 
	 */
	public String exceptionAnalyseMood() throws MoodAnalysisException {
		try {
			if (message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"please enter proper message");
			if (message.contains("sad"))
				return "SAD";
			return "HAPPY";
		} 
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}
}