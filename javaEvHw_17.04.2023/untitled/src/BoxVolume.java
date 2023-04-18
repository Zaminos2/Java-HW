public class BoxVolume {
    private  double hight;
    private  double wight;
    private  double lenght;

    public BoxVolume(double hight, double wight, double lenght) {
        this.hight = hight;
        this.wight = wight;
        this.lenght = lenght;
        double volumeResault = hight * wight * lenght;
        System.out.println("Volume = " + volumeResault);
    }
}
