package com.back.jpa.documenttype;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface DocumentTypeDataRepository extends CrudRepository<DocumentTypeData, Integer>, QueryByExampleExecutor<Integer> {
}
