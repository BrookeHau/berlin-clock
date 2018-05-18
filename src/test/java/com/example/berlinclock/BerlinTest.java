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
		String light = clock.topRowLightColor(1);
		assertThat(lights, is("O"));
		assertThat(light, is("O"));
	}
	
	@Test
	public void firstTopRowSecondtLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(11, 25, 1);
		String lights = clock.topRowLightColor(2);
		String light = clock.topRowLightColor(1);
		assertThat(lights, is("R"));
		assertThat(light, is("R"));
	}
	
	@Test
	public void firstTopRowThirdLightShouldBeOff() {
		BerlinClock clock = new BerlinClock(11, 25, 1);
		String lights = clock.topRowLightColor(3);
		String light = clock.topRowLightColor(1);
		assertThat(lights, is("O"));
		assertThat(light, is("R"));
	}
	
	@Test
	public void firstTopRowThirdLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(15, 25, 1);
		String lights = clock.topRowLightColor(3);
		String light = clock.topRowLightColor(2);
		assertThat(lights, is("R"));
		assertThat(light, is("R"));
	}
	
	@Test
	public void firstTopRowFourthLightShouldBeOff() {
		BerlinClock clock = new BerlinClock(15, 25, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.topRowLightColor(2);
		assertThat(lights, is("O"));
		assertThat(light, is("R"));
	}
	
	@Test
	public void firstTopRowFourthLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(20, 25, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.topRowLightColor(2);
		String light2 = clock.secondRowLightColor(1);
		assertThat(lights, is("R"));
		assertThat(light, is("R"));
		assertThat(light2, is("O"));
	}
	@Test
	public void testingMoreFromAbove() {
		BerlinClock clock = new BerlinClock(4, 25, 2);
		String lights = clock.topRowLightColor(4);
		String light = clock.topRowLightColor(2);
		String light2 = clock.secondRowLightColor(1);
		String secs = clock.toplampColor();
		assertThat(lights, is("O"));
		assertThat(light, is("O"));
		assertThat(light2, is("R"));
		assertThat(secs, is("Y"));
	}
	
	@Test
	public void secondTopRowFirstLightShouldBeRed() {
		BerlinClock clock = new BerlinClock(21, 25, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.secondRowLightColor(1);
		assertThat(lights, is("R"));
		assertThat(light, is("R"));
	}
	
	@Test
	public void firstRowFirstLightOfMinutesShouldBeOff() {
		BerlinClock clock = new BerlinClock(21, 1, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.firstRowMinutesLightColor(1);
		String light2 = clock.firstRowMinutesLightColor(2);
		assertThat(lights, is("R"));
		assertThat(light, is("O"));
		assertThat(light2, is("O"));
	}
	@Test
	public void firstRowFirstLightOfMinutesShouldBeY() {
		BerlinClock clock = new BerlinClock(21, 15, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.firstRowMinutesLightColor(1);
		String light2 = clock.firstRowMinutesLightColor(2);
		String light3 = clock.firstRowMinutesLightColor(4);
		String test = clock.firstRowMinutesLightColor(3);		
		String light4 = clock.secondRowMinutesLightColor(2);
		assertThat(lights, is("R"));
		assertThat(light, is("Y"));
		assertThat(test, is("R"));
		assertThat(light2, is("Y"));
		assertThat(light3, is("O"));
		assertThat(light4, is("O"));
	}
	@Test
	public void secondRowFirstLightOfMinutesShouldBeY() {
		BerlinClock clock = new BerlinClock(21, 56, 1);
		String lights = clock.topRowLightColor(4);
		String light = clock.firstRowMinutesLightColor(1);
		String light2 = clock.firstRowMinutesLightColor(2);
		String light3 = clock.firstRowMinutesLightColor(4);
		String light9 = clock.firstRowMinutesLightColor(9);
		String light4 = clock.secondRowMinutesLightColor(1);
		String light5 = clock.secondRowMinutesLightColor(2);
		assertThat(lights, is("R"));
		assertThat(light, is("Y"));
		assertThat(light2, is("Y"));
		assertThat(light3, is("Y"));
		assertThat(light4, is("Y"));
		assertThat(light9, is("R"));
		assertThat(light5, is("O"));
	}
	@Test
	public void testingEverything() {
		BerlinClock clock = new BerlinClock(1, 56, 1);
		String seconds = clock.toplampColor();
		String lights = clock.topRowLightColor(4);
		String test = clock.secondRowLightColor(1);
		String light = clock.firstRowMinutesLightColor(1);
		String light2 = clock.firstRowMinutesLightColor(2);
		String light3 = clock.firstRowMinutesLightColor(4);
		String light4 = clock.secondRowMinutesLightColor(1);
		String light5 = clock.secondRowMinutesLightColor(2);
		assertThat(seconds, is("O"));
		assertThat(lights, is("O"));
		assertThat(test, is("R"));
		assertThat(light, is("Y"));
		assertThat(light2, is("Y"));
		assertThat(light3, is("Y"));
		assertThat(light4, is("Y"));
		assertThat(light5, is("O"));
	}
}
