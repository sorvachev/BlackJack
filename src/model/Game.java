package model;

/**
 * Created by sakic on 9/7/16.
 */
public class Game {
  GameResult gm;
    Game()
    {
        this.gm = GameResult.NONE;
    }
    Game(GameResult gameResult)
    {
        this.gm = gameResult;
    }
    public String getStringStatus()
    {
        return gm.getName();
    }
    public GameResult getStatus()
    {
        return gm;
    }
    public void setStatus(GameResult other)
    {
        gm = other;
    }


}
