package views;

import java.util.ArrayList;

public class TileView {
    // color : civilization , civilian , military
    private String[] color = new String[3];
    private String backgroundColor;
    private String nickname;
    private String militaryUnit;
    private String civilianUnit;
    private String feature;
    private String resource;
    private String improvement;
    ArrayList<String> hasRiver;
    private int x;
    private int y;

    public TileView(String[] color, String backgroundColor, String nickname, String militaryUnit,
            String civilianUnit, String feature, String resource, String improvement, ArrayList<String> hasRiver, int x, int y) {
        this.color = color;
        this.backgroundColor = backgroundColor;
        this.nickname = nickname;
        this.militaryUnit = militaryUnit;
        this.civilianUnit = civilianUnit;
        this.feature = feature;
        this.resource = resource;
        this.improvement = improvement;
        this.hasRiver = hasRiver;
        this.x = x;
        this.y = y;
    }

    public String[] getColor() {
        return this.color;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getMilitaryUnit() {
        return this.militaryUnit;
    }

    public String getCivilianUnit() {
        return this.civilianUnit;
    }

    public String getFeature() {
        return this.feature;
    }

    public String getResourceTileView() { return resource; }

    public String getImprovement() { return improvement; }

    public ArrayList<String> getHasRiver() {
        return this.hasRiver;
    }

    public int getX() { return x; }

    public int getY() { return y; }
}
