public class SpecialBuilding extends Building {

    private boolean hasWindows;

    public SpecialBuilding(int height, String color, boolean hasWindows) {
        super(height, color);
        this.hasWindows = hasWindows;
    }

}
