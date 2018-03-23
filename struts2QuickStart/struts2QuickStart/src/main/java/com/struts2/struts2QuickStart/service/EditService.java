package com.struts2.struts2QuickStart.service;

import com.struts2.struts2QuickStart.model.Person;

public interface EditService {
	Person getPerson();

	void savePerson(Person personBean);
}
