package com.trukhachev.elastic.persistence.repository;

import com.trukhachev.elastic.persistence.entity.LoanEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface LoansRepository extends ElasticsearchRepository<LoanEntity, String> {

}