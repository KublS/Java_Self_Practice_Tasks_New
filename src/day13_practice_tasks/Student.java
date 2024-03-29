package day13_practice_tasks;

public class Student {

    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
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
        if (name == null){
            throw new RuntimeException("Invalid input in the: NAME");
        }
        if ( name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid input in the: NAME");
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
        if (gender == null){
            throw new RuntimeException("Invalid input in the: NAME");
        }
        if ( gender.isEmpty() || gender.isBlank()){
            throw new RuntimeException("Invalid input in the: NAME");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
