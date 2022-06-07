package text_6_7;

import java.io.File;

public class digui {
    public static void main(String[] args) {
        int s=f(5);
        System.out.println(s);
        File s1=new File("G:\\我的Java2.0");
        getAllfile(s1);
    }
    public  static void getAllfile(File kiss){
        File [] kisss=kiss.listFiles();
        if(kisss!=null){
            for(File kis:kisss){
                if(kis.isDirectory()){
                    getAllfile(kis);
                }else {
                    System.out.println(kis.getAbsolutePath());
                }
            }
        }
    }
    public static int f(int x){
        if(x==1){
            return 1;
        }
        return f(x-1)*x;
    }
}
