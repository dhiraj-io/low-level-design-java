public class client {


    public static void main(String[] args) {

    Instructor instructor = new Instructor.Build().setAge(32).setName("Dhiraj")
            .setCompany("Integrate").build();

        System.out.println(instructor.getName());    // Dhiraj
        System.out.println(instructor.getAge());     // 32
        System.out.println(instructor.getCompany()); // Integrate
}
}
