package particles;

public class Part_CGenerator extends ParticleGenerator {
    static final String PTYPE = "C_Particle";
    static final int PCAPACITY = 210;
    static int GENERATED_COUNT = 0;

    public Part_CGenerator(String pGeneratorID, Location pGeneratorPos) {
        super(pGeneratorID, pGeneratorPos);
        this.GENERATED_COUNT ++;
    }


    @Override
    Particle generateParticle() {
        Particle particle = new C_Particle("C"+GENERATED_COUNT);
        return particle;
    }
}
