package classroom.encapsulation;

public class Example {
    public static void main(String[] args) {

        // Person object
        Person person = new Person();
        person.name = "Nikita";
        person.lastname = "Milka";
        person.age = 27;

        Student student = new Student("nikita.milka");
        System.out.println(student.getEmail());
        student.setEmail("nikita@milka.me");
        System.out.println(student.getEmail());

        Student john = new Student("");
        System.out.println(john.getEmail());
        john.setEmail("john.doe@lu.lv");
        System.out.println(john.getEmail());


        john.setGraduationYear(2023);
        System.out.println(john.getGraduationYear());
        System.out.println(john);






    }
}
