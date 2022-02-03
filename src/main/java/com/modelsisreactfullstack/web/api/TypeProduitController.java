package com.modelsisreactfullstack.web.api;

import com.modelsisreactfullstack.persistance.entity.TypeProduit;
import com.modelsisreactfullstack.services.servicesImplement.TypeProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TypeProduitController {

    @Autowired
    private TypeProduitService typeProduitService ;

    @GetMapping("/typeproduits")
    public List<TypeProduit> getAllProduct(){
        return typeProduitService.getAllProduit();
    }

    @PostMapping("/typeproduits")
    public TypeProduit addProduct(@RequestBody TypeProduit typeP){
        return typeProduitService.addProduit(typeP);
    }

    @PostMapping("/typeproduit")
    public String delProduct(@RequestBody int id ){
        return typeProduitService.deleteProduit(id);
    }


}
