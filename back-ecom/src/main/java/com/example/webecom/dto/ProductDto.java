package com.example.webecom.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter


public class ProductDto {
    private String name;
    private Float price ;
    private Integer quantity;
    private String description;
    private Float old_price;
    private String file_pic;
}
