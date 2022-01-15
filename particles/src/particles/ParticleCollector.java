package particles;

import java.util.ArrayList;

public class ParticleCollector {
    String collectorID;
    Location collectorPOS;
    ArrayList<Particle> collectorPool = new ArrayList<>();
    static final int COLLECTOR_CAPACITY = 500;

    public ParticleCollector(String collectorID, Location collectorPOS) {
        this.collectorID = collectorID;
        this.collectorPOS = collectorPOS;
    }

    boolean collectParticle(Particle particle) {
        if (collectorPool.size() < COLLECTOR_CAPACITY) {
            collectorPool.add(particle);
            return true;
        } else {
            return false;
        }
    }
}
