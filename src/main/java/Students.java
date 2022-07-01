import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Students {
    //Json dosyasındaki students obje arrayi için students arrayi oluşturuldu.
    Student[] students;

    //Studentların listeleye eklenme metotu yazıldı.
    public List<Student> addList(){
        List<Student> studentList = new ArrayList<Student>();
        for(int i=0;i< students.length;i++){
            studentList.add(students[i]);
        }
        return studentList;
    }
}
