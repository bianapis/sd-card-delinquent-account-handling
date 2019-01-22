package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PaymentWithIdAndRoot
 */
public class PaymentWithIdAndRoot   {
  private String cardDeliquentAccountPaymentNotificationTaskReference = null;

  private String cardDelinquentAccountProcessingReference = null;

  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private String cardDelinquentAccountProcessingSchedule = null;

  private Object cardDeliquentAccountPaymentNotificationTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardDeliquentAccountPaymentNotificationTaskReference
  **/

  public String getCardDeliquentAccountPaymentNotificationTaskReference() {
    return cardDeliquentAccountPaymentNotificationTaskReference;
  }

  public void setCardDeliquentAccountPaymentNotificationTaskReference(String cardDeliquentAccountPaymentNotificationTaskReference) {
    this.cardDeliquentAccountPaymentNotificationTaskReference = cardDeliquentAccountPaymentNotificationTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return paymentTransactionReference
  **/

  public String getPaymentTransactionReference() {
    return paymentTransactionReference;
  }

  public void setPaymentTransactionReference(String paymentTransactionReference) {
    this.paymentTransactionReference = paymentTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return paymentTransaction
  **/

  public String getPaymentTransaction() {
    return paymentTransaction;
  }

  public void setPaymentTransaction(String paymentTransaction) {
    this.paymentTransaction = paymentTransaction;
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
   * @return cardDeliquentAccountPaymentNotificationTaskRecord
  **/

  public Object getCardDeliquentAccountPaymentNotificationTaskRecord() {
    return cardDeliquentAccountPaymentNotificationTaskRecord;
  }

  public void setCardDeliquentAccountPaymentNotificationTaskRecord(Object cardDeliquentAccountPaymentNotificationTaskRecord) {
    this.cardDeliquentAccountPaymentNotificationTaskRecord = cardDeliquentAccountPaymentNotificationTaskRecord;
  }


}

