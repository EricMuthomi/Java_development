package particles;

public abstract class ParticleGenerator {
    String pGeneratorID;
    Location pGeneratorPos;

    public ParticleGenerator(String pGeneratorID, Location pGeneratorPos) {
        this.pGeneratorID = pGeneratorID;
        this.pGeneratorPos = pGeneratorPos;
    }

    abstract Particle generateParticle();
}
