package com.back.jpa.Register;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface RegisterDataRepository extends CrudRepository<RegisterData, Integer>, QueryByExampleExecutor<RegisterData> {
}
