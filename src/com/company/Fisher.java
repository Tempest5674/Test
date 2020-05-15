package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Fisher {
    String name;
    List<Fish> caughtFishList = new ArrayList<Fish>();
    public Fisher(String name) {
        this.name = name;
        this.caughtFishList = caughtFishList;
    }

    public void tryTocatchFish(Calendar dayOfFishing, List<TypeOfFish> typeOfFishList,Random mood)
    {
        if(mood.nextInt(10)<=8)
        {
            caughtFishList.add(new Fish(typeOfFishList.get(mood.nextInt(typeOfFishList.size())),mood.nextInt(5000),dayOfFishing));
        }
    }
    public void startFishing(Calendar start, Calendar end)
    {
        List<TypeOfFish> typeOfFishList =Arrays.asList(TypeOfFish.Herring,TypeOfFish.Perch,TypeOfFish.Pike);
        Random mood = new Random();
        while(!start.getTime().equals(end.getTime())) {
            this.tryTocatchFish(start, typeOfFishList, mood);
            start.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
    public void show()
    {
        for(Fish f : caughtFishList)
        {
            System.out.println(f.toString());
        }
    }
}
