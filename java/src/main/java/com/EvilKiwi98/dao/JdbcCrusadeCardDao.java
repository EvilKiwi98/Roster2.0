package com.EvilKiwi98.dao;

import com.EvilKiwi98.model.CrusadeCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JdbcCrusadeCardDao implements CrusadeCardDao{

    private final JdbcTemplate jdbcTemplate;
    public JdbcCrusadeCardDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    // CREATE NEW CARD
    @Override
    public CrusadeCard createCrusadeCard(CrusadeCard crusadeCard) {
        // insert statement
        String sql = "INSERT INTO crusade_cards (unit_name, unit_type, equipment, enhancements_upgrades, points_cost, crusade_points, experience_points, model_count, battles_played, battles_survived, units_destroyed, battle_honors, battle_scars, rank)" +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?) " +
                "RETURNING unit_id";

        return null;
    }

    // SINGLE CARD FETCH BY ID
    @Override
    public CrusadeCard fetchCrusadeCardByID(int crusadeCardId) {
        CrusadeCard fetchedCard;
        String sql = "SELECT * FROM crusade_cards WHERE unit_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, crusadeCardId);
    return null;
    }


    // HELPER MAPPING METHOD
    public CrusadeCard mapToRowSet(SqlRowSet result){
        CrusadeCard newCard = new CrusadeCard();
        newCard.setUnit_name(result.getString("unit_name"));
        newCard.setUnit_type(result.getString("unit_type"));
        newCard.setEquipment(result.getString("equipment"));
        newCard.setEnhancements_upgrades(result.getString("enhancements_upgrades"));
        newCard.setPoints_cost(result.getInt("points_cost"));
        newCard.setCrusade_points(result.getInt("crusade_points"));
        newCard.setExperience_points(result.getInt("experience_points"));
        newCard.setModel_count(result.getInt("model_count"));
        newCard.setBattles_played(result.getInt("battles_played"));
        newCard.setBattles_survived(result.getInt("battles_survived"));
        newCard.setUnits_destroyed(result.getInt("units_destroyed"));
        newCard.setBattle_honors(result.getString("battle_honors"));
        newCard.setBattle_scars(result.getString("battle_scars"));
        newCard.setRank(result.getString("rank"));
        return newCard;
    }

}
