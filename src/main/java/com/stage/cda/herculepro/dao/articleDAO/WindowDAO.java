package com.stage.cda.herculepro.dao.articleDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.articles.Window;

@Repository(value="windowDAO")
public interface WindowDAO extends JpaRepository<Window, Integer> {

}
