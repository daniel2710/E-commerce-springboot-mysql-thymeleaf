package com.proyect.ecommerce.service;

import com.proyect.ecommerce.model.Producto;

import java.util.Optional;

public interface ProductoService {

    // Metodos

    // Para guardar
    public Producto save( Producto producto );

    // Para obtener
    // Optional nos da la opcion de poder validar si el objeto que mandamos a llamar de la base de datos existe o no
    public Optional<Producto> get (Integer id);

    // Para actualizar
    public void update( Producto producto );

    // Para eliminar
    public void delete( Integer id );

}
