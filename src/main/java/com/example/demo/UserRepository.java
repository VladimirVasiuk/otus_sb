package com.example.demo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "user")
public interface UserRepository extends PagingAndSortingRepository<User, Integer> {

    List<User> findAll();
}
