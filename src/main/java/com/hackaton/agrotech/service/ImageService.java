package com.hackaton.agrotech.service;

import com.hackaton.agrotech.model.Imagem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    Imagem create(Imagem image);

    List<Imagem> viewAll();

    Imagem viewById(long id);
}
