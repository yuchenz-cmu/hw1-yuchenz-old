package edu.cmu.cs.lti.huskie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import edu.cmu.cs.lti.huskie.GeneAnnotation;

public class HuskieGeneAnnotator extends JCasAnnotator_ImplBase {
  
  @Override
  public void process(JCas jcasIn) throws AnalysisEngineProcessException {
    // get the document text
    String docText = jcasIn.getDocumentText();
    String line = null;
    
    BufferedReader docTextRdr = new BufferedReader(new StringReader(docText));
    
    int currStart = 0;
    int sentence_id = 1;
    try {
      while ((line = docTextRdr.readLine()) != null) {
        // System.err.println("NEWLINE: " + line);
        
        GeneAnnotation geneAnnt = new GeneAnnotation(jcasIn);
        geneAnnt.setBegin(currStart);
        geneAnnt.setEnd(currStart + 1);
        geneAnnt.setGene("Dummy");
        geneAnnt.setSentence_id(String.format("%d", sentence_id));
        geneAnnt.addToIndexes();
        
        currStart += line.length() + 1;
        sentence_id++;
      }
    } catch (IOException e1) {
      System.err.println("Unable to read the next line from document text.");
    }

    
    try {
      docTextRdr.close();
    } catch (IOException e) {
      System.err.println("Unable to close document text reader.");
    }
  }
  
  public HuskieGeneAnnotator() {
    
  }

}
