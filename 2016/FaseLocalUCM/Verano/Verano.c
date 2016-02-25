#include <stdio.h>

int MCD(int a, int b) {
  int r;
  int c;
  if (a == 0)
    return b;
  if (b == 0)
    return a;
  if (a > b) {
    c = a / b;
    r = a % b;
    if (c != 0) {
      a = MCD(b, r);
    }
  }
  if (a < b) {
    c = b / a;
    r = b % a;
    if (c != 0) {
      a = MCD(a, r);
    }
  }
  return a;
}

int main() {
  int first;
  scanf("%d", &first);
  while (first != 0) {
    int second = first;
    int total = 0;
    int mcd = 0;
    while (second != 0) {
      mcd = MCD (mcd, second);
      total += second;
      scanf("%d", &second);
    }
    printf("%d\n", total/mcd);
    scanf("%d", &first);
  }
  return 0;
}
