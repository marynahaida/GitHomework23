public class MyApp {
    public static void main(String[] args) {
        Smartphones xiaomi = new Android("Xiaomi", "9");
        Smartphones iPhone13 = new IPhones("iPhone", "13");
        Android huawei = new Android("Huawei", "8 pro max");
        IPhones iPhone11Pro = new IPhones("iPhone", "11Pro");
        LinuxOS samsung = new Android("Samsung", "8A");
        IOS iPhone12 = new IPhones("iPhone", "12");

        xiaomi.call();
        huawei.sms();
        samsung.linuxOS();
        iPhone13.internet();
        iPhone11Pro.iOS();
        iPhone12.iOS();
    }
}
