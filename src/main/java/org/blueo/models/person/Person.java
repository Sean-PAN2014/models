package org.blueo.models.person;

import java.util.List;
import java.util.Map;

public class Person {
	private String name;
	private int age;
	private Address address;
	private List<String> nickNames;
	private Map<String, PhoneNumber> phoneNumberMap;

	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Person(String name, int age, Address address, List<String> nickNames) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.nickNames = nickNames;
	}

	public Person(String name, int age, Address address, List<String> nickNames, Map<String, PhoneNumber> phoneNumberMap) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.nickNames = nickNames;
		this.phoneNumberMap = phoneNumberMap;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nickNames == null) ? 0 : nickNames.hashCode());
		result = prime * result + ((phoneNumberMap == null) ? 0 : phoneNumberMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nickNames == null) {
			if (other.nickNames != null)
				return false;
		} else if (!nickNames.equals(other.nickNames))
			return false;
		if (phoneNumberMap == null) {
			if (other.phoneNumberMap != null)
				return false;
		} else if (!phoneNumberMap.equals(other.phoneNumberMap))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", address=");
		builder.append(address);
		builder.append(", nickNames=");
		builder.append(nickNames);
		builder.append(", phoneNumberMap=");
		builder.append(phoneNumberMap);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}

	public Map<String, PhoneNumber> getPhoneNumberMap() {
		return phoneNumberMap;
	}

	public void setPhoneNumberMap(Map<String, PhoneNumber> phoneNumberMap) {
		System.out.println("to setPhoneNumberMap");
		this.phoneNumberMap = phoneNumberMap;
	}

}
