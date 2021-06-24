package com.company;

import java.util.ArrayList;

public class Accountant extends CEO{
        public ArrayList<String> paySalary(String staffID, double amount, String forTheMonthOf, ArrayList<String> profile){
                CEO ceo = new CEO();
                return ceo.paySalary(staffID,amount,forTheMonthOf,ceo.viewStaffProfile(staffID,profile));
        }


}
