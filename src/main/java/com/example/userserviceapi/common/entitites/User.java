package com.example.userserviceapi.common.entitites;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {
    @Id

    private Long userId;
    private String email;
    private String password;
}
