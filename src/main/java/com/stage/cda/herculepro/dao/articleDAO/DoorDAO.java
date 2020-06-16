package com.stage.cda.herculepro.dao.articleDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.articles.Door;

@Repository(value="doorDAO")
public interface DoorDAO extends JpaRepository<Door, Integer> {

}
