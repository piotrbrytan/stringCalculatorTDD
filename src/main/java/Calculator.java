public class Calculator {
    public int add(String numbers) {
        int ret = 0;

        if(numbers.isEmpty()) {
            ret = 0;
        } else {
            String separate[];
            String delimiter = null;

            if(numbers.startsWith("//")) {
                delimiter = Character.toString(numbers.charAt(2));  //delimiter position
                numbers = numbers.substring(4);                     //delete four chars from beginning
                separate = numbers.split(""+delimiter+"|\n");
            } else {
                separate = numbers.split(",|\n");
            }

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
