
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
 * Fees not included in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFee2", propOrder = {
    "tp",
    "othrTp",
    "feePrgm",
    "feeDscrptr",
    "feeAmt",
    "feeRcncltnAmt",
    "desc",
    "addtlData"
})
public class AdditionalFee2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAmount21Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "FeePrgm")
    protected String feePrgm;
    @XmlElement(name = "FeeDscrptr")
    protected String feeDscrptr;
    @XmlElement(name = "FeeAmt", required = true)
    protected FeeAmount3 feeAmt;
    @XmlElement(name = "FeeRcncltnAmt")
    protected FeeAmount3 feeRcncltnAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public TypeOfAmount21Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public AdditionalFee2 setTp(TypeOfAmount21Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee2 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the feePrgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePrgm() {
        return feePrgm;
    }

    /**
     * Sets the value of the feePrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee2 setFeePrgm(String value) {
        this.feePrgm = value;
        return this;
    }

    /**
     * Gets the value of the feeDscrptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDscrptr() {
        return feeDscrptr;
    }

    /**
     * Sets the value of the feeDscrptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee2 setFeeDscrptr(String value) {
        this.feeDscrptr = value;
        return this;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public AdditionalFee2 setFeeAmt(FeeAmount3 value) {
        this.feeAmt = value;
        return this;
    }

    /**
     * Gets the value of the feeRcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeRcncltnAmt() {
        return feeRcncltnAmt;
    }

    /**
     * Sets the value of the feeRcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public AdditionalFee2 setFeeRcncltnAmt(FeeAmount3 value) {
        this.feeRcncltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee2 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public AdditionalFee2 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
