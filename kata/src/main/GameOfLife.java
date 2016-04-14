package main;

/**
 * Created by atlantis on 14/04/16.
 * https://github.com/arolla/Craft_Your_Skills/tree/master/GameOfLife
 *
 */
public class GameOfLife {

   public static final String DEAD_CELL = ".";
   public static final String LIVE_CELL = "*";

    private String lifeMap;


    public GameOfLife(String inputMap) {

        lifeMap = inputMap;
    }

    public String nextRound() {
        StringBuilder sb = new StringBuilder(DEAD_CELL);

        copyInsideCells(sb);
        addLastCell(sb);

        return sb.toString();
    }

    private void copyInsideCells(StringBuilder sb) {
        while (lifeMap.length() - 1 > sb.length()) {
            char currentCell = lifeMap.charAt(sb.length());
            sb.append(currentCell);
        }
    }

    private void addLastCell(StringBuilder sb) {
        if(lifeMap.length() > 1) {
            sb.append(DEAD_CELL);
        }
    }

}
