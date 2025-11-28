package gr.aueb.cf.cf9.ch7;

public class StringContains {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

       // if (s.contains("Economics")) System.out.println("Bingo");

        index = s.indexOf("t");
        System.out.println("Start index of 't':" + index);

        index = s.lastIndexOf("t");
        System.out.println("Last index of 't' :" + index);

        index = s.indexOf('s',7);
        System.out.println("Start index of 's' :" + index);

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }

        }
    }

