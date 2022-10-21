package _21102022;

public class MobilePhone {
    private int price;
    String modelName;

    public MobilePhone(int price, String modelName) {
        this.price = price;
        this.modelName = modelName;
    }

    public MobilePhone() {
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        /** MobilePhone(тип данных)
         *  mobilePhone(имя объекта)
         *  = (присвоение типа)
         *  new (создаем объект какого то типа)
         *  MobilePhone(); ( с каким то конструктором )
         */

        MobilePhone mobilePhone = new MobilePhone(1000, "IPHONE");
        MobilePhone mobilePhone1 = new MobilePhone();
    }
}