package r02.r02_06;

public class NetworkDemo {
    public static void main(String[] args) {
        Network myFace = new Network();
        Network tooter = new Network();
        Network.Member fred = myFace.enroll("Fred");
        Network.Member wilma = myFace.new Member("Wilma");
            // Obiekt, ale nie dopisany
            // Aby tego unikn¹æ zadeklaruj konstruktor jako prywatny
        fred.addFriend(wilma);

        Network.Member barney = tooter.enroll("Barney");
        fred.addFriend(barney);
        System.out.println(myFace);
            // Jeœli nie powinno byæ mo¿³iwoœci dodania kontaktu
            // nale¿¹cego do innej sieci wywo³aj belongsTo
        System.out.println(barney.belongsTo(myFace));
    }
}
