package creational.abstractfactory.classwork;

import creational.abstractfactory.classwork.gpu.Gpu;
import creational.abstractfactory.classwork.monitor.Monitor;

public abstract class Company {
    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();

    public Monitor assembleMonitor() {
        Monitor monitor = createMonitor();
        monitor.assemble();
        return monitor;
    }

    public abstract Monitor createMonitor();
}
