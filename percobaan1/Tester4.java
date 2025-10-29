public class Tester4 {
    public static void main(String[] args) {
        Owner owner = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        owner.pay(eBill);
        System.out.println("=========================");

        PermanentEmployee pEmp = new PermanentEmployee("Silver Chariot", 500);
        owner.pay(pEmp);
        System.out.println("=========================");

        InternshipEmployee eEmp = new InternshipEmployee("Star Platinum", 5);
        owner.showEmployee(pEmp);
        System.out.println("=========================");
        owner.showEmployee(eEmp);
    }
}
