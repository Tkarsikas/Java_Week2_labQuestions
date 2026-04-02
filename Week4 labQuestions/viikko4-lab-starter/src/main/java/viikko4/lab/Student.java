package viikko4.lab;

public class Student {
    private String name;
    private Integer credits;

    public Student(String n, Integer c) {
        if(n != null && !n.trim().isEmpty()){
            this.name = n;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Student");
        }
        if(c != null && c>=0){
            this.credits = c;
        }else{
            throw new IllegalArgumentException("Väärä arvo! Student");
        }
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}