package com.softhousesolutions.cachetest.repository;

import com.softhousesolutions.cachetest.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

    public List<Product> listAll() {
        log.info("c=ProductRepository, m=listAll");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        final Product product1 = Product.builder()
                .sku("produto123")
                .price(new BigDecimal("10.00"))
                .description("produto1")
                .build();
        final Product product2 = Product.builder()
                .sku("produto321")
                .price(new BigDecimal("7.75"))
                .description("produto2")
                .build();
        List<Product> products = List.of(product1,product2);

        return products;
    }
}
