package uk.ac.cam.yw580.SupoWork.Supo3;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        Car c1 = o1;
        Car c2 = o2;
        int c = c1.manufacturer.compareTo(c2.manufacturer);
        if (c != 0)
            return c;
        else return Integer.compare(c1.age,c2.age);

    }
}