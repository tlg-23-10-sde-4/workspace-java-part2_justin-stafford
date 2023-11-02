import com.duckrace.DuckRacer;
import com.duckrace.Reward;

import java.util.Collection;


public class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer = new DuckRacer(14, "Scott");
        System.out.println(racer);  // toString() automatically called

        racer.win(Reward.PRIZES);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.PRIZES);
        racer.win(Reward.PRIZES);
        System.out.println(racer);  // toString() automatically called

        // to show the read-only view to the underlying collection
        Collection<Reward> rewards = racer.getRewards();
        System.out.println(rewards); // should see 4

            racer.win(Reward.DEBIT_CARD);
            racer.win(Reward.DEBIT_CARD);

            System.out.println(rewards);  //  this will still show 4
        }


    }


