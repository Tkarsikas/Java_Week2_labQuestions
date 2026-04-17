

public class Task {
    
    private Difficulty difficulty;
    public String title;

    public Difficulty getDifficulty(){
        return this.difficulty;
    }

    public Task(String title, Difficulty d){
        this.title=title;
        this.difficulty=d;
    }
    
    @Override
    public String toString(){
        return title + ", "+ difficulty;
    }


    }

