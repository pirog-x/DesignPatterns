package structural.adapter.classwork;

import structural.adapter.classwork.data.JsonData;
import structural.adapter.classwork.data.XmlData;

public class FancyUiService {
    public void displayMenus(JsonData data) {
        System.out.println("Display menus via json");
    }

    public void displayRecommendations(JsonData data) {
        System.out.println("Display recommendations via json");
    }
}
