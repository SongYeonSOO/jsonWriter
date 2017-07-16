import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Test jsonWriter
 * example of creating json file named students.json inside of project directory.
 */
public class JsonWriterMain {
    public static  void main(String[] args){
        List<Student> students = new ArrayList<>();
        Gson gson = new Gson();
        for(int i=0;i<3;i++){
            students.add(new Student("name","number"));
        }
   String json = gson.toJson(students);
        System.out.println(json);
        try {
            FileWriter file = new FileWriter(System.getProperty("user.dir")+"\\students.json");
            file.write(json);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
