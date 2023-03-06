package PVSv.files;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ScoreBoard {
    PrintWriter scoreWriter;
    ScoreBoard(String scorePath) throws IOException {
        scoreWriter = new PrintWriter(new BufferedWriter(new FileWriter(new File(scorePath), true)));
    }
    void writeScore(int score) {
        scoreWriter.println(score);
    }
    int play() {
        int min = 1, max = 6;
        Scanner sc = new Scanner(System.in);
        int r = ThreadLocalRandom.current().nextInt(min, max);
        int score = 0;
        int headLosingChance = 1;
        boolean alive = true;
        System.out.println("Roulette: 1 to risk, otherwise to concede");
        int input = sc.nextInt(); 
        while (alive && input == 1)  {
            System.out.println("Your chance is 1:" + (6-headLosingChance));
            if (r <= headLosingChance) {
                System.out.println("You got your head blown off, ending...");
                alive = false;
                score = 0;
            }
            else {
                score += 100*headLosingChance;
                System.out.println("You survived and gained " + (100*headLosingChance) + " points!");
                System.out.println("Risk again?");
                input = sc.nextInt();
            }


        }
        return score;
    }

    public static void main(String[] args) throws IOException {
        ScoreBoard sb = new ScoreBoard("score.txt");
        sb.writeScore(sb.play());
        sb.scoreWriter.close();
    }
}
