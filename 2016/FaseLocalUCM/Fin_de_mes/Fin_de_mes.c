#include <stdio.h>

int main() {
  int n;
  scanf("%i", &n);
  while (n > 0) {
    int a;
    int b;
    scanf("%i %i", &a, &b);
    if (a + b >= 0) {
      printf("SI\n");
    } else
      printf("NO\n");
    n--;
  }
}
