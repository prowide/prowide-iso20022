
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Data to request to card data acquisition.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAcquisitionRequest3", propOrder = {
    "saleTxId",
    "allwdPmtBrnd",
    "allwdLltyBrnd",
    "forceCstmrSelctnFlg",
    "ttlAmt",
    "pmtTp",
    "cshBckFlg",
    "saleToPOIData",
    "saleToAcqrrData",
    "saleToIssrData"
})
public class CardAcquisitionRequest3 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "AllwdPmtBrnd")
    protected List<String> allwdPmtBrnd;
    @XmlElement(name = "AllwdLltyBrnd")
    protected List<String> allwdLltyBrnd;
    @XmlElement(name = "ForceCstmrSelctnFlg")
    protected Boolean forceCstmrSelctnFlg;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "PmtTp")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType13Code pmtTp;
    @XmlElement(name = "CshBckFlg")
    protected Boolean cshBckFlg;
    @XmlElement(name = "SaleToPOIData")
    protected String saleToPOIData;
    @XmlElement(name = "SaleToAcqrrData")
    protected String saleToAcqrrData;
    @XmlElement(name = "SaleToIssrData")
    protected String saleToIssrData;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public CardAcquisitionRequest3 setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
        return this;
    }

    /**
     * Gets the value of the allwdPmtBrnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdPmtBrnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPmtBrnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllwdPmtBrnd() {
        if (allwdPmtBrnd == null) {
            allwdPmtBrnd = new ArrayList<String>();
        }
        return this.allwdPmtBrnd;
    }

    /**
     * Gets the value of the allwdLltyBrnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdLltyBrnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdLltyBrnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllwdLltyBrnd() {
        if (allwdLltyBrnd == null) {
            allwdLltyBrnd = new ArrayList<String>();
        }
        return this.allwdLltyBrnd;
    }

    /**
     * Gets the value of the forceCstmrSelctnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceCstmrSelctnFlg() {
        return forceCstmrSelctnFlg;
    }

    /**
     * Sets the value of the forceCstmrSelctnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardAcquisitionRequest3 setForceCstmrSelctnFlg(Boolean value) {
        this.forceCstmrSelctnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardAcquisitionRequest3 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType13Code }
     *     
     */
    public CardPaymentServiceType13Code getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType13Code }
     *     
     */
    public CardAcquisitionRequest3 setPmtTp(CardPaymentServiceType13Code value) {
        this.pmtTp = value;
        return this;
    }

    /**
     * Gets the value of the cshBckFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshBckFlg() {
        return cshBckFlg;
    }

    /**
     * Sets the value of the cshBckFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CardAcquisitionRequest3 setCshBckFlg(Boolean value) {
        this.cshBckFlg = value;
        return this;
    }

    /**
     * Gets the value of the saleToPOIData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToPOIData() {
        return saleToPOIData;
    }

    /**
     * Sets the value of the saleToPOIData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAcquisitionRequest3 setSaleToPOIData(String value) {
        this.saleToPOIData = value;
        return this;
    }

    /**
     * Gets the value of the saleToAcqrrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToAcqrrData() {
        return saleToAcqrrData;
    }

    /**
     * Sets the value of the saleToAcqrrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAcquisitionRequest3 setSaleToAcqrrData(String value) {
        this.saleToAcqrrData = value;
        return this;
    }

    /**
     * Gets the value of the saleToIssrData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleToIssrData() {
        return saleToIssrData;
    }

    /**
     * Sets the value of the saleToIssrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardAcquisitionRequest3 setSaleToIssrData(String value) {
        this.saleToIssrData = value;
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
     * Adds a new item to the allwdPmtBrnd list.
     * @see #getAllwdPmtBrnd()
     * 
     */
    public CardAcquisitionRequest3 addAllwdPmtBrnd(String allwdPmtBrnd) {
        getAllwdPmtBrnd().add(allwdPmtBrnd);
        return this;
    }

    /**
     * Adds a new item to the allwdLltyBrnd list.
     * @see #getAllwdLltyBrnd()
     * 
     */
    public CardAcquisitionRequest3 addAllwdLltyBrnd(String allwdLltyBrnd) {
        getAllwdLltyBrnd().add(allwdLltyBrnd);
        return this;
    }

}
