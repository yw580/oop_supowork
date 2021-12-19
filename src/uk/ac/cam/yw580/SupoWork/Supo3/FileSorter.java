package uk.ac.cam.yw580.SupoWork.Supo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FileSorter {
    private class IntegerTuple {
        private final int fst;
        private final int snd;
        private IntegerTuple(int fst, int snd) {
            this.fst = fst;
            this.snd = snd;
        }
        private int first() {
            return fst;
        }
        private int second() {
            return snd;
        }
        @Override
        public String toString(){
            return "%d,%d".formatted(fst,snd);
        }
    }


    String address;

    public FileSorter(String address) {
        this.address = address;
    }


    public void run() {
        List<IntegerTuple> l = new ArrayList<>();
        try {
            File file = new File(address);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split("[,]");
                l.add(new IntegerTuple(Integer.parseInt(data[0]),Integer.parseInt(data[1])));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Comparator<IntegerTuple> comparator = Comparator.comparingInt(IntegerTuple::first).thenComparingInt(IntegerTuple::second);
        l.sort(comparator);
        for (IntegerTuple s:
             l) {
            System.out.println(s);
        }
    }
}
