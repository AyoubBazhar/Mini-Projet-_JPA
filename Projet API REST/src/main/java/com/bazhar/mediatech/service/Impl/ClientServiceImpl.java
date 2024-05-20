package com.bazhar.mediatech.service.Impl;

import com.bazhar.mediatech.Exceptions.EntityNotFoundException;
import com.bazhar.mediatech.dao.ClientDao;
import com.bazhar.mediatech.dto.Client.ClientRequest;
import com.bazhar.mediatech.dto.Client.ClientRespance;
import com.bazhar.mediatech.models.Client_Entity;
import com.bazhar.mediatech.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDao  clientDao;
    private ModelMapper modelMapper;


    public ClientServiceImpl(ClientDao clientDao, ModelMapper modelMapper) {
        this.clientDao = clientDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public ClientRespance save(ClientRequest clientRequest) {

        Client_Entity cl1 = modelMapper.map(clientRequest,Client_Entity.class);
        Client_Entity saved = clientDao.save(cl1);
        return modelMapper.map(saved,ClientRespance.class);
    }

    @Override
    public ClientRespance FindByID(Integer id) {
        Client_Entity cl1 = clientDao.findById(id).orElseThrow(() -> new EntityNotFoundException("Client not found"));//flux
    return modelMapper.map(cl1,ClientRespance.class);
    }

    @Override
    public ClientRespance FindByNOM(String nom) {
        Client_Entity cl1 = clientDao.findByNom(nom);
        return modelMapper.map(cl1,ClientRespance.class);
    }

    @Override
    public void delete(Integer id) {
clientDao.deleteById(id);

//        Client_Entity cl1 = clientDao.findById(id).get();
//        clientDao.delete(cl1);
    }

    @Override
    public ClientRespance Update(ClientRequest clientRequest, Integer id) {
        Optional<Client_Entity> clientEntity = clientDao.findById(id);

        if(clientEntity.isPresent()){
            Client_Entity cl1 = modelMapper.map(clientRequest,Client_Entity.class);
            cl1.setId(id); // If we don't pass the ID to save, it will create a new client
            return modelMapper.map(clientDao.save(cl1),ClientRespance.class);
        } else {
            throw new EntityNotFoundException("Client Not Found");
        }
    }

    @Override
    public List<ClientRespance> FindAll() {
        return clientDao.findAll()
                .stream()
                //.reduce().filter().peek
                .map(el->modelMapper.map(el,ClientRespance.class))
                .collect(Collectors.toList());
    }
}
