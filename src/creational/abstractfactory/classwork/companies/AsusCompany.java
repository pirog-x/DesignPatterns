package creational.abstractfactory.classwork.companies;

import creational.abstractfactory.classwork.Company;
import creational.abstractfactory.classwork.gpu.Gpu;
import creational.abstractfactory.classwork.gpu.gpues.AsusGpu;
import creational.abstractfactory.classwork.monitor.Monitor;
import creational.abstractfactory.classwork.monitor.monitores.AsusMonitor;

public class AsusCompany extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
