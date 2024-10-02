package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import static java.lang.Math.*;

public class UserMain {

    public static void main(String[] args) {

        User anna = new User(2,"Anna", "G", "anna", "12345", false);

        System.out.println("Anna id : " +anna.getId()) ;

    }
}