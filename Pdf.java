import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class PDFCreator {

	public static int NUMLINES = 58;
//	public static final int NUMLINES_HEADER = 56;

	// static parts
	public static final String BEGIN = "%PDF-1.4\n";
	public static final String OBJECT2 = "2 0 obj\n<< /Type /Catalog\n/Pages 3 0 R\n>>\nendobj\n";
	public static final String OBJECT3 = "3 0 obj\n<< /Type /Pages\n/MediaBox "
			+ "[0 0 595 842]\n/Resources\n<< /Font << /F1 4 0 R >>\n  /ProcSet "
			+ "[/PDF /Text]\n>>\n/Kids []\n /Count  \n>>\nendobj\n";
	public static final String OBJECT4 = "4 0 obj\n<< /Type /Font\n/Subtype "
			+ "/Type1\n/BaseFont /Helvetica\n/Encoding /WinAnsiEncoding\n>>\nendobj\n";

	// dynamic parts
	public static final String OBJECT5 = "5 0 obj\n<< /Type /Page\n/Parent 3 0 "
			+ "R\n/Contents 6 0 R\n>>\nendobj";

	public static final String REFTAB = "xref\n0 7\n0000000000 65535 f "
			+ "\n0000000009 00000 n \n0000000050 00000 n \n0000000102 00000 n "
			+ "\n0000000268 00000 n \n0000000374 00000 n \n0000000443 00000 n \n";

	public static final String TRAILER = "trailer\n<< /Size 7\n/Info 1 0 R\n/Root 2 0 R\n>>\n";

	// global flag for method createPDFMulti(...)
	// this flag will be set in the method createContentObject(...) 
	public static boolean headerFlag = false;
  
  @Before
	public void setUp() throws Exception {
	}

//	@Test
//	public void testGenerateLines() {
//		String content = "hhijijdiedih1\n2fssssqqejsksllskakkdllslssjaalalksksksjskskaklskjsjsslslsskssffddddd\n" +
//				"ffmmfdd,,s,smdmmfjdjsjkala28291mdlwooqoo2933llslalalalkksllalalalakakaa";
//		ArrayList<String> lines = PDFCreator.generateLines(content);
//		for (String line : lines) {
//			System.out.println(line);
//		}
//	}
	
	@Test
	public void testCreateRefTab() {
		String datName = "testFile.txt";
		String content = "";
		File file = new File(datName);
}
  
  
