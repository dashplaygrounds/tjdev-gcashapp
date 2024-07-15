package com.tjdev.gcashapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private Long number;

    @Column
    private Long pin;

}