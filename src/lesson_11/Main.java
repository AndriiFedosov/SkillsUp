package lesson_11;

import lesson_11.Rada.Deputy;
import lesson_11.Rada.Partia;
import lesson_11.Rada.Util;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List list = new LinkedList();
//        list.add("st");
//        list.add(1);
//        list.add(false);
//        list.add("123");
//        list.add(222);
//        list.add(true);
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//        System.out.println(list);
//        list.set(1,"aaaa");
//        System.out.println(list.get(1));

//        Set<String> set = new HashSet<>();
//        Set<String> set2 = new LinkedHashSet<>();
//        Set<String> set3 = new TreeSet<>();
//
//        set.add("fff");
//        set.add("aaaa");
//        set.add("fff");
//        System.out.println(set);

//        Map<String, Integer> map = new HashMap();
//        Map map2 = new LinkedHashMap();
//        Map ma4 = new TreeMap();
//
//        map.put("ff", 1);
//        System.out.println(map);
//        map.put("ff", 2);
//        System.out.println(map);
//        List<String> strings = new ArrayList<>();
//        strings.add("Andry");
//        strings.add("Vova");
//        strings.add("Sasha");
//        strings.add("Tania");
//        strings.add("Ann");
//
//        ListIterator <String> iterator = (ListIterator<String>) strings.iterator();
        Map<String, Partia> rada = new HashMap<>();
        Util util = new Util();

        Deputy deputy1 = new Deputy("deputy1", false);
        Deputy deputy2 = new Deputy("deputy2", false);
        Deputy deputy3 = new Deputy("deputy3", false);
        Deputy deputy4 = new Deputy("deputy4", false);
        Deputy deputy5 = new Deputy("deputy5", false);
        Deputy deputy6 = new Deputy("deputy6", false);
        Deputy deputy7 = new Deputy("deputy7", false);
        Deputy deputy8 = new Deputy("deputy8", false);

        List<Deputy> koalitionList = new ArrayList<>();
        koalitionList.add(deputy1);
        koalitionList.add(deputy2);
        koalitionList.add(deputy3);
        koalitionList.add(deputy4);

        List<Deputy> opositionList = new ArrayList<>();
        opositionList.add(deputy5);
        opositionList.add(deputy6);
        opositionList.add(deputy7);
        opositionList.add(deputy8);


        Partia koalition = new Partia(koalitionList);
        Partia oposition = new Partia(opositionList);

        rada.put("koalition", koalition);
        rada.put("oposition", oposition);

        util.takeBribe(rada, deputy1.getName());

        System.out.println(rada);
    }
}
