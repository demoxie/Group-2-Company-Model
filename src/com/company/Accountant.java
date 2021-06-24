package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Accountant extends CEO{
        public ArrayList<String> paySalary(String staffID, double amount, String forTheMonthOf){
                CEO ceo = new CEO();
                return ceo.paySalary(staffID,amount,forTheMonthOf,ceo.viewStaffProfile(staffID));
        }


}
