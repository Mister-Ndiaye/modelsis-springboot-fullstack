package com.modelsisreactfullstack.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "type_produit")
public class TypeProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    private String nomType ;

}
