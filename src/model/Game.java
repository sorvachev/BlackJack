package model;

/**
 * Created by sakic on 9/7/16.
 */
import java.util.Map;
import java.util.TreeMap;

public class Game {

    private GameResult state;

    public Deal deal;

    public Map<GameResult, Integer> agreggatedResults;

    public Game() {
        this.agreggatedResults = new TreeMap<>();
        this.agreggatedResults.put(GameResult.WIN, 0);
        this.agreggatedResults.put(GameResult.BUSTED, 0);
        this.agreggatedResults.put(GameResult.PUSH, 0);
    }

    public void startNewDeal() {
        deal = new Deal(this);
        deal.start();
        setState(GameResult.NONE);
    }

    public void hit() {
        deal.hit();
    }

    public void stand() {
        deal.stand();
    }

    public void setState(GameResult state) {
        this.state = state;
        if (state != GameResult.NONE) {
            this.agreggatedResults.put(state,
                    this.agreggatedResults.get(state) + 1);
        }
    }

    public GameResult getState() {
        return state;
    }
}