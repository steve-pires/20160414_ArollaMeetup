/**
 * Created by atlantis on 14/04/16.
 * https://github.com/arolla/Craft_Your_Skills/tree/master/GameOfLife
 *
 */
class GameOfLife {

    static final String DEAD_CELL = ".";
    static final String LIVE_CELL = "*";

    private String lifeMap;


    GameOfLife(String inputMap) {

        lifeMap = inputMap;
    }

    public String nextRound() {

        StringBuilder sb = new StringBuilder();
        while(lifeMap.length() > sb.length()) {
            sb.append(DEAD_CELL);
        }

        return sb.toString();
    }
}
