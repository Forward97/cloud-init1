package com.example.demo.msorder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ii97 on 20.4.27.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Long id;

    private String title;

    private String pic;

    private String desc;

    private Long price;


}