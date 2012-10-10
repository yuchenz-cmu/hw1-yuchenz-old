
/* First created by JCasGen Wed Oct 10 00:21:18 EDT 2012 */
package edu.cmu.cs.lti.huskie;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Oct 10 00:21:18 EDT 2012
 * @generated */
public class GeneAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneAnnotation(addr, GeneAnnotation_Type.this);
  			   GeneAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneAnnotation(addr, GeneAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.lti.huskie.GeneAnnotation");
 
  /** @generated */
  final Feature casFeat_sentence_id;
  /** @generated */
  final int     casFeatCode_sentence_id;
  /** @generated */ 
  public String getSentence_id(int addr) {
        if (featOkTst && casFeat_sentence_id == null)
      jcas.throwFeatMissing("sentence_id", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_sentence_id);
  }
  /** @generated */    
  public void setSentence_id(int addr, String v) {
        if (featOkTst && casFeat_sentence_id == null)
      jcas.throwFeatMissing("sentence_id", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_sentence_id, v);}
    
  
 
  /** @generated */
  final Feature casFeat_gene;
  /** @generated */
  final int     casFeatCode_gene;
  /** @generated */ 
  public String getGene(int addr) {
        if (featOkTst && casFeat_gene == null)
      jcas.throwFeatMissing("gene", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_gene);
  }
  /** @generated */    
  public void setGene(int addr, String v) {
        if (featOkTst && casFeat_gene == null)
      jcas.throwFeatMissing("gene", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_gene, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sentence_id = jcas.getRequiredFeatureDE(casType, "sentence_id", "uima.cas.String", featOkTst);
    casFeatCode_sentence_id  = (null == casFeat_sentence_id) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sentence_id).getCode();

 
    casFeat_gene = jcas.getRequiredFeatureDE(casType, "gene", "uima.cas.String", featOkTst);
    casFeatCode_gene  = (null == casFeat_gene) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_gene).getCode();

  }
}



    