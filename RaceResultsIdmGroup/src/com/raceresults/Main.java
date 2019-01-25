package com.raceresults;

public class Main {

	public static void main(String[] args) throws BadBadValueException {
		// TODO Auto-generated method stub

		// main method that simulates a bunch of arrivals and prints the results

		RaceResults race = new RaceResults();

		// Bunch of Arrivals

		race.onNewResult("azerty", new TimeDuration(45));

		race.onNewResult("azer0ty", new TimeDuration(500));
		race.onNewResult("azeidm", new TimeDuration(44));
		race.onNewResult("aze065", new TimeDuration(43));
		race.onNewResult("azfan", new TimeDuration(458));
		race.onNewResult("azjuserty", new TimeDuration(459));
		race.onNewResult("azerty", new TimeDuration(100));
		race.onNewResult("azjnserty", new TimeDuration(4));
		race.onNewResult("az76rterty", new TimeDuration(4));

		System.out.println("******NO ORDER *** : " + race.contestantsMap);

		System.out.println("************ ");

		// Prints results

		race.printResults();

		// Question

		/*
		 * what can go wrong with the system? does the code handle it properly? (please
		 * write your answer as a comment in the main method)
		 */

		// Answer

		/*
		 * It's possible that at least two contestants have the same race time.
		 * 
		 * If a race time appears at least two times, the map is ordered alphabetically
		 * based on tag number. In this case, we will not have a unique winner
		 * 
		 * The race time can be negative. In this case BadaBadValueException is thrown.
		 * 
		 * The code handles all cases properly.
		 * 
		 * 
		 * 
		 */

	}

}
