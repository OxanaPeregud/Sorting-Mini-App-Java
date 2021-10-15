package com.peregud.sorting;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.List;

@UtilityClass
public class FileTextUtil {

    public void readFromFile(List<Equipment> equipmentDetails, String pathInput, String splitRegex) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathInput))) {
            String currentLine = reader.readLine();
            while (StringUtils.isNotBlank(currentLine)) {
                String[] equipmentModels = currentLine.split(splitRegex);
                equipmentDetails.add(new Equipment(equipmentModels));
                currentLine = reader.readLine();
            }
        }
    }

    public void writeToFile(List<Equipment> equipmentDetails, String pathOutput, String splitRegex) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathOutput))) {
            for (Equipment equipment : equipmentDetails) {
                for (String eq : equipment.getModel()) {
                    writer.write(eq + splitRegex);
                }
                writer.newLine();
            }
        }
    }
}
