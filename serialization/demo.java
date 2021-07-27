package serialization;

import java.io.*;

public class demo implements Serializable {
    int i=33;
    String name="bharath";
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        demo d=new demo();
        FileOutputStream fs=new FileOutputStream("/home/ubuntumsd/Documents/ser.txt");
        ObjectOutputStream obj=new ObjectOutputStream(fs);
        obj.writeObject(d);
        obj.close();
        fs.close();
        FileInputStream fw=new FileInputStream("/home/ubuntumsd/Documents/ser.txt");
        ObjectInputStream ow=new ObjectInputStream(fw);
        demo d1=(demo)ow.readObject();
        System.out.println(d1.i+" "+d1.name);

    }
}
