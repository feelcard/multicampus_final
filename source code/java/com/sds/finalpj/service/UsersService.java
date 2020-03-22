package com.sds.finalpj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sds.finalpj.dao.UsersDao;
import com.sds.finalpj.vo.UserInterest;
import com.sds.finalpj.vo.Users;

@Service
public class UsersService implements InterfaceService{
	
	@Autowired
	UsersDao usersdao;

	@Override
	public Users userSearch(String userid) {
		
		Users user = usersdao.userSelect(userid);
		
		return user;
	}

	@Override
	public ArrayList<Users> userSearchAll() {
		
		ArrayList<Users> list = usersdao.userSelectAll();
		
		return list;
	}

	@Override
	public UserInterest UserInterestSearch(String userid) {
		
		UserInterest userinterest = usersdao.UserInterestSelect(userid);
		
		return userinterest;
	}

	@Override
	public ArrayList<UserInterest> interestSearchAll() {
		
		ArrayList<UserInterest> list = usersdao.interestSelectAll();
		
		return list;
	}
	
	

}
