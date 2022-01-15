package particles;

public class Location {
    String name;
    int X;
    int Y;

    public Location(String name, int x, int y) {
        this.name = name;
        X = x;
        Y = y;
    }

    public double euclideanDistance(Location location) {
        return location.X - location.Y;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", X=" + X +
                ", Y=" + Y +
                '}';
    }
}
