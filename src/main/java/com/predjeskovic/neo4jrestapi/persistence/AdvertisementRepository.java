package com.predjeskovic.neo4jrestapi.persistence;

import com.predjeskovic.neo4jrestapi.domain.AdvertisementNode;
import com.predjeskovic.neo4jrestapi.domain.PersonNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementRepository extends Neo4jRepository<AdvertisementNode,Long> {
    
}
