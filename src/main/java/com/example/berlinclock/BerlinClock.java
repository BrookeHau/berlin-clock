package com.example.berlinclock;

public class BerlinClock {

	private int hour;
	private int minutes;
	private int seconds;

	public BerlinClock(int hour, int minutes, int seconds) {
		this.hour = hour;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	/*public int getSeconds() {
		return seconds;
	}*/

	public String toplampColor() {
		if (seconds % 2 == 0) {
			return "Y";
		}
		return "O";
	}

	public int topRowLightAmount() {
		return 4;
	}

	public String topRowLightColor(int lightNumber) {
		if(hour>=5 && lightNumber==1 ) {
			return "R";
		}
		if(hour>=10 && lightNumber==2 ) {
			return "R";
		}
		return "O";
	}

}
