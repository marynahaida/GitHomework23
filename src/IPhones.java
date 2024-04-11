public class IPhones implements Smartphones, IOS {
    public String name;
    public String model;

    public IPhones(String name, String model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public void call() {
        System.out.printf("Phone %s %s work with %s and has a function CALL\n", name, model, getClass());
    }

    @Override
    public void sms() {
        System.out.printf("Phone %s %s work with %s and has a function SMS\n", name, model, getClass());
    }

    @Override
    public void internet() {
        System.out.printf("Phone %s %s work with %s and has an access to the Internet\n", name, model, getClass());
    }

    @Override
    public void iOS() {
        System.out.printf("Phone %s %s work with %s and iOS\n", name, model, getClass());
    }
}
