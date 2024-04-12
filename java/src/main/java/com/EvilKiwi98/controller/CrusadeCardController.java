package com.EvilKiwi98.controller;

import com.EvilKiwi98.model.CrusadeCard;
import com.EvilKiwi98.dao.CrusadeCardDao;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CrusadeCardController {

    private CrusadeCardDao crusadeCardDao;

    public CrusadeCardController(CrusadeCardDao crusadeCardDao) {this.crusadeCardDao = crusadeCardDao;}

    @RequestMapping(path ="/CrusadeCard/{crusadeCardId}", method = RequestMethod.GET)
    public CrusadeCard fetchCrusadeCardById (@PathVariable int crusadeCardId){
        return crusadeCardDao.fetchCrusadeCardByID(crusadeCardId);
    }

}
