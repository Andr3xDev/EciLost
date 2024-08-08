package com.andr3xdev.repository;

// * Estos repositorios son interfaces que extienden de JpaRepository, que es una interfaz de Spring Data JPA que
// * proporciona todos los métodos necesarios para realizar operaciones CRUD en la base de datos. Osea operar la base de datos

import com.andr3xdev.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel,Long> {


}