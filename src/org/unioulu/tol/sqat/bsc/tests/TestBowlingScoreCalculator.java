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
		
		assertEquals(0,1,0);
	}

}
