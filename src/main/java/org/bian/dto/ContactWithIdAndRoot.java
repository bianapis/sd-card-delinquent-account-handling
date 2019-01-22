package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ContactWithIdAndRoot
 */
public class ContactWithIdAndRoot   {
  private String cardDeliquentAccountContactTaskReference = null;

  private String cardDelinquentAccountProcessingReference = null;

  private String cardDelinquentAccountProcessingSchedule = null;

  private String correspondenceReference = null;

  private String correspondenceContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private String contactReference = null;

  private Object cardDeliquentAccountContacttRecord = null;

  private Object cardDelinquentAccountProcessingRecord = null;

  private Object cardDeliquentAccountContactTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardDeliquentAccountContactTaskReference
  **/

  public String getCardDeliquentAccountContactTaskReference() {
    return cardDeliquentAccountContactTaskReference;
  }

  public void setCardDeliquentAccountContactTaskReference(String cardDeliquentAccountContactTaskReference) {
    this.cardDeliquentAccountContactTaskReference = cardDeliquentAccountContactTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  
   * @return cardDeliquentAccountContacttRecord
  **/

  public Object getCardDeliquentAccountContacttRecord() {
    return cardDeliquentAccountContacttRecord;
  }

  public void setCardDeliquentAccountContacttRecord(Object cardDeliquentAccountContacttRecord) {
    this.cardDeliquentAccountContacttRecord = cardDeliquentAccountContacttRecord;
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
   * @return cardDeliquentAccountContactTaskRecord
  **/

  public Object getCardDeliquentAccountContactTaskRecord() {
    return cardDeliquentAccountContactTaskRecord;
  }

  public void setCardDeliquentAccountContactTaskRecord(Object cardDeliquentAccountContactTaskRecord) {
    this.cardDeliquentAccountContactTaskRecord = cardDeliquentAccountContactTaskRecord;
  }


}

