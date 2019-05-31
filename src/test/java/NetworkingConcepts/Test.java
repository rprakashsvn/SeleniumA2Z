package NetworkingConcepts;

import java.net.InetAddress;
import java.net.URL;

class Test {
	public static void main(String[] args) throws Exception {
		
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);

		address = InetAddress.getByName("www.studytonight.com");
		System.out.println(address);

		InetAddress sw[] = InetAddress.getAllByName("www.google.com");
		for (int i = 0; i < sw.length; i++) {
			System.out.println(sw[i]);
		}

		URL hp = new URL("http://www.studytonight.com/index");
		System.out.println(hp.getProtocol());
		System.out.println(hp.getHost());
		System.out.println(hp.getDefaultPort());
		System.out.println(hp.getPath());
	}
}
