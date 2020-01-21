
package mybuiltinannotations;

import java.lang.reflect.method;

public class MyAnnTestdemo{

public static void main(String[] args)throws Exception{
                MyAnnTest mat=new MyAnnTest();
Method m=mat.getClass().getAnnotation(MySampleAnn.class);

System.out.println("Name: "+msa.name());
System.out.println("Description: "+msa.desc());

    mat.myTestMethod();
}

