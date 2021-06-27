/***************************************************************
 *@purpose Implementing Mood Analyzer Problem.
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 **************************************************************/

package com.MoodAnalyzer_Program;

/**
 * taken enum to take null and empty value which is not be changed
 */

public class MoodAnalysisException extends Exception {

	enum ExceptionType {

		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	/**
	 * Parameterize constructor of the class
	 * 
	 * @param type
	 * @param message
	 */

	public MoodAnalysisException(ExceptionType type, String message) {

		super(message);
		this.type = type;
	}

}