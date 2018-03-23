package com.struts2.struts2QuickStart.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.struts2QuickStart.model.Person;
import com.struts2.struts2QuickStart.model.State;
import com.struts2.struts2QuickStart.service.EditService;
import com.struts2.struts2QuickStart.service.EditServiceInMemory;

public class EditAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private EditService editService = new EditServiceInMemory();

	private Person personBean;

	private String[] sports = { "football", "baseball", "basketball" };

	private String[] genders = { "male", "female", "not sure" };

	private List<State> states;

	private String[] carModelsAvailable = { "Ford", "Chrysler", "Toyota", "Nissan" };

	public String execute() throws Exception {

		editService.savePerson(getPersonBean());

		return SUCCESS;

	}

	public String input() throws Exception {

		setPersonBean(editService.getPerson());

		return INPUT;
	}

	public Person getPersonBean() {

		return personBean;

	}

	public void setPersonBean(Person person) {

		personBean = person;

	}

	public List<String> getSports() {
		return Arrays.asList(sports);
	}

	public List<String> getGenders() {

		return Arrays.asList(genders);

	}

	public List<State> getStates() {

		states = new ArrayList<State>();
		states.add(new State("AZ", "Arizona"));
		states.add(new State("CA", "California"));
		states.add(new State("FL", "Florida"));
		states.add(new State("KS", "Kansas"));
		states.add(new State("NY", "New York"));

		return states;
	}

	public String[] getCarModelsAvailable() {
		return carModelsAvailable;
	}
}
