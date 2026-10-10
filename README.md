# Java Data Structures & Algorithms

A growing collection of Java practice programs, interview patterns, and problem solutions. The repository currently contains **162 tracked Java source files**, from language fundamentals to array, string, matrix, binary-search, and backtracking problems.

> The index below reflects the source files in this repository. A link to a LeetCode problem identifies a related problem; it does not imply that the solution has been submitted to or accepted by LeetCode.

## At a glance

| | |
|---|---|
| **Language** | Java |
| **Tracked Java sources** | 162 |
| **Organization** | Standalone `.java` files in the repository root |
| **Build system** | None required; compile a file directly with `javac` |
| **Practice areas** | Fundamentals · Arrays · Sorting · Binary Search · Strings · Matrices · Recursion · Backtracking |

## Contents

- [Getting started](#getting-started)
- [Problem index](#problem-index)
  - [Arrays and hashing](#arrays-and-hashing)
  - [Sorting and array techniques](#sorting-and-array-techniques)
  - [Binary search](#binary-search)
  - [Strings](#strings)
  - [Matrices](#matrices)
  - [Recursion and backtracking](#recursion-and-backtracking)
  - [Math and number theory](#math-and-number-theory)
  - [Java fundamentals](#java-fundamentals)
- [How to use the solutions](#how-to-use-the-solutions)
- [References](#references)

## Getting started

Install a JDK (Java 11 or newer is recommended), clone the repository, and compile and run an individual program from the repository root:

```powershell
git clone https://github.com/Srixjan/Java---Data-Structure-and-Algorithms.git
cd Java---Data-Structure-and-Algorithms
javac .\NQueens.java
java NQueens
```

Many files contain a `main` method with a small example. Others focus on a method in the style of an online judge and may need a caller or test harness. Compile one solution at a time: these independent exercises can reuse class names or have different input/output conventions.

## Problem index

The links in the **Related problem** column point to canonical LeetCode statements when there is a clear match. Files without a problem link are still useful implementations or practice exercises.

### Arrays and hashing

| Topic | Source | Related problem |
|---|---|---|
| Two Sum | [`twoSum.java`](./twoSum.java) | [Two Sum](https://leetcode.com/problems/two-sum/) |
| Contains Duplicate | [`containsDuplicates.java`](./containsDuplicates.java) | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) |
| Remove Duplicates from Sorted Array | [`removeDuplicatesFromSortedArray.java`](./removeDuplicatesFromSortedArray.java) | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) |
| Move Zeroes | [`moveZerosToEnd.java`](./moveZerosToEnd.java) | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) |
| Rotate Array by one / by K | [`leftRotateArrayByOne.java`](./leftRotateArrayByOne.java), [`leftRotateArrayByKPlaces.java`](./leftRotateArrayByKPlaces.java) | [Rotate Array](https://leetcode.com/problems/rotate-array/) |
| Maximum Consecutive Ones | [`maximumConsecutiveOnes.java`](./maximumConsecutiveOnes.java) | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) |
| Majority Element | [`majorityElement_1.java`](./majorityElement_1.java) | [Majority Element](https://leetcode.com/problems/majority-element/) |
| Majority Element II | [`majorityElement_2.java`](./majorityElement_2.java) | [Majority Element II](https://leetcode.com/problems/majority-element-ii/) |
| Maximum Subarray (Kadane's algorithm) | [`kadaneAlgorithm.java`](./kadaneAlgorithm.java) | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) |
| Maximum Product Subarray | [`maximumProductSubarrayInAnArray.java`](./maximumProductSubarrayInAnArray.java) | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/) |
| Longest Consecutive Sequence | [`longestConsecutiveSequenceInArray.java`](./longestConsecutiveSequenceInArray.java) | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) |
| Next Permutation | [`nextPermutation.java`](./nextPermutation.java) | [Next Permutation](https://leetcode.com/problems/next-permutation/) |
| Sort Colors | [`sortColour.java`](./sortColour.java) | [Sort Colors](https://leetcode.com/problems/sort-colors/) |
| Rearrange by sign | [`rearrangeArrayElementsBySigns.java`](./rearrangeArrayElementsBySigns.java) | [Rearrange Array Elements by Sign](https://leetcode.com/problems/rearrange-array-elements-by-sign/) |
| Leaders in an array | [`leadersInArray.java`](./leadersInArray.java) | |
| Second-largest element | [`secondLargestElement.java`](./secondLargestElement.java) | |
| Missing number | [`findMissingNumber.java`](./findMissingNumber.java) | [Missing Number](https://leetcode.com/problems/missing-number/) |
| Repeating and missing number | [`findTheRepeatingAndMissingNumber.java`](./findTheRepeatingAndMissingNumber.java) | |
| Longest subarray with sum K | [`LongestSubarrayWithsumK.java`](./LongestSubarrayWithsumK.java) | |
| Count subarrays with XOR K | [`countSubarraysWithGivenXorK.java`](./countSubarraysWithGivenXorK.java) | |
| Subarray sum / frequency exercises | [`subarray.java`](./subarray.java), [`sumOfHighestAndLowestFrequency.java`](./sumOfHighestAndLowestFrequency.java) | |
| Union and intersection of sorted arrays | [`unionOfTwoSortedArrays.java`](./unionOfTwoSortedArrays.java), [`intersectionOfTwoSortedArrays.java`](./intersectionOfTwoSortedArrays.java) | |
| Trapping Rain Water | [`trapping_rainwater.java`](./trapping_rainwater.java) | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) |
| 3Sum / 4Sum | [`threeSum.java`](./threeSum.java), [`fourSum.java`](./fourSum.java) | [3Sum](https://leetcode.com/problems/3sum/) · [4Sum](https://leetcode.com/problems/4sum/) |

### Sorting and array techniques

| Technique | Source |
|---|---|
| Bubble, insertion, and selection sort | [`bubbleSort.java`](./bubbleSort.java), [`insertionSort.java`](./insertionSort.java), [`selectionSort.java`](./selectionSort.java) |
| Merge sort and quicksort | [`mergeSort.java`](./mergeSort.java), [`quickSortt.java`](./quickSortt.java) |
| Count inversions | [`countInversions.java`](./countInversions.java) |
| Reverse pairs | [`reversePairs.java`](./reversePairs.java) |
| Merge sorted arrays without extra space | [`mergeTwoSortedArraysWithNoExtraSpace.java`](./mergeTwoSortedArraysWithNoExtraSpace.java) |
| Linear search | [`linearSearch.java`](./linearSearch.java) |
| Array reversal | [`reverseAnArray.java`](./reverseAnArray.java), [`array_reverse.java`](./array_reverse.java) |

### Binary search

| Topic | Source | Related problem |
|---|---|---|
| Lower bound / upper bound | [`lowerBound.java`](./lowerBound.java), [`upperBound.java`](./upperBound.java) | |
| Search insertion position | [`searchInsertPostion.java`](./searchInsertPostion.java) | [Search Insert Position](https://leetcode.com/problems/search-insert-position/) |
| First and last occurrence | [`firstAndLastOccurence.java`](./firstAndLastOccurence.java) | [Find First and Last Position](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) |
| Floor and ceil in a sorted array | [`floorAndCeilInSortedArray.java`](./floorAndCeilInSortedArray.java) | |
| Search in a rotated sorted array | [`searchInRotateSortedArray_I.java`](./searchInRotateSortedArray_I.java), [`searchInRotatedSortedArray_II.java`](./searchInRotatedSortedArray_II.java) | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) · [Search II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/) |
| Find minimum / rotation count in rotated array | [`findMinimumInRotatedSortedArray.java`](./findMinimumInRotatedSortedArray.java), [`findOutHowManyTimesArrayIsRotated.java`](./findOutHowManyTimesArrayIsRotated.java) | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) |
| Find peak element | [`findPeakElement.java`](./findPeakElement.java), [`findPeakElement_II.java`](./findPeakElement_II.java) | [Find Peak Element](https://leetcode.com/problems/find-peak-element/) |
| Single element in a sorted array | [`singleElementInSortedArray.java`](./singleElementInSortedArray.java) | [Single Element in a Sorted Array](https://leetcode.com/problems/single-element-in-a-sorted-array/) |
| Search a 2D matrix | [`searchIn2DMatrix.java`](./searchIn2DMatrix.java), [`searchIn2DMatrix_II.java`](./searchIn2DMatrix_II.java) | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) · [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) |
| Integer square root / Nth root | [`findSquareRootOfANumber.java`](./findSquareRootOfANumber.java), [`findTheNthRootOfANumber.java`](./findTheNthRootOfANumber.java) | [Sqrt(x)](https://leetcode.com/problems/sqrtx/) |
| Kth missing positive number | [`KMissingPostiiveNumber.java`](./KMissingPostiiveNumber.java) | [Kth Missing Positive Number](https://leetcode.com/problems/kth-missing-positive-number/) |
| Koko eating bananas | [`kokoEatingBananas.java`](./kokoEatingBananas.java) | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) |
| Minimum days to make bouquets | [`minimumDaysToMakeMBouquets.java`](./minimumDaysToMakeMBouquets.java) | [Minimum Number of Days to Make m Bouquets](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/) |
| Smallest divisor / split array | [`findTheSmallestDivisor.java`](./findTheSmallestDivisor.java), [`splitArray_LargestSum.java`](./splitArray_LargestSum.java) | [Find the Smallest Divisor](https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/) · [Split Array Largest Sum](https://leetcode.com/problems/split-array-largest-sum/) |
| Aggressive cows / book allocation | [`aggressiveCows.java`](./aggressiveCows.java), [`bookAllocation.java`](./bookAllocation.java) | |
| Median of two sorted arrays | [`medianOfTwoSortedArrays.java`](./medianOfTwoSortedArrays.java) | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) |
| Kth element of two sorted arrays / matrix median | [`KthElementOfTwoSortedArrays.java`](./KthElementOfTwoSortedArrays.java), [`matrixMedian.java`](./matrixMedian.java) | |

### Strings

| Topic | Source | Related problem |
|---|---|---|
| Longest common prefix | [`longestCommonPrefix.java`](./longestCommonPrefix.java) | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/) |
| Isomorphic strings | [`isomorphicString.java`](./isomorphicString.java) | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) |
| Rotate string | [`rotateString.java`](./rotateString.java) | [Rotate String](https://leetcode.com/problems/rotate-string/) |
| Largest odd number in a string | [`largestOddNumberInAString.java`](./largestOddNumberInAString.java) | [Largest Odd Number in String](https://leetcode.com/problems/largest-odd-number-in-string/) |
| String compression | [`String_Compression.java`](./String_Compression.java) | [String Compression](https://leetcode.com/problems/string-compression/) |
| Reverse a string | [`reverseAString2.java`](./reverseAString2.java), [`reverseAStringRecursion.java`](./reverseAStringRecursion.java) | |
| Palindrome checks | [`stringPalindromeCheck.java`](./stringPalindromeCheck.java), [`string_pallindrome.java`](./string_pallindrome.java), [`checkIfStringPalindromRecursion.java`](./checkIfStringPalindromRecursion.java) | |
| Letter combinations of a phone number | [`letterCombinationOfAPhoneNumber.java`](./letterCombinationOfAPhoneNumber.java) | [Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) |

### Matrices

| Topic | Source | Related problem |
|---|---|---|
| Spiral matrix traversal | [`printTheMatrixInSpiralOrders.java`](./printTheMatrixInSpiralOrders.java) | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) |
| Rotate image by 90 degrees | [`rotateImageBy90Degrees.java`](./rotateImageBy90Degrees.java) | [Rotate Image](https://leetcode.com/problems/rotate-image/) |
| Search in sorted matrices | [`searchIn2DMatrix.java`](./searchIn2DMatrix.java), [`searchIn2DMatrix_II.java`](./searchIn2DMatrix_II.java) | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) · [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) |
| Matrix peak / median | [`findPeakElement_II.java`](./findPeakElement_II.java), [`matrixMedian.java`](./matrixMedian.java) | |
| Matrix examples | [`Matrices.java`](./Matrices.java), [`sparse_matrix.java`](./sparse_matrix.java) | |

### Recursion and backtracking

| Topic | Source | Related problem |
|---|---|---|
| Subsets / power set | [`subsets.java`](./subsets.java), [`subsets_II.java`](./subsets_II.java) | [Subsets](https://leetcode.com/problems/subsets/) · [Subsets II](https://leetcode.com/problems/subsets-ii/) |
| Combination Sum I, II, and III | [`combinationSSum.java`](./combinationSSum.java), [`combinationSum_II.java`](./combinationSum_II.java), [`combinationSum_III.java`](./combinationSum_III.java) | [Combination Sum](https://leetcode.com/problems/combination-sum/) · [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/) · [Combination Sum III](https://leetcode.com/problems/combination-sum-iii/) |
| N-Queens | [`NQueens.java`](./NQueens.java) | [N-Queens](https://leetcode.com/problems/n-queens/) |
| Word Search | [`wordSearch.java`](./wordSearch.java) | [Word Search](https://leetcode.com/problems/word-search/) |
| Palindrome partitioning | [`pallindromePartioning.java`](./pallindromePartioning.java) | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) |
| Subsequences with sum K | [`checkIfThereSubsequenceWithSumK.java`](./checkIfThereSubsequenceWithSumK.java), [`countAllSubsequencesWithSumK.java`](./countAllSubsequencesWithSumK.java) | |
| Generate binary strings without consecutive ones | [`generateBinaryStringsWithConsecutive1s.java`](./generateBinaryStringsWithConsecutive1s.java) | |
| Recursive stack reversal | [`reverseStack.java`](./reverseStack.java) | |

### Math and number theory

| Topic | Source | Related problem |
|---|---|---|
| Greatest common divisor / least common multiple | [`GCDofTwoNumbers.java`](./GCDofTwoNumbers.java), [`lcmofTwoNumbers.java`](./lcmofTwoNumbers.java) | |
| Prime checks and divisors | [`prime.java`](./prime.java), [`prime_function.java`](./prime_function.java), [`checkPrimeRecursion.java`](./checkPrimeRecursion.java), [`DivisorsofaNumber.java`](./DivisorsofaNumber.java) | |
| Factorial and binomial coefficient | [`Factoriial.java`](./Factoriial.java), [`factorialOfAGivenNumberRecursion.java`](./factorialOfAGivenNumberRecursion.java), [`binomialCoefficent.java`](./binomialCoefficent.java) | |
| Armstrong / perfect number | [`armstrongNumber.java`](./armstrongNumber.java), [`perfectNumber.java`](./perfectNumber.java) | |
| Digit operations | [`countAllDigitsofANumber.java`](./countAllDigitsofANumber.java), [`countNumberofOddDigitsinaNumber.java`](./countNumberofOddDigitsinaNumber.java), [`sumOfDigitsInAGivenNumber.java`](./sumOfDigitsInAGivenNumber.java) | |
| Fast exponentiation | [`Power_X_n.java`](./Power_X_n.java) | [Pow(x, n)](https://leetcode.com/problems/powx-n/) |
| Count Good Numbers | [`countGoodNumbers.java`](./countGoodNumbers.java) | [Count Good Numbers](https://leetcode.com/problems/count-good-numbers/) |
| Pascal's triangle | [`pascalsTriangle_1.java`](./pascalsTriangle_1.java), [`pascalsTriangle_2.java`](./pascalsTriangle_2.java) | [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) · [Pascal's Triangle II](https://leetcode.com/problems/pascals-triangle-ii/) |

### Java fundamentals

Language basics and practice exercises include [`JavaBasics.java`](./JavaBasics.java), [`javaBasic.java`](./javaBasic.java), [`Variables.java`](./Variables.java), [`types.java`](./types.java), [`input.java`](./input.java), [`operators.java`](./operators.java), [`conditional.java`](./conditional.java), [`switches.java`](./switches.java), [`forloop.java`](./forloop.java), [`loop.java`](./loop.java), [`breakcontinue.java`](./breakcontinue.java), [`function.java`](./function.java), [`function_overloading.java`](./function_overloading.java), [`function_question.java`](./function_question.java), and [`OOPS.java`](./OOPS.java).

Array and pattern exercises include [`array.java`](./array.java), [`pair_array.java`](./pair_array.java), [`SumofArrayElements.java`](./SumofArrayElements.java), [`ProductUsingFunction.java`](./ProductUsingFunction.java), [`pattern_14.java`](./pattern_14.java), [`pattern_15.java`](./pattern_15.java), [`pattern_16.java`](./pattern_16.java), [`pattern_17.java`](./pattern_17.java), [`pattern_18.java`](./pattern_18.java), [`pattern_19.java`](./pattern_19.java), [`pattern_20.java`](./pattern_20.java), [`pattern_21.java`](./pattern_21.java), and [`star.java`](./star.java).

## How to use the solutions

1. Choose a problem from the index and open its Java source.
2. Read the method and any `main` example; compare the approach with the linked problem statement where provided.
3. Compile and run that file independently. Most sources are in the default package and are not part of a single application.
4. For online judges, copy or adapt the relevant method to the platform's required class name, signature, and input/output format.

Problem statements and constraints can change; use the linked platform page as the source of truth. Treat these programs as learning material and verify edge cases before relying on an implementation.

## References

- [LeetCode](https://leetcode.com/problemset/) — problem statements and practice
- [LeetCode Explore](https://leetcode.com/explore/) — guided learning cards and topic collections
- [Take U Forward / Striver A2Z DSA Course](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/) — structured DSA roadmap and practice sheet
- [GeeksforGeeks](https://www.geeksforgeeks.org/) — explanations and additional algorithm practice
- [Java Documentation](https://docs.oracle.com/en/java/) — official language and standard library documentation
