/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package library;
cahnge3
/**
 *
 * @author xia
 */
class ToGBK{
changge 2
    public static String toGBK(String s){
        String str = s;
        try{
            if(s == null){
                return null;
            }
            else{
                str = new String(s.getBytes("ISO-8859-1"), "GBK");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

        return str;
    }
}
