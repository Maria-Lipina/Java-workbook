package UndergroundSystemMine;
import java.util.Random;

public class Client {
    private int cardID;
    private Random r = new Random();
    private int t;
    

    public Client(int cardID) {
        this.cardID = cardID;
        this.t = r.nextInt(25);
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int CheckIn() { //вместо public int getT()
        return t;
    }

    public int CheckOut() {
        return t + r.nextInt(1, 25);
    }
}
