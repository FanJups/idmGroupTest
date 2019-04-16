package com.raceresults.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.raceresults.model.TimeDuration;

public class RaceResults {

	// protected ArrayList<Contestant> contestantsList = new
	// ArrayList<Contestant>();

	public Map<String, Integer> contestantsMap = new HashMap<>();

	public RaceResults() {

	}

	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		// contestantsList.add(new Contestant(tagNumber, resultTime));

		contestantsMap.put(tagNumber, resultTime.getSeconds());

	}

	public void printResults() {

		// LinkedHashMap preserve the ordering of elements in which they are inserted
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

		contestantsMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

		System.out.println("Ordered by increasing result time  : " + sortedMap);

	}

}
