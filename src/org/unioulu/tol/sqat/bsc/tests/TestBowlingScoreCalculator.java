package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {

	Frame strike = new Frame(10,0);
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

		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, strike);
		game.setFrames(temp);
		//Assert
		
		assertEquals(94,game.score(),0);
	}
	@Test
	public void SpareRecognation() {
		//Arrange
		Frame frame = new Frame(1,9);
		//Act
		
		//Assert
		
		assertTrue(null,frame.isSpare());
	}
	@Test
	public void GameScoreWithSpareTest() {
		//Arrange
		BowlingGame game = setup();
		Frame spare = new Frame (1,9);
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, spare);
		game.setFrames(temp);
		//Assert
		
		assertEquals(88,game.score(),0);
	}
	
	@Test
	public void GameScoreWithSpareAndStrikeTest() {
		//Arrange
		BowlingGame game = setup();
		Frame spare = new Frame (4,6);

		
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, strike);
		temp.set(1, spare);
		game.setFrames(temp);
		//Assert
		
		assertEquals(103,game.score(),0);
	}
	@Test
	public void GameScoreWith2xStrikesTest() {
		//Arrange
		BowlingGame game = setup();
		
		
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, strike);
		temp.set(1, strike);
		game.setFrames(temp);
		//Assert
		
		assertEquals(112,game.score(),0);
	}
	@Test
	public void GameScoreWith2xSpareTest() {
		//Arrange
		BowlingGame game = setup();
		Frame spare = new Frame (8,2);
		Frame spare2 = new Frame (5,5);
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(0, spare);
		temp.set(1, spare2);
		game.setFrames(temp);
		//Assert
		
		assertEquals(98,game.score(),0);
	}
	
	@Test
	public void LastFrameTest() {
		//Arrange
		BowlingGame game = setup();
		Frame frame = game.getFrames().get(9);
		//Act
		
		//Assert
		
		assertTrue(null,frame.isLastFrame());
	}
	
	@Test
	public void GameScoreWithLastSpareTest() {
		//Arrange
		BowlingGame game = setup();
		Frame spare = new Frame (2,8);
		Frame Bonus = new Frame (7,0);
		//Act
		List<Frame> temp = new ArrayList<Frame>();
		temp=game.getFrames();
		temp.set(9, spare);
		game.setFrames(temp);
		//Assert
		
		assertEquals(90,game.score(),0);
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
