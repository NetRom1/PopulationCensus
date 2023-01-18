import java.util.Objects;
public class Person implements Comparable<Person>{
    private String name;
    private String family;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person(String name, String family, int age, Sex sex, Education education) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getName().equals(person.getName()) &&
                getFamily().equals(person.getFamily()) &&
                getAge().equals(person.getAge()) &&
                getSex() == person.getSex() &&
                getEducation() == person.getEducation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFamily(), getAge(), getSex(), getEducation());
    }

    @Override
    public int compareTo(Person p) {
        return (family + " " + name).compareTo(p.getFamily() + " " + p.getName());

    }
}
