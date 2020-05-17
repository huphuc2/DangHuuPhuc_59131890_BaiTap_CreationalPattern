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
public class MyStringBuilder 
{
    String str;
    
    public static class Builder 
    {
        
        String str = "";
        
        public Builder addFloat(float f) 
        {
            this.str = this.str.concat(Float.toString(f));
            return this;
        }
        
        public Builder(String myStr) 
        {
            this.str = str;
            
        }
        
        public Builder addBool(boolean b) 
        {
            this.str = this.str.concat(Boolean.toString(b));
            return this;
        }
        
        public Builder() 
        {}
                
        public Builder addString(String s) 
        {
            
            this.str = this.str.concat(s);
            return this;
        }
        public MyStringBuilder build() 
        {
            return new MyStringBuilder(this);
        }
    }
    
    protected MyStringBuilder (Builder builder) 
    {
        this.str = builder.str;
    }
    
    @Override
    public String toString() 
    {
        return "Chuỗi đã được xây dựng: " + "\n"+str;
    }
}
