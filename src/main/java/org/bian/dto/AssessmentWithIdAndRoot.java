package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AssessmentWithIdAndRoot
 */
public class AssessmentWithIdAndRoot   {
  private String cardDeliquentAccountAssessmentTaskReference = null;

  private String cardDelinquentAccountProcessingReference = null;

  private String cardDelinquentAccountProcessingSchedule = null;

  private Object cardDeliquentAccountAssessmentRecord = null;

  private Object cardDelinquentAccountProcessingRecord = null;

  private Object cardDeliquentAccountAssessmentTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardDeliquentAccountAssessmentTaskReference
  **/

  public String getCardDeliquentAccountAssessmentTaskReference() {
    return cardDeliquentAccountAssessmentTaskReference;
  }

  public void setCardDeliquentAccountAssessmentTaskReference(String cardDeliquentAccountAssessmentTaskReference) {
    this.cardDeliquentAccountAssessmentTaskReference = cardDeliquentAccountAssessmentTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardDelinquentAccountProcessingReference
  **/

  public String getCardDelinquentAccountProcessingReference() {
    return cardDelinquentAccountProcessingReference;
  }

  public void setCardDelinquentAccountProcessingReference(String cardDelinquentAccountProcessingReference) {
    this.cardDelinquentAccountProcessingReference = cardDelinquentAccountProcessingReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text          
   * @return cardDelinquentAccountProcessingSchedule
  **/

  public String getCardDelinquentAccountProcessingSchedule() {
    return cardDelinquentAccountProcessingSchedule;
  }

  public void setCardDelinquentAccountProcessingSchedule(String cardDelinquentAccountProcessingSchedule) {
    this.cardDelinquentAccountProcessingSchedule = cardDelinquentAccountProcessingSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  
   * @return cardDeliquentAccountAssessmentRecord
  **/

  public Object getCardDeliquentAccountAssessmentRecord() {
    return cardDeliquentAccountAssessmentRecord;
  }

  public void setCardDeliquentAccountAssessmentRecord(Object cardDeliquentAccountAssessmentRecord) {
    this.cardDeliquentAccountAssessmentRecord = cardDeliquentAccountAssessmentRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  
   * @return cardDelinquentAccountProcessingRecord
  **/

  public Object getCardDelinquentAccountProcessingRecord() {
    return cardDelinquentAccountProcessingRecord;
  }

  public void setCardDelinquentAccountProcessingRecord(Object cardDelinquentAccountProcessingRecord) {
    this.cardDelinquentAccountProcessingRecord = cardDelinquentAccountProcessingRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return cardDeliquentAccountAssessmentTaskRecord
  **/

  public Object getCardDeliquentAccountAssessmentTaskRecord() {
    return cardDeliquentAccountAssessmentTaskRecord;
  }

  public void setCardDeliquentAccountAssessmentTaskRecord(Object cardDeliquentAccountAssessmentTaskRecord) {
    this.cardDeliquentAccountAssessmentTaskRecord = cardDeliquentAccountAssessmentTaskRecord;
  }


}

