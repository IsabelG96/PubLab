import java.util.spi.CurrencyNameProvider;
import java.util.Currency;
public class Guest {

    private String name;
    private double wallet;
    private int age;
    private boolean bannedStatus;
    private boolean sobriety;

    public Guest(String name, double wallet, int age, boolean bannedStatus, boolean sobriety){
        this.name = name;
        this.wallet = wallet;
        this.age = age;
        this.bannedStatus = bannedStatus;
        this.sobriety = sobriety;
    }

//    Getters and Setters
//    Name
    public String getName() {return name;}

    public void setName(String name){
        this.name = name;
    }

//    Wallet
    public double getWallet() {return wallet;}

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
//    Age
    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }

//    Banned status

    public boolean getBannedStatus() { return bannedStatus;}

    public void setBannedStatus(boolean bannedStatus){
        this.bannedStatus = bannedStatus;
    }

//    Sobriety

    public boolean getSobriety() { return sobriety;}
    public void setSobriety(boolean sobriety){
        this.sobriety = sobriety;
    }
}
