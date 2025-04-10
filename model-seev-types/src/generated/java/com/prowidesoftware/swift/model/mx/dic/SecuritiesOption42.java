
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the corporate action security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesOption42", propOrder = {
    "finInstrmId",
    "cdtDbtInd",
    "tempFinInstrmInd",
    "newSctiesIssncInd",
    "pstngQty",
    "sfkpgPlc",
    "frctnDspstn",
    "ccyOptn",
    "dtDtls",
    "rateDtls",
    "pricDtls",
    "rcvgSttlmPties",
    "dlvrgSttlmPties"
})
public class SecuritiesOption42 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TempFinInstrmInd")
    protected TemporaryFinancialInstrumentIndicator1Choice tempFinInstrmInd;
    @XmlElement(name = "NewSctiesIssncInd")
    @XmlSchemaType(name = "string")
    protected NewSecuritiesIssuanceType3Code newSctiesIssncInd;
    @XmlElement(name = "PstngQty", required = true)
    protected Quantity6Choice pstngQty;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat3Choice sfkpgPlc;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType23Choice frctnDspstn;
    @XmlElement(name = "CcyOptn")
    protected String ccyOptn;
    @XmlElement(name = "DtDtls", required = true)
    protected SecurityDate6 dtDtls;
    @XmlElement(name = "RateDtls")
    protected CorporateActionRate49 rateDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice45 pricDtls;
    @XmlElement(name = "RcvgSttlmPties")
    protected SettlementParties24 rcvgSttlmPties;
    @XmlElement(name = "DlvrgSttlmPties")
    protected SettlementParties24 dlvrgSttlmPties;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecuritiesOption42 setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecuritiesOption42 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public TemporaryFinancialInstrumentIndicator1Choice getTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemporaryFinancialInstrumentIndicator1Choice }
     *     
     */
    public SecuritiesOption42 setTempFinInstrmInd(TemporaryFinancialInstrumentIndicator1Choice value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the newSctiesIssncInd property.
     * 
     * @return
     *     possible object is
     *     {@link NewSecuritiesIssuanceType3Code }
     *     
     */
    public NewSecuritiesIssuanceType3Code getNewSctiesIssncInd() {
        return newSctiesIssncInd;
    }

    /**
     * Sets the value of the newSctiesIssncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewSecuritiesIssuanceType3Code }
     *     
     */
    public SecuritiesOption42 setNewSctiesIssncInd(NewSecuritiesIssuanceType3Code value) {
        this.newSctiesIssncInd = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity6Choice }
     *     
     */
    public Quantity6Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity6Choice }
     *     
     */
    public SecuritiesOption42 setPstngQty(Quantity6Choice value) {
        this.pstngQty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public SafekeepingPlaceFormat3Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat3Choice }
     *     
     */
    public SecuritiesOption42 setSfkpgPlc(SafekeepingPlaceFormat3Choice value) {
        this.sfkpgPlc = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType23Choice }
     *     
     */
    public FractionDispositionType23Choice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType23Choice }
     *     
     */
    public SecuritiesOption42 setFrctnDspstn(FractionDispositionType23Choice value) {
        this.frctnDspstn = value;
        return this;
    }

    /**
     * Gets the value of the ccyOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyOptn() {
        return ccyOptn;
    }

    /**
     * Sets the value of the ccyOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesOption42 setCcyOptn(String value) {
        this.ccyOptn = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityDate6 }
     *     
     */
    public SecurityDate6 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDate6 }
     *     
     */
    public SecuritiesOption42 setDtDtls(SecurityDate6 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the rateDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionRate49 }
     *     
     */
    public CorporateActionRate49 getRateDtls() {
        return rateDtls;
    }

    /**
     * Sets the value of the rateDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionRate49 }
     *     
     */
    public SecuritiesOption42 setRateDtls(CorporateActionRate49 value) {
        this.rateDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice45 }
     *     
     */
    public CorporateActionPrice45 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice45 }
     *     
     */
    public SecuritiesOption42 setPricDtls(CorporateActionPrice45 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties24 }
     *     
     */
    public SettlementParties24 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Sets the value of the rcvgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties24 }
     *     
     */
    public SecuritiesOption42 setRcvgSttlmPties(SettlementParties24 value) {
        this.rcvgSttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties24 }
     *     
     */
    public SettlementParties24 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Sets the value of the dlvrgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties24 }
     *     
     */
    public SecuritiesOption42 setDlvrgSttlmPties(SettlementParties24 value) {
        this.dlvrgSttlmPties = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
