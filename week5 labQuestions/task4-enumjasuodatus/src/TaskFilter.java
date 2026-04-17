import java.util.ArrayList;
import java.util.List;

public class TaskFilter {
        public static List<Task> filterBy(List<Task> tasks, Difficulty d){
        List<Task> newList = new ArrayList<>(); 
            for (Task task : tasks) {
                if(task.getDifficulty() == d){
                    newList.add(task);
                }
            }
        return newList;
    }
}
