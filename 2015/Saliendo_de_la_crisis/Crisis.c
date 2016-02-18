#include <stdio.h>

int main()
{
  int nDatos;
  scanf("%d", &nDatos);
  while (nDatos != 0) {
    int n0;
    scanf("%d", &n0);
    int r = 1;
    int i;
    for (i = 0; i < nDatos - 1; i++) {
      int n1;
      scanf("%d", &n1);
      if (n0 >= n1)
        r = 0;
      n0 = n1;
    }
    if (r == 1)
      printf("SI\n");
    else
      printf("NO\n");
    scanf("%d", &nDatos);
  }
}
