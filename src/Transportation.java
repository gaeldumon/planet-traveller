public class Transportation {
    private final String label;
    private final double velocity;

    /**
     * @param label    Name of the transportation/where it is from
     * @param velocity Speed of the transportation in km per second
     */
    public Transportation(String label, double velocity) {
        this.label = label;
        this.velocity = velocity;
    }

    public String getLabel() {
        return label;
    }

    public double getVelocity(Unit unit) {
        double v = 0;

        if (unit == Unit.KM_PER_SEC) {
            v = this.velocity;
        } else if (unit == Unit.KM_PER_HOUR) {
            v = this.velocity * 3600;
        } else if (unit == Unit.KM_PER_DAY) {
            v = this.velocity * 3600 * 24;
        } else if (unit == Unit.KM_PER_YEAR) {
            v = this.velocity * 3600 * 24 * 365;
        }

        return v;
    }
}
