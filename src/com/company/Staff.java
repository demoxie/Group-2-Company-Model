package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Staff extends Company{
    private boolean employmentStatus;
    private String staffRank;
    protected HashMap<String, ArrayList<String>> listOfStaffs = new HashMap<>();
    public Staff(){
    }
    public Staff(String staffID, ArrayList<String> list){
        this.listOfStaffs.put(staffID,list);
    }

    public Staff(String name, String staffID, String s, String s1, String discipline, boolean empStat, String rank, int attendance, double salary) {
        int age = Integer.parseInt(s);
        int yrsOfExp = Integer.parseInt(s1);
        this.employmentStatus = Boolean.parseBoolean(String.valueOf(empStat));
        this.staffRank = rank;
        ArrayList<String> profile = new ArrayList<>();
        profile.add(name);
        profile.add(Integer.toString(age));
        profile.add(Integer.toString(yrsOfExp));
        profile.add(discipline);
        profile.add(Boolean.toString(employmentStatus));
        profile.add(staffRank);
        profile.add(Integer.toString(attendance));
        profile.add(Double.toString(salary));
        this.listOfStaffs.put(staffID,profile);
    }


    protected boolean setStaffProfile(ArrayList<String> data){
        this.employmentStatus = true;
        this.staffRank = "Senior";
        ArrayList<String> profile = new ArrayList<>();
        profile.add(data.get(0));
        profile.add(data.get(1));
        profile.add(data.get(2));
        profile.add(data.get(3));
        profile.add(Boolean.toString(true));
        profile.add(this.staffRank);
        double salary = 0.00D;
        profile.add(Double.toString(salary));
        this.listOfStaffs.put("ST-263738",profile);
        return true;
    }
    public ArrayList<String> getStaffProfile(String staffID){
        return listOfStaffs.get(staffID);
    }
    protected boolean updateStaffEmploymentStatus(boolean status){
        this.employmentStatus = status;
        return status;
    }
    protected boolean getStaffEmploymentStatus(){
        return this.employmentStatus;
    }
    protected boolean updateStaffRank(String status){
        this.staffRank = status;
        return true;
    }
    private String getStaffRank(){
        return this.staffRank;
    }
    protected HashMap<String, ArrayList<String>> getListOfStaffs(){
        return this.listOfStaffs;
    }
    public String requestForRaise(double salary,double workRate, double expectedSalary){
        String message = "";
        if(salary<expectedSalary && workRate>=70.00D){
            message = "I am placing request for raise";
        }
        return message;
    }
    public String markAttendance(String staffID,boolean presence){
        if(presence){
            ArrayList<String> profile = this.listOfStaffs.get(staffID);
            profile.set(4,profile.get(4));
        }
        return "Request accepted";
    }
}
