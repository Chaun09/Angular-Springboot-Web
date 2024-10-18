package com.example.webecom.entity;

import com.example.webecom.enums.UserRole;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String name;
    @Column(unique=true)
    private String email;
    private String password;
    private String again_password;
    private UserRole userRole;

}
