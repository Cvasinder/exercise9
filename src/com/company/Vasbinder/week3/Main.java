package com.company.Vasbinder.week3;
//Cameron Vasbinder
//03/15/19
//Exercise 9
abstract class ContactInfo{



    ContactInfo() {



    }



    public abstract void contact();

}

class emailClass extends ContactInfo{

    public String email;



    public emailClass(String email){

        this.email = email;

    }

    @Override

    public void contact(){

        System.out.println(email);

    }

}

class phoneClass extends ContactInfo{

    public String phone;



    public phoneClass(String phone){

        this.phone = phone;

    }

    @Override

    public void contact(){

        System.out.println(phone);

    }

}

public class Main {

    public static void main(String[] args) {

        emailClass test = new emailClass("ajg0525@att.net");

        phoneClass asa = new phoneClass("614-940-0881");

        asa.contact();

        test.contact();

    }

}