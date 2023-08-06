public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("MyBank");
        Branch branch1 = new Branch(bank.getPrefix(), "20500", "Branch 1");
        Branch branch2 = new Branch(bank.getPrefix(), "21500","Branch 2");
        Client client1 = new Client(bank.getPrefix(), 135);
        Client client2 = new Client(bank.getPrefix(), 136);
        Client client3 = new Client(bank.getPrefix(), 137);
        Client client4 = new Client(bank.getPrefix(), 138);
        Account account1 = new Account(bank.getPrefix(), "123456");
        Account account2 = new Account(bank.getPrefix(), "223456");
        Account account3 = new Account(bank.getPrefix(), "323456");
        Account account4 = new Account(bank.getPrefix(), "423456");
        Account account5 = new Account(bank.getPrefix(), "523456");
        Account account6 = new Account(bank.getPrefix(), "623456");
        Account account7 = new Account(bank.getPrefix(), "723456");
        Account account8 = new Account(bank.getPrefix(), "823456");


        
    }
}