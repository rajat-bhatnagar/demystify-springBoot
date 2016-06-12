package com.thoughtworks.boot.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtworks.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	//List Shipwrecks
	@RequestMapping(value="shipwrecks" , method=RequestMethod.GET)
	public List<Shipwreck> list(){
		return ShipwreckStub.list();
	}
	
	//Create a Shipwreck
	@RequestMapping(value="shipwrecks" , method=RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck){
		return ShipwreckStub.create(shipwreck);
	}
	
	//View a Shipwreck
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id){
		return ShipwreckStub.get(id);
	}
	
	//Update a Shipwreck
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck){
		return ShipwreckStub.update(id, shipwreck);
	}
	
	//Delete a Shipwreck
	@RequestMapping(value="shipwrecks/{id}", method=RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id){
		return ShipwreckStub.delete(id);
	}
	
}
