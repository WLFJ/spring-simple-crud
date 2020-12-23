package wyw1813004316qygl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import wyw1813004316qygl.entity.wyw_People;
import wyw1813004316qygl.query.wyw_QueryPeople;
import wyw1813004316qygl.service.wyw_IPeopleService;

@Controller
public class testJobController {
	
	@Autowired
	private wyw_IPeopleService wyw_service;
	
	@GetMapping("/add")
	public ModelAndView showAddPeople(ModelAndView mv) {
		mv.setViewName("form");
		return mv;
	}
	
	@PostMapping("/add")
	public RedirectView addPeople(String wyw_name, Integer wyw_age, String wyw_job) {
		wyw_People p = new wyw_People(wyw_name, wyw_age, wyw_job);
		wyw_service.addPeople(p);
		return new RedirectView("/");
	}
	
	@RequestMapping("/delete")
	public RedirectView deletePeople(Integer wyw_id) {
		wyw_service.deletePeople(wyw_id);
		return new RedirectView("/");
	}
	
	@GetMapping("/update")
	public ModelAndView showUpdatePeople(ModelAndView mv, Integer wyw_id) {
		mv.addObject("wyw_people", wyw_service.getPeopleById(wyw_id));
		mv.setViewName("form");
		return mv;
	}
	
	@PostMapping("/update")
	public RedirectView updatePeople(Integer wyw_id, String wyw_name, Integer wyw_age, String wyw_job) {
		wyw_People p = new wyw_People(wyw_id, wyw_name, wyw_age, wyw_job);
		wyw_service.updatePeople(p);
		return new RedirectView("/");
	}
	
	@GetMapping("/query")
	public ModelAndView showQueryPeople(ModelAndView mv) {
		mv.setViewName("query");
		return mv;
	}
	
	@PostMapping("/query")
	public ModelAndView queryPeople(@RequestParam(required=false) Integer wyw_id,
			@RequestParam(required=false) String wyw_name,
			@RequestParam(required=false) Integer wyw_age_lower,
			@RequestParam(required=false) Integer wyw_age_upper,
			@RequestParam(required=false) String wyw_job
			, ModelAndView mv) {
		wyw_QueryPeople qp = new wyw_QueryPeople();
		qp.setWyw_id(wyw_id);
		qp.setWyw_ageLower(wyw_age_lower);
		qp.setWyw_ageUpper(wyw_age_upper);
		qp.setWyw_name(wyw_name);
		qp.setWyw_job(wyw_job);
		mv.addObject("wyw_people", wyw_service.queryPeoples(qp));
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView getPeoples(ModelAndView mv) {
		mv.addObject("wyw_people", wyw_service.getPeoples());
		mv.setViewName("index");
		return mv;
	}

}
