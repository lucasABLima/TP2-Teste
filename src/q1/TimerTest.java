package q1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import q1.Timer;

class Timertest {
	Timer timer = new Timer();
	
	@Test
	void getStartingTime() {
		timer = new Timer();

		long startingTime = System.currentTimeMillis();
		assertEquals(startingTime, timer.getStartingTime());
	}
	
	@Test
	void testGetTotalTimeInMillis() {
		long totalTime = System.currentTimeMillis() - timer.getStartingTime();
		assertEquals(totalTime, timer.getTotalTimeInMillis());
	}
	
	@Test
	void testGetTotalTimeInSeconds() {
		long totalTime = (System.currentTimeMillis() - timer.getStartingTime())/1000;
		assertEquals(totalTime, timer.getTotalTimeInSeconds());
	}
	
	@Test
	void testGetTotalTimeInMinutes() {
		long totalTime = ((System.currentTimeMillis() - timer.getStartingTime())/1000)/60;
		assertEquals(totalTime, timer.getTotalTimeInMinutes());
	}
	
	@Test
	void testGetTotalTimeInHours() {
		long totalTime = (((System.currentTimeMillis() - timer.getStartingTime())/1000)/60);
		assertEquals(totalTime, timer.getTotalTimeInHours());
	}
	
	@Test
	void testGetTotalTimeMillis() {
		timer.sleep(60);
		StringBuilder totalTime = new StringBuilder();
		if(timer.getTotalTimeInMillis()!=0) {
			totalTime.append((timer.getTotalTimeInMillis() - 1000*timer.getTotalTimeInSeconds()) + " milliseg.");
		}
		
		assertEquals(totalTime.toString(), timer.getTotalTime());
	}
	
	@Test
	void testGetTotalTimeSeconds() {
		timer.sleep(6000);
		StringBuilder totalTime = new StringBuilder();
		if(timer.getTotalTimeInSeconds()!=0) {
			totalTime.append((timer.getTotalTimeInSeconds() - 60*timer.getTotalTimeInMinutes()) +  " seg, ");
		}if(timer.getTotalTimeInMillis()!=0) {
			totalTime.append((timer.getTotalTimeInMillis() - 1000*timer.getTotalTimeInSeconds()) + " milliseg.");
		}
		
		assertEquals(totalTime.toString(), timer.getTotalTime());
	}
	
	@Test
	void testGetTotalTimeMinutes() {
		timer.setStartingTime(timer.getStartingTime()-60000);
		StringBuilder totalTime = new StringBuilder();
		if(timer.getTotalTimeInMinutes()!=0) {
			totalTime.append((timer.getTotalTimeInMinutes() - 60*timer.getTotalTimeInHours()) + " min, ");
		}if(timer.getTotalTimeInSeconds()!=0) {
			totalTime.append((timer.getTotalTimeInSeconds() - 60*timer.getTotalTimeInMinutes()) +  " seg, ");
		}if(timer.getTotalTimeInMillis()!=0) {
			totalTime.append((timer.getTotalTimeInMillis() - 1000*timer.getTotalTimeInSeconds()) + " milliseg.");
		}
		
		assertEquals(totalTime.toString(), timer.getTotalTime());
	}

	
	@Test
	void testGetTotalTimeHours() {
		timer.setStartingTime(System.currentTimeMillis()-3600000);
		StringBuilder totalTime = new StringBuilder();
		if(timer.getTotalTimeInHours()!=0) {
			totalTime.append(timer.getTotalTimeInHours() + " h, ");
		}if(timer.getTotalTimeInMinutes()!=0) {
			totalTime.append((timer.getTotalTimeInMinutes() - 60*timer.getTotalTimeInHours()) + " min, ");
		}if(timer.getTotalTimeInSeconds()!=0) {
			totalTime.append((timer.getTotalTimeInSeconds() - 60*timer.getTotalTimeInMinutes()) +  " seg, ");
		}if(timer.getTotalTimeInMillis()!=0) {
			totalTime.append((timer.getTotalTimeInMillis() - 1000*timer.getTotalTimeInSeconds()) + " milliseg.");
		}
		
		assertEquals(totalTime.toString(), timer.getTotalTime());
	}
	
	@Test
	void testSleep() {
		timer.sleep(60);
		assertEquals(60+timer.getStartingTime(), timer.getTotalTime());
	}
	
	/*

	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
*/

}
