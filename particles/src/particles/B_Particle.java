package particles;

public class B_Particle extends Particle{
    static int AParticleCount = 0;
    public B_Particle(String retrievalCode) {
        super(retrievalCode,1.7,396,18,Mineral.TRITANIUM);
        particleCount = AParticleCount;
        isRefined = false;
    }

    @Override
    double scatterLight() {
        return Mineral.TRITANIUM.strength*Math.sqrt(10);
    }
}
