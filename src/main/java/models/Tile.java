package models;

import enums.*;

import java.util.ArrayList;

public class Tile {
    private User player;
    private int[] coordinates;
    private LandType landType;
    private Feature feature;
    private Resource resource;
    private Boolean[] hasRiver = new Boolean[6];

    private int food;
    private int gold;
    private int production;
    private int movementCost;
    private int combatModifier;

    private MilitaryUnit garrisonUnit;
    private CivilianUnit workerUnit;
    private Improvement improvement;
    private ArrayList<Building> buildings = new ArrayList<Building>();
    private Boolean hasRoad;

    public Tile(int[] coordinates, LandType landType, Feature feature, Resource resource) {
        this.player = null;
        this.coordinates = coordinates;
        this.landType = landType;
        this.feature = feature;
        this.resource = resource;
        this.improvement = null;
        this.food = landType.getFood() + (feature != null ? feature.getFood() : 0);
        this.gold = landType.getGold() + (feature != null ? feature.getGold() : 0);
        this.production = landType.getProduction() + (feature != null ? feature.getProduction() : 0);
        this.movementCost = landType.getMovementCost() + (feature != null ? feature.getMovementCost() : 0);
        this.combatModifier = landType.getCombatModifier() + (feature != null ? feature.getCombatModifier() : 0);
    }

    public User getPlayer() {
        return this.player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }

    public int[] getCoordinates() {
        return coordinates;
    }

    public LandType getLandType() {
        return this.landType;
    }

    public void removeJungle() {
        // this.food = this.food - this.landType.getFood() + landType.getFood();
        // this.gold = this.gold - this.landType.getGold() + landType.getGold();
        // this.production = this.production - this.landType.getProduction() +
        // landType.getProduction();
        // this.movementCost = this.movementCost - this.landType.getMovementCost() +
        // landType.getMovementCost();
        // this.combatModifier = this.movementCost - this.landType.getMovementCost() +
        // landType.getCombatModifier() + (feature != null ? feature.getCombatModifier()
        // : 0);
    }

    public Feature getFeature() {
        return this.feature;
    }

    public Resource getResource() {
        return this.resource;
    }

    public void activateResource() {
    }

    public Boolean[] getHasRiver() {
        return this.hasRiver;
    }

    public void setHasRiver(int side, Boolean hasRiver) {
        this.hasRiver[side] = hasRiver;
    }

    public int getCombatModifier() {
        return this.combatModifier;
    }

    public int getMovementCost() {
        return this.movementCost;
    }

    public int getProduction() {
        return this.production;
    }

    public int getGold() {
        return this.gold;
    }

    public int getFood() {
        return this.food;
    }

    public MilitaryUnit getGarrisonUnit() {
        return garrisonUnit;
    }

    public void setGarrisonUnit(MilitaryUnit garrisonUnit) {
        this.garrisonUnit = garrisonUnit;
    }

    public CivilianUnit getWorkerUnit() {
        return this.workerUnit;
    }

    public void setWorkerUnit(CivilianUnit workerUnit) {
        this.workerUnit = workerUnit;
    }

    public Improvement getImprovement() {
        return improvement;
    }

    public void addImprovement(Improvement improvement) {
        this.improvement = improvement;
    }

    public ArrayList<Building> getBuildings() {
        return this.buildings;
    }

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public Boolean getHasRoad() {
        return this.hasRoad;
    }

    public void setHasRoad(Boolean hasRoad) {
        this.hasRoad = hasRoad;
    }
}
