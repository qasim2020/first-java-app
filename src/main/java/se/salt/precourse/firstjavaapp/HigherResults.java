package se.salt.precourse.firstjavaapp;

import java.util.HashMap;
import java.util.Map;

public class HigherResults extends TestResults {
    public static void main(String[] args) {
        System.out.println( listHigherResult(TestResults.getOriginalGrades(), TestResults.getMakeUpGrades() ) );
    }

    public static Map listHigherResult(Map originalGrades, Map makeUpGrades) {
        Map<String,Integer> newScores = new HashMap<>();
        originalGrades.forEach((k, v) -> {
            Integer myMakeUpGrade = (Integer) makeUpGrades.get( (String) k );
            Integer currentGrade = (Integer) v;
            System.out.println("Name: " + k + " | currentGrade: " + v + " | makeUpGrade: " + myMakeUpGrade);
            if ( myMakeUpGrade > currentGrade ) {
                newScores.put((String) k, myMakeUpGrade);
            } else {
                newScores.put((String) k, currentGrade);
            };
        });
        return newScores;
    }
}
