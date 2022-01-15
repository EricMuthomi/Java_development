package particles;


public class C_Particle extends Particle {
    static int AParticleCount = 0;

    public C_Particle(String retrievalCode) {
        super(retrievalCode, 2.1, 518, 24, Mineral.UNAMIUM);
        particleCount = AParticleCount;
        isRefined = false;
    }

    @Override
    double scatterLight() {
        return Mineral.UNAMIUM.mass*10;
    }
}
