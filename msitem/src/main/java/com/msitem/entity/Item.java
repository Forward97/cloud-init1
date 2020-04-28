package com.msitem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ii97 on 20.4.27.
 */
@Data
@AllArgsConstructor
public class Item {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;

}
