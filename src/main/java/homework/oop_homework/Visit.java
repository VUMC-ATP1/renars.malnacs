package homework.oop_homework;

import java.util.Date;

public class Visit {
    public Customer customer;
    public Date date;
    public double serviceExpense;
    public double productExpense;


    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType())) + (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()))));

    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
