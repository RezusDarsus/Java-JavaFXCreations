#Array Operations Exercise

## Overview

This repository contains an implementation of basic array operations in Java. The primary focus of this exercise is to practice manipulating arrays by implementing several key methods:

1. **Print**: Output the contents of an array.
2. **Find Min and Max**: Determine and display the minimum and maximum values in an array.
3. **Invert**: Reverse the order of elements in an array.
4. **Cut**: Adjust the size of an array, either truncating it or padding it with zeros.
5. **Linearize**: Convert a 2D array into a 1D array.

## Implemented Methods

### 1. `print(int[] arr)`

Prints the contents of an integer array in a formatted manner.

**Example Usage**:
```java
int[] array = {1, 2, 3};
print(array); // Output: {1, 2, 3}
```

### 2. `minUndMax(int[] arr)`

Finds and prints the minimum and maximum values in an integer array.

**Example Usage**:
```java
int[] array = {1, 10, 25, -13, 1000};
minUndMax(array); // Output: Min: -13, Max: 1000
```

### 3. `invert(int[] arr)`

Reverses the elements of an integer array and returns the result.

**Example Usage**:
```java
int[] array = {1, 2, 3};
int[] inverted = invert(array); // Output: {3, 2, 1}
```

### 4. `cut(int[] arr, int len)`

Truncates or pads the input array to a specified length. If the input array is shorter than the specified length, the extra positions are filled with zeros.

**Example Usage**:
```java
int[] array = {1, 2, 3};
int[] cutArray = cut(array, 5); // Output: {1, 2, 3, 0, 0}
```

### 5. `linearize(int[][] arr)`

Converts a 2D array into a 1D array by flattening it.

**Example Usage**:
```java
int[][] array2D = {
    {1, 2, 3},
    {4, 5},
    {6, 7, 8, 9}
};
int[] linearized = linearize(array2D); // Output: {1, 2, 3, 4, 5, 6, 7, 8, 9}
```

## Notes

- Make sure to test each method individually to verify correctness.
- Consider edge cases, such as empty arrays or arrays with different lengths.

Feel free to explore and modify the code according to your needs. Contributions and improvements are welcome!

This README file provides a clear explanation of each method and includes example code and usage for easy understanding and testing.
