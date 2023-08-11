package org.example.exceptionHandling;

public class CustomException {

    public static void main(String[] args) {


        // accenture
        //   suhas@accenture.com  , pradip@accenture.com
        //   suhas@gmail.com - external email


        validateExternalEmail("suhas@tcs.com");


        giveSalary();



    }



    private static void validateExternalEmail(String email) {

        if(email.contains("@accenture.com")){
           System.out.println("This is valid email");
        }else{
            System.out.println("This is invalid email");
            throw new InvalidEmailException(" This is not valid email , so we not give you salary  ");
        }


    }

    private static void giveSalary() {

        System.out.println("Credit 10000 rupees in account ");

    }


}
