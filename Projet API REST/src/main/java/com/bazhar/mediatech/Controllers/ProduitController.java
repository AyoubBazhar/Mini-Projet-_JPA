package com.bazhar.mediatech.Controllers;

import com.bazhar.mediatech.dto.ProduitDto;
import com.bazhar.mediatech.service.ProduitService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produits")
@RequiredArgsConstructor
public class ProduitController {
    @Autowired
    private  ProduitService produitService;
    @PostMapping("/")
    public ProduitDto save( @Valid @RequestBody ProduitDto produitDto) {
        return produitService.save(produitDto);
    }
    @GetMapping("/ref/{ref}")
    public ProduitDto FindByRef( @PathVariable String ref) {
        return produitService.FindByRef(ref);
    }
    @PutMapping("/")
    public ProduitDto update(@Valid @RequestBody ProduitDto produitDto) {
        return produitService.Update(produitDto);
    }
    @GetMapping("/")
    public List<ProduitDto> findAll() {
        return produitService.findAll();
    }

    @DeleteMapping("/ref/{ref}")
    public int delete(@PathVariable String ref) {
        return produitService.delete(ref);
    }

}
