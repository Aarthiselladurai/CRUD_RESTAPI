package com.example.cruds.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cruds.entity.Bean;

public interface Repoclass extends JpaRepository<Bean, Integer> {

}
