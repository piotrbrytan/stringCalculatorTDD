public class Calculator {
    public int add(String numbers) {
        int ret = 0;

        if(numbers.isEmpty()) {
            ret = 0;
        } else {
            String separate[] = numbers.split(",|\n");

            try {
                for(String n : separate) {
                    ret += Integer.parseInt(n);
                }
            } catch (NumberFormatException e) {
                ret = 0;
            }
        }

        return ret;
    }
}
