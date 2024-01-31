package day33;

public class Developer extends Employee{
    private String ProgLang;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public String getProgLang() {
        return ProgLang;
    }

    public void setProgLang(String progLang) {
        ProgLang = progLang;
    }


    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","")+
                "ProgLang=" + ProgLang + "}";
    }
}
