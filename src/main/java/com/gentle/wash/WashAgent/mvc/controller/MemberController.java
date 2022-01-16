package com.gentle.wash.WashAgent.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gentle.wash.WashAgent.mvc.service.MemberService;

@Controller
@RequestMapping("/")
public class MemberController {

	private MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping("index")
	public String SelectMember(Model model) {
		
		model.addAttribute("Member", memberService.SelectMember());
		
		return "index";
		
	}
}
