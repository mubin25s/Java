package Design_Pattern.Practice_problems.OOP_Problems.Level4Solutions;


import java.io.*;
import java.util.*;

public class Department {
    String deptName;
    List<Professor> professors;
    Department(String deptName) {
        this.deptName = deptName;
        this.professors = new ArrayList<>();
    }
    void addProfessor(Professor p) { professors.add(p); }
}
