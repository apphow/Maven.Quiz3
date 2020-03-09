package rocks.zipcode.io.quiz3.objectorientation.enums;

import java.util.Scanner;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;


    public RockPaperScissorHandSign getWinner() {
        if (PAPER.equals(ROCK)) {
            return ROCK;
        }
        if (SCISSOR.equals(PAPER)) {

            return SCISSOR;
        }
        if (SCISSOR.equals(ROCK)) {

            return ROCK;


        }
        return SCISSOR;
    }


    public RockPaperScissorHandSign getLoser() {
        if (SCISSOR.equals(ROCK)) {
            return SCISSOR;
        }
        if (ROCK.equals(PAPER)) {
            return ROCK;
        }
        if (PAPER.equals(SCISSOR)) {
            return PAPER;

        }
        return PAPER;
    }
}


