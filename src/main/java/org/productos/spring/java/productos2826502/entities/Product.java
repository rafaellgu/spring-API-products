package org.productos.spring.java.productos2826502.entities;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Builder
// @Entity
// @Table(name="products")
public class Product {


    private long id;
    private String nombre;
    private Double precio;
}
