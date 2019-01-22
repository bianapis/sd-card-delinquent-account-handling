package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ResolutionWithIdAndRoot
 */
public class ResolutionWithIdAndRoot   {
  private String cardDeliquentAccountResolutionTaskReference = null;

  private String cardDelinquentAccountProcessingReference = null;

  private String cardDelinquentAccountResolutionActionPlan = null;

  private String cardDelinquentAccountProcessingSchedule = null;

  private Object cardDeliquentAccountResolutionTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardDeliquentAccountResolutionTaskReference
  **/

  public String getCardDeliquentAccountResolutionTaskReference() {
    return cardDeliquentAccountResolutionTaskReference;
  }

  public void setCardDeliquentAccountResolutionTaskReference(String cardDeliquentAccountResolutionTaskReference) {
    this.cardDeliquentAccountResolutionTaskReference = cardDeliquentAccountResolutionTaskReference;
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
   * @return cardDelinquentAccountResolutionActionPlan
  **/

  public String getCardDelinquentAccountResolutionActionPlan() {
    return cardDelinquentAccountResolutionActionPlan;
  }

  public void setCardDelinquentAccountResolutionActionPlan(String cardDelinquentAccountResolutionActionPlan) {
    this.cardDelinquentAccountResolutionActionPlan = cardDelinquentAccountResolutionActionPlan;
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
   * @return cardDeliquentAccountResolutionTaskRecord
  **/

  public Object getCardDeliquentAccountResolutionTaskRecord() {
    return cardDeliquentAccountResolutionTaskRecord;
  }

  public void setCardDeliquentAccountResolutionTaskRecord(Object cardDeliquentAccountResolutionTaskRecord) {
    this.cardDeliquentAccountResolutionTaskRecord = cardDeliquentAccountResolutionTaskRecord;
  }


}

