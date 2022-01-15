package particles;

public class Part_AGenerator extends ParticleGenerator {
    static final String PTYPE = "A_Particle";
    static final int PCAPACITY = 100;
    static int GENERATED_COUNT = 0;

    public Part_AGenerator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
        }

    @Override
    Particle generateParticle() {
        GENERATED_COUNT++;
        Particle particle = new A_Particle("A"+GENERATED_COUNT);
        return particle;
    }

}
