package za.ac.cput.util;

import com.fasterxml.uuid.Generators;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.Date;

public class Helper {
    public Helper() {
    }

    public static String generateId() {
        return Generators.randomBasedGenerator().generate().toString();
    }

    public static boolean validateEmail(String email) {
        return EmailValidator.getInstance().isValid(email);
    }
    public static boolean isNullOrEmpty(Object s){

        return s==null || s.equals("");
    }
    public static boolean validateScore(int score){
        return score<=5;
    }

    public static boolean isValidDate(Date date){
        Date today=new Date();
        System.out.println(today);
        return today.compareTo(date)<=0;
    }
}
