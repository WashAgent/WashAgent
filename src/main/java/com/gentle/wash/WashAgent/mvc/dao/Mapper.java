package com.gentle.wash.WashAgent.mvc.dao;

import java.util.List;

import com.gentle.wash.WashAgent.mvc.dto.MemberDTO;

public interface Mapper {
	
	List<MemberDTO> SelectLoginMember();
	
}
