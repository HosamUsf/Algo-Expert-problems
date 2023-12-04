package org.hosam;

import org.hosam.easy.TournamentWinner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TournamentWinner tournamentWinner = new TournamentWinner();

        // Sample Input
        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(new ArrayList<>(List.of("HTML", "C#")));
        competitions.add(new ArrayList<>(List.of("C#", "Python")));
        competitions.add(new ArrayList<>(List.of("Python", "HTML")));

        ArrayList<Integer> results = new ArrayList<>(List.of(0, 0, 1));

        // Sample Output
        String winner = tournamentWinner.tournamentWinner(competitions, results);
        System.out.println("Tournament Winner: " + winner);
    }

}
