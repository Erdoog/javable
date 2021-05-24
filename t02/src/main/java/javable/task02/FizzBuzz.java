package javable.task02;

class FizzBuzz {
    public String fizzbuzz(int n) {
        String end = "";
        if (n == -1){
            throw new IllegalArgumentException("");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    end = end.concat("fizzbuzz\n");
                } else {
                    end = end.concat("fizz\n");
                }
            } else if (i % 5 == 0) {
                end = end.concat("buzz\n");
            } else
            end = end.concat(String.valueOf(i)+"\n");
        }

        return end;
    }
    }

