package com.example.cruds.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cruds.Servic.Serclass;
import com.example.cruds.entity.Bean;
import java.util.List;

@RestController
@RequestMapping("/portal")
public class Conclass {
@Autowired
Serclass obj;
@PostMapping("/save")
public Bean insert1(@RequestBody Bean bean){
return  obj.insert2(bean);

}
@GetMapping("/getall")
public List<Bean> get(){
	return obj.get2();
}
@PutMapping("/put/{id}")
public Bean update(@RequestBody Bean bean,@PathVariable(name="id")Integer id) {
	return obj.update(bean,id);
}
@DeleteMapping("/delete/{id}")
public String  Delete(@PathVariable Integer id) {
	obj.delete(id);
	return"deleted";
	
}
}