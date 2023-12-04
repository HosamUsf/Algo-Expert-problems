package org.hosam.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * *
 * There's an algorithms tournament taking place in which teams of programmers
 * compete against each other to solve algorithmic problems as fast as possible.
 * Teams compete in a round robin, where each team faces off against all other
 * teams. Only two teams compete against each other at a time, and for each
 * competition, one team is designated the home team, while the other team is
 * the away team. In each competition there's always one winner and one loser;
 * there are no ties. A team receives 3 points if it wins and 0 points if it
 * loses. The winner of the tournament is the team that receives the most amount
 * of points.
 * <p>
 * <p>
 * Given an array of pairs representing the teams that have competed against
 * each other and an array containing the results of each competition, write a
 * function that returns the winner of the tournament. The input arrays are
 * named
 * <p>
 * Sample Input = [ ["HTML", "C#"], ["C#", "Python"], ["Python", "HTML"], ], [0,
 * 0, 1]
 * <p>
 * Sample Output = "Python"
 */
public class TournamentWinner {

    //  time complexity is O(n) and space complexity is o(m)
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        String tWinner = null;
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < competitions.size(); i++) {
            String home = competitions.get(i).get(0);
            String away = competitions.get(i).get(1);
            String winner = results.get(i) == 1 ? home : away;
            map.put(winner, map.getOrDefault(winner, 0) + 3);
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                tWinner = entry.getKey();
            }
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}
