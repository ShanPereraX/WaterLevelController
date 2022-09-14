package lk.ijse.waterlevel.main;

/**
 *
 * @author lakshan
 */
import lk.ijse.waterlevel.alarm.Alarm;
import lk.ijse.waterlevel.observerble.Observerble;
import lk.ijse.waterlevel.smswindow.SmsWindow;
import lk.ijse.waterlevel.splitter.Splitter;
import lk.ijse.waterlevel.watertank.WaterTank;

public class main {
    public static void main(String[] args) {
        
        Observerble observerble = new Observerble();
        
        observerble.addToArrayList(new SmsWindow());
        observerble.addToArrayList(new Alarm());
        observerble.addToArrayList(new Splitter());
        
        new WaterTank(observerble).setVisible(true);
        
    }
    
}
