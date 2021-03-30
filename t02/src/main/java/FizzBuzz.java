class FizzBuzz {
  public String fizzbuzz(int n) {
    if(n < 0) {
      throw new IllegalArgumentException();
    }
    StringBuilder builder = new StringBuilder();
    for(int i = 1; i <= n; i++) {
      final String value;
      if(i % 15 == 0){
        value = "fizzbuzz";
      } else if(i % 5 == 0) {
        value = "buzz";
      } else if(i % 3 == 0) {
        value = "fizz";
      } else {
        value = Integer.toString(i);
      }
      builder.append(value).append('\n');
    }
    return builder.length() > 0? builder.substring(0, builder.length() - 1): "";
  }
}
