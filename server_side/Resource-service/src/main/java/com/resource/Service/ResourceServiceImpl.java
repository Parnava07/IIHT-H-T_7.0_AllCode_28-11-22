package com.resource.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.Entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService {

	List<Resource> list = List.of(new Resource(1L, "Akash@gmail.com", "Akash", "Senior dev", 1001L),
			new Resource(2L, "Akash@gmail.com", "Akash", "Senior dev", 1001L),
			new Resource(3L, "Akash@gmail.com", "Akash", "Senior dev", 1002L),
			new Resource(4L, "Akash@gmail.com", "Akash", "Senior dev", 1004L),
			new Resource(5L, "Akash@gmail.com", "Akash", "Senior dev", 1001L),
			new Resource(6L, "Akash@gmail.com", "Akash", "Senior dev", 1002L),
			new Resource(7L, "Akash@gmail.com", "Akash", "Senior dev", 1001L));

	@Override
	public List<Resource> getResourceForUsers(Long userId) {
		return list.stream().filter(resource -> resource.getUserID().equals(userId)).collect(Collectors.toList());

	}
}
