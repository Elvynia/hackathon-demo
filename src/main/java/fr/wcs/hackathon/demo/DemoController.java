package fr.wcs.hackathon.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private MarcelleService service;

	@RequestMapping({ "/", "/index" })
	public String index(Model model) {
		List<Article> list = this.service.getArticles();
		LOGGER.info("SUPERLIST : {} ", list);
		model.addAttribute("list", list);
		return "index";
	}
}
