public class Heizung {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heizung(int initialTemperature, int increment) {
        this.temperature = initialTemperature;
        this.increment = increment;
    }

    public Heizung(int initialTemperature, int min, int max) {
        this.temperature = initialTemperature;
        this.min = min;
        this.max = max;
    }

    public Heizung() {
        this.temperature = 15;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= min && temperature <= max) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature is out of range.");
        }
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public void increaseTemperature() {
        if (temperature + increment <= max) {
            temperature += increment;
        } else {
            System.out.println("Temperature cannot exceed the maximum.");
        }
    }

    public void decreaseTemperature() {
        if (temperature - increment >= min) {
            temperature -= increment;
        } else {
            System.out.println("Temperature cannot go below the minimum.");
        }
    }

    public static void main(String[] args) {

        Heizung heizung1 = new Heizung(20, 2);
        Heizung heizung2 = new Heizung(18, 15, 25);
        Heizung heizung3 = new Heizung();

        heizung3.setTemperature(20);
        heizung3.setMin(15);
        heizung3.setMax(25);
        heizung3.setIncrement(2);

        System.out.println("Current Temperature: " + heizung3.getTemperature());
        heizung3.increaseTemperature();
        System.out.println("Warmer Temperature: " + heizung3.getTemperature());
        heizung3.decreaseTemperature();
        System.out.println("Colder Temperature: " + heizung3.getTemperature());
    }
}
