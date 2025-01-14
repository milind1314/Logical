# Reverse Words in String

This project solves the problem of reversing the words in a given string while ensuring that:

- There is exactly one space between words.
- There are no leading or trailing spaces.
- Multiple spaces between words or around the string are removed.

## Problem Description

You are given a string `str` of length `N`. Your task is to reverse the original string word by word. There can be multiple spaces between two words, and there can be leading or trailing spaces. The output reversed string should contain a single space between words and should not have leading or trailing spaces.

### Input:
- A string `str` with length `N` (0 <= N <= 10^5).

### Output:
- A new string where the words are reversed with exactly one space between them and no leading or trailing spaces.

### Constraints:
- Time limit: 1 second.
- Memory limit: 256 MB.

### Example 1:

**Explanation:**
The string is reversed word by word, and the leading and trailing spaces are removed.

## Approach

1. **Trimming spaces**: First, we trim any leading and trailing spaces in the given string.
2. **Splitting words**: Split the string by spaces, handling any number of spaces between words.
3. **Reversing words**: Reverse the order of the words in the list.
4. **Join the words**: Join the words using a single space.

## Steps to Solve

1. Trim the input string to remove leading and trailing spaces.
2. Split the string into a list of words, removing extra spaces between them.
3. Reverse the list of words.
4. Join the words back together with a single space.
