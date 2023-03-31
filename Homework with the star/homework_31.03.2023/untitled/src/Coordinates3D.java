public class Coordinates3D extends  Coordinates{

    private double z;


    public Coordinates3D(double x, double y,double z) {
        super(x, y);
        this.z = z;
    }
    public boolean isInRange (double minX, double maxX, double minY, double maxY,double minZ,double maxZ){
        return getX() >= minX && getX() <= maxX && getY() >= minY && getY() <= maxY && z >= minZ && z <= maxZ;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
