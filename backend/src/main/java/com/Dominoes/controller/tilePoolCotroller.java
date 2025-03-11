package com.Dominoes.controller;


import com.Dominoes.model.tilePool;
import com.Dominoes.services.tilePoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tilePoolCotroller {

    private final tilePoolService service;

    public tilePoolCotroller(tilePoolService service) {
        this.service = service;
    }

    @GetMapping("v1/tilePool/{tilePoolId}")
    public tilePool getUser(
            @PathVariable("tilePoolId") Integer tileId) {

        return service.getTilePool(tileId);
    }
}
