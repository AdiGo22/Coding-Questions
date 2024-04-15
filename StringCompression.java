class Solution {
    public int compress(char[] chars) {
        int write = 0; // Pointer to the current position in the result array.
        int anchor = 0; // Pointer to the start of a group of consecutive characters.

        for (int read = 0; read < chars.length; read++) {
            if (read == chars.length - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[anchor]; // Store the character.

                int count = read - anchor + 1;
                if (count > 1) {
                    char[] countChars = String.valueOf(count).toCharArray();
                    for (char c : countChars) {
                        chars[write++] = c; // Store the count as characters.
                    }
                }

                anchor = read + 1; // Move the anchor to the next group.
            }
        }

        return write;
    }
}


class Solution {
  public int compress(char[] chars) {
    int ans = 0; // keep track of current position in compressed array

    // iterate through input array using i pointer
    for (int i = 0; i < chars.length;) {
      char letter = chars[i]; // current character being compressed
      int count = 0; // count of consecutive occurrences of letter

      // count consecutive occurrences of letter in input array
      while (i < chars.length && chars[i] == letter) {
        ++count;
        ++i;
      }

      // write letter to compressed array
      chars[ans++] = letter;

      // if count is greater than 1, write count as string to compressed array
      if (count > 1) {
        // convert count to string and iterate over each character in string
        for ( char c : String.valueOf(count).toCharArray()) {
          chars[ans++] = c;
        }
      }
    }

    // return length of compressed array
    return ans;
  }
}