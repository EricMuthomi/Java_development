package particles;

import java.util.ArrayList;

public class ParticleExtractor {
    String extractorID;
    Location extractorPOS;
    ArrayList<Particle> extractorPool  = new ArrayList<>();
    static final int EXTRACTOR_CAPACITY = 500;

    public ParticleExtractor(String extractorID, Location extractorPOS) {
        this.extractorID = extractorID;
        this.extractorPOS = extractorPOS;
    }

    boolean extractParticles(ParticleCollector particleCollector) {
        if (extractorPool.size() < EXTRACTOR_CAPACITY) {
            particleCollector.collectorPool.stream().forEach(particle -> extractorPool.add(particle));
            return true;
        } else {
            System.out.println("Extractor pool does not have sufficient capacity");
            return false;
        }

    }
}
