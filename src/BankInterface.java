public interface BankInterface {
        int getBalance();
        String depositMoney(int amount);
        String withdraw(String enterPassword,int amount);
        double calculateInterest(int time);
}
