package lesson_8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;

public class OuterClass {
   public class InnerClass {
        Boolean getFlag() {
            return System.currentTimeMillis() > 1;
        }
    }
    public static class InnerStaticClass {
        public static Boolean getStaticFlag() {
            return System.currentTimeMillis() > 1;
        }
    }


    public void showFlag() {
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.getFlag());
        System.out.println(OuterClass.InnerStaticClass.getStaticFlag());

        class LocalClass {
            Boolean getFlagFromLocalClass(){
                return System.currentTimeMillis() > 1;
            }
        }

        LocalClass localClass = new LocalClass();

        System.out.println(localClass.getFlagFromLocalClass());


    }




}
