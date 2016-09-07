package model;

/**
 * Created by sakic on 9/7/16.
 */
public enum GameResult {
    WIN("win"), BUSTED("busted"), PUSH("push"), NONE("none");

    private String name;

    private GameResult(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
