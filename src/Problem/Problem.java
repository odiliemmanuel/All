package Problem;

public class Problem {

    private String problemName;
    private Type problemType;
    private boolean status;


    public String createAProblem(String problemName, String description){
        Problem newProblem = new Problem();
        newProblem.setProblemName(problemName);
        newProblem.setProblemType(Type.valueOf(problemType.name()));
        newProblem.setStatus(true);

        Person.addToProblems(newProblem);

        return "New problem created";

    }


    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }



    public Type getProblemType() {
        return problemType;
    }

    public void setProblemType(Type problemType) {
        this.problemType = problemType;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
