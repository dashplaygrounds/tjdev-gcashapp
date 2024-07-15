package com.tjdev.gcashapp.entity;

import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(name = "transactions")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transaction {

    @Id
    private Long id;

    @Column
    private Double amount;

    @Column
    private String name;

    @Column
    private Long accountId;

    @Column
    private String date;

    @Column
    private String transferToId;

    @Column
    private String transferFromId;


}
