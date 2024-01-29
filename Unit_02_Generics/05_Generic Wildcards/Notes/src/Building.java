import java.util.List;

public class Building {
    private int height;
    private String color;

    public Building(int height, String color){
        this.height = height;
        this.color = color;
    }

    public void paint(String newColor){
        color = newColor;
    }

    public static void paintAllBuildings(List<? extends Building> buildings, String newColor){
        for(int i = 0; i < buildings.size(); i++){
            buildings.get(i).paint(newColor);
        }
    }


}
