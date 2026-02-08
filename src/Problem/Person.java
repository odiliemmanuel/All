package Problem;

import java.util.ArrayList;

public class Person {

    private String name;
    private static ArrayList<Problem> problems = new ArrayList<>();
    int solvedProblemCounter = 0;



    public int getSolvedProblemCounter() {
        return solvedProblemCounter;
    }


    public static void addToProblems(Problem newProblem) {
        problems.add(newProblem);

    }

    public void solveProblem(String problemName) {
        for (Problem foundProblem: problems) {
            if (foundProblem.getProblemName().equals(problemName) && foundProblem.isStatus()) {
                foundProblem.setStatus(false);
                solvedProblemCounter++;
            }
            problems.add(foundProblem);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Problem> getProblems() {
        return problems;
    }

    public void setProblems(ArrayList<Problem> problems) {
        this.problems = problems;
    }
}
