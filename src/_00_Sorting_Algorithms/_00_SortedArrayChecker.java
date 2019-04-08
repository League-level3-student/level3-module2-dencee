package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
    // 1. Write a static method called intArraySorted.
    // This method takes in an array of integers
    // and it returns a boolean.
    // The method returns true if the integer
    // array is in ascending order and false otherwise
    static boolean intArraySorted(int[] ia) {
        boolean sorted = true;

        if( ia.length > 1 ) {
            for( int i = 1; i < ia.length; i++ ) {
                if( ia[i] < ia[i - 1] ) {
                    sorted = false;
                    break;
                }
            }
        }

        return sorted;
    }

    // 2. Write a static method called doubleArraySorted.
    // This method takes in an array of doubles
    // and it returns a boolean.
    // The method returns true if the double
    // array is in ascending order and false otherwise
    static boolean doubleArraySorted( double[] da ) {
        boolean sorted = true;

        if( da.length > 1 ) {
            for( int i = 1; i < da.length; i++ ) {
                if( da[i] < da[i - 1] ) {
                    sorted = false;
                    break;
                }
            }
        }

        return sorted;
    }

    // 3. Write a static method called charArraySorted.
    // This method takes in an array of characters
    // and it returns a boolean.
    // The method returns true if the character
    // array is in alphabetical order and false otherwise
    // (You can compare characters just like integers)
    static boolean charArraySorted( char[] ca ) {
        boolean sorted = true;

        if( ca.length > 1 ) {
            for( int i = 1; i < ca.length; i++ ) {
                if( ca[i] < ca[i - 1] ) {
                    sorted = false;
                    break;
                }
            }
        }

        return sorted;
    }
    
    
    // 4. Write a static method called stringArraySorted.
    // This method takes in an array of Strings
    // and it returns a boolean.
    // The method returns true if the String
    // array is in alphabetical order and false otherwise
    // (Use the compareTo(String) method)
    static boolean stringArraySorted( String[] sa ) {
        boolean sorted = true;

        if( sa.length > 1 ) {
            for( int i = 1; i < sa.length; i++ ) {
                if( sa[i].compareTo( sa[i - 1] ) < 0 ) {
                    sorted = false;
                    break;
                }
            }
        }

        return sorted;
    }

}
