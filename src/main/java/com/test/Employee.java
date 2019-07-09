package com.test;
class Employee {

    // write fields
    protected String name, email;
    protected int experience;
    // write constructor
    protected Employee (String name, String email, int experience) {
        this.name = name;
        this.email= email;
        this.experience = experience;
    }

    // write getters
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;

    }
    public int getExperience(){
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    protected String mainLanguage;
    protected String[] skills;

    // write constructor
    protected Developer(String name, String email, int experience, String mainLanguage, String[] skills){
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
        getName();
        getEmail();
        getExperience();

    }

    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    protected boolean phd;
    protected String[] methods;

    // write constructor
    protected DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
        getName();
        getEmail();
        getExperience();
    }

    // write getters

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}