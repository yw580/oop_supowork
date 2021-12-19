package uk.ac.cam.yw580.SupoWork;
import uk.ac.cam.yw580.SupoWork.Supo3.CollectionArrayList;
import uk.ac.cam.yw580.SupoWork.Supo3.ExamMarks;
import uk.ac.cam.yw580.SupoWork.Supo3.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> l = new CollectionArrayList<>();
        l.add(0, 5);
        l.add(1, 16);
        l.add(0, 4);
        System.out.println(l);
        l.remove(0);
        l.set(0, 90999);
        System.out.println(l);
        System.out.println(l.size());
    }

}
