package com.ericsson.supplierapi.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ericsson.supplierapi.models.Supplier;

public interface SupplierRepository extends MongoRepository<Supplier,Long>{

}
