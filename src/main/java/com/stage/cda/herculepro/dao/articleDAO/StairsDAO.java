package com.stage.cda.herculepro.dao.articleDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.articles.Stairs;

@Repository(value="stairsDAO")
public interface StairsDAO extends JpaRepository<Stairs, Integer> {

}
