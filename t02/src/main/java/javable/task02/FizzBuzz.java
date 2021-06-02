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
                    if(i == n) {
                        end = end.concat("fizzbuzz");
                    } else
                        end = end.concat("fizzbuzz\n");
                } else {
                    if(i == n) {
                        end = end.concat("fizz");
                    } else
                        end = end.concat("fizz\n");
                }
            } else if (i % 5 == 0) {
                if(i == n) {
                    end = end.concat("buzz");
                }
                end = end.concat("buzz\n");
            } else {
                if(i == n) {
                    end = end.concat(String.valueOf(i));
                }else
                    end = end.concat(String.valueOf(i) + "\n");
            }
        }

        return end;
    }
    }

