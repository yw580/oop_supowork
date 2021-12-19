package uk.ac.cam.yw580.SupoWork.Supo3;

import java.util.Comparator;

public class Point3D implements Comparable<Point3D>{

    public final int x;
    public final int y;
    public final int z;

    public Point3D (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(Point3D o) {
        if (this.z != o.z)
            return this.z - o.z;
        if (this.y != o.y)
            return this.y - o.y;
        return this.x - o.x;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d)",x,y,z);
    }
}
