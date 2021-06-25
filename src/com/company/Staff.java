package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Staff extends Company{
    protected HashMap<String,ArrayList<HashMap<String, String>>> staffProfile;

    private void setStaffProfile(HashMap<String,ArrayList<HashMap<String, String>>> profile) {
        this.staffProfile = profile;
    }
    private HashMap<String, ArrayList<HashMap<String, String>>> getStaffProfile(){
        return this.staffProfile;
    }

    public String requestForRaise(double salary,double workRate, double expectedSalary){
        String message = "";
        if(salary<expectedSalary && workRate>=70.00D){
            message = "I am placing request for raise";
        }
        return message;
    }
    public String markAttendance(String staffID,boolean present){
        if(present){
                ArrayList<HashMap<String, String>> profile = this.staffProfile.get(staffID);
                for (int i=0; i<profile.size();i++){
                    HashMap<String,String> item = profile.get(i);
                    if(item.containsKey("attendanceCount")){
                        Integer val = Integer.parseInt(item.get("attendanceCount"))+1;
                        item.put("attendanceCount",(val).toString());
                    }
                }



        }
        return "Marked";
    }
}
