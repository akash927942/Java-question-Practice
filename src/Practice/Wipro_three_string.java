package Practice;



public class Wipro_three_string {

    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            this.output1 = out1;
            this.output2 = out2;
            this.output3 = out3;
        }
    }

    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        // Local class with methods to split parts
        class Splitter {
            String getFront(String input) {
                int len = input.length();
                int partLen = len / 3;
                int remainder = len % 3;
                if (remainder == 0) {
                    return input.substring(0, partLen);
                } else if (remainder == 1) {
                    return input.substring(0, partLen);
                } else { // remainder == 2
                    return input.substring(0, partLen + 1);
                }
            }

            String getMiddle(String input) {
                int len = input.length();
                int partLen = len / 3;
                int remainder = len % 3;
                if (remainder == 0) {
                    return input.substring(partLen, 2 * partLen);
                } else if (remainder == 1) {
                    return input.substring(partLen, partLen + partLen + 1);
                } else { // remainder == 2
                    return input.substring(partLen + 1, 2 * partLen + 1);
                }
            }

            String getEnd(String input) {
                int len = input.length();
                int partLen = len / 3;
                int remainder = len % 3;
                if (remainder == 0) {
                    return input.substring(2 * partLen);
                } else if (remainder == 1) {
                    return input.substring(partLen + partLen + 1);
                } else { // remainder == 2
                    return input.substring(2 * partLen + 1);
                }
            }
        }

        Splitter splitter = new Splitter();

        String front1 = splitter.getFront(input1);
        String middle1 = splitter.getMiddle(input1);
        String end1 = splitter.getEnd(input1);

        String front2 = splitter.getFront(input2);
        String middle2 = splitter.getMiddle(input2);
        String end2 = splitter.getEnd(input2);

        String front3 = splitter.getFront(input3);
        String middle3 = splitter.getMiddle(input3);
        String end3 = splitter.getEnd(input3);

        // Create Output1, Output2, Output3
        String output1 = front1 + end2 + middle3;
        String output2 = middle1 + front2 + end3;
        String output3 = end1 + middle2 + front3;

        // Toggle the case of each character in Output3
        StringBuilder toggledOutput3 = new StringBuilder(output3.length());
        for (char c : output3.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledOutput3.append(Character.toLowerCase(c));
            } else {
                toggledOutput3.append(Character.toUpperCase(c));
            }
        }

        return new Result(output1, output2, toggledOutput3.toString());
    }

    public static void main(String[] args) {
        // Example usage
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";

        Result result = encodeThreeStrings(input1, input2, input3);
        System.out.println("Output1: " + result.output1);
        System.out.println("Output2: " + result.output2);
        System.out.println("Output3: " + result.output3);
    }
}

