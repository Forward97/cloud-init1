package com.msitem.controller;

import com.msitem.entity.Item;
import com.msitem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ii97 on 20.4.27.
 */
@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        System.out.println("item.controller");
        return this.itemService.queryItemById(id);
    }

}
