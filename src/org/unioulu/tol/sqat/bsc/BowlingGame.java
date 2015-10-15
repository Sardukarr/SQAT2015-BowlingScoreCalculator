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
		if(frames.size()==9)
			frame.setIsLast(true);
		frames.add(frame);
	}
	
	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		if(frames.size()==10)
			frames.get(9).setIsLast(true);
		
		this.frames = frames;
	}

	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score=0;
		boolean wasStrike=false;
		boolean wasDoubleStrike=false;
		boolean wasSpare=false;
		for(Frame f: frames)
		{
			score=score+f.score();
			
			if(wasStrike)
			{
				if(wasDoubleStrike)
				{
				 score=score+f.getFirstThrow();
				 wasDoubleStrike=false;
				}
			
				if(f.isStrike())
				{
					wasDoubleStrike=true;
				}
				
				score=score+f.score();
				wasStrike=false;
			}
			
			
			if(f.isStrike())
			{
				wasStrike=true;

			}
			
			if(wasSpare)
			{
				score=score+f.getFirstThrow();
				wasSpare=false;
			}
			if(f.isSpare())
			{
				wasSpare=true;
			}
			
		}
		return score;
	}
	
	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}

	public boolean isNextFrameBonus(int i){
		if(frames.get(i).isLastFrame())
			return true;
		return false;
	}
}
