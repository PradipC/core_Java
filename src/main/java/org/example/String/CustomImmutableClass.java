package org.example.String;

public class CustomImmutableClass {

    // Exception handling
    // Multi threading

    // -- sample application


    public static void main(String[] args) {

       /* Employee employee = new Employee();
        System.out.println(employee);
        employee.id=10;
        employee.name="suhas";
        System.out.println(employee);
        System.out.println(employee.hashCode());

        System.out.println("*************");
        employee.id=20;
        employee.name="Pradip";
        System.out.println(employee);
        System.out.println(employee.hashCode());*/


        // make class as final , so no one will extend our class , so no one will override our properties
        // make all varibales as private


      /*  Employee employee = new Employee();
        System.out.println(employee);
        employee.setId(10);
        employee.setName("suhas");
        System.out.println(employee);
        System.out.println(employee.hashCode());

        System.out.println("*************");
        employee.setId(20);
        employee.setName("Pradip");
        System.out.println(employee);
        System.out.println(employee.hashCode());*/

        // dont use setter method
        // use only parameterized constrctor to initialize value


        Employee employee = new Employee(10,"suhas");
        System.out.println(employee);
        System.out.println(employee.hashCode());

        Employee employee1 = new Employee(20, "Pradip");
        System.out.println(employee1);
        System.out.println(employee1.hashCode());

    }
}


final class Employee  {

      private int id;

      private String name;


      public Employee(int id , String name ){
          this.id=id;
          this.name = name;
      }


    public int getId() {
        return id;
    }

  /*  public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

  /*  public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
