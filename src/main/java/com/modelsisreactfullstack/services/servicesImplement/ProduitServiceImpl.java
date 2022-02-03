package com.modelsisreactfullstack.services.servicesImplement;

import com.modelsisreactfullstack.persistance.entity.Produit;
import com.modelsisreactfullstack.persistance.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl {

    @Autowired
    private ProduitRepository produitRepository ;

    public List<Produit> getAll(){
      return  produitRepository.findAll();
    }

    public Produit addProduit(Produit produit) {
        if(produit.getNom()!="") {
            return produitRepository.save(produit);
        }
        return null;
    }

    public Produit updateProduit(Produit produit){
        return  produitRepository.save(produit);
    }

    public String deleteProduit(int id){
        if(produitRepository.findById(id)!=null ){
            produitRepository.deleteById(id);
            return "produit supprimé avec succes" ;
        }
        return "erreur lors de la suppression";
    }

}
