package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class CEO extends Staff{
    private final Staff staffProfile;
    public CEO(){
        this.staffProfile = null;
    }
public CEO (Staff staff){
    this.staffProfile = staff;
}
    String hire(ArrayList<String> applicantData){

        String status = "";
        int age = Integer.parseInt(applicantData.get(1));
        int yrsOfExp = Integer.parseInt(applicantData.get(2));
        if(( age>= 18 && age <= 45) &&  yrsOfExp >= 5){
            status += "Congratulations, You're now employed with us";
            setStaffProfile(applicantData);
        }else{
            status = "Unfortunately, we can move forward with your application";
            //result = applicantData;
        }

        return status + "\n" + applicantData;

    }
    private String fire(String staffID){
        ArrayList<HashMap<String, String>> profile = this.staffProfile.staffProfile.getOrDefault(staffID,0);
        for (int i=0; i<profile.size();i++){
            HashMap<String,String> item = profile.get(i);
            if(item.containsKey("employmentStatus")){
                Boolean val = Boolean.parseBoolean(item.get("employmentStatus"));
                item.put("employmentStatus",Boolean.toString(!val));
            }
        }
        return "Unfortunately your appointment has been terminated with us";
    }
    private Staff getStaffProfile(String staffID){
        CEO ceo = new CEO(new Staff());
        return (ceo.staffProfile);
    }

    protected Staff paySalary(String staffID, double amount, String forTheMonthOf){

        LocalDateTime dateObject = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String datePaid = dateObject.format(dateTimeFormatter);
        /*Staff staff = new Staff();
        staff.listOfStaffs.set(6,Double.toString(amount));
        profile.add(forTheMonthOf);
        profile.add(datePaid);
        return profile;*/
    }
    protected Staff viewStaffProfile(String staffID){
        return this.listOfStaffs.get(staffID);
    }
    private Staff promote(String staffID){
        Staff staffData =  new ArrayList<>();
        staffData = this.listOfStaffs.get(staffID);
        staffData.set(5,"Senior");
        return staffData;
    }
    private HashMap<String, ArrayList<String>> setStaffProfile(ArrayList<String> data){
    HashMap<String,ArrayList<String>> d = new HashMap<>();

        if(Integer.parseInt(data.get(2))>=10){
            this.staffProfile.
            data.add("Senior");
            data.add(Integer.toString(0));
            data.add(Integer.toString(0));
            data.add("N"+Double.toString(300000.00D));
        }else{
            data.add("Staff member");
            data.add(Integer.toString(0));
            data.add(Integer.toString(0));
            data.add("N"+Double.toString(150000.00D));
        }
        HashMap<String, ArrayList<String>> profile = new HashMap<>();
        profile.put("ST-1234",data);
        //this.listOfStaffs.put(profile);
        return profile;
    }

    protected ArrayList<Staff> getListOfStaffs(){
        return this.listOfStaffs;
    }
}
