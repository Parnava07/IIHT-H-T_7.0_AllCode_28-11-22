package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.HR;

@Service
public class HrServiceImpl implements IHrservice {
	
	//Fake HR list
	List<HR> list = List.of(
			new HR(1001L,"vivek","123456789"),
			new HR(1002L,"Rahul","323786789"),
			new HR(1003L,"Shreya","956456789"),
			new HR(1004L,"Tulika","888886789"),
			new HR(1005L,"Soumi","782345789"));

	@Override
	public HR getHR(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(hr -> hr.getUserID().equals(id)).findAny().orElse(null);
	}

}
