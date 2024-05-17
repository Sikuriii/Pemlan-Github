package Tugas6;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Buku Tulis", 7, 10);
        Invoice invoice2 = new Invoice("Penghapus", 3, 10);
        Invoice invoice3 = new Invoice("Kertas HVS", 1, 200);   
        Invoice invoice4 = new Invoice("Penggaris", 1, 50);
        Invoice invoice5 = new Invoice("Pensil", 5, 5);

        Invoice[] invoices = {invoice1, invoice2, invoice3, invoice4, invoice5};

        Employee employee = new Employee(111025, "Muhammad Fachri Abdurafi", 1500, invoices);

        employee.displayEmployeeInfo();

    }
}