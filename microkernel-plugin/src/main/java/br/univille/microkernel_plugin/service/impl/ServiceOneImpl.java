package br.univille.microkernel_plugin.service.impl;

import br.univille.microkernel_kernel.service.DefaultService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ServiceOneImpl implements DefaultService {

    @Override
    public HttpStatus doWork(HashMap<String, String> params) {
        System.out.println("Servico 1");
        return HttpStatus.OK;
    }

}
