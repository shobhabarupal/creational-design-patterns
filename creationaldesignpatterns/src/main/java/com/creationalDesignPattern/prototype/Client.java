package creationalDesignPattern.prototype;

import javafx.geometry.Point3D;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
        s1.move(new Point3D(-10,0,0),20);
        s1.attack();

        System.out.println(s1);

        Swordsman clone = (Swordsman) s1.clone();

        System.out.println(clone);
        
        
        General general = new General();
        general.boostMorale();
        general.move(new Point3D(-10,0,0),20);

        System.out.println(general);

        general.clone();

    }

}
