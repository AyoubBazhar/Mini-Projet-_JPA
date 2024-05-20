package com.bazhar.mediatech.service;

import com.bazhar.mediatech.dto.Client.ClientRequest;
import com.bazhar.mediatech.dto.Client.ClientRespance;

import java.util.List;

public interface ClientService {
    ClientRespance save(ClientRequest clientRequest);
    ClientRespance FindByID (Integer id);
    ClientRespance FindByNOM(String nom);

    void delete(Integer id);
    ClientRespance Update(ClientRequest clientRequest,Integer id);
    List<ClientRespance> FindAll();
}
