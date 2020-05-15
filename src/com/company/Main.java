package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Fisher f1 = new Fisher("Vova");
        Fisher f2 = new Fisher("Igorek");
        Fisher f3 = new Fisher("Max");
        f1.startFishing(new GregorianCalendar(2020, Calendar.MAY, 1), new GregorianCalendar(2020, Calendar.MAY, 30));
        f2.startFishing(new GregorianCalendar(2020, Calendar.MAY, 1), new GregorianCalendar(2020, Calendar.MAY, 30));
        f3.startFishing(new GregorianCalendar(2020, Calendar.MAY, 1), new GregorianCalendar(2020, Calendar.MAY, 30));
        List<Fisher> fisherList = Arrays.asList(f1, f2, f3);
        Main m1 = new Main();
        List<TypeOfFish> typeOfFishList = Arrays.asList(TypeOfFish.Herring, TypeOfFish.Perch, TypeOfFish.Pike);
        m1.competition(fisherList, TypeOfFish.Herring, new GregorianCalendar(2020, Calendar.MAY, 1), new GregorianCalendar(2020, Calendar.MAY, 31));
    }

    public void competition(List<Fisher> fisherList, TypeOfFish typeOfFish, Calendar start, Calendar end) {
        List<ResultComp> resultCompList = new ArrayList<ResultComp>();
        fisherList.forEach(f-> resultCompList.add(new ResultComp(f.name,f.caughtFishList.stream().filter(cf->cf.typeOfFish==typeOfFish&&cf.timeOfCaught.compareTo(start)>0&&cf.timeOfCaught.compareTo(end)<0).mapToInt(Fish::getWeight).max().getAsInt())));
        System.out.println(resultCompList.stream().max(Comparator.comparing(ResultComp::getWeigth)).toString());
    }
}
