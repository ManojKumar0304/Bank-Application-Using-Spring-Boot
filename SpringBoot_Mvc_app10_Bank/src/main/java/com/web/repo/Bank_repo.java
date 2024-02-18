package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.web.model.Bank_Manoj;

@Repository
public interface Bank_repo extends CrudRepository<Bank_Manoj, Integer> {

}
