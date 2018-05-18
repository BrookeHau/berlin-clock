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
		if (hour >= 20 && lightNumber == 4) {
			return "R";
		}
		if (hour >= 15 && lightNumber == 3) {
			return "R";
		}
		if (hour >= 10 && lightNumber == 2) {
			return "R";
		}
		if (hour >= 5 && lightNumber == 1) {
			return "R";
		}

		return "O";
	}

	public String secondRowLightColor(int lightNumber) {
		if (hour >= 24 || (hour >= 4 && hour < 5) && lightNumber == 4) {
			return "R";
		}
		if (hour >= 23 || (hour >= 3 && hour < 5) && lightNumber == 3) {
			return "R";
		}
		if (hour >= 22 || (hour >= 2 && hour < 5) && lightNumber == 2) {
			return "R";
		}
		if (hour >= 21 || (hour >= 1 && hour < 5) && lightNumber == 1) {
			return "R";
		}
		return "O";
	}

	public String firstRowMinutesLightColor(int lightNumber) {
		if (minutes >= 55 && lightNumber == 11) {
			return "Y";
		}
		if (minutes >= 50 && lightNumber == 10) {
			return "Y";
		}
		if (minutes >= 45 && lightNumber == 9) {
			return "Y";
		}
		if (minutes >= 40 && lightNumber == 8) {
			return "Y";
		}
		if (minutes >= 35 && lightNumber == 7) {
			return "Y";
		}
		if (minutes >= 30 && lightNumber == 6) {
			return "Y";
		}
		if (minutes >= 25 && lightNumber == 5) {
			return "Y";
		}
		if (minutes >= 20 && lightNumber == 4) {
			return "Y";
		}
		if (minutes >= 15 && lightNumber == 3) {
			return "Y";
		}
		if (minutes >= 10 && lightNumber == 2) {
			return "Y";
		}
		if (minutes >= 5 && lightNumber == 1) {
			return "Y";
		}
		return "O";
	}

	public String secondRowMinutesLightColor(int lightNumber) {
		if (minutes >= 59 && lightNumber == 4) {
			return "Y";
		}
		if (minutes >= 58 && lightNumber == 3) {
			return "Y";
		}
		if (minutes >= 57 && lightNumber == 2) {
			return "Y";
		}
		if (minutes >= 56 && lightNumber == 1) {
			return "Y";
		}
		return "O";
	}

}
