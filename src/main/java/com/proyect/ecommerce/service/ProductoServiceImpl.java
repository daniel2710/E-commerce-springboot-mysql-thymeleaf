package com.proyect.ecommerce.service;

import com.proyect.ecommerce.model.Producto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{


    @Override
    public Producto save(Producto producto) {
        return null;
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public void update(Producto producto) {

    }

    @Override
    public void delete(Integer id) {

    }
}
