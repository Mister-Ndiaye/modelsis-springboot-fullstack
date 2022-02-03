package com.modelsisreactfullstack.persistance.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
     private String nom ;
     private  String prenom ;
     private  String telephone ;
     private String password ;
}
