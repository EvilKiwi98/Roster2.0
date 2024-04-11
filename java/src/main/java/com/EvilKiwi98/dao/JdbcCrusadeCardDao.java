package com.EvilKiwi98.dao;

import com.EvilKiwi98.model.CrusadeCard;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcCrusadeCardDao implements CrusadeCardDao{


    @Override
    public CrusadeCard createCrusadeCard(CrusadeCard crusadeCard) {
        return null;
    }
}
