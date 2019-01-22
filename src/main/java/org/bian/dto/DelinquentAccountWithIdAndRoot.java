package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * DelinquentAccountWithIdAndRoot
 */
public class DelinquentAccountWithIdAndRoot   {
  private String cardDelinquentAccountProcessingReference = null;

  private String productInstanceReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String involvedPartyReference = null;

  private String involvedPartyObligationEntitlement = null;

  private String partyReference = null;

  private String cardType = null;

  private String cardAccountCurrency = null;

  private String secondaryBillingCurrency = null;

  private String cardAccountStatus = null;

  private String cardAccountLimits = null;

  private String configurationOptions = null;

  private String taxReference = null;

  private String billingTransactionReference = null;

  private String billingParameters = null;

  private String billingParty = null;

  private String billingAddress = null;

  private String billingPeriod = null;

  private String billingStatementReference = null;

  private String billingAmount = null;

  private String billingMinimumRequiredPayment = null;

  private String paymentDueDate = null;

  private String paymentTransactionReference = null;

  private String paymentTransaction = null;

  private String paymentInstallment = null;

  private String cardTransactionRecordReference = null;

  private String cardIssuingBankReference = null;

  private String merchantAcquiringBankReference = null;

  private String cardTransactionType = null;

  private String cardTransactionCurrency = null;

  private String cardTransactionAmountType = null;

  private String cardTransactionAmount = null;

  private String cardTransactionMerchantReference = null;

  private String cardTransactionLocationReference = null;

  private String cardTransactionProductServiceReference = null;

  private String cardTransactionDateTime = null;

  private String interestRateReference = null;

  private String interestRateConfiguration = null;

  private String applicableInterestRates = null;

  private String rateApplicationSchedule = null;

  private String feeReference = null;

  private String feeConfiguration = null;

  private String feeType = null;

  private String feeCharge = null;

  private String feeProjectionsCommitments = null;

  private String creditPlanReference = null;

  private String creditPlanType = null;

  private String creditPlanTerms = null;

  private String creditPlanAccount = null;

  private String cardDelinquentAccountProcessingSchedule = null;

  private Object cardDelinquentAccountProcessingRecord = null;


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
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return involvedPartyReference
  **/

  public String getInvolvedPartyReference() {
    return involvedPartyReference;
  }

