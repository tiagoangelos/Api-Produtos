package com.api.produto.repositorio;

import com.api.produto.modelo.ProdutoModelo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{
    List<ProdutoModelo> findAll();
    
    ProdutoModelo findByCodigo(int codigo);

    void delete(ProdutoModelo produto);
    
    <ProdMod extends ProdutoModelo> ProdMod save(ProdMod produto);
}




