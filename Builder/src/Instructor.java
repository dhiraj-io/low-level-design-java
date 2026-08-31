

public class Instructor {

    private String name;
    private String email;

    private double salary;

    private int age;
    private String company;


    public Instructor(String name, String email, double salary, int age, String company) {
        this.name = name;
        this.email = email;
        this.salary = salary;
        this.age = age;
        this.company = company;
    }

    public Instructor(Build build)
    {
        this(build.name, build.email, build.salary, build.age, build.company);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static class Build
    {
        private String name;
        private String email;

        private double salary;

        private int age;
        private String company;

        public Build setAge(int age)
        {
            this.age = age;
            return this;
        }

        public Build setName(String name) {
            this.name = name;
            return this;
        }

        public Build setEmail(String email) {
            this.email = email;
            return this;
        }

        public Build setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Build setCompany(String company) {
            this.company = company;
            return this;
        }

        public Instructor build()
        {
            validate();
            return  new Instructor(this);
        }

        public void validate()
        {
            if(this.company == null)
            {
                throw new RuntimeException("not working prfessional");
            }
        }
    }
}
