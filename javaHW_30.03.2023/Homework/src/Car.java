public class Car {
    private String mark;
    private String country;
    private int year;
    private boolean elektrik;

    /**
     * конструктор для электро кара
     * @param mark    модель
     * @param country страна приобретения
     * @param year  год выпуска
     * @param elektrik является ли кар электрическим
     */
    public Car(String mark, String country, int year, boolean elektrik) {
        this.mark = mark;
        this.country = country;
        this.year = year;
        this.elektrik = elektrik;
    }

    /**
     * конструктор для классического авто
     * @param mark модель
     * @param country страна покупки
     * @param year год выпуска
     */
    public Car(String mark, String country, int year) {
        this.mark = mark;
        this.country = country;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public boolean isElektrik() {
        return elektrik;
    }
}
