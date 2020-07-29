package chapter9;

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return slides * length;
    }
    public void print(String What){
        System.out.println("Im a "+What);
    }
}
