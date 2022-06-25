package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        System.out.println("********** Customer1 has membership + buys service + buys product **********");
        Customer customer1 = new Customer("Linda");
        customer1.setMember(true);
        customer1.setMemberType("Premium");

        Visit customer1Visit = new Visit(customer1, new Date());
        customer1Visit.setServiceExpense(86);
        customer1Visit.setProductExpense(32);
        System.out.println(customer1Visit);
        System.out.println("Total expense: " + customer1Visit.getTotalExpense());



        System.out.println("\n********** Customer2 has membership + buys service **********");
        Customer customer2 = new Customer("Rolands");
        customer2.setMember(true);
        customer2.setMemberType("Gold");

        Visit customer2Visit = new Visit(customer2, new Date());
        customer2Visit.setServiceExpense(55);
        System.out.println(customer2Visit);
        System.out.println("Total expense: " + customer2Visit.getTotalExpense());



        System.out.println("\n********** Customer3 has membership + buys product **********");
        Customer customer3 = new Customer("Liene");
        customer3.setMember(true);
        customer3.setMemberType("Silver");

        Visit customer3Visit = new Visit(customer3, new Date());
        customer3Visit.setProductExpense(49);
        System.out.println(customer3Visit);
        System.out.println("Total expense: " + customer3Visit.getTotalExpense());



        System.out.println("\n********** Customer4 doesn't have a membership **********");
        Customer customer4 = new Customer("Māris");
        customer4.setMemberType("None");

        Visit customer4Visit = new Visit(customer4, new Date());
        customer4Visit.setServiceExpense(60);
        customer4Visit.setProductExpense(15);
        System.out.println(customer4Visit);
        System.out.println("Total expense: " + customer4Visit.getTotalExpense());

    }
}
