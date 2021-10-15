package com.peregud.sorting;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.List;

@UtilityClass
public class SortTextUtil {

    public void readFromFile(List<Equipment> equipmentDetails) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/in.txt"));
        String currentLine = reader.readLine();
        while (StringUtils.isNotBlank(currentLine)) {
            String[] equipmentModels = currentLine.split("\t");
            equipmentDetails.add(new Equipment(equipmentModels));
            currentLine = reader.readLine();
        }
        reader.close();
    }

    public void sortData(List<Equipment> equipmentDetails) {
        equipmentDetails.sort(new EquipmentModelsComparator());
    }

    public void writeToFile(List<Equipment> equipmentDetails) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/out.txt"));
        for (Equipment equipment : equipmentDetails) {
            for (String eq : equipment.getModel()) {
                writer.write(eq + "\t");
            }
            writer.newLine();
        }
        writer.close();
    }
}
