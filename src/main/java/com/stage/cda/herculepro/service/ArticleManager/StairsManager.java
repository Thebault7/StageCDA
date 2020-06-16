package com.stage.cda.herculepro.service.ArticleManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.articles.Stairs;
import com.stage.cda.herculepro.dao.articleDAO.StairsDAO;

@Service(value="stairsManager")
public class StairsManager {

	@Autowired
	StairsDAO stairsDAO;
	
	public List<Stairs> findAll() {
		return stairsDAO.findAll();
	}
}
