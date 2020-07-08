package com.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyFedRepo;

import com.entity.Feedback;


@Service
public class AppService {

	@Autowired
	private MyFedRepo myfedrepo;
	private static HashMap<Integer,List<Feedback>> hm = new HashMap<Integer,List<Feedback>>();

	public boolean addUser(Feedback e){
		myfedrepo.save(e);
		return true;
	}
	
	
	public boolean updateperson(Feedback e, int id){
		
		if(hm.containsKey(id)){
			
			ArrayList<Feedback> al = new ArrayList<Feedback>();
			al.add(e);
			hm.put(id,al);
			System.out.println(hm.get(id));
			return true;
	}
		else{
			return false;
		}
	}

	
	public boolean deleteperson(int id ){
		
	if(hm.containsKey(id))
	{
		hm.remove(id);
		System.out.println(hm.get(101));
	return true;
	}
	else{
		return false;
	}
	
	}


	
	
}
