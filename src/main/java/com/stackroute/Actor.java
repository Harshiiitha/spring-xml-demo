package com.stackroute;

public class Actor {

        private  String a_name;
        private String a_gender;
        private int a_age;

    public Actor(String a_name, String a_gender, int a_age) {
        this.a_name = a_name;
        this.a_gender = a_gender;
        this.a_age = a_age;
    }
    public Actor()
    {

    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_gender() {
        return a_gender;
    }

    public void setA_gender(String a_gender) {
        this.a_gender = a_gender;
    }

    public int getA_age() {
        return a_age;
    }

    public void setA_age(int a_age) {
        this.a_age = a_age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "a_name='" + a_name + '\'' +
                ", a_gender='" + a_gender + '\'' +
                ", a_age=" + a_age +
                '}';
    }
}
