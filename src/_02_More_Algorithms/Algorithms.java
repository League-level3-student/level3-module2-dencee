package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int brokenEggIndex = -1;

		for (int i = 0; i < eggs.size(); i++) {
			if (!eggs.get(i).equalsIgnoreCase("whole")) {
				brokenEggIndex = i;
				break;
			}
		}

		return brokenEggIndex;
	}

	public static int countPearls(List<Boolean> bl) {
		int numOysertersWithPearls = 0;

		for (int i = 0; i < bl.size(); i++) {
			if (bl.get(i)) {
				numOysertersWithPearls++;
			}
		}

		return numOysertersWithPearls;
	}

	public static double findTallest(List<Double> dl) {
		double tallestHeight = -1.0;

		for (int i = 0; i < dl.size(); i++) {
			if (dl.get(i) > tallestHeight) {
				tallestHeight = dl.get(i);
			}
		}

		return tallestHeight;
	}

	public static String findLongestWord(List<String> sl) {
		String longestWord = "";

		for (int i = 0; i < sl.size(); i++) {
			if (sl.get(i).length() > longestWord.length())
				longestWord = sl.get(i);
		}

		return longestWord;
	}

	public static boolean containsSOS(List<String> messages) {
		String sosMessage = "... --- ...";
		boolean containsSosMessage = false;

		for (int i = 0; i < messages.size(); i++) {
			String message = messages.get(i);

			for (int j = 0; j <= message.length() - sosMessage.length(); j++) {

				if (message.substring(j, j + sosMessage.length()).equals(sosMessage)) {
					containsSosMessage = true;
					break;
				}
			}
		}

		return containsSosMessage;
	}

	public static List<Double> sortScores(List<Double> ld) {
		List<Double> sortedList = new ArrayList<Double>();
		double lowest;
		int lowestIndex = -1;

		for (int i = 0; i < ld.size(); i++) {

			lowest = -1;
			for (int j = 0; j < ld.size(); j++) {

				if (lowest == -1 || ld.get(j) < lowest) {
					if (!sortedList.contains(ld.get(j))) {
						lowestIndex = j;
						lowest = ld.get(j);
					}
				}
			}

			sortedList.add(ld.get(lowestIndex));
		}
		
		return sortedList;
	}
	
	public static List<String> sortDNA( List<String> ls ) {
		List<String> sortedList = new ArrayList<String>();
		double lowest;
		int lowestIndex = -1;

		for (int i = 0; i < ls.size(); i++) {

			lowest = -1.0;
			for (int j = 0; j < ls.size(); j++) {

				if (lowest == -1.0 || ls.get(j).length() < lowest) {
					if (!sortedList.contains(ls.get(j))) {
						lowestIndex = j;
						lowest = ls.get(j).length();
					}
				}
			}

			sortedList.add(ls.get(lowestIndex));
		}
		
		
		return sortedList;
	}
	
	public static List<String> sortWords( List<String> ls ) {
		List<String> sortedList = new ArrayList<String>();
		String lowest;
		int lowestIndex = -1;

		for (int i = 0; i < ls.size(); i++) {

			lowest = null;
			for (int j = 0; j < ls.size(); j++) {

				if (lowest == null || ls.get(j).compareTo(lowest) < 0 ) {
					if (!sortedList.contains(ls.get(j))) {
						lowestIndex = j;
						lowest = ls.get(j);
					}
				}
			}

			sortedList.add(ls.get(lowestIndex));
		}
		
		return sortedList;
	}
}
