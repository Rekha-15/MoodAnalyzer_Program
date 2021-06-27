/***************************************************************
 *@purpose Implementing Mood Analyzer Problem.
 *@author Rekha
 *@version 1.0
 *@since 18-06-2021
 **************************************************************/

package com.MoodAnalyzer_Program;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * MoodAnalyserTest is a class of public type
 * In this class we are testing user moods
 * If user states , user is in sad mood, Our mood analyzer returns sad
 * If user states , user is in happy mood, Our mood analyzer returns happy
 */

public class MoodAnalyserTest {

	/**
	 * @method givenSadMessageReturnSad is to test weather user in in sad mood
	 * @Test User is in sad mood
	 * @return Sad
	 */
	
	@Test
	public void givenSadMessageReturnSad() {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Sad");
		Assert.assertEquals("SAD", mood);
	}
	
	/**
	 * @method givenHappyMessageReturnHappy is to test for users happy mood.
	 * @Test If user is in happy mood
	 * @return Happy
	 */

	@Test
	public void givenHappyMessageReturnHappy() {
		MoodAnalyser MoodAnalyserTest = new MoodAnalyser();
		String mood = MoodAnalyserTest.analyseMood("Hello i am Happy");
		Assert.assertEquals("HAPPY", mood);
	}
}