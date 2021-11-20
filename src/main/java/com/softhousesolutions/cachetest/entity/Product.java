package com.softhousesolutions.cachetest.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@Data
public class Product implements Serializable {

    private String sku;
    private BigDecimal price;
    private String description;
}
