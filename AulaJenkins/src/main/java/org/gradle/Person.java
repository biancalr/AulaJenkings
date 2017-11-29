package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Person {
    private final String name;
	private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        new GrowthList();
    }

	public String getName() {
        return name;
    }
    public int getAge() {
    	return age;
    }
}
