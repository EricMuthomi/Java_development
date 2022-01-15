package particles;

public class A_Particle extends Particle {
    static int AParticleCount = 10;

    public A_Particle(String retrievalCode) {
        super(retrievalCode, 1.3, 124, 7, Mineral.DILITHIUM);
        particleCount = AParticleCount;
        isRefined = false;
    }

    @Override
    double scatterLight() {
        return Mineral.DILITHIUM.strength * Math.sqrt(10) * 0.28 * Mineral.DILITHIUM.mass;

    }
}
