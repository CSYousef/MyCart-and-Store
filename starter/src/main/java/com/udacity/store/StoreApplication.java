package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.nio.file.Files;


@SpringBootApplication
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(String... args) throws Exception {
        // TODO: Populate the database with products
        Resource rs = resourceLoader.getResource("classpath:static/playstation5.jpg");
        Resource rs2 = resourceLoader.getResource("classpath:static/XboxSeriesX.jpg");
        Resource rs3 = resourceLoader.getResource("classpath:static/NintendoSwitch.jpg");

        productRepository.save(new Product(1L,"playstation 5", "Sony PlayStation 5 Console Blu-ray Edition", 615,  Files.readAllBytes(rs.getFile().toPath()) ));
        productRepository.save(new Product(2L,"Xbox Series X", "Microsoft Xbox Series X Console", 610, Files.readAllBytes(rs2.getFile().toPath()) ));
        productRepository.save(new Product(3L,"Nintendo Switch", "Nintendo Switch Extended Battery Life", 400, Files.readAllBytes(rs3.getFile().toPath()) ));


    }
}
