package com.example.webecom.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @NotNull
    private Float price;
    @NotNull
    private Integer quantity;

    private String description;
    private String file_pic;
    @NotNull
    private Float old_price;

}