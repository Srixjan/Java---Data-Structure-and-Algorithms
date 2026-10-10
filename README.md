# My Java DSA practice

This is my working folder for learning Java and practicing data structures and algorithms. The files are standalone exercises in the repository root; there is no single application or build system.

## Run a solution

From this folder, compile and run one file at a time:

```powershell
javac .\twoSum.java
java twoSum
```

Use the class name (not the `.java` filename) with `java`. Some files have a `main` method and sample input; others only have a method intended for a caller or an online judge. If a solution does not run on its own, check for `main` before assuming it is broken.

## Where to look

### Start here: Java basics

- Variables and types: [`Variables.java`](./Variables.java), [`types.java`](./types.java)
- Input, conditions, and loops: [`input.java`](./input.java), [`conditional.java`](./conditional.java), [`switches.java`](./switches.java), [`forloop.java`](./forloop.java), [`loop.java`](./loop.java)
- Functions and OOP: [`function.java`](./function.java), [`function_overloading.java`](./function_overloading.java), [`OOPS.java`](./OOPS.java)

### Arrays and common patterns

Array basics and traversal: [`array.java`](./array.java), [`largestElement.java`](./largestElement.java), [`secondLargestElement.java`](./secondLargestElement.java), [`linearSearch.java`](./linearSearch.java)

Two pointers / in-place changes: [`twoSum.java`](./twoSum.java), [`moveZerosToEnd.java`](./moveZerosToEnd.java), [`removeDuplicatesFromSortedArray.java`](./removeDuplicatesFromSortedArray.java), [`leftRotateArrayByKPlaces.java`](./leftRotateArrayByKPlaces.java)

Subarrays and prefix-style problems: [`kadaneAlgorithm.java`](./kadaneAlgorithm.java), [`LongestSubarrayWithsumK.java`](./LongestSubarrayWithsumK.java), [`countSubarraysWithGivenXorK.java`](./countSubarraysWithGivenXorK.java), [`trapping_rainwater.java`](./trapping_rainwater.java)

Sorting: [`bubbleSort.java`](./bubbleSort.java), [`selectionSort.java`](./selectionSort.java), [`insertionSort.java`](./insertionSort.java), [`mergeSort.java`](./mergeSort.java), [`quickSortt.java`](./quickSortt.java)

### Binary search

Basic bounds and positions: [`lowerBound.java`](./lowerBound.java), [`upperBound.java`](./upperBound.java), [`searchInsertPostion.java`](./searchInsertPostion.java), [`firstAndLastOccurence.java`](./firstAndLastOccurence.java)

Rotated arrays and peaks: [`searchInRotateSortedArray_I.java`](./searchInRotateSortedArray_I.java), [`searchInRotatedSortedArray_II.java`](./searchInRotatedSortedArray_II.java), [`findMinimumInRotatedSortedArray.java`](./findMinimumInRotatedSortedArray.java), [`findPeakElement.java`](./findPeakElement.java)

Binary search on the answer: [`kokoEatingBananas.java`](./kokoEatingBananas.java), [`minimumDaysToMakeMBouquets.java`](./minimumDaysToMakeMBouquets.java), [`bookAllocation.java`](./bookAllocation.java), [`aggressiveCows.java`](./aggressiveCows.java)

### Strings and matrices

Strings: [`longestCommonPrefix.java`](./longestCommonPrefix.java), [`isomorphicString.java`](./isomorphicString.java), [`String_Compression.java`](./String_Compression.java), [`rotateString.java`](./rotateString.java)

Matrices: [`searchIn2DMatrix.java`](./searchIn2DMatrix.java), [`searchIn2DMatrix_II.java`](./searchIn2DMatrix_II.java), [`printTheMatrixInSpiralOrders.java`](./printTheMatrixInSpiralOrders.java), [`rotateImageBy90Degrees.java`](./rotateImageBy90Degrees.java)

### Recursion and backtracking

Recursion exercises: [`checkifArraySortedRecursion.java`](./checkifArraySortedRecursion.java), [`reverseArrayRecursion.java`](./reverseArrayRecursion.java), [`factorialOfAGivenNumberRecursion.java`](./factorialOfAGivenNumberRecursion.java)

Subsets and combinations: [`subsets.java`](./subsets.java), [`subsets_II.java`](./subsets_II.java), [`combinationSSum.java`](./combinationSSum.java), [`combinationSum_II.java`](./combinationSum_II.java), [`combinationSum_III.java`](./combinationSum_III.java)

Grid and board search: [`wordSearch.java`](./wordSearch.java), [`ratInMaze.java`](./ratInMaze.java), [`NQueens.java`](./NQueens.java)

## Practice order

Use this as a route through the files, not as a claim that a topic is finished:

1. Java basics, arrays, and simple loops.
2. Sorting, frequency counting, and two-pointer problems.
3. Binary search on sorted arrays, then binary search on an answer.
4. Strings and 2D arrays.
5. Recursion, subsets/combinations, then backtracking.
6. Revisit problems without looking at the code; write down the idea and time/space complexity.

When solving a LeetCode problem, compare the constraints and required method signature with the local file. The local code is practice material; it may need changes for edge cases or the judge's expected class/signature.

## Problem links I use

- [LeetCode problem set](https://leetcode.com/problemset/) — find problems and revisit statements.
- [Striver A2Z DSA Sheet](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/) — use as a topic-by-topic checklist.
- [Java documentation](https://docs.oracle.com/en/java/) — look up Java APIs and language behavior.

For a specific solution, search this folder by its problem name. Many filenames are named after the problem rather than grouped into subfolders.
