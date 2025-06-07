
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
 * Details of an order in financial instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderData4", propOrder = {
    "submitgNtty",
    "drctElctrncAccs",
    "clntId",
    "invstmtDcsnPrsn",
    "exctgPrsn",
    "nonExctgBrkr",
    "tradgCpcty",
    "lqdtyPrvsnActvty",
    "ordrClssfctn",
    "ordrPrics",
    "instrData",
    "txData"
})
public class OrderData4 {

    @XmlElement(name = "SubmitgNtty")
    protected String submitgNtty;
    @XmlElement(name = "DrctElctrncAccs")
    protected Boolean drctElctrncAccs;
    @XmlElement(name = "ClntId")
    protected PersonOrOrganisation4Choice clntId;
    @XmlElement(name = "InvstmtDcsnPrsn")
    protected ExecutingParty2Choice invstmtDcsnPrsn;
    @XmlElement(name = "ExctgPrsn")
    protected ExecutingParty2Choice exctgPrsn;
    @XmlElement(name = "NonExctgBrkr")
    protected String nonExctgBrkr;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected RegulatoryTradingCapacity1Code tradgCpcty;
    @XmlElement(name = "LqdtyPrvsnActvty")
    protected Boolean lqdtyPrvsnActvty;
    @XmlElement(name = "OrdrClssfctn")
    protected OrderClassification2 ordrClssfctn;
    @XmlElement(name = "OrdrPrics")
    protected OrderPriceData2 ordrPrics;
    @XmlElement(name = "InstrData")
    protected OrderInstructionData2 instrData;
    @XmlElement(name = "TxData")
    protected TransactionData3 txData;

    /**
     * Gets the value of the submitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgNtty() {
        return submitgNtty;
    }

    /**
     * Sets the value of the submitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderData4 setSubmitgNtty(String value) {
        this.submitgNtty = value;
        return this;
    }

    /**
     * Gets the value of the drctElctrncAccs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctElctrncAccs() {
        return drctElctrncAccs;
    }

    /**
     * Sets the value of the drctElctrncAccs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderData4 setDrctElctrncAccs(Boolean value) {
        this.drctElctrncAccs = value;
        return this;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisation4Choice }
     *     
     */
    public PersonOrOrganisation4Choice getClntId() {
        return clntId;
    }

    /**
     * Sets the value of the clntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisation4Choice }
     *     
     */
    public OrderData4 setClntId(PersonOrOrganisation4Choice value) {
        this.clntId = value;
        return this;
    }

    /**
     * Gets the value of the invstmtDcsnPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public ExecutingParty2Choice getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    /**
     * Sets the value of the invstmtDcsnPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public OrderData4 setInvstmtDcsnPrsn(ExecutingParty2Choice value) {
        this.invstmtDcsnPrsn = value;
        return this;
    }

    /**
     * Gets the value of the exctgPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public ExecutingParty2Choice getExctgPrsn() {
        return exctgPrsn;
    }

    /**
     * Sets the value of the exctgPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public OrderData4 setExctgPrsn(ExecutingParty2Choice value) {
        this.exctgPrsn = value;
        return this;
    }

    /**
     * Gets the value of the nonExctgBrkr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonExctgBrkr() {
        return nonExctgBrkr;
    }

    /**
     * Sets the value of the nonExctgBrkr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderData4 setNonExctgBrkr(String value) {
        this.nonExctgBrkr = value;
        return this;
    }

    /**
     * Gets the value of the tradgCpcty property.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public RegulatoryTradingCapacity1Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Sets the value of the tradgCpcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public OrderData4 setTradgCpcty(RegulatoryTradingCapacity1Code value) {
        this.tradgCpcty = value;
        return this;
    }

    /**
     * Gets the value of the lqdtyPrvsnActvty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdtyPrvsnActvty() {
        return lqdtyPrvsnActvty;
    }

    /**
     * Sets the value of the lqdtyPrvsnActvty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public OrderData4 setLqdtyPrvsnActvty(Boolean value) {
        this.lqdtyPrvsnActvty = value;
        return this;
    }

    /**
     * Gets the value of the ordrClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link OrderClassification2 }
     *     
     */
    public OrderClassification2 getOrdrClssfctn() {
        return ordrClssfctn;
    }

    /**
     * Sets the value of the ordrClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClassification2 }
     *     
     */
    public OrderData4 setOrdrClssfctn(OrderClassification2 value) {
        this.ordrClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the ordrPrics property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPriceData2 }
     *     
     */
    public OrderPriceData2 getOrdrPrics() {
        return ordrPrics;
    }

    /**
     * Sets the value of the ordrPrics property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPriceData2 }
     *     
     */
    public OrderData4 setOrdrPrics(OrderPriceData2 value) {
        this.ordrPrics = value;
        return this;
    }

    /**
     * Gets the value of the instrData property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionData2 }
     *     
     */
    public OrderInstructionData2 getInstrData() {
        return instrData;
    }

    /**
     * Sets the value of the instrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionData2 }
     *     
     */
    public OrderData4 setInstrData(OrderInstructionData2 value) {
        this.instrData = value;
        return this;
    }

    /**
     * Gets the value of the txData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionData3 }
     *     
     */
    public TransactionData3 getTxData() {
        return txData;
    }

    /**
     * Sets the value of the txData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionData3 }
     *     
     */
    public OrderData4 setTxData(TransactionData3 value) {
        this.txData = value;
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
