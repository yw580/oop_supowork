package uk.ac.cam.yw580.SupoWork.Supo3;

import java.util.*;
import java.util.stream.Collectors;


public class ExamMarks {
    private Map<String,Float> studentMarks;

    public ExamMarks() {
        studentMarks = new TreeMap<>();
    }

    public List<String> getStudents() {
        return new ArrayList<>(studentMarks.keySet());
    }

    public List<String> topP (float p) {
        int nToTake = (int) (p * studentMarks.size() / 100);
        Comparator<Map.Entry<String,Float>> cmp = Map.Entry.comparingByValue();
        return studentMarks.entrySet().stream().sorted(cmp.reversed()).limit(nToTake).map(x -> x.getKey()).toList();
    }

    public float median () {
        List<Float> a = studentMarks.values().stream().sorted().toList();
        if (a.size() % 2 == 1)
            return a.get(a.size() / 2);
        return (a.get(a.size() / 2) + a.get(a.size() / 2 - 1)) / 2;
    }

    public void addStudent(String name, float mark) {
        studentMarks.put(name,mark);
    }

}
