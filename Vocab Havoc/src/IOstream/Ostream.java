package IOstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Luis
 *
 * LEADERBOARD FORMAT
 *
 * [FRENZY] // notice: surrounded by brackets 
 * NAME, SCORE, TIME 
 * ...
 *
 * [TIME ATTACK] 
 * NAME, TIME
 *
 */
public class Ostream {

    static String path = "data/leaderboard.txt";

    protected static void stringToFile(String data, String path) throws IOException {
        File leaderboard = new File(path);
        FileWriter fw = new FileWriter(leaderboard);
        fw.write(data);
        fw.close();
    }

    protected static String numToTime(int num) {
        int sec = num % 60;
        int min = num / 60;

        String time = String.format("%02d:%02d", min, sec);
        return time;
    }

    public static void saveScoreFrenzy(String name, int wordsGuessed, int time) {
        String scoreString = "\n" + name + "," + Integer.toString(wordsGuessed) + "/5," + numToTime(time);
        float finalScore = getFinalScoreFrenzy(wordsGuessed, time);
        saveScore(scoreString, "FRENZY", finalScore);
    }

    public static void saveScoreTimeAttack(String name, int time) {
        String scoreString = "\n" + name + "," + numToTime(time);
        float finalScore = getFinalScoreTimeAttack(time);
        saveScore(scoreString, "TIME ATTACK", finalScore);
    }

    protected static float getFinalScoreFrenzy(int wordsGuessed, int time) {
        float timeScore = 100.f / time;
        float wordScore = wordsGuessed;
        float finalScore = (timeScore + wordScore) * 10;

        return finalScore;
    }

    protected static float getFinalScoreTimeAttack(int time) {
        return 100.f / time;
    }

    protected static float getFinalScoreFromString(String score, String mode) {
        float finalScore = getFinalScoreFromString(score.split(","), mode);

        return finalScore;

    }

    protected static float getFinalScoreFromString(String[] scores, String mode) {
        float finalScore = 0;

        switch (mode) {
            case "FRENZY": {

                int wordsGuessed = Character.getNumericValue(scores[1].charAt(0));

                int min = Integer.parseInt(scores[2].substring(0, 2));
                int sec = Integer.parseInt(scores[2].substring(3, 5));
                int time = (min * 60) + sec;

                finalScore = getFinalScoreFrenzy(wordsGuessed, time);
            }
            break;

            case "TIME ATTACK": {

                int min = Integer.parseInt(scores[1].substring(0, 2));
                int sec = Integer.parseInt(scores[1].substring(3, 5));
                int time = (min * 60) + sec;

                finalScore = getFinalScoreTimeAttack(time);
            }
            break;
        }

        return finalScore;

    }

    protected static int getRank(float finalScore, String mode) {
        String[] score = Istream.getScore(1, mode);
        if (score == null) {
            return 1;
        }

        ArrayList<String[]> scores = new ArrayList<String[]>();
        for (int i = 2; score != null; i++) {
            scores.add(score);
            score = Istream.getScore(i, mode);
        }

        Float[] finalScores = new Float[scores.size()];
        for (int i = 0; i < finalScores.length; i++) {
            finalScores[i] = getFinalScoreFromString(scores.get(i), mode);
        }

        // sort finalScores
        Arrays.sort(finalScores, Collections.reverseOrder());

        // find the rank
        int prevIndex = 0;
        int currentIndex = 0;
        int result = 0;
        for (int i = 0; i < finalScores.length; i++) {
            prevIndex = currentIndex;
            currentIndex = i;
            if (finalScore > finalScores[i]) {
                result = currentIndex;
                break;
            }
            result = currentIndex + 1;
        }

        return result + 1;
    }

    protected static void saveScore(String scoreString, String mode, float finalScore) {
        // load the file as string so we can manipulate it
        String leaderboard = "";
        try {
            leaderboard = Istream.fileToString(path);
        } catch (IOException ex) {
            System.out.println("failed to save score :(");
            return;
        }

        int startIndex = Istream.getWordEnclosedIndex(leaderboard, mode, '[', ']');
        int rank = getRank(finalScore, mode);
        int newlinesFound = 0;
        int appendIndex = 0;
        for (int i = startIndex; i < leaderboard.length(); i++) {
            if (leaderboard.charAt(i) == '\n') {
                newlinesFound++;
                if (newlinesFound == rank) {
                    appendIndex = i;
                    break;
                }
            }
        }

        // we will append the new scores here
        String startOfScores = leaderboard.substring(0, appendIndex);

        // and then concat it with the rest of the string
        String everythingElse = leaderboard.substring(appendIndex);

        startOfScores += scoreString;
        leaderboard = startOfScores + everythingElse;

        // and then write the concatinated string to the save file
        try {
            stringToFile(leaderboard, path);
        } catch (IOException ex) {
            System.out.println("failed to save score :(");
        }
    }
}
