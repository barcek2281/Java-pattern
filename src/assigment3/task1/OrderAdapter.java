package assigment3.task1;

public class OrderAdapter implements NewOrderProcessor{
    private LegacyOrderProcessor legacyOrderProcessor;

    OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }

    @Override
    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder(); // Адаптация старого метода к новому интерфейсу
    }
}
