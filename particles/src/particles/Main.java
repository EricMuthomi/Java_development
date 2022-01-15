package particles;

public class Main {

    public static void main(String[] args) {
        processParticles();
    }

    public static void processParticles(){
      Part_AGenerator aGen = new Part_AGenerator("AGEN-1", new Location("Alpha", 10,10));
      Part_BGenerator bGen = new Part_BGenerator("BGEN-1", new Location("Beta", 30,20));
      Part_CGenerator cGen = new Part_CGenerator("CGEN-1", new Location("Gamma", 50,30));
      ParticleCollector pCol = new ParticleCollector("PCOLLECT", new Location("Lambda",70,40));
      ParticleExtractor pExt = new ParticleExtractor("PEXTRACT", new Location("Sigma", 90,50));
      ParticleRefiner pRef = new ParticleRefiner("PREFINE","PX", new Location("Tau", 120,60));
        for (int i = 0; i < 10; i++) {
            pCol.collectParticle(aGen.generateParticle());
            pCol.collectParticle(bGen.generateParticle());
            pCol.collectParticle(cGen.generateParticle());
        }

        pExt.extractParticles(pCol);
        pRef.emptyExtractor(pExt);
        pRef.displayInfo();
        System.out.println();
        pRef.sampleParticles(3);
    }
}
