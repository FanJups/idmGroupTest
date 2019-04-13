package com.timeduration.model;

import com.timeduration.exception.BadBadValueException;

public class TimeDuration {

	protected int seconds;

	public TimeDuration(int secondsInput) throws BadBadValueException {

		try {

			if (secondsInput < 0)
				throw new BadBadValueException("Incorrect number because it's negative");

			this.seconds = secondsInput;

		} catch (BadBadValueException e) {

			throw e;

		}
	}

	public String toString() {

		String result = "";

		int sec = seconds % 60;
		int h = seconds / 60;
		int min = h % 60;
		h = h / 60;

		if (h == 0) {

			if (min == 0) {

				result = sec + "s";

			} else {

				result = min + "m " + sec + "s";

			}

		} else {

			result = h + "h " + min + "m " + sec + "s";

		}

		return result;

	}

}
