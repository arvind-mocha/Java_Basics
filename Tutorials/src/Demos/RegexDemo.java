package Demos;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {


        List emails = new ArrayList();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");

//Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");

        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        for (Object email : emails) {
            Matcher matcher = pattern.matcher((String) email);
            try {
                System.out.println(email + " : " + matcher.matches() + " " + ((String) email).substring(matcher.start(), matcher.end()));
            }
            catch (Exception e){
                System.out.println("No match");
            }
        }
    }
}