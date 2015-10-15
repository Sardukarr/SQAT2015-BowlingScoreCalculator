package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame()
	{
		
	}
	
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}

	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score=0;
		boolean wasStrike=false;
		for(Frame f: frames)
		{
			score=score+f.score();
			
			if(wasStrike)
			{
				score=score+f.score();
				wasStrike=false;
			}
			if(f.isStrike())
			{
				wasStrike=true;
			}
			
			
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
