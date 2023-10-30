package StudentSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public Map<String, Student> getRepo() {
        return this.repo;
    }

    public void ParseCommand(String[] args) {
        String command = args[0];

        if (command.equals("Create")) {
            String name = args[1];
            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!repo.containsKey(name)) {
                Student student = new Student(name, age, grade);
                repo.put(name, student);
            }
        } else if (command.equals("Show")) {
            String name = args[1];

            if (repo.containsKey(name)) {
                Student student = repo.get(name);
                StringJoiner sj = new StringJoiner(" ");
                sj.add(String.format("%s is %s years old.", student.getName(), student.getAge()));

                if (student.getGrade() >= 5.00) {
                    sj.add("Excellent student.");
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    sj.add("Average student.");
                } else {
                    sj.add("Very nice person.");
                }

                System.out.println(sj);
            }
        }
    }
}
