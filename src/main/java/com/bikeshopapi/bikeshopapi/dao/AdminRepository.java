package com.bikeshopapi.bikeshopapi.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikeshopapi.bikeshopapi.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {



	Optional<Admin> findByNameAndPassword(String name, String password);


}
