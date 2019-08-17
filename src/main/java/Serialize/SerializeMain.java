package Serialize;

import java.io.*;

public class SerializeMain {
    public static void main(String[] args) throws IOException {
        User user1 = new User(100, 100, 1, "oleh", "male");
        User user2 = new User(120, 110, 2, "olha", "female");

        FileOutputStream fileOutputStream = new FileOutputStream("saveFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user1);
        objectOutputStream.writeObject(user2);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("saveFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.close();

        System.out.println(user1);
        System.out.println(user2);

    }
}
