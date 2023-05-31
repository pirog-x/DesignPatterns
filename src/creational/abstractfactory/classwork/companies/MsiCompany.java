package creational.abstractfactory.classwork.companies;

import creational.abstractfactory.classwork.Company;
import creational.abstractfactory.classwork.gpu.Gpu;
import creational.abstractfactory.classwork.gpu.gpues.MsiGpu;
import creational.abstractfactory.classwork.monitor.Monitor;
import creational.abstractfactory.classwork.monitor.monitores.MsiMonitor;

public class MsiCompany extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
