//Victor Quan
//COP 3503C
//Vi705465

import java.io.*;
import java.util.*;

class RunLikeHell {
public static int maxGain(int [] blocks) {
  int length = blocks.length;
  int [] memo = new int[length];
  // Initialize the solutions array with the first three answers
  // we will build off of
  memo[0] = blocks[0];
  memo[1] = blocks[1];
  memo[2] = blocks[0] + blocks[2];
  // Set a max variable and update it as we add values to the memo array
  // If we see a new max sum, update appropriately
  int max = memo[2];
  // For loop the iterate through the blocks array.
  // Take the max sum we already saw in the memo[i-2] and memo[i-3] and build off of that
  for (int i = 3; i < length; i++) {
    memo[i] = blocks[i] + Math.max(memo[i-2], memo[i-3]);
  // Update the max if the newest element in memo is higher than previous max
    if (memo[i] > max)
      max = memo[i];
  }
  return max;
}

public static double difficultyRating() {
  return 3.0;
}

public static double hoursSpent() {
  return 3.0;
}
}
