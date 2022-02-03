package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.Produit;
import com.modelsisreactfullstack.services.servicesImplement.ProduitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ProduitController {

   @Autowired
    private ProduitServiceImpl produitService ;

    @PostMapping("/produits")
    public Produit addProduit(@RequestBody Produit produit){
        return produitService.addProduit(produit);
    }
    @GetMapping("/hello")
    public String hello(){
        return "Hello" ;
    }
    @GetMapping("/produits")
    public List<Produit> getAllProduits(){
        return produitService.getAll();
    }

    @PutMapping("/produit")
    public Produit updateProduit(@RequestBody Produit produit){
        return null ;

    }

}
