/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author Asus
 */
public class Bt3_main 
{
        public static void main(String[] args) 
        {
            ShapeFactory shape = new ShapeFactory();

            Shape circle = shape.createShape(ShapeType.Circle);
            
            circle.setBrush("Vẽ bằng bút lông");
            circle.setFrame("Vẽ trên khung");
            circle.setPaper("Vẽ trên giấy");
            System.out.println(circle.toString());

            Shape circle2 = Circle.createInstance();
            circle2.setBrush("Vẽ bằng phần mềm");
            circle2.setFrame("Vẽ không cần khung");
            circle2.setPaper("Vẽ trên máy tính");
            System.out.println(circle.toString());

            Shape rectangle = shape.createShape(ShapeType.Rectangle);
            rectangle.setBrush("Vẽ bằng cọ");
            rectangle.setFrame("Vẽ không cần khung");
            rectangle.setPaper("Vẽ trên giấy A4");
            System.out.println(rectangle.toString());
            
            Shape rectangle2 = shape.createShape(ShapeType.Rectangle);
            rectangle2.setPaper("Vẽ trên tường");
            System.out.println(rectangle.toString());
    }
}
