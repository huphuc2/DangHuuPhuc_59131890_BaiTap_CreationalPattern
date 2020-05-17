/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Asus
 */
public class Bt1_main 
{
    public static void main(String[] args)
    {
        HoaDonHeader HDH = new HoaDonHeader
        ("HD1", "17/05/2020","Đặng Hữu Phúc");
        CTHD CTHD1 = new CTHD("Rau Dền",3,10000,0);
        CTHD CTHD2 = new CTHD("Củ Cải",10,250000,0.3);
        CTHD CTHD3 = new CTHD("Dưa Hấu",1,150000,0.5);
        CTHD CTHD4 = new CTHD("Mít",2,270000,0.5);
        
        HoaDon HD = new HoaDon.Builder()
            .addHoaDonHeader(HDH)
            .addCTHD(CTHD1)
            .addCTHD(CTHD2)
            .addCTHD(CTHD3)
            .addCTHD(CTHD4)
            .build();
        
        System.out.println(HD.toString());
    }
    
}
