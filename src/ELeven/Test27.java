package ELeven;

import java.util.LinkedList;
import java.util.Queue;

public class Test27 {
    Queue<Command> queue=new LinkedList<>();
    public Command PPP(Command tem){
        queue.add(tem);
        return tem;
    }

    Queue transform(){
        while (!queue.isEmpty()) {
            queue.poll().operation("dsfa");

        }
        return queue;
    }
}
