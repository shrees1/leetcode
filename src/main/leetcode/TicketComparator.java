
import lombok.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
class Ticket {
    String name;
    int platform;
}

public class TicketComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        if(o1.getPlatform()>o2.getPlatform()){
            return 1;
        }
        else{
           return -1;
        }
    }
}
class OfMain{
    public static void main(String[] args) {
        Ticket ticket1= new Ticket("Shikha",1);
        Ticket ticket2= new Ticket("Anshu",2);
        ArrayList<Ticket> ticketArr= new ArrayList<Ticket>();
        ticketArr.add(ticket1);
        ticketArr.add(ticket2);
        Collections.sort(ticketArr,new TicketComparator());
        for (Ticket ticket:ticketArr) {
            System.out.println(ticket.getPlatform());
        }
    }
}
