package education.basic;

public interface OrderAccept {
    public String[] queryItems();

    public boolean order(String item);

    public String confirm(String name, String address);
};
