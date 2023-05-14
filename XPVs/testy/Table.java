package XPVs.testy;

import java.time.LocalTime;
import java.util.ArrayList;

public class Table {
    static ArrayList<Table> arrList = new ArrayList<>();
    int cislo;
    LocalTime maintenaceTime;

    public Table(int cislo, LocalTime maintenaceTime) {
        this.cislo = cislo;
        this.maintenaceTime = maintenaceTime;
        arrList.add(this);
    }

    public static void main(String[] args) {
        new Table(2, LocalTime.of(10,43));
        new Table(5, LocalTime.of(16,0));
        new Table(11, LocalTime.of(9,30));
        new Table(7, LocalTime.of(14,14));
        System.out.println(reserve(2, "10:40",15));
    }

    static boolean reserve(int table, String time, int minutes) {
        LocalTime start = LocalTime.parse(time);
        boolean pass = false;
        for (Table stul : arrList) {
            if (stul.cislo == table) {
                pass = true;
                break;
            }
        }
        if (!pass){
            return pass;
        }
        pass = false;
        if (start.isAfter(LocalTime.of(8,0)) && start.plusMinutes(minutes).isBefore(LocalTime.of(22,0))){
            pass = true;
        }
        if (!pass){
            return pass;
        }
        pass = false;
        for (Table stul : arrList) {
            if (start.plusMinutes(minutes).isAfter(stul.maintenaceTime) && start.isBefore(stul.maintenaceTime)){
                return false;
            }
        }
        return true;
    }
}
