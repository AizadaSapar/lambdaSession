package com.company;

public class Main {

    public static void main(String[] args) {
        //Bir functional interface tuzobuz
    //Al interfacetin realizasiyasin lyamdanin jardami menen kilabiz.
    //interfacetegi metod return metod bolsun, String kaitarsin,
    // parametrinde bir string bir int tibinde maani alsin
    //konsolgo alingan string tibindegi maani chon tamgalar menen chiksin
    Method method=(age,name)-> System.out.println(age+name);
    method.methodAbstr(25," Maksat");
    method.jhgf();
    Method.jhgfd(2);

    }
}
@FunctionalInterface
interface Method {
    void methodAbstr(int age,String name);

   static void jhgfd(int a) {
       System.out.println(654 + a);
   }

   default void jhgf() {
       System.out.println(54);
   }


}