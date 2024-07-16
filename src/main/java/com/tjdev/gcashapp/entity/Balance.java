package com.tjdev.gcashapp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "balances")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Balance {

    @Id
    private Long id;

    @Column
    private Double amount;

    @Column
    private Long userId;

    public Balance(Double newBalance, Long userId) {
    }
}
