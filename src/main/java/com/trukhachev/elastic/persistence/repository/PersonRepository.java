package com.trukhachev.elastic.persistence.repository;

import com.trukhachev.elastic.persistence.entity.PersonEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<PersonEntity, String> {

}
