package javable.task02;

class FizzBuzz {
    public String fizzbuzz(int n) {
        StringBuilder end = new StringBuilder("");
        if (n < 0){
            throw new IllegalArgumentException("argument should be greater than zero")
        }
        for (int i = 1; i <= n; i++) {
            if(i % 5 == 0) && (i % 3 == 0) {
                end.append("fizzbuzz");
            } else if (i % 5 == 0) {
                end.append("buzz");
            } else if (i % 3 == 0) {
                end.append("fizz");
            } else {
                end.append(String.valueOf(i));
            }
            end.append(i < n? "\n": "")
        }
        return end.toString();
    }
}
