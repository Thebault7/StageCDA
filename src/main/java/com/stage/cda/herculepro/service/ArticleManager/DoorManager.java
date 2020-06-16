package com.stage.cda.herculepro.service.ArticleManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.articles.Door;
import com.stage.cda.herculepro.dao.articleDAO.DoorDAO;

@Service(value="doorManager")
public class DoorManager {

	@Autowired
	DoorDAO doorDAO;
	
	public List<Door> findAll() {
		return doorDAO.findAll();
	}
}
