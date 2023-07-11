package org.example.String;

public class StringCreation {

    public static void main(String[] args) {

       // string is a sequnce of chacarters only
        String name = "suhas";


      // String creation in Java
        // 2 ways

        String s1 = "india";

        String s2 = new String("USA");


      // Using String Literal / double quotes

        String s11 = "sachin";
         s11.concat(" tendulkar");
        String s44 = s11.toUpperCase();

        String s22 = "sachin";


        String s33 = "dhoni";


        System.out.println(s11);
        System.out.println(s22);
        System.out.println(s33);

        System.out.println(s44);

       // memory utilization / memory benefits we use String constant pool area
        // String is not modifiable object , once it will create it will remain same only
        // if we modify , then it will create new object for that in string constant pool area
        // so we are calling String is immutable in Java


        String empName = "suhas";
        String empName2 = "suhas";
        String empName3 = "pradip";

        System.out.println(empName.hashCode());
        System.out.println(empName2.hashCode());
        System.out.println(empName3.hashCode());



        String s111= "india is my country";

       String toUpperCase = s111.toUpperCase();

       String toLowerCase =  s111.toLowerCase();

        char characterOfZeroIndex = s111.charAt(0);

        char characterOfSevenIndex = s111.charAt(7);

        String concatResult =s111.concat(" and I love India");

        String replacedString = s111.replace('i','a');

        String s333= "india is my country";

        System.out.println("*************");

        System.out.println(toUpperCase);

        System.out.println(toLowerCase);

        System.out.println(characterOfZeroIndex);

        System.out.println(replacedString);


        System.out.println(s111);
        //System.out.println(s222);
        System.out.println(s333);

        System.out.println(s111.hashCode());
        //System.out.println(s222.hashCode());
        System.out.println(s333.hashCode());




        String empName11 = "ramesh kumar" ;
        String empName22 = "Ramesh Kumar";


        if(empName11.equalsIgnoreCase(empName22)){
            System.out.println("Both are having same name employee");
        }else{
            System.out.println("Both are having differnent name employee");
        }


      //
        String sc1 = "suhas";
        String sc2 = new String("USA");
        String sc3 = new String("suhas");



    // StringBuffer and StringBuilder
         // Both are mutable object
         // when we update the string , It will not create new object and it will update the same object only

        // Stringbuffer having all methods with syncronized keyword , so it make its thread safe
        // Stringbuilder not having any method with syncronized keyword , so it make its not thread safe
        // due to perfomance wise , stringbuilder is not theread safe , so its fast
        // TODO - cover all above points in Multi threading


        /*StringBuffer sb11 = new StringBuffer(" select * from Person ");

        if(  name != null ){

            sb11.append( "  where name = suhas" );

        }else if ( role != null ){

            sb11.append(" where role= dev");

        }*/


        System.out.println("###########################################");

       String name1 = "suhas";
       String name2=name1.concat(" kumar");

       System.out.println(name1);

       StringBuffer sb1 = new StringBuffer("suhas");
       sb1.append(" kumar");
       System.out.println(sb1);


       sb1.insert(3 , "india");
       System.out.println(sb1);


        sb1.delete(3,8);
        System.out.println(sb1);


        int length = sb1.length();
        System.out.println(length);


        String name11 = "     suhas                            ";
        System.out.println("name11 : "+name11);

        String name22 = name11.trim();
        System.out.println("name22 : "+name22);
        System.out.println("name22 : "+name22.length());

        if(name22.length() == 0 ){

            System.out.println("Please enter valid name");

        }else{
            System.out.println("valid name");

        }


        String email= "     pradip@gmail.com   ";
        System.out.println("email : "+email);
        System.out.println("email : "+email.length());
        String trim = email.trim();
        System.out.println("trimmed email : "+trim);
        System.out.println("email : "+trim.length());



        StringBuilder sbuild1 = new StringBuilder("suhas");








    }


}
