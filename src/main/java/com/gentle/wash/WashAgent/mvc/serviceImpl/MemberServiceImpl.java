package com.gentle.wash.WashAgent.mvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gentle.wash.WashAgent.mvc.dao.Mapper;
import com.gentle.wash.WashAgent.mvc.dto.MemberDTO;
import com.gentle.wash.WashAgent.mvc.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	private Mapper mapper;
	
	@Autowired
	public MemberServiceImpl(Mapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public List<MemberDTO> SelectMember() {
		List<MemberDTO> member = mapper.SelectLoginMember();
		return member;
	}
}
