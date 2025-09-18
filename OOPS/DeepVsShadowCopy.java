package OOPS;

import java.util.*;

class Address {
 String city;
 String state;

 Address(String city, String state) {
  this.city = city;
  this.state = state;
 }  
}

class Person {
 String name;
 int age;
 Address address; // Reference to Address object

 Person(String name, int age, Address address) {
  this.name = name;
  this.age = age;
  this.address = address;
 }
}

public class DeepVsShadowCopy {
 public static void main(String[] args) {
    Address add = new Address("New York", "NY");

    Person p1 = new Person("Alice", 30, add);
    Person p2 = p1; // Shallow copy (reference copy)
    System.out.println(p1.name + " lives in " + p1.address.city);
    System.out.println(p2.name + " lives in " + p2.address.city);
    System.out.println(p1==p2);

    p2.name = "Bob";

    System.out.println("After Modification:");

    System.out.println(p1.name + " lives in " + p1.address.city);
    System.out.println(p2.name + " lives in " + p2.address.city);
   
    Person p3 = new Person(p1.name, p1.age, new Address(p1.address.city, p1.address.state)); // Deep copy
    System.out.println(p1.name + " lives in " + p1.address.city);
    System.out.println(p3.name + " lives in " + p3.address.city);
    System.out.println(p1==p3);

    p3.name = "Charlie";

      System.out.println("After Modification:");

    System.out.println(p1.name + " lives in " + p1.address.city);
    System.out.println(p3.name + " lives in " + p3.address.city);
 }
}