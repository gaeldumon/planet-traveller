public class Transportation {
    /**
     * Name of the transportation/where does it come from
     */
    private final String label;
    /**
     * Transportation speed in km per second
     */
    private final double kms;
    /**
     * Transportation speed in km per year
     */
    private final double kmy;

    /**
     * @param label Name of the transportation/where it is from
     * @param kms   Speed of the transportation in km per second
     */
    public Transportation(String label, double kms) {
        this.label = label;
        this.kms = kms;
        this.kmy = this.kms * 3600 * 24 * 365;
    }

    public String getLabel() {
        return label;
    }

    public double getKms() {
        return kms;
    }

    public double getKmy() {
        return kmy;
    }
}
