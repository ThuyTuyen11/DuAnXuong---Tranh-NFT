package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.dao.InfomationDAO;
import com.demo.dao.ProductDAO;
import com.demo.entity.Infomation;
import com.demo.entity.Product;

@Controller
public class ProductController {
	@Autowired
	ProductDAO pdao;
	@Autowired
	InfomationDAO idao;
	@RequestMapping("/mkpfe/WebsiteTMDT")
	public String index(Model model,@RequestParam("pusername")Optional<String> pusername) {
		List<Infomation> listi = idao.findAll();
		model.addAttribute("artists",listi);
		if(pusername.isPresent()) {
			List<Product> list = pdao.findByUsername(pusername.get());
		    model.addAttribute("products", list);
		}else {
			List<Product> list = pdao.findAll();
		    model.addAttribute("products", list);
		}
		return"mkpfe/WebsiteTMDT";
	}

}
