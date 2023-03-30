public class Server {

    Guest guest;
    public boolean canServeGuest(Guest guest){
        return true;
    }

    public boolean checkWallet(){
        if(guest.getWallet() >= 5.00){
            return true;
        }


    }


}
