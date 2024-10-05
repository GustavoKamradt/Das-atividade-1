package br.univille.microkernel_kernel.service;

import org.springframework.http.HttpStatus;

import java.util.HashMap;

public interface DefaultService {

    public HttpStatus doWork(HashMap<String, String> params);
}
