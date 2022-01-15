package particles;

public abstract class Refinable {
    abstract A_Particle refineAParticles(A_Particle a_particle);
    abstract B_Particle refineBParticles(B_Particle b_particle);
    abstract C_Particle refineCParticles(C_Particle c_particle);
}
