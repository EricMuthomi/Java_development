package particles;

public enum Mineral {
    UNAMIUM(90,270),DILITHIUM(40,140),TRITANIUM(80,180);

    double mass;
    double strength;

    Mineral(double mass, double strength) {
        this.mass = mass;
        this.strength = strength;
    }

}
