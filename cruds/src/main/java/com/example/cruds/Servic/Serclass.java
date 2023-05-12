package com.example.cruds.Servic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruds.entity.Bean;
import com.example.cruds.repo.Repoclass;
import com.example.cruds.resource.Resource;

import antlr.collections.List;

@Service
public class Serclass {
	@Autowired
	Repoclass rep;
	public Bean insert2(Bean bean) {
return rep.save(bean);
		
}
	
	public java.util.List<Bean> get2() {
		// TODO Auto-generated method stub
		return rep.findAll();
	}
	
	public Bean update(Bean bean,Integer id) {
		Bean b=rep.findById(id).orElseThrow( () -> new Resource("bean","id",id));
		b.setPass(bean.getPass());
		return rep.save(b);

	+}
	public void delete(Integer id) {
		rep.deleteById(id);
	}
}