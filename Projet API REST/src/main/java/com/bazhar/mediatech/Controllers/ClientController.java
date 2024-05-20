package com.bazhar.mediatech.Controllers;

import com.bazhar.mediatech.dto.Client.ClientRequest;
import com.bazhar.mediatech.dto.Client.ClientRespance;
import com.bazhar.mediatech.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//controlleur  parle  avec  Service
@RestController
@RequestMapping("clients")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("")
    public List<ClientRespance> getClient(){
    return clientService.FindAll();
}

@PostMapping("")
public ResponseEntity<ClientRespance> saveclient (@Valid @RequestBody() ClientRequest clientRequest){
    return new ResponseEntity<>(clientService.save(clientRequest), HttpStatus.CREATED);
}

@DeleteMapping("/id/{id}")
        public ResponseEntity<?> delete(@PathVariable Integer id) {
        clientService.delete(id);
       return ResponseEntity.noContent().build();
    }
    @GetMapping("/id/{id}")
    public  ResponseEntity<ClientRespance> FindByID(@PathVariable Integer id) {
        return ResponseEntity.ok(clientService.FindByID(id));
    }
@GetMapping("/nom/{nom}")
    public  ResponseEntity<ClientRespance> FindByNOM(@PathVariable String nom) {
        return ResponseEntity.ok(clientService.FindByNOM(nom));
    }
    @PutMapping("/id/{id}")
    public ResponseEntity<ClientRespance> Update( @Valid @RequestBody ClientRequest clientRequest, @PathVariable Integer id) {
        return new ResponseEntity<>(clientService.Update(clientRequest, id),HttpStatus.ACCEPTED);
    }
}
