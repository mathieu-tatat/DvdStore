package com.simplon.dvdstore.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DvdServiceModel {
    private String name;
    private String genre;
    private Long quantity;
    public Float prix;
    private Optional <Long> id;


}
