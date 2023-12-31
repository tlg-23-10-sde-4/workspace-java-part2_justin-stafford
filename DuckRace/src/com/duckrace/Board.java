package com.duckrace;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;


//This is a lookup table of ids to student names.
//When a duck wins for the first time, we need to find out who that is.
//This lookup table could be hardcoded with the data, or we could read the data
//in from a file, so that no code changes would need to be made for each cohort.

// Map<Integer,String> studentIdMap;

// Integer    String
//=======    ======
//    1       John
//    2       Jane
//    3       Danny
//    4       Armando
//    5       Sheila
//   6       Tess
//
//
//  We also need a data structure to hold the results of all winners.
//  This data structure should facilitate easy lookup, retrieval, and storage.
//
//  Map<Integer,DuckRacer> racerMap;
//
//  Integer    DuckRacer
//  =======    =========
//            id    name     wins   rewards
//             --    ----     ----   -------
//     5        5    Sheila     2    PRIZES, PRIZES
//     6        6    Tess       1    PRIZES
//    13       13    Zed        3    PRIZES, DEBIT_CARD, DEBIT_CARD
//    17       17    Dom        1    DEBIT_CARD


public class Board {
    private final Map<Integer, String> studentIdMap = loadStudentIdMap();

    private Map<Integer, String> loadStudentIdMap() {
        Map<Integer, String> studentIdMap = new HashMap<>();

        try {
            Path path = Path.of("src/main/resources/studentIdMap.txt");
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                String[] split = line.split(",");
                int id = Integer.parseInt(split[0]);
                String name = split[1];
                studentIdMap.put(id, name);
            }
        } catch (Exception e) {
            System.out.println("Error reading studentIdMap.txt");
        }

        return studentIdMap;
    }

    private final Map<Integer, DuckRacer> racerMap = new TreeMap<>();


    public void update(int id, Reward reward) {
        DuckRacer racer = null;

        if (racerMap.containsKey(id)) {   //id present, so fetch(get) DuckRacer id
            racer = racerMap.get(id);

        } else {           // id not present, so here we create new DuckRacer
            racer = new DuckRacer(id, studentIdMap.get(id));
            racerMap.put(id, racer);
        }

    }

    public int maxId() {
        return studentIdMap.size();
    }

    public Map<Integer, String> show() {
        StringBuilder display = new StringBuilder();
        display.append("\n--------------------------------");
        display.append("\nDuck Race Results");
        display.append("\n");
        display.append("id  name     wins   rewards");
        display.append("--    ----     ----   -------");

        if (racerMap.isEmpty()) {
            display.append("There are currently no ducks to show.");

        } else {
            Collection<DuckRacer> racers = racerMap.values();
            for (DuckRacer racer : racers) {
                String rewardsString = racer.getRewards().toString();
                String rewardString = rewardsString.substring(1, rewardsString.length() - 1);

                String row = String.format("%s    %s   %s    %s\n",
                        racer.getId(),
                        racer.getName(),
                        racer.getWins(),
                        rewardString,
                        System.lineSeparator());
                display.append(row);
            }
        }
        display.append("\n");
        System.out.println(display.toString());

        private Map<Integer, String> loadStudentIdMap() {
            Map<Integer, String> idMap = new HashMap<>();

            try {
                // read all lines from conf/student-ids.csv into a List<String>
                List<String> lines = Files.readAllLines(Path.of("DuckRace/conf/student-ids.csv"));
                // for each line, split it into "tokens"
                for (String line : lines) {
                    String[] tokens = line.split(",");  // tokens[0] is "1" and tokens[1] is "John"

                    idMap.put(Integer.valueOf(tokens[0]), tokens[1]);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return idMap;

        }
    }
}
