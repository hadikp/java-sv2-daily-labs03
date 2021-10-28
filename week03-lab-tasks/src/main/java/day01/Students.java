package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    List<Integer> heightOfChildren = new ArrayList<>();

    public void addHeight(int height){
        heightOfChildren.add(height);
    }

    public boolean isHeightsIncreasing(){
        for (int i = 0; i < heightOfChildren.size() - 1; i++) {
            if(heightOfChildren.get(i)>heightOfChildren.get(i + 1)){
                return false;
            };
        }
        return true;
    }
}
