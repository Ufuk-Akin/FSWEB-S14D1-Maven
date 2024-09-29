import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle radius= " + circle.getRadius());
        System.out.println("circle area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder radius= " + cylinder.getRadius());
        System.out.println("cylinder height= " + cylinder.getHeight());
        System.out.println("cylinder area= " + cylinder.getArea());
        System.out.println("cylinder volume= " + cylinder.getVolume());

        System.out.println("******************");

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("--**********----");


        HRManager hrManager = new HRManager(2,"ufuk" , 20000);

        System.out.println(hrManager.getSalary());
        hrManager.work();
        System.out.println(hrManager.getSalary());

        HRManager hrManager2 = getHrManager();

        System.out.println(Arrays.toString(hrManager2.getJuniorDevelopers()));
        System.out.println(Arrays.toString(hrManager2.getMidDevelopers()));

    }

    private static HRManager getHrManager() {
        HRManager hrManager2 = new HRManager(2,"ufuk" , 20000 , 2 ,2, 3 );

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(17 , "John" , 300);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(20,"Ei" , 3003);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(22,"Eire" , 34204);

        MidDeveloper midDeveloper = new MidDeveloper(18,"Johnny", 2999);

        SeniorDeveloper senDeveloper = new SeniorDeveloper(19 , "Johnson" , 404040);

        hrManager2.addEmployee(juniorDeveloper);
        hrManager2.addEmployee(midDeveloper);
        hrManager2.addEmployee(senDeveloper);
        hrManager2.addEmployee(juniorDeveloper1);
        hrManager2.addEmployee(juniorDeveloper2);

        return hrManager2;
    }
}