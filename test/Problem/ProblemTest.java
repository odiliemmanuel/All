package Problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {
    Problem problem;
    Person person;

    @BeforeEach
    public void startEveryTestMethodWith(){
        problem = new Problem();
        person = new Person();
    }


    @Test
    public void testThatListOfPersonsProblemsIsAtInitialState(){
        assertEquals(new ArrayList<>(),  person.getProblems());
    }

//    @Test
//    public void testThatICanCreateAProblemWithNameAndType(){
//        problem.add("School fees");
//        assertEquals("School fees", person.setProblems("School fees"));
//    }
}
