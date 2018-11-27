package com.filip.math_example;

import java.beans.PropertyChangeEvent;

class AdditionNumberObserver implements NumberObserver {
    private int numberToAdd = 5;
    public int number;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.number = (int) evt.getNewValue() + numberToAdd;
    }
}
