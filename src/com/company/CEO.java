package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class CEO extends Staff{
String designation;
public CEO (){
    this.designation = "CEO";
}
    String hire(ArrayList<String> applicantData){
        HashMap<String, ArrayList<String>> result = new HashMap<>();
        String status = "";
        int age = Integer.parseInt(applicantData.get(3));
        int yrsOfExp = Integer.parseInt(applicantData.get(4));
        if(( age>= 18 && age <= 45) &&  yrsOfExp >= 5){

            result = setStaffProfile(applicantData.get(4),applicantData);
            status += "Congratulations, You're now employed with us";
        }else{
            status = "Unfortunately, we can move forward with your application";
            //result = applicantData;
        }

        return status + "\n" + result;

    }
    private String fire(String staffID,HashMap<String, ArrayList<String>> list){
        ArrayList<String> ls = list.get(staffID);
        int attendCount = Integer.parseInt(ls.get(4));
        if(attendCount<20){
            list.remove(staffID);
        }
        return "Unfortunately your appointment has been terminated with us";
    }
    protected ArrayList<String> paySalary(String staffID, double amount, String forTheMonthOf, ArrayList<String> profile){

        LocalDateTime dateObject = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = dateObject.format(dateTimeFormatter);
        profile.set(6,Double.toString(amount));
        profile.add(forTheMonthOf);
        profile.add(datePaid);
        return profile;
    }
    protected ArrayList<String> viewStaffProfile(String staffID){
        return this.listOfStaffs.get(staffID);
    }
    private ArrayList<String> promote(String staffID){
        ArrayList<String> staffData =  new ArrayList<>();
        staffData = this.listOfStaffs.get(staffID);
        staffData.set(5,"Senior");
        return staffData;
    }
    private HashMap<String, ArrayList<String>> setStaffProfile(String yrsOfExperience, ArrayList<String> data){
        data.add(Boolean.toString(true));
        data.add("Junior");
        data.add(Integer.toString(1));
        if(Integer.parseInt(yrsOfExperience)>=10){
            data.add("Senior");
            data.add("N"+Double.toString(300000.00D));
        }else{
            data.add("Junior");
            data.add("N"+Double.toString(150000.00D));
        }
        HashMap<String, ArrayList<String>> profile = new HashMap<>();
        profile.put("ST-1234",data);
        //this.listOfStaffs.put(profile);
        return profile;
    }
}
