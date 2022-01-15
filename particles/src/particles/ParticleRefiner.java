package particles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParticleRefiner extends Refinable {
    String refinerID;
    String refinerName;
    Location refinerPos;
    ArrayList<Particle> pStorage = new ArrayList<>();
    ArrayList<A_Particle> Refined_AStorage = new ArrayList<>();
    ArrayList<B_Particle> Refined_BStorage = new ArrayList<>();
    ArrayList<C_Particle> Refined_CStorage = new ArrayList<>();

    public ParticleRefiner(String refinerID, String refinerName, Location refinerPos) {
        this.refinerID = refinerID;
        this.refinerName = refinerName;
        this.refinerPos = refinerPos;
    }


    public boolean emptyExtractor(ParticleExtractor particleExtractor) {
        particleExtractor.extractorPool.stream().forEach(particle -> pStorage.add(particle));
        List<Particle> refined = pStorage.stream().filter(particle -> particle.isRefined).collect(Collectors.toList());
        for (int i = 0; i < pStorage.size(); i++) {
            if (pStorage.get(i) instanceof A_Particle) {
                Refined_AStorage.add((A_Particle) pStorage.get(i));
            }else if (pStorage.get(i) instanceof B_Particle){
                Refined_BStorage.add((B_Particle) pStorage.get(i));
            }else {
                Refined_CStorage.add((C_Particle) pStorage.get(i));
            }
        }
        return true;

    }

    public void sampleParticles(int count) {
        for (int i = 0; i < count; i++) {
            pStorage.get(i).displayParticleInfo();
        }
    }

    @Override
    A_Particle refineAParticles(A_Particle a_particle) {
        a_particle.isRefined = true;
        return a_particle;
    }

    @Override
    B_Particle refineBParticles(B_Particle b_particle) {
        b_particle.isRefined = true;
        return b_particle;
    }

    @Override
    C_Particle refineCParticles(C_Particle c_particle) {
        c_particle.isRefined = true;
        return c_particle;
    }

    public void displayInfo() {
        System.out.println("ParticleRefiner{" +
                "refinerID='" + refinerID + '\'' +
                ", refinerName='" + refinerName + '\'' +
                ", refinerPos=" + refinerPos +
                ", pStorage=" + pStorage +
                ", Refined_AStorage=" + Refined_AStorage +
                ", Refined_BStorage=" + Refined_BStorage +
                ", Refined_CStorage=" + Refined_CStorage +
                '}');
    }
}
