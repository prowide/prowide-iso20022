
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding corporate action reorganisation instruction details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReorganisationInstructionSD5", propOrder = {
    "plcAndNm",
    "txTp",
    "txSeq",
    "ttlOvrsbcptQty",
    "ackDtls",
    "ctctPrsn",
    "usrRefNb",
    "warrtSbcptChrgAmt",
    "nonXmptInstrsAllwdInd",
    "slctnFeeInd",
    "cert",
    "dcsdBnfclOwnrDtls"
})
public class ReorganisationInstructionSD5 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "TxTp")
    @XmlSchemaType(name = "string")
    protected ReorganisationTransactionType2Code txTp;
    @XmlElement(name = "TxSeq")
    protected List<InstructionsTransactionsSequence1> txSeq;
    @XmlElement(name = "TtlOvrsbcptQty")
    protected FinancialInstrumentQuantity4 ttlOvrsbcptQty;
    @XmlElement(name = "AckDtls")
    protected CorporateActionAcknowledgementSD1 ackDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification5 ctctPrsn;
    @XmlElement(name = "UsrRefNb")
    protected String usrRefNb;
    @XmlElement(name = "WarrtSbcptChrgAmt")
    protected RestrictedFINActiveCurrencyAndAmount warrtSbcptChrgAmt;
    @XmlElement(name = "NonXmptInstrsAllwdInd")
    protected Boolean nonXmptInstrsAllwdInd;
    @XmlElement(name = "SlctnFeeInd")
    protected Boolean slctnFeeInd;
    @XmlElement(name = "Cert")
    protected CorporateActionCertificateSD1 cert;
    @XmlElement(name = "DcsdBnfclOwnrDtls")
    protected DeceasedStatusSD1 dcsdBnfclOwnrDtls;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD5 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReorganisationTransactionType2Code }
     *     
     */
    public ReorganisationTransactionType2Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReorganisationTransactionType2Code }
     *     
     */
    public ReorganisationInstructionSD5 setTxTp(ReorganisationTransactionType2Code value) {
        this.txTp = value;
        return this;
    }

    /**
     * Gets the value of the txSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionsTransactionsSequence1 }
     * 
     * 
     * @return
     *     The value of the txSeq property.
     */
    public List<InstructionsTransactionsSequence1> getTxSeq() {
        if (txSeq == null) {
            txSeq = new ArrayList<>();
        }
        return this.txSeq;
    }

    /**
     * Gets the value of the ttlOvrsbcptQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public FinancialInstrumentQuantity4 getTtlOvrsbcptQty() {
        return ttlOvrsbcptQty;
    }

    /**
     * Sets the value of the ttlOvrsbcptQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4 }
     *     
     */
    public ReorganisationInstructionSD5 setTtlOvrsbcptQty(FinancialInstrumentQuantity4 value) {
        this.ttlOvrsbcptQty = value;
        return this;
    }

    /**
     * Gets the value of the ackDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionAcknowledgementSD1 }
     *     
     */
    public CorporateActionAcknowledgementSD1 getAckDtls() {
        return ackDtls;
    }

    /**
     * Sets the value of the ackDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionAcknowledgementSD1 }
     *     
     */
    public ReorganisationInstructionSD5 setAckDtls(CorporateActionAcknowledgementSD1 value) {
        this.ackDtls = value;
        return this;
    }

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification5 }
     *     
     */
    public ContactIdentification5 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification5 }
     *     
     */
    public ReorganisationInstructionSD5 setCtctPrsn(ContactIdentification5 value) {
        this.ctctPrsn = value;
        return this;
    }

    /**
     * Gets the value of the usrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrRefNb() {
        return usrRefNb;
    }

    /**
     * Sets the value of the usrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReorganisationInstructionSD5 setUsrRefNb(String value) {
        this.usrRefNb = value;
        return this;
    }

    /**
     * Gets the value of the warrtSbcptChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAndAmount getWarrtSbcptChrgAmt() {
        return warrtSbcptChrgAmt;
    }

    /**
     * Sets the value of the warrtSbcptChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAndAmount }
     *     
     */
    public ReorganisationInstructionSD5 setWarrtSbcptChrgAmt(RestrictedFINActiveCurrencyAndAmount value) {
        this.warrtSbcptChrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the nonXmptInstrsAllwdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonXmptInstrsAllwdInd() {
        return nonXmptInstrsAllwdInd;
    }

    /**
     * Sets the value of the nonXmptInstrsAllwdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReorganisationInstructionSD5 setNonXmptInstrsAllwdInd(Boolean value) {
        this.nonXmptInstrsAllwdInd = value;
        return this;
    }

    /**
     * Gets the value of the slctnFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlctnFeeInd() {
        return slctnFeeInd;
    }

    /**
     * Sets the value of the slctnFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ReorganisationInstructionSD5 setSlctnFeeInd(Boolean value) {
        this.slctnFeeInd = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCertificateSD1 }
     *     
     */
    public CorporateActionCertificateSD1 getCert() {
        return cert;
    }

    /**
     * Sets the value of the cert property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCertificateSD1 }
     *     
     */
    public ReorganisationInstructionSD5 setCert(CorporateActionCertificateSD1 value) {
        this.cert = value;
        return this;
    }

    /**
     * Gets the value of the dcsdBnfclOwnrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedStatusSD1 }
     *     
     */
    public DeceasedStatusSD1 getDcsdBnfclOwnrDtls() {
        return dcsdBnfclOwnrDtls;
    }

    /**
     * Sets the value of the dcsdBnfclOwnrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedStatusSD1 }
     *     
     */
    public ReorganisationInstructionSD5 setDcsdBnfclOwnrDtls(DeceasedStatusSD1 value) {
        this.dcsdBnfclOwnrDtls = value;
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

    /**
     * Adds a new item to the txSeq list.
     * @see #getTxSeq()
     * 
     */
    public ReorganisationInstructionSD5 addTxSeq(InstructionsTransactionsSequence1 txSeq) {
        getTxSeq().add(txSeq);
        return this;
    }

}
