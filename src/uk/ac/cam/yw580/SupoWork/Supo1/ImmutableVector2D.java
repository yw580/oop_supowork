package uk.ac.cam.yw580.SupoWork.Supo1;

public class ImmutableVector2D {
    private final float _x;
    private final float _y;
    public ImmutableVector2D(float x, float y) {
        _x = x;
        _y = y;
    }

    public float X() {
        return _x;
    }

    public float Y() {
        return _y;
    }

    public ImmutableVector2D add(ImmutableVector2D other) {
        return new ImmutableVector2D(this.X() + other.X(), this.Y() + other.Y());
    }

    public float dot(ImmutableVector2D other) {
        return this.X() * other.X() + this.Y() * other.Y();
    }

    public ImmutableVector2D scale(float scalar) {
        return new ImmutableVector2D(this.X() * scalar, this.Y() * scalar);
    }

    public float magnitude() {
        return (float) Math.sqrt(X() * X() + Y() * Y());
    }

    public ImmutableVector2D normalise() {
        return this.scale(1.0f / magnitude());
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)",_x,_y);
    }
}
