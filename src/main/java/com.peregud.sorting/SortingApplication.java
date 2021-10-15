package com.peregud.sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SortingApplication {

    public static final String SPLIT_REGEX = "\t";
    public static final String FILE_INPUT_NAME = "src/main/resources/in.txt";
    public static final String FILE_OUTPUT_NAME = "src/main/resources/out.txt";

    public static void main(String[] args) throws IOException {
        List<Equipment> equipmentDetails = new ArrayList<>();
        FileTextUtil.readFromFile(equipmentDetails, FILE_INPUT_NAME, SPLIT_REGEX);
        SortTextUtil.sortData(equipmentDetails);
        FileTextUtil.writeToFile(equipmentDetails, FILE_OUTPUT_NAME, SPLIT_REGEX);
    }
}
