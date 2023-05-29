package XPVs.oop.dedicnost;

import XPVs.testy.Movies;

import java.util.ArrayList;

public class MyList extends ArrayList<Movies> {
    public static void main(String[] args) {
        MyList list = new MyList();

    }

    @Override
    public boolean equals(Object o) {
        MyList list = (MyList) o;
        if (list.size() != this.size()) {
            return false;
        }
        for (Movies m: list) {
            if (!this.contains(m)) {
                return false;
            }

        }
        return true;
    }

    /*@Override
    public boolean add(Movies movies) {
        if (movies.release >= 2000) {
            return super.add(movies);
        }
        return false;
    }*/
}
