package Part1_Class_Demonstration;

public class GettersAndSettersDemonstration {
    private int count;
    private String name;
    private boolean YesOrNo;
    public int getCount(){
        return count;
    }

    public String getName(){
        return name;
    }
    public boolean getYesOrNo(){
        return YesOrNo;
    }
    public void setCount(int newCount){
        this.count = newCount;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public void setYesOrNo(boolean newYesOrNo){
        this.YesOrNo = newYesOrNo;
    }

}
