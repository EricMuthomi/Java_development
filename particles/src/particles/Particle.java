package particles;

public class Particle extends Scatterable {
    String retrievalCode;
    double pDiameter;
    double pVolume;
    double pSurfaceArea;
    //enum mineral
    Mineral pComposition;
    boolean isRefined;
    static int particleCount;


    public Particle(String retrievalCode, double pDiameter,
                    double pVolume, double pSurfaceArea, Mineral pComposition) {
        this.retrievalCode = retrievalCode;
        this.pDiameter = pDiameter;
        this.pVolume = pVolume;
        this.pSurfaceArea = pSurfaceArea;
        this.pComposition = pComposition;

    }

    @Override
    public String toString() {
        return "Particle{" +
                "retrievalCode='" + retrievalCode + '\'' +
                ", pDiameter=" + pDiameter +
                ", pVolume=" + pVolume +
                ", pSurfaceArea=" + pSurfaceArea +
                ", pComposition=" + pComposition +
                ", isRefined=" + isRefined +
                '}';
    }

    public void displayParticleInfo() {
        System.out.println("Particle{" +
                "retrievalCode='" + retrievalCode + '\'' +
                ", pDiameter=" + pDiameter +
                ", pVolume=" + pVolume +
                ", pSurfaceArea=" + pSurfaceArea +
                ", pComposition='" + pComposition + '\'' +
                ", isRefined=" + isRefined +
                ", particleCount='" + particleCount + '\'' +
                '}');
    }

    @Override
    double scatterLight() {
        return 0;
    }
}
