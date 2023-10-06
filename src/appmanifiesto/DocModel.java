package appmanifiesto;

import java.nio.file.Paths;

public class DocModel {
	static public String imgFilename = "image-cartaporte-vacia-SILOG.png";
	static public String pdfFilename = "image-cartaporte-vacia-SILOG.pdf";
	static public String imgFilepath;
	static public String pdfFilepath;
	static public String temporalPath;
	static public String resourcesPath;
	static public String docFilename;
	static public String docPdfFilename;
	static public String docJsonFilename;
	static public int fontLineSpacing;
	
	public static void initFilePaths () {
		temporalPath = Utils.getTemporalPath ("tmp-docsprinter");
		Utils.createFolder (temporalPath);
		imgFilepath = Paths.get (temporalPath, "resources",  imgFilename).toString ();
		pdfFilepath = Paths.get (temporalPath, "resources", pdfFilename).toString ();
		resourcesPath = Paths.get (temporalPath, "resources").toString ();
	}	
}
