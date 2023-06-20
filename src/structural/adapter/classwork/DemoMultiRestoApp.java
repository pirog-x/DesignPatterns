package structural.adapter.classwork;

import structural.adapter.classwork.adapter.FancyUiServiceAdapter;
import structural.adapter.classwork.app.MultiRestoApp;
import structural.adapter.classwork.data.XmlData;

public class DemoMultiRestoApp {
    public static void main(String[] args) {
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(new XmlData());

        FancyUiServiceAdapter adapter = new FancyUiServiceAdapter(new FancyUiService());
        adapter.displayMenus(new XmlData());
    }
}
