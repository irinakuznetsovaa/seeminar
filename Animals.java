package animals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Animals implements Serializable {
    private List<Food> foodList=new ArrayList<Food>();
    private TypesAnimals type;
    private String name;
    private int age;
public Animals(TypesAnimals type,String name,int age,List<Food> foodList){
    this.type=type;
    this.name=name;
    this.age=age;
    this.foodList=foodList;
}

    public int getAge() {
        return age;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public String getName() {
        return name;
    }

    public TypesAnimals getType() {
        return type;
    }
}
