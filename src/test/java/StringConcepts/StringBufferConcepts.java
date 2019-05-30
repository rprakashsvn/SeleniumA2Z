package StringConcepts;

public class StringBufferConcepts {

	int j;
	int x;

	public void assign(int x) {
		//x = x;
		System.out.println(this.x);
	}

	public void Test(int n) {
		System.out.println(x = n); // line 6
	}

	public static void main(String[] args) {

		String str = "Study";
		str.concat("Tonight");
		System.out.println(str); // Output: study

		StringBuffer strB = new StringBuffer("study");
		strB.append("java");
		System.out.println(strB); // Output: studytonight

		StringBuffer sb = new StringBuffer("Pandian");
		System.out.println(sb);
		sb.append("Prakash");
		System.out.println(sb);
		sb.append(5);
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);

		System.out.println("Reverse String");
		StringBuffer rev = new StringBuffer("Pandian");
		rev.reverse();
		System.out.println(rev);
		System.out.println(rev.capacity());

		new StringBufferConcepts().assign(100);

		StringBufferConcepts n = new StringBufferConcepts(); // line 10
		sb.append(n);

	}

}
