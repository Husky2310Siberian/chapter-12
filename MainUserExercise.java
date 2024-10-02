package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentialsExercise;
import gr.aueb.cf.ch12.model.UserExercise;

public class MainUserExercise {

    public static void main(String[] args) {


        UserExercise user1 = new UserExercise(1, "Vasileios", "Kritikos");
        UserCredentialsExercise user2 = new UserCredentialsExercise(1, "vaskrit", "12345");




        System.out.println("user1 ID : " +user1.getId());
        System.out.println("user1 firstname: " +user1.getFirstname());
        System.out.println("user1 lastname: " +user1.getLastname());
        System.out.println("user1 firstname: " +user2.getUsername());
        System.out.println("user1 lastname: " +user2.getPassword());



    }
}
