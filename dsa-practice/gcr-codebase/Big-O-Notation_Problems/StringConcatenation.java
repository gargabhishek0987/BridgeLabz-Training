public class StringConcatenation {
    public static void main(String[] args) {
        String str1="hello ", str2="world";
        StringBuilder sb1=new StringBuilder(str1);
        StringBuilder sb2=new StringBuilder(str2);

        StringBuffer buffer1=new StringBuffer(str1);
        StringBuffer buffer2=new StringBuffer(str2);
        long startString=System.nanoTime();
        String ans=str1+str2;
        long endString=System.nanoTime();

        long startBuilder=System.nanoTime();
        sb1.append(sb2);
        long endBuilder=System.nanoTime();

        long startBuffer=System.nanoTime();
        buffer1.append(buffer2);
        long endBuffer=System.nanoTime();

        System.out.println("String: "+(endString-startString));
        System.out.println("String Builder: "+(endBuilder-startBuilder)) ;
        System.out.println("String Buffer: "+(endBuffer-startBuffer));
    }
}
