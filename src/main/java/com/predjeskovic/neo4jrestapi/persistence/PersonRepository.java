package com.predjeskovic.neo4jrestapi.persistence;

import com.predjeskovic.neo4jrestapi.domain.PersonNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends Neo4jRepository<PersonNode,Long> {

    @Query("MATCH (n:Person) RETURN n")
    List<PersonNode> findAllPeople();

    PersonNode findByUsername(String username);
}
