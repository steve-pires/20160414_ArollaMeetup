import main.GameOfLife;
import org.junit.Assert;
import org.junit.Test;

import static main.GameOfLife.*;
/**
 * Created by atlantis on 14/04/16.
 */
public class TestGameOfLife {

    @Test
    public void if_cell_is_alive_and_has_no_neighbours_it_should_die() {
        GameOfLife game = new GameOfLife(LIVE_CELL);

        Assert.assertEquals(DEAD_CELL, game.nextRound());
    }

    @Test
    public void should_contain_several_cells() {
        GameOfLife game = new GameOfLife(DEAD_CELL + DEAD_CELL);
        Assert.assertEquals(DEAD_CELL + DEAD_CELL, game.nextRound());
    }

    @Test
    public void should_return_result_with_same_length() {
        GameOfLife game = new GameOfLife(DEAD_CELL + DEAD_CELL + DEAD_CELL);
        Assert.assertEquals(DEAD_CELL + DEAD_CELL + DEAD_CELL, game.nextRound());
    }

    @Test
    public void if_cell_is_alive_and_has_less_than_two_live_neighbours_it_should_die() {
        GameOfLife game = new GameOfLife(LIVE_CELL + DEAD_CELL + DEAD_CELL);
        Assert.assertEquals(DEAD_CELL + DEAD_CELL + DEAD_CELL, game.nextRound());
    }

    @Test
    public void if_cell_is_alive_and_has_two_live_neighbours_it_should_stay_alive() {
        GameOfLife game = new GameOfLife(LIVE_CELL + LIVE_CELL + LIVE_CELL);
        Assert.assertEquals(DEAD_CELL + LIVE_CELL + DEAD_CELL, game.nextRound());
    }

    @Test
    public void if_cell_is_alive_and_has_two_live_neighbours_it_should_stay_alive_2() {
        GameOfLife game = new GameOfLife(LIVE_CELL + LIVE_CELL + LIVE_CELL + LIVE_CELL);
        Assert.assertEquals(DEAD_CELL + LIVE_CELL + LIVE_CELL + DEAD_CELL, game.nextRound());
    }

    @Test
    public void if_cell_is_alive_and_has_three_live_neighbours_it_should_stay_alive() {
        String input = LIVE_CELL + LIVE_CELL + LIVE_CELL + LIVE_CELL;
        String expectedOutput = DEAD_CELL + LIVE_CELL + LIVE_CELL + DEAD_CELL;

        GameOfLife game = new GameOfLife(input);
        Assert.assertEquals(expectedOutput, game.nextRound());
    }
}
