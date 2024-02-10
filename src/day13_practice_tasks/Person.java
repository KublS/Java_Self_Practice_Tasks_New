package day13_practice_tasks;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        if ( name.isEmpty() || name.isBlank() || name == null){
            System.err.println("Invalid input in the: NAME");
            System.exit(1);
        }
        this.name = name;
    }

    public void setAge(int age) {
            if ( age <= 0){
                System.err.println("Invalid input in the: AGE");
                System.exit(1);
            }
        this.age = age;
    }

    public void setGender(String gender) {
        if ( gender.isEmpty() ||gender.isBlank() || gender == null){
            System.err.println("Invalid input in the: Gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "Name: " + name +
                ", age: " + age +
                ", gender: " + gender;
    }
}
