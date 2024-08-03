import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExerciseManagementTest1 {
    private ExerciseManagement management;

    @Before
    public void setUp() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.getExercises().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.getExercises().size());
    }

    @Test
    public void addedExerciseIsInList() {
        management.add("Write a test");
        boolean found = false;
        for (Exercise exercise : management.getExercises()) {
            if (exercise.getName().equals("Write a test")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("Write a test");
        management.markAsCompleted("Write a test");
        for (Exercise exercise : management.getExercises()) {
            if (exercise.getName().equals("Write a test")) {
                assertTrue(exercise.isCompleted());
            }
        }
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted() {
        management.add("Write a test");
        for (Exercise exercise : management.getExercises()) {
            if (exercise.getName().equals("Write a test")) {
                assertFalse(exercise.isCompleted());
            }
        }
    }
}
