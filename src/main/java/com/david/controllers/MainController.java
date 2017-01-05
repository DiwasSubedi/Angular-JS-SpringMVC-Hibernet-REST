package com.david.controllers;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.david.Service.BankService;
import com.david.Service.PersonService;
import com.david.domain.BankAccount;
import com.david.domain.Person;


@Controller
@ComponentScan("com.david.service")
public class MainController {
	@Autowired
	PersonService service;
	@Autowired
	BankService bankService;
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	public String personform(@ModelAttribute("person")Person person){
		  return "AddPerson";
	 }
	 
	 @RequestMapping(value = "/search", method = RequestMethod.GET)
	public String searchForm(){
		  return "search";
	 }
	 @RequestMapping(value = "/results", method = RequestMethod.GET)
	public String resultForm(){
			  return "success";
		 }
	 
	 @RequestMapping(value = "/savenewperson", method = RequestMethod.POST)
		public String saveperson(@RequestBody Person person,Model model){
			//service.save(person);
		 	System.out.println(person.getfName());
		 	service.save(person);
			model.addAttribute("person", person);
			return "success";		
		}
	 
	@RequestMapping(value = "/getPerson/{searchname}", method = RequestMethod.GET)
	@ResponseBody
	    public Person givePerson(@PathVariable("searchname") String searchname) { 
			System.out.println("inside get person");
			Person result =(Person) service.searchByName(searchname);
			/*System.out.println("Getting all BankAccouts for " + result.getfName());
			for(BankAccount bank : result.getBanks()){					
					System.out.println(bank);			
			}*/
			return result;
	    }
	
	@ResponseBody
	@RequestMapping(value = "/getAllBankTypes", method = RequestMethod.GET)
    public Set<String> giveAllPerson() { 
		Set<String> bankcatagoryset =new TreeSet<String>();
		for(BankAccount banks: bankService.getAll()){
			bankcatagoryset.add(banks.getType());
		}		
		return bankcatagoryset;
    }

}
