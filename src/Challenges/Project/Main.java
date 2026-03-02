package Challenges.Project;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String, String> mySkills = new HashMap<>();
        mySkills.put("Java", "Beginner");
        mySkills.put("Spring Boot", "Learning");
        mySkills.put("Next.js", "Interested");

        mySkills.replace("Java", "Advanced Beginner");

        for(String skill : mySkills.keySet()) {
            System.out.println(skill + ": " + mySkills.get(skill));
        }
    }
}
