import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        
        List<Task> objTasks = new ArrayList<>();
        List<Task> obj = Arrays.asList(new Task("level100", Difficulty.MEDIUM), new Task("level123", Difficulty.HARD));
        objTasks.add(new Task("Level1", Difficulty.EASY));
        objTasks.add(new Task("Level2", Difficulty.EASY));
        objTasks.add(new Task("Level3", Difficulty.MEDIUM));
        objTasks.add(new Task("Level4", Difficulty.MEDIUM));
        objTasks.add(new Task("Level5", Difficulty.HARD));
        objTasks.add(new Task("Level6", Difficulty.HARD));
        objTasks.add(new Task("Level7", Difficulty.HARD));

        System.out.println(TaskFilter.filterBy(objTasks, Difficulty.EASY).toString());
        System.out.println(TaskFilter.filterBy(objTasks, Difficulty.HARD).toString());
        System.out.println(TaskFilter.filterBy(obj, Difficulty.HARD).toString());
        


    }
}
