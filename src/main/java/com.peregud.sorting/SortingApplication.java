package com.peregud.sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortingApplication {

    public static void main(String[] args) throws IOException {
        List<Equipment> equipmentDetails = new ArrayList<>();
        SortTextUtil.readFromFile(equipmentDetails);
        SortTextUtil.sortData(equipmentDetails);
        SortTextUtil.writeToFile(equipmentDetails);
    }
}
