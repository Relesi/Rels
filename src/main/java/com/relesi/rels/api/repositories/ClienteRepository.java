package com.relesi.rels.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.relesi.rels.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
