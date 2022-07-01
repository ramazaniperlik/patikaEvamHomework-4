import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@Getter
@Setter
//Thread kullanımı için Runnable interface'i implemente edildi.
public class valueController implements Runnable {

    private List<Student> studentList;

    @Override
    public void run() {
    //Json dosyasının objectMapper ile students sınıfına cast işlemi yapıldı.
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Students _students =  objectMapper.readValue(new File("C:\\Users\\ramaz\\Desktop\\studentsJson.json"),Students.class);
            System.out.println("Veri okunuyor...");
            Thread.sleep(3000);
            addList(_students);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
          }
    }

    //Console'a yazma işlemi için addList metotu yazıldı.
    public void addList(Students students){

        studentList = students.addList();
        for(int i = 0; i<studentList.size();i++){
            System.out.println(
                    studentList.get(i).getId()+".öğrenci: "+
                            studentList.get(i).getName()+" "+
                            studentList.get(i).getSurname()+" - "+
                            studentList.get(i).getAge()
            );
        }

    }

}
