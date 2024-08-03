import java.util.ArrayList;
import java.util.List;

public class ExerciseManagement {
    private List<Exercise> exercises;

    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public void add(String exerciseName) {
        this.exercises.add(new Exercise(exerciseName));
    }

    public List<Exercise> getExercises() {
        return this.exercises;
    }

    public void markAsCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                exercise.setCompleted(true);
                break;
            }
        }
    }

    public boolean isCompleted(String exerciseName) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(exerciseName)) {
                return exercise.isCompleted();
            }
        }
        return false;
    }
}
