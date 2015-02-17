package com.split;

import java.util.Random;

/**
 * @author vinay.pawar
 *
 */
public class SplitInProportion {
	
	private static Random r = new Random();
	
	public void printRandom(Divisional divisional1,Divisional divisiona2) throws InterruptedException {
		for (int i = 0; i < 100; i++) {
			System.out.println("Next text is :: "+r.nextInt(100));
			//Thread.sleep(2000);
		}	
	}
	
	private long getProprtion(Divisional divisional) {
		if(divisional.getSection1() > divisional.getSection2()) {
			return divisional.getSection1()/divisional.getSection2();
		} else {
			return divisional.getSection2()/divisional.getSection1();
		}
	}
	
	public static void main(String[] args) {
		try {
			new SplitInProportion().printRandom(null,null);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
