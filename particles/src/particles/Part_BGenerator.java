package particles;

public class Part_BGenerator extends ParticleGenerator {
    static final String PTYPE = "B_Particle";
    static final int PCAPACITY = 180;
    static int GENERATED_COUNT = 0;

    public Part_BGenerator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
    }


    @Override
    Particle generateParticle() {
        Particle particle = new B_Particle("B"+GENERATED_COUNT);

        return particle;
    }
}
