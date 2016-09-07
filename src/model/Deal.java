package model;

import java.util.Random;

/**
 * Created by sakic on 9/7/16.
 */
public class Deal {
    private Card[] cards;
    public int AccountFirst;
    public int AccountSecond;

    void init() {
        Random random = new Random();
        int number = random.nextInt();
        Color color = Color.BLUE;
        cards = new Card[5];
        for (int i = 0; i < 5; i++) {
            cards[i] = new Card(number, color);
        }
    }
      public   void getRound()
    {
        int pos = 0;
        int all = 0;
        int parity = 0;
        while(true)
        {
            all += pos;
            if(all >= 5) break;
           // parity ^= 1;

            pos = 0;
            while(pos < 4) {
                if(parity == 0)  AccountFirst += cards[pos].get();
                else AccountSecond += cards[pos].get();
                pos++;
            }
            parity ^= 1;
    }

    }
}
