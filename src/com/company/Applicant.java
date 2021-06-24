package com.company;

import java.util.ArrayList;

public class Applicant {
    public String name;
    public int age;
    public int yearsOfExperience;
    public String discipline;
   
    public ArrayList<String> apply(String name,int age, int yearsOfExperience,String discipline,String companyName,String address){
        ArrayList<String> application = new ArrayList<>();
        application.add(companyName);
        application.add(address);
        application.add(name);
        application.add(Integer.toString(age));
        application.add(Integer.toString(yearsOfExperience));
        application.add(discipline);
        return application;
    }

}
