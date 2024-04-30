package com.back.jpa.Sex;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface SexDataRepository extends CrudRepository<SexData,Integer>, QueryByExampleExecutor<SexData> {
}
