import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
//Json dosyasındaki students obje arrayi içindeki student objeleri için student sınıfı oluşturuldu.
class Student {
    private int id;
    private String name;
    private String surname;
    private int age;

    @Override
    public String toString() {
        return  id +" "+ name +" " +  surname+" " + age ;
    }
}
