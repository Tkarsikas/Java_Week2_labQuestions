package viikko4.lab;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        if(name != null && !name.trim().isEmpty()){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Väärä arvo!");
        }
        if(age == null || age < 0){
            throw new IllegalArgumentException("Väärä arvo!");
        }else{
            this.age = age;
        }
  
        
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}