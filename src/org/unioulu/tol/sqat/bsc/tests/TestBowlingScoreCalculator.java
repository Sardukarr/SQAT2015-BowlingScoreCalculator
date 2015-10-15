package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	@Test
	public void testFrameAdd() {
		//Arrange
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(2,4);
		//Act
		game.addFrame(frame);
		//Assert
		
		assertEquals(1,game.getFrames().size(),0);
	}
	@Test
	public void testScoreOfFreme() {
		//Arrange
		Frame frame = new Frame(2,4);
		//Act
		
		//Assert
		
		assertEquals(6,frame.score(),0);
	}
	@Test
	public void DefinitionOfGame() {
		//Arrange
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(2,4);
		//Act
		game.addFrame(frame);
		//Assert
		
		assertEquals(10,game.getFrames().size(),0);
	}
	
}
