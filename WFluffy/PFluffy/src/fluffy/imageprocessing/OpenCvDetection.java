/**
 * @author romain.capocasa
 * @author jonas.freiburghaus
 * @author vincent.moulin1
 * Projet P2
 * Printemps 2019
 * He-arc
 */
package fluffy.imageprocessing;

import org.opencv.objdetect.CascadeClassifier;

/**
 * This class is used to initialize a Cascade classifier based on xml, with opencv
 */
public abstract class OpenCvDetection {
	
	public OpenCvDetection(String xmlModelFile) {
		this.xmlModelFile = xmlModelFile;
		this.classifier = new CascadeClassifier(this.xmlModelFile);
	}

	private String xmlModelFile;
	protected CascadeClassifier classifier;
}
