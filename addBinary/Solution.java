package addBinary;


class Solution {
    public static String addBinary(String a, String b) {
        String output = "";
        String compare;
        int aTracer = a.length() - 1;
        int bTracer = b.length() - 1;
        String carry = "0";
        while (aTracer > -1 || bTracer > -1) {
            if (aTracer == -1) {
                if (carry.equals("0")) {
                    output = b.substring(0, bTracer+1) + output;
                    bTracer = -1;
                } else if (b.charAt(bTracer) == '1'){
                    output = '0'+ output;
                    carry = "1";
                    bTracer--;
                }
                else{
                    output = b.substring(0, bTracer)+carry+output;
                    bTracer = -1;
                    carry = "0";
                }

            } else if (bTracer == -1) {
                if (carry.equals("0")) {
                    output = a.substring(0, aTracer+1) + output;
                    aTracer = -1;
                } else if (a.charAt(aTracer) == '1'){
                    output = '0'+ output;
                    carry = "1";
                    aTracer--;
                }
                else{
                    output = a.substring(0, aTracer)+carry+output;
                    aTracer = -1;
                    carry ="0";
                }
            } else {
                compare = carry +a.substring(aTracer, aTracer + 1) + b.substring(bTracer, bTracer + 1);
                switch (compare) {
                    case "000":
                        carry = "0";
                        output = "0" + output;
                        aTracer--;
                        bTracer--;
                        break;
                    case "001":
                    case "010":
                    case "100":
                        carry = "0";
                        output = "1" + output;
                        aTracer--;
                        bTracer--;
                        break;
                    case "011":
                    case "110":
                    case "101":
                        carry = "1";
                        output = "0" + output;
                        aTracer--;
                        bTracer--;
                        break;
                    case "111":
                        carry = "1";
                        output = "1" + output;
                        aTracer--;
                        bTracer--;
                        break;
                }

            }
        }
        if(carry.equals("1")){
            return carry + output;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }
}