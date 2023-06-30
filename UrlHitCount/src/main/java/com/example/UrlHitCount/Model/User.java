package com.example.UrlHitCount.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName ;
    private Integer hitcount = 0 ;
}
