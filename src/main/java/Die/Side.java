package Die;

import java.awt.*;
import java.util.Objects;

/**
 * Side represents a side of a Die
 */
public class Side {
    private int sideValue;
    private String sideColor;
    private Shape shape;

    public Side() {
    }

    public Side(int sideValue) {
        this.sideValue = sideValue;
    }

    public Side(int sideValue, String sideColor) {
        this.sideValue = sideValue;
        this.sideColor = sideColor;
    }

    public int getSideValue() {
        return sideValue;
    }

    public void setSideValue(int sideValue) {
        this.sideValue = sideValue;
    }

    public String getSideColor() {
        return sideColor;
    }

    public void setSideColor(String sideColor) {
        this.sideColor = sideColor;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Side side = (Side) o;
        return getSideValue() == side.getSideValue() && getSideColor().equals(side.getSideColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSideValue(), getSideColor());
    }

    @Override
    public String toString() {
        return "side{" +
                "sideValue=" + sideValue +
                ", sideColor='" + sideColor + '\'' +
                '}';
    }
}
