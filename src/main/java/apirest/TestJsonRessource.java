package apirest;

import java.io.Serializable;

public class TestJsonRessource {
    private static final long serialVersionUID = 4254739092263227552L;
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
