package com.directi.training.codesmells.duplicatecode;

public class Statistics
{
    public double average(double[] array)
    {
        double sum = 0;

        for (double element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public double calculateDifferenceOfAverage(double[] array1, double[] array2)
    {
        return Math.abs(average(array1) - average(array2);
    }

    public double calculateSampleVariance(double[] elements)
    {
        double average1 = average(elements);

        double temp = 0.0;
        for (double element : elements) {
            temp += Math.pow(element - average1, 2);
        }
        return temp / (elements.length - 1);

    }
}
