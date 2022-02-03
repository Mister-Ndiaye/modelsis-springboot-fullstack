package com.modelsisreactfullstack.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produits")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private String nom ;
    private  String type ;
    private String prix  ;
    private String description ;
    @JoinColumn(name = "type_produit")
    @ManyToOne
    private TypeProduit typeProduit;
}
