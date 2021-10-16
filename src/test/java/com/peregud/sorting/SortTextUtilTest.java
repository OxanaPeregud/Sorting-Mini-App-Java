package com.peregud.sorting;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortTextUtilTest {

    @Test
    void sortData() {
        List<Equipment> equipmentDetails = new ArrayList<>();
        equipmentDetails.add(new Equipment(new String[]{"GH", "9", "7"}));
        equipmentDetails.add(new Equipment(new String[]{"8", "5", "7"}));
        equipmentDetails.add(new Equipment(new String[]{"2", "5", "7"}));
        equipmentDetails.add(new Equipment(new String[]{"Aja", "PLO", "lim"}));
        equipmentDetails.add(new Equipment(new String[]{"56", "5", "7"}));
        SortTextUtil.sortData(equipmentDetails);
        assertEquals("2", equipmentDetails.get(0).getModel()[0]);
        assertEquals("GH", equipmentDetails.get(equipmentDetails.size() - 1).getModel()[0]);
    }
}