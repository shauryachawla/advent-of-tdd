package org.advent.day1;

/**
 * Elf that is assigned calories
 */
public class Elf implements Comparable<Elf> {

    private int totalCalories = 0;

    /**
     * Calories carried by the Elf
     * @return total calories
     */
    public int getTotalCalories() {
        return totalCalories;
    }

    public void addCalories(int cal) {
        this.totalCalories += cal;
    }

    @Override
    public int compareTo(Elf elf) {
        return this.totalCalories - elf.totalCalories;
    }

}
