package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
		BowlingGame game = setup();
		//Act
		//Assert
		
		assertEquals(10,game.getFrames().size(),0);
	}
	
	@Test
	public void GameScoreTest() {
		//Arrange
		BowlingGame game = setup();
		//Act
		//Assert
		
		assertEquals(81,game.score(),0);
	}
	@Test
	public void StrikeRecognation() {
		//Arrange
		Frame frame = new Frame(10,0);
		//Act
		
		//Assert
		
		assertTrue(null,frame.isStrike());
	}
	@Test
	public void GameScoreWithStrikeTest() {
		//Arrange
		BowlingGame game = setup();
		Frame strike = new Frame (10,0);
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, strike);
		game.setFrames(temp);
		//Assert
		
		assertEquals(94,game.score(),0);
	}
	
	private BowlingGame setup() {
		BowlingGame game = new BowlingGame();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(4,4));
		game.addFrame(new Frame(5,3));
		game.addFrame(new Frame(3,3));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(8,1));
		game.addFrame(new Frame(2,6));
		return game;
	}
	
}
