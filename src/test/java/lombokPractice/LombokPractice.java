package lombokPractice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class LombokPractice {

    private String name;
    private String lastName;
    private int age;

    public LombokPractice(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public LombokPractice(String name){
        this.name = name;

    }

    public LombokPractice(int age){
        this.age = age;
    }

}
