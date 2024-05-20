package com.bazhar.mediatech.Controllers;

import com.bazhar.mediatech.dao.FactureDao;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("factures")
public class FactureController {

    public String create ( @RequestBody FactureDao factureDao){
        return null;
    }
}
