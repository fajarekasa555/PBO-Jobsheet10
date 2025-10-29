public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Jokoie", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Shimitsu Koya", 5);
        ElectricityBill eBill = new ElectricityBill(450, "R-2");

        System.out.println("=== Permanent Employee ===");
        System.out.println(pEmp.getEmployeeInfo());
        System.out.println("Payment Amount: " + pEmp.getPaymentAmount());

        System.out.println("\n=== Internship Employee ===");
        System.out.println(iEmp.getEmployeeInfo());

        System.out.println("\n=== Electricity Bill ===");
        System.out.println(eBill.getBillInfo());
    }
}