  public void setInvolvedPartyReference(String involvedPartyReference) {
    this.involvedPartyReference = involvedPartyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  
   * @return involvedPartyObligationEntitlement
  **/

  public String getInvolvedPartyObligationEntitlement() {
    return involvedPartyObligationEntitlement;
  }

  public void setInvolvedPartyObligationEntitlement(String involvedPartyObligationEntitlement) {
    this.involvedPartyObligationEntitlement = involvedPartyObligationEntitlement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return partyReference
  **/

  public String getPartyReference() {
    return partyReference;
  }

  public void setPartyReference(String partyReference) {
    this.partyReference = partyReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardType
  **/

  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAccountCurrency
  **/

  public String getCardAccountCurrency() {
    return cardAccountCurrency;
  }

  public void setCardAccountCurrency(String cardAccountCurrency) {
    this.cardAccountCurrency = cardAccountCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return secondaryBillingCurrency
  **/

  public String getSecondaryBillingCurrency() {
    return secondaryBillingCurrency;
  }

  public void setSecondaryBillingCurrency(String secondaryBillingCurrency) {
    this.secondaryBillingCurrency = secondaryBillingCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAccountStatus
  **/

  public String getCardAccountStatus() {
    return cardAccountStatus;
  }

  public void setCardAccountStatus(String cardAccountStatus) {
    this.cardAccountStatus = cardAccountStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardAccountLimits
  **/

  public String getCardAccountLimits() {
    return cardAccountLimits;
  }

  public void setCardAccountLimits(String cardAccountLimits) {
    this.cardAccountLimits = cardAccountLimits;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return configurationOptions
  **/

  public String getConfigurationOptions() {
    return configurationOptions;
  }

  public void setConfigurationOptions(String configurationOptions) {
    this.configurationOptions = configurationOptions;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return billingTransactionReference
  **/

  public String getBillingTransactionReference() {
    return billingTransactionReference;
  }

  public void setBillingTransactionReference(String billingTransactionReference) {
    this.billingTransactionReference = billingTransactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return billingParameters
  **/

  public String getBillingParameters() {
    return billingParameters;
  }

  public void setBillingParameters(String billingParameters) {
    this.billingParameters = billingParameters;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return billingParty
  **/

  public String getBillingParty() {
    return billingParty;
  }

  public void setBillingParty(String billingParty) {
    this.billingParty = billingParty;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return billingAddress
  **/

  public String getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(String billingAddress) {
    this.billingAddress = billingAddress;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration  
   * @return billingPeriod
  **/

  public String getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(String billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return billingStatementReference
  **/

  public String getBillingStatementReference() {
    return billingStatementReference;
  }

  public void setBillingStatementReference(String billingStatementReference) {
    this.billingStatementReference = billingStatementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount     
   * @return billingAmount
  **/

  public String getBillingAmount() {
    return billingAmount;
  }

  public void setBillingAmount(String billingAmount) {
    this.billingAmount = billingAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return billingMinimumRequiredPayment
  **/

  public String getBillingMinimumRequiredPayment() {
    return billingMinimumRequiredPayment;
  }

  public void setBillingMinimumRequiredPayment(String billingMinimumRequiredPayment) {
    this.billingMinimumRequiredPayment = billingMinimumRequiredPayment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Date     
   * @return paymentDueDate
  **/

  public String getPaymentDueDate() {
    return paymentDueDate;
  }

  public void setPaymentDueDate(String paymentDueDate) {
    this.paymentDueDate = paymentDueDate;
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
   * @return paymentInstallment
  **/

  public String getPaymentInstallment() {
    return paymentInstallment;
  }

  public void setPaymentInstallment(String paymentInstallment) {
    this.paymentInstallment = paymentInstallment;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardTransactionRecordReference
  **/

  public String getCardTransactionRecordReference() {
    return cardTransactionRecordReference;
  }

  public void setCardTransactionRecordReference(String cardTransactionRecordReference) {
    this.cardTransactionRecordReference = cardTransactionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardIssuingBankReference
  **/

  public String getCardIssuingBankReference() {
    return cardIssuingBankReference;
  }

  public void setCardIssuingBankReference(String cardIssuingBankReference) {
    this.cardIssuingBankReference = cardIssuingBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return merchantAcquiringBankReference
  **/

  public String getMerchantAcquiringBankReference() {
    return merchantAcquiringBankReference;
  }

  public void setMerchantAcquiringBankReference(String merchantAcquiringBankReference) {
    this.merchantAcquiringBankReference = merchantAcquiringBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text              
   * @return cardTransactionType
  **/

  public String getCardTransactionType() {
    return cardTransactionType;
  }

  public void setCardTransactionType(String cardTransactionType) {
    this.cardTransactionType = cardTransactionType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardTransactionCurrency
  **/

  public String getCardTransactionCurrency() {
    return cardTransactionCurrency;
  }

  public void setCardTransactionCurrency(String cardTransactionCurrency) {
    this.cardTransactionCurrency = cardTransactionCurrency;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardTransactionAmountType
  **/

  public String getCardTransactionAmountType() {
    return cardTransactionAmountType;
  }

  public void setCardTransactionAmountType(String cardTransactionAmountType) {
    this.cardTransactionAmountType = cardTransactionAmountType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount 
   * @return cardTransactionAmount
  **/

  public String getCardTransactionAmount() {
    return cardTransactionAmount;
  }

  public void setCardTransactionAmount(String cardTransactionAmount) {
    this.cardTransactionAmount = cardTransactionAmount;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardTransactionMerchantReference
  **/

  public String getCardTransactionMerchantReference() {
    return cardTransactionMerchantReference;
  }

  public void setCardTransactionMerchantReference(String cardTransactionMerchantReference) {
    this.cardTransactionMerchantReference = cardTransactionMerchantReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return cardTransactionLocationReference
  **/

  public String getCardTransactionLocationReference() {
    return cardTransactionLocationReference;
  }

  public void setCardTransactionLocationReference(String cardTransactionLocationReference) {
    this.cardTransactionLocationReference = cardTransactionLocationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return cardTransactionProductServiceReference
  **/

  public String getCardTransactionProductServiceReference() {
    return cardTransactionProductServiceReference;
  }

  public void setCardTransactionProductServiceReference(String cardTransactionProductServiceReference) {
    this.cardTransactionProductServiceReference = cardTransactionProductServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime   
   * @return cardTransactionDateTime
  **/

  public String getCardTransactionDateTime() {
    return cardTransactionDateTime;
  }

  public void setCardTransactionDateTime(String cardTransactionDateTime) {
    this.cardTransactionDateTime = cardTransactionDateTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return interestRateReference
  **/

  public String getInterestRateReference() {
    return interestRateReference;
  }

  public void setInterestRateReference(String interestRateReference) {
    this.interestRateReference = interestRateReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return interestRateConfiguration
  **/

  public String getInterestRateConfiguration() {
    return interestRateConfiguration;
  }

  public void setInterestRateConfiguration(String interestRateConfiguration) {
    this.interestRateConfiguration = interestRateConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Rate   
   * @return applicableInterestRates
  **/

  public String getApplicableInterestRates() {
    return applicableInterestRates;
  }

  public void setApplicableInterestRates(String applicableInterestRates) {
    this.applicableInterestRates = applicableInterestRates;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return rateApplicationSchedule
  **/

  public String getRateApplicationSchedule() {
    return rateApplicationSchedule;
  }

  public void setRateApplicationSchedule(String rateApplicationSchedule) {
    this.rateApplicationSchedule = rateApplicationSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return feeReference
  **/

  public String getFeeReference() {
    return feeReference;
  }

  public void setFeeReference(String feeReference) {
    this.feeReference = feeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return feeConfiguration
  **/

  public String getFeeConfiguration() {
    return feeConfiguration;
  }

  public void setFeeConfiguration(String feeConfiguration) {
    this.feeConfiguration = feeConfiguration;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return feeType
  **/

  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount       
   * @return feeCharge
  **/

  public String getFeeCharge() {
    return feeCharge;
  }

  public void setFeeCharge(String feeCharge) {
    this.feeCharge = feeCharge;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return feeProjectionsCommitments
  **/

  public String getFeeProjectionsCommitments() {
    return feeProjectionsCommitments;
  }

  public void setFeeProjectionsCommitments(String feeProjectionsCommitments) {
    this.feeProjectionsCommitments = feeProjectionsCommitments;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return creditPlanReference
  **/

  public String getCreditPlanReference() {
    return creditPlanReference;
  }

  public void setCreditPlanReference(String creditPlanReference) {
    this.creditPlanReference = creditPlanReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return creditPlanType
  **/

  public String getCreditPlanType() {
    return creditPlanType;
  }

  public void setCreditPlanType(String creditPlanType) {
    this.creditPlanType = creditPlanType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return creditPlanTerms
  **/

  public String getCreditPlanTerms() {
    return creditPlanTerms;
  }

  public void setCreditPlanTerms(String creditPlanTerms) {
    this.creditPlanTerms = creditPlanTerms;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return creditPlanAccount
  **/

  public String getCreditPlanAccount() {
    return creditPlanAccount;
  }

  public void setCreditPlanAccount(String creditPlanAccount) {
    this.creditPlanAccount = creditPlanAccount;
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
   * @return cardDelinquentAccountProcessingRecord
  **/

  public Object getCardDelinquentAccountProcessingRecord() {
    return cardDelinquentAccountProcessingRecord;
  }

  public void setCardDelinquentAccountProcessingRecord(Object cardDelinquentAccountProcessingRecord) {
    this.cardDelinquentAccountProcessingRecord = cardDelinquentAccountProcessingRecord;
  }


}

