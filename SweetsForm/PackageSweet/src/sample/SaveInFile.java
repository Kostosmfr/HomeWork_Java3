package sample;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by K_PC-S on 25.12.2017.
 */
public class SaveInFile {


    public SaveInFile(){}
    //тут что то не так
    public static void save(Sweet s) throws IOException {
        try(FileWriter writer = new FileWriter("SweetsPackage.txt",true)) {
            String text = String.format("Name: %s, Price = %.1f, Weight = %.1f", s.getName(), s.getPrice(), s.getWeight());
            writer.write(text + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        };

    }


    public void saveinFile(Sweet s) throws IOException {
        try(FileWriter writer = new FileWriter("SweetsPackage.txt",true)) {
            String text = String.format("Name: %s, Price = %.1f, Weight = %.1f", s.getName(), s.getPrice(), s.getWeight());
            writer.write(text + "\r\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        };

    }

}
