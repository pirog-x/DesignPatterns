package structural.adapter.classwork.app;

import structural.adapter.classwork.IMultiRestoApp;
import structural.adapter.classwork.data.XmlData;

public class MultiRestoApp implements IMultiRestoApp {
    @Override
    public void displayMenus(XmlData data) {
        System.out.println("Display via xml");
    }

    @Override
    public void displayRecommendations(XmlData data) {
        System.out.println("Display recommendations via xml");
    }
}
