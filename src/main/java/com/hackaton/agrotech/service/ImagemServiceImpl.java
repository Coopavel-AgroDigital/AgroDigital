package com.hackaton.agrotech.service;

import com.hackaton.agrotech.model.Imagem;
import com.hackaton.agrotech.repository.ImagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImagemServiceImpl implements ImageService {
    @Autowired
    private ImagemRepository ImagemRepository;

    @Override
    public Imagem create(Imagem image) {
        return ImagemRepository.save(image);
    }

    @Override
    public List<Imagem> viewAll() {
        return (List<Imagem>) ImagemRepository.findAll();
    }

    @Override
    public Imagem viewById(long id) {
        return ImagemRepository.findById(id).get();
    }
}
