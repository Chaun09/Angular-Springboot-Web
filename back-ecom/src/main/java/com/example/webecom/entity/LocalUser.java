package com.example.webecom.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name="localusers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LocalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String email;

}
