package com.stage.cda.herculepro.service.ArticleManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.articles.Window;
import com.stage.cda.herculepro.dao.articleDAO.WindowDAO;

@Service(value="windowManager")
public class WindowManager {

	@Autowired
	WindowDAO windowDAO;
	
	public List<Window> findAll() {
		return windowDAO.findAll();
	}
}
