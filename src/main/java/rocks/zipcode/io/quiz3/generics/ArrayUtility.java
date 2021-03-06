package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType evenOccuringValue = null;
        for(SomeType each : this.array) {
            if(getNumberOfOccurrences(each) %2 == 1) {
                evenOccuringValue = each;
            }
        }


        return evenOccuringValue;
    }

    public SomeType findEvenOccurringValue() {
        SomeType evenOccuringValue = null;
        for(SomeType each :this.array) {
            if(getNumberOfOccurrences(each) % 2 == 0) {
                evenOccuringValue = each;
            }
        }
        return evenOccuringValue;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        int counter = 0;
        for(SomeType each : this.array) {
            if(each.equals(valueToEvaluate)) counter++;
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
