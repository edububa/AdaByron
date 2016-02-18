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

int main()
{

  return 0;
}
