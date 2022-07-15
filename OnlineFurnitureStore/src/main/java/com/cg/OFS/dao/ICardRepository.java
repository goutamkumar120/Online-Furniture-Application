package com.cg.OFS.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.OFS.model.Card;

@Repository
public interface ICardRepository extends JpaRepository<Card,Integer> {

}
