public class TestPlanet {

    public static void main(String[] args) {
        Planet p1 = new Planet(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
        Planet p2 = new Planet(2.0, 3.0, 4.0 ,1.0, 2.0, "hh.gif");
        double F = p1.calcPairwiseForce(p2);
        System.out.println("The Pairwise force between them is "+ F);
    }

    
}
