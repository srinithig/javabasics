package com.object;

public class StringExamples1 {
public StringExamples1() {
}
public static void main(String[] args) {
	String one = "Sri";
	String oneObj = new String("Sri");
	String two = "Sri";
	System.out.println(one == two);
	System.out.println(one.equals(two));
	System.out.println(one.equals(oneObj));
	System.out.println(one.hashCode());
	one = one + "nithi";
	System.out.println(one);
	System.out.println(one.hashCode());
System.out.println(one.concat(oneObj));
String s = "this,is,an,example";
String ss[] = s.split(",");
for (int i = 0; i<ss.length;i++) {
}
StringBuffer sb = new StringBuffer();
sb.append("jj");
sb.append("one");
sb.append("two");
System.out.println(sb);
StringBuilder sbuilder = new StringBuilder();
sbuilder.append("jj");
sbuilder.append("one");
sbuilder.append("two");
System.out.println(sbuilder);
}
}