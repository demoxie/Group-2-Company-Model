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
    public String hire(boolean empStat,String rank, int attendance,double salary, ArrayList<String> applicantData){
        //ArrayList<String> appData = new ArrayList<>();
        String status = "";
        int age = Integer.parseInt(applicantData.get(3));
        int yrsOfExp = Integer.parseInt(applicantData.get(4));
        if(( age>= 18 && age <= 45) &&  yrsOfExp >= 5){

            Staff staff = new Staff(applicantData.get(2),"ST-1234",applicantData.get(3),applicantData.get(4),applicantData.get(5),empStat,rank,attendance,salary);
            staff.setStaffProfile(applicantData);
            status += "Congratulations, You're now employed";
        }else{
            status = "Unfortunately, we can move forward with your application";
        }

        return status;

    }
    public String fire(String staffID,HashMap<String, ArrayList<String>> list){
        ArrayList<String> ls = list.get(staffID);
        int attendCount = Integer.parseInt(ls.get(4));
        if(attendCount<20){
            list.remove(staffID);
        }
        return "Unfortunately your appointment has been terminated with us";
    }
    protected ArrayList<String> paySalary(String staffID, double amount, String forTheMonthOf, ArrayList<String> list){
        Staff staff = new Staff(staffID,list);
        LocalDateTime dateObject = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = dateObject.format(dateTimeFormatter);
        //ArrayList<String> list =  staff.getStaffProfile(staffID);
        list.set(6,Double.toString(amount));
        list.add(forTheMonthOf);
        list.add(datePaid);
        return list;
    }
    protected ArrayList<String> viewStaffProfile(String staffID, ArrayList<String> profile){
        Staff staffObj = new Staff(staffID,profile);
        return profile;
    }
    protected ArrayList<String> promote(String staffID){
        Staff staffObject = new Staff();
        ArrayList<String> list =  staffObject.getStaffProfile(staffID);
        list.set(5,"Senior");
        return staffObject.getStaffProfile(staffID);
    }
}
