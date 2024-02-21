public class stringClass {
    public static void main(String[] args){
        String s1 = "Shahhabuddin Akhon";
        String s2;
        s2 = new String(" Hridoy");
        String s3 = s1.concat(s2);
        System.out.println("Full name: "+s3);
        System.out.println(s3.toUpperCase());
        String s4= s1.replace('S','h');
        System.out.println(s4);
        String[] s5 = s3.split(" ");
        for(String x:s5){
            System.out.println(x);
        }

        StringBuffer sb = new StringBuffer("sha");
        sb.repeat("dfd",3);
        System.out.println(sb);
        sb.append(" akhon ");
        sb.append(34);
        System.out.println(sb);
        int k=90;
        Integer y = Integer.valueOf(k);
        System.out.println(y);
        //int to string
        String s = Integer.toString(k);
        System.out.println("S: "+s);

        //string to int
        String t = "34";
        int p = Integer.parseInt(t);
    }
}
