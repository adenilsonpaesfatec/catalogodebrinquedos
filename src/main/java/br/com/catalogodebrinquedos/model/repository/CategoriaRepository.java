package br.com.catalogodebrinquedos.model.repository;

import br.com.catalogodebrinquedos.model.CategoriaModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}