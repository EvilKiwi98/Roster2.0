package com.EvilKiwi98.model;

public class CrusadeCard {
    // CLASS VARIABLES FOR JSON CONVERSION
    private int unit_id;
    private String unit_name;
    private String unit_type;
    private String equipment;
    private String enhancements_upgrades;
    private int points_cost;
    private int crusade_points;
    private int experience_points;
    private int model_count;
    private int battles_played;
    private int battles_survived;
    private int units_destroyed;
    private String battle_honors;
    private String battle_scars;
    private String rank;

    // CONSTRUCTOR
    public CrusadeCard(int unit_id, String unit_name, String unit_type, String equipment, String enhancements_upgrades, int points_cost, int crusade_points, int experience_points, int model_count, int battles_played, int battles_survived, int units_destroyed, String battle_honors, String battle_scars, String rank) {
        this.unit_id = unit_id;
        this.unit_name = unit_name;
        this.unit_type = unit_type;
        this.equipment = equipment;
        this.enhancements_upgrades = enhancements_upgrades;
        this.points_cost = points_cost;
        this.crusade_points = crusade_points;
        this.experience_points = experience_points;
        this.model_count = model_count;
        this.battles_played = battles_played;
        this.battles_survived = battles_survived;
        this.units_destroyed = units_destroyed;
        this.battle_honors = battle_honors;
        this.battle_scars = battle_scars;
        this.rank = rank;
    }

    public CrusadeCard(){
    };

    // GETTERS AND SETTERS
    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(String unit_type) {
        this.unit_type = unit_type;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEnhancements_upgrades() {
        return enhancements_upgrades;
    }

    public void setEnhancements_upgrades(String enhancements_upgrades) {
        this.enhancements_upgrades = enhancements_upgrades;
    }

    public int getPoints_cost() {
        return points_cost;
    }

    public void setPoints_cost(int points_cost) {
        this.points_cost = points_cost;
    }

    public int getCrusade_points() {
        return crusade_points;
    }

    public void setCrusade_points(int crusade_points) {
        this.crusade_points = crusade_points;
    }

    public int getExperience_points() {
        return experience_points;
    }

    public void setExperience_points(int experience_points) {
        this.experience_points = experience_points;
    }

    public int getModel_count() {
        return model_count;
    }

    public void setModel_count(int model_count) {
        this.model_count = model_count;
    }

    public int getBattles_played() {
        return battles_played;
    }

    public void setBattles_played(int battles_played) {
        this.battles_played = battles_played;
    }

    public int getBattles_survived() {
        return battles_survived;
    }

    public void setBattles_survived(int battles_survived) {
        this.battles_survived = battles_survived;
    }

    public int getUnits_destroyed() {
        return units_destroyed;
    }

    public void setUnits_destroyed(int units_destroyed) {
        this.units_destroyed = units_destroyed;
    }

    public String getBattle_honors() {
        return battle_honors;
    }

    public void setBattle_honors(String battle_honors) {
        this.battle_honors = battle_honors;
    }

    public String getBattle_scars() {
        return battle_scars;
    }

    public void setBattle_scars(String battle_scars) {
        this.battle_scars = battle_scars;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}


