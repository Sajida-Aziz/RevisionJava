package Revision;

public class StringExamples {

	public static void main(String[] args) {
    String str="saj";
    String str1=str;
    StringBuffer strb=new StringBuffer("i m in stingbuffer");
    StringBuilder strbl=new StringBuilder("Iam in stringbuilder");
    System.out.println(str+"ida");
    System.out.println(str1);
    System.out.println(strb);
    strb.append(str1);
    System.out.println(strb);
    System.out.println(strbl.append("added"));
    System.out.println(strbl);

	}

}
