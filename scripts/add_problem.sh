#!/bin/bash

# Usage: ./add_problem.sh "Problem Name"
# Example: ./add_problem.sh "Trapping Rain Water"

if [ $# -lt 1 ]; then
  echo "Usage: $0 \"problem name\""
  exit 1
fi

NAME="$1"
# Auto-generate next problem number
BASE_DIR="src/main/java/leetcode"
mkdir -p "$BASE_DIR"

# Count existing problems
COUNT=$(find "$BASE_DIR" -maxdepth 1 -type d -name 'problem*' | wc -l)
NEXT_NUM=$(printf "%04d" $((COUNT + 1)))

# Sanitize problem name
CLEAN_NAME=$(echo "$NAME" | tr '[:upper:]' '[:lower:]' | tr ' ' '_' | tr -cd 'a-z0-9_')

PACKAGE="problem${NEXT_NUM}_${CLEAN_NAME}"
DIR="${BASE_DIR}/${PACKAGE}"

# Create folder and file
mkdir -p "$DIR"
FILE="${DIR}/Solution.java"

cat > "$FILE" <<EOF
package main.java.leetcode.${PACKAGE};

public class Solution {
    public void solve() {
        // TODO: Implement ${NAME}
    }

    public static void main(String[] args) {}
}
EOF

echo "✅ Created: ${FILE}"
