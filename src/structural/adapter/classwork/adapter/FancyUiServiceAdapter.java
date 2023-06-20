package structural.adapter.classwork.adapter;

import structural.adapter.classwork.FancyUiService;
import structural.adapter.classwork.IMultiRestoApp;
import structural.adapter.classwork.data.JsonData;
import structural.adapter.classwork.data.XmlData;

public class FancyUiServiceAdapter implements IMultiRestoApp {
    private final FancyUiService fancyUiService;

    public FancyUiServiceAdapter(FancyUiService fancyUiService) {
        this.fancyUiService = fancyUiService;
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUiService.displayMenus(jsonData);

    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUiService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData data) {
        return new JsonData();
    }
}
