package javable.task02;

class FizzBuzz {
    public String fizzbuzz(int n) {
        StringBuilder end = new StringBuilder("");
        if (n < 0){
            throw new IllegalArgumentException("");
        }
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    if(i == n) {
                        end.append("fizzbuzz");
                    } else
                        end.append("fizzbuzz\n");
                } else {
                    if(i == n) {
                        end.append("fizz");
                    } else
                        end.append("fizz\n");
                }
            } else if (i % 5 == 0) {
                if(i == n) {
                    end.append("buzz");
                }
                end.append("buzz\n");
            } else {
                if(i == n) {
                    end.append(String.valueOf(i));
                }else
                    end.append(String.valueOf(i) + "\n");
            }
        }
        String singleString = end.toString();
        return singleString;
    }
    }

