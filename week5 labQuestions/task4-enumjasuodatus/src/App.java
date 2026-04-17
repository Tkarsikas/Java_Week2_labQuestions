import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Task> objTasks = new ArrayList<>();
        objTasks.add(new Task("Level1", Difficulty.EASY));
        objTasks.add(new Task("Level2", Difficulty.EASY));
        objTasks.add(new Task("Level3", Difficulty.MEDIUM));
        objTasks.add(new Task("Level4", Difficulty.HARD));

        System.out.println(TaskFilter.filterBy(objTasks, Difficulty.EASY).toString());
        


    }
}
