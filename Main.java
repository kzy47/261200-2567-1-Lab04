public class Main {
    public static void main(String[] args) {
        HealthRecord hr1 = new HealthRecord(170, 65);
        HealthRecord hr2 = new HealthRecord(160, 55);
        HealthRecord hr3 = new HealthRecord(420, 80);
        HealthRecord hr4 = new HealthRecord(90, 30);

        System.out.println("Max Height: " + HealthRecord.getMaxHeight());
        System.out.println("Min Height: " + HealthRecord.getMinHeight());
        System.out.println("Max Weight: " + HealthRecord.getMaxWeight());
        System.out.println("Min Weight: " + HealthRecord.getMinWeight());
    }
}

