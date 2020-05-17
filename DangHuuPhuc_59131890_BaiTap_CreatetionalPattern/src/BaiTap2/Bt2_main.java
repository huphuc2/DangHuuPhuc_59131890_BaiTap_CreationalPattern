/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Asus
 */
public class Bt2_main 
{
    public static void main(String[] args) 
    {
        MyStringBuilder str = new MyStringBuilder.Builder()
                .addString("Dang Huu Phuc_59131890 ")
                .addFloat(9.0F)
                .addBool(true)                
                .build();
        System.out.println(str.toString());
        
    }
}
