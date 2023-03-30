import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ServerTest {

    Server server;
    Guest guest;


    @BeforeEach
    public void setUp(){
        server = new Server();
        guest = new Guest("Tom", 30.00,20, false,true);
    }

    @Test
    public void canCheckWallet(){
        boolean result = server.checkWallet;
        assertThat(result).isEqualTo(true);

    }
}







    // TODO: test that guest can only get served if over 18

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)

    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)

    // TODO: test that guest can only get served if guest is not banned from the pub

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)

    // EXTENSIONS

    // TODO: test that guest can only get served if server can make favourite drink
    //  (give server a list of drinks (strings) it can make)
//
//}
