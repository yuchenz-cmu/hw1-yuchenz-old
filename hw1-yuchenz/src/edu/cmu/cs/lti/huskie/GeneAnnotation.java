

/* First created by JCasGen Wed Oct 10 00:21:18 EDT 2012 */
package edu.cmu.cs.lti.huskie;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Oct 10 00:21:18 EDT 2012
 * XML source: /home/yuchenz/Documents/academics/2012fall/11-791 Software Engineering/workspace/hw1-yuchenz/hw1-yuchenz/descriptors/GeneAnnotatorTypeSystem.xml
 * @generated */
public class GeneAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: sentence_id

  /** getter for sentence_id - gets 
   * @generated */
  public String getSentence_id() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_sentence_id == null)
      jcasType.jcas.throwFeatMissing("sentence_id", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_sentence_id);}
    
  /** setter for sentence_id - sets  
   * @generated */
  public void setSentence_id(String v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_sentence_id == null)
      jcasType.jcas.throwFeatMissing("sentence_id", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_sentence_id, v);}    
   
    
  //*--------------*
  //* Feature: gene

  /** getter for gene - gets 
   * @generated */
  public String getGene() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_gene == null)
      jcasType.jcas.throwFeatMissing("gene", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_gene);}
    
  /** setter for gene - sets  
   * @generated */
  public void setGene(String v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_gene == null)
      jcasType.jcas.throwFeatMissing("gene", "edu.cmu.cs.lti.huskie.GeneAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_gene, v);}    
  }

    