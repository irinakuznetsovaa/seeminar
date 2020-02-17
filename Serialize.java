package animals;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Serialize {
    public static void Record(List<Animals> listAnimals, String fileName){
        Path path= Paths.get(fileName);
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path)))
        {
            oos.writeObject(listAnimals);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static List<Animals> Read(String fileName) {
        Path path = Paths.get(fileName);
        List<Animals> listAnimals=null ;
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            listAnimals = (List<Animals>)ois.readObject();
            return listAnimals;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listAnimals;
    }



}
