package com.peregud.sorting;

import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class SortTextUtil {

    public void sortData(List<Equipment> equipmentDetails) {
        equipmentDetails.sort(new EquipmentModelsComparator());
    }
}
