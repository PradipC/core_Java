package org.example.oops.encapsulation;

public class Car {

      private String brand;

      private String model;

      private Integer year;

      private Float price;


      public String getBrand() {
            return brand;
      }

      public void setBrand(String suhasGivenBrand) {
            this.brand = suhasGivenBrand;
      }

      public String getModel() {
            return model;
      }

      public void setModel(String passedValueModel) {
            this.model = passedValueModel;
      }

      public Integer getYear() {
            return year;
      }

      public void setYear(Integer year) {
            this.year = year;
      }

      public Float getPrice() {
            return price;
      }

      public void setPrice(Float price) {
            this.price = price;
      }

      public void getAllCarDetails(){

            System.out.println("Car brand is : "+brand);
            System.out.println("Car model is : "+model);
            System.out.println("Car year is : "+year);
            System.out.println("Car price is : "+price);


      }





}
