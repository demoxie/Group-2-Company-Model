package com.company;

import java.util.ArrayList;

public class Company {
    public String companyName;
    public String companyAddress;
    protected ArrayList<Staff> listOfStaffs;
    public Company(){
        this.companyName = "Decagon";
        this.companyAddress = "Edo State";
    }
    protected Company(Staff staffProfile){
        this.listOfStaffs.add(staffProfile);
    }
    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}';
    }

    public static void main(String[] args) {
	// write your code here

       /* Accountant accountant = new Accountant();
        Staff staff = new Staff();
        String name,discipline;
        int age,yrsOfExp;
        Scanner sc;
        HashMap<String, ArrayList<String>> tl;
        sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter Years of experience: ");
        yrsOfExp = sc.nextInt();
        System.out.println("Enter Discipline: ");
        discipline = sc.next();
        tl = new HashMap<>();
        tl.put("ST-1234",applicant.apply(name,age,yrsOfExp,discipline,company.companyName,company.companyAddress));
        System.out.println(ceo.hire(applicant.apply(name,age,yrsOfExp,discipline,company.companyName,company.companyAddress)));*/
        /*ArrayList<String> profile = new ArrayList<>();
        profile.add("Shadrach Adamu");
        profile.add("23");
        profile.add("27");
        profile.add("Computer Science");
        profile.add("True");
        profile.add("Seniour");
        profile.add("0.00D");
        System.out.println(accountant.paySalary("ST-1234",50000D,"For the Month of June",profile));*/

    }
    public Company getCompanyInfo(){

        return new Company();
    }

}
