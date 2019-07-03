package com.stackroute.pe3;

public class UserDefindException {
    public UserDefindException(){

    }

    public String throwsException(int number){
        try{
            if(number==10){
                throw new Exception("Number not Equal to 10");
            }
        }
        catch (Exception e){
            System.out.println("number out of range exception");
        }
        finally {
            System.out.println("given nunber is less than actual number");
        }
        return "Exception";
    }
}
