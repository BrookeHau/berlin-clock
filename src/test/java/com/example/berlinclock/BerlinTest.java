package com.example.berlinclock;

import static org.junit.Assert.assertThat;

import org.junit.Test;
import static org.hamcrest.Matchers.is;

public class BerlinTest {

	@Test
	public void topYelloLampBlinksEveryTwoSeconds() {
		BerlinClock clock = new BerlinClock(1, 25, 0);
		String color = clock.toplampColor();
		assertThat(color, is("Y"));
	}
	
	@Test
	public void topYellowLightShouldNotBlinkAtOneSecond() {
		BerlinClock clock = new BerlinClock(1, 25, 1);
		String color = clock.toplampColor();
		assertThat(color, is("O"));
	}
	
	@Test
	public void topRowShouldHaveFourLights() {
		BerlinClock clock = new BerlinClock(1, 25, 1);
		int lights = clock.topRowLightAmount();
		assertThat(lights, is(4));
	}
	
	@Test
	public void firstTopRowFirstLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(8, 25, 1);
		String lights = clock.topRowLightColor(1);
		assertThat(lights, is("R"));
	}
	
	@Test
	public void firstTopRowFirstLightShouldBeOff() {
		BerlinClock clock = new BerlinClock(1, 25, 1);
		String lights = clock.topRowLightColor(1);
		assertThat(lights, is("O"));
	}
	@Test
	public void firstTopRowSecondtLightShouldBeOff() {
		BerlinClock clock = new BerlinClock(1, 25, 1);
		String lights = clock.topRowLightColor(2);
		assertThat(lights, is("O"));
	}
	
	@Test
	public void firstTopRowSecondtLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(11, 25, 1);
		String lights = clock.topRowLightColor(2);
		assertThat(lights, is("R"));
	}
}
