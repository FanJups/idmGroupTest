package timeduration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import timeduration.exception.BadBadValueException;
import timeduration.model.TimeDuration;

public class TestTimeDuration {

	@Test
	public void testToString0() throws BadBadValueException {

		assertEquals("0s", new TimeDuration(0).toString());

	}

	@Test
	public void testToString732() throws BadBadValueException {

		assertEquals("12m 12s", new TimeDuration(732).toString());

	}

	@Test
	public void testToString7242() throws BadBadValueException {

		assertEquals("2h 0m 42s", new TimeDuration(7242).toString());

	}

	@Test(expected = BadBadValueException.class)
	public void testToStringNegative() throws BadBadValueException {

		System.out.println(new TimeDuration(-2).toString());

	}

}
