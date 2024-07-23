package org.productos.spring.java.productos2826502.controllers;


import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    // inyectar el servicio
    private ProductService service = new ProductService();
    // primer endpoint
    // endpoint: un metodo en controlador 

    @GetMapping("/saludo")
    public String Saludo(){
        return "hola ... 2826502";
    }

    // segundo endpoint
    // Get: obtener informacion sin alterarla 
    // (inmutable)
    @GetMapping("/{idproducto}")
    public String findProductById(@PathVariable String idproducto) {
        return "aqui se mostrará el producto cuyo id es:" + idproducto;
    }

        @GetMapping    
        public List<Product> findAllProducts() {
        // utilizo el servicio
        return service.findAllProducts();
        }

    
}
