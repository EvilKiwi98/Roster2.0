package com.EvilKiwi98.dao;

import com.EvilKiwi98.model.CrusadeCard;

import java.util.List;

public interface CrusadeCardDao {

    CrusadeCard createCrusadeCard (CrusadeCard crusadeCard);
    CrusadeCard fetchCrusadeCardByID (int crusadeCardId);


}
