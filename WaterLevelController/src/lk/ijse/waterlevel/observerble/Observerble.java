package lk.ijse.waterlevel.observerble;

import lk.ijse.waterlevel.observer.Observer;
import java.util.ArrayList;

/**
 *
 * @author lakshan
 */
public class Observerble {
    ArrayList<Observer> list = new ArrayList<>();
    
    public void addToArrayList(Observer ob){
        list.add(ob);
    }
    
    public void sendValue(int number){
        for (Observer ele: list) {
            ele.addNum(number);
        }
    }
}
