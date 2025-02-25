public class SmartHome {
    public static final class Device {
        public static final int MAX_DEVICES = 50;
        private final int id;
        private final String name;
        public Device(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public final String getDeviceInfo() {
            return "Device ID: " + id + ", Name: " + name;
        }
    }
    public static final class Configuration {
        public static final int MAX_POWER_LIMIT = 5000;
    }
    static abstract class DeviceType {
    abstract String getDeviceCategory();
    }
    public static class LightDevice extends DeviceType {
        public String getDeviceCategory() {
            return "Light Device";
        }  
    }
    public static class FanDevice extends DeviceType {
        public String getDeviceCategory() {
            return "Fan Device";
        }
    }
    public static void main(String[] args) {
        Device device = new Device(1, "Smart Light");
        System.out.println(device.getDeviceInfo());
        System.out.println("Maximum Power Limit: " + Configuration.MAX_POWER_LIMIT);
        DeviceType lightDevice = new LightDevice();
        DeviceType fanDevice = new FanDevice();
        System.out.println("Light Device Category: " + lightDevice.getDeviceCategory());
        System.out.println("Fan Device Category: " + fanDevice.getDeviceCategory());
    }
}

