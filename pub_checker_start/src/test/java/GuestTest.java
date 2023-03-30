import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import java.util.Currency;

public class GuestTest {

    Guest guest;
//    Server server;

    @BeforeEach
    public void setUp(){
//        server = new Server();
        guest = new Guest("Tom", 30.00,20, false,true);

    }

    @Test
    public void canGetName(){
        String result = guest.getName();
        assertThat(result).isEqualTo("Tom");
    }

    @Test
    public void canGetAge(){
        int result = guest.getAge();
        assertThat(result).isEqualTo(20);
    }

    @Test
    public void canGetSobriety(){
        Boolean result = guest.getSobriety();
        assertThat(result).isEqualTo(true);
    }

    @Test
    public void canGetBanStatus(){
        Boolean result = guest.getBannedStatus();
        assertThat(result).isEqualTo(false);
    }

    @Test
    public void canGetWallet(){
        double result = guest.getWallet();
        assertThat(result).isEqualTo(30.00);
    }


}
