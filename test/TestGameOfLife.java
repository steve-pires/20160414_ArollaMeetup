import org.junit.Assert;
import org.junit.Test;

/**
 * Created by atlantis on 14/04/16.
 *
 */
public class TestGameOfLife {

    @Test
    public void if_cell_is_alive_and_has_no_neighbours_it_should_die() {
        GameOfLife game = new GameOfLife(GameOfLife.LIVE_CELL);

        Assert.assertEquals(GameOfLife.DEAD_CELL, game.nextRound());
    }

    @Test
    public void should_contain_several_cells() {
        GameOfLife game = new GameOfLife(GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL);
        Assert.assertEquals(GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL, game.nextRound());
    }

    @Test
    public void if_cell_is_alive_and_has_less_than_two_neighbours_it_should_die() {
        GameOfLife game = new GameOfLife(GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL);
        Assert.assertEquals(GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL + GameOfLife.DEAD_CELL, game.nextRound());
    }
}
