package uk.ac.cam.yw580.SupoWork.Supo1;

public class MutableVector2D {
    private float _x;
    private float _y;
    public MutableVector2D(float x, float y) {
        _x = x;
        _y = y;
    }

    public float X() {
        return _x;
    }

    public float Y() {
        return _y;
    }

    public void setX(float x) {_x = x;}

    public void setY(float y) {_y = y;}

    public void add(MutableVector2D other) {
        setX(this.X() + other.X());
        setY(this.Y() + other.Y());
    }

    public float dot(MutableVector2D other) {
        return this.X() * other.X() + this.Y() * other.Y();
    }

    public void scale(float scalar) {
        setX(this.X() * scalar);
        setY(this.Y() * scalar);
    }

    public float magnitude() {
        return (float) Math.sqrt(X() * X() + Y() * Y());
    }

    public void normalise() {



        this.scale(1.0f / magnitude());
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)",_x,_y);
    }
}
