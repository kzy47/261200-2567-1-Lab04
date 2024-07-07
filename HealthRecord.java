public class HealthRecord {

    private int height;
    private int weight;

    private static final int MIN_ALLOWED_HEIGHT = 20; // cm
    private static final int MAX_ALLOWED_HEIGHT = 500;
    private static final int MIN_ALLOWED_WEIGHT = 5;  // kg
    private static final int MAX_ALLOWED_WEIGHT = 500;
    private static final int DEFAULT_HEIGHT = 150;
    private static final int DEFAULT_WEIGHT = 150;
    private static int minHeight = MAX_ALLOWED_HEIGHT;
    private static int maxHeight = MIN_ALLOWED_HEIGHT;
    private static int minWeight = MAX_ALLOWED_WEIGHT;
    private static int maxWeight = MIN_ALLOWED_WEIGHT;

    public HealthRecord(int height, int weight) {
        setHeight(height);
        setWeight(weight);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < MIN_ALLOWED_HEIGHT || height > MAX_ALLOWED_HEIGHT) {
            this.height = DEFAULT_HEIGHT;
        } else {
            this.height = height;
            if (height > maxHeight)
                maxHeight = height;
            if (height < minHeight)
                minHeight = height;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < MIN_ALLOWED_WEIGHT || weight > MAX_ALLOWED_WEIGHT) {
            this.weight = DEFAULT_WEIGHT;
        } else {
            this.weight = weight;
            if (weight > maxWeight)
                maxWeight = weight;
            if (weight < minWeight)
                minWeight = weight;
        }
    }

    public static int getMaxHeight() {
        return maxHeight;
    }

    public static int getMinHeight() {
        return minHeight;
    }

    public static int getMaxWeight() {
        return maxWeight;
    }

    public static int getMinWeight() {
        return minWeight;
    }
}
