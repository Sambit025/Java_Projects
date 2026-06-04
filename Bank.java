public class Bank {
    private String name;
    private String address;
    Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public static void main(String[] args) {
        Bank bank = new Bank("Chase Bank", "123 Main St");
        System.out.println("Welcome to " + bank.name + "!");
    }
}