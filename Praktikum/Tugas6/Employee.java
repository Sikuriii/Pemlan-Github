package Tugas6;

public class Employee implements Payable {
    private int registrationNumber;
    private String nama;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.nama = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getNama() {
        return nama;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void displayEmployeeInfo() {
        System.out.println("==============[Employee Information]==============");
        System.out.println("Registration Number             : " + registrationNumber);
        System.out.println("Name                            : " + nama);
        System.out.println("Salary Per Month                : " + salaryPerMonth);
        System.out.println("Total Salary After Debt         : " + getPayableAmount());

        System.out.println("\n==============[Employee Invoices]==============");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}