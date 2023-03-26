package ro.sda.advanced._4_arrayList;

// Your job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Branch {

    private List<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }

    public String getBranchName() {
        return branchName;
    }
    // method contains iterates over the list and searches for the desired element by comparing them using EQUALS method
    public void addCustomer(String customerName, double initialAmount) {
        Customer c = new Customer(customerName, initialAmount);
        if (customers.contains(c)) {
            throw new RuntimeException("Client already exists!");
        }
        customers.add(c);
    }

    public void addCustomerTransaction(String customerName, double amount) {
        for(Customer c : customers){
            if (c.getName().equals(customerName)) {
                c.addTransaction(amount);
                return;
            }
        }
        throw new RuntimeException("Customer doesn't exist!");
    }

}
