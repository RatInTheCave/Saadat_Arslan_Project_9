package Part2_Hobby_Artefact;
public class    Part2_Main {
    public static void main(String[] args) {
        Miniature_Class Miniature1 = new Miniature_Class();
        Miniature_Class Miniature2 = new Miniature_Class();
        Miniature1.setAmount(3);
        Miniature1.setColor("green");
        Miniature1.setName("robot");

        Miniature2.setAmount(20);
        Miniature2.setColor("purple");
        Miniature2.setName("alien");

        Miniature1.PrintDescription();
        System.out.println("I have " + Miniature2.getAmount() + " " +  Miniature2.getColor()+  " " +  Miniature2.getName() + "s");

    }


}
