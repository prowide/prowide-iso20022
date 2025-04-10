
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
 * Fees not included in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFee1", propOrder = {
    "tp",
    "othrTp",
    "feePrgm",
    "feeDscrptr",
    "amt",
    "labl"
})
public class AdditionalFee1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAmount10Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "FeePrgm")
    protected String feePrgm;
    @XmlElement(name = "FeeDscrptr")
    protected String feeDscrptr;
    @XmlElement(name = "Amt", required = true)
    protected FeeAmount2 amt;
    @XmlElement(name = "Labl")
    protected String labl;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount10Code }
     *     
     */
    public TypeOfAmount10Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount10Code }
     *     
     */
    public AdditionalFee1 setTp(TypeOfAmount10Code value) {
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
    public AdditionalFee1 setOthrTp(String value) {
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
    public AdditionalFee1 setFeePrgm(String value) {
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
    public AdditionalFee1 setFeeDscrptr(String value) {
        this.feeDscrptr = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount2 }
     *     
     */
    public FeeAmount2 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount2 }
     *     
     */
    public AdditionalFee1 setAmt(FeeAmount2 value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the labl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabl() {
        return labl;
    }

    /**
     * Sets the value of the labl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalFee1 setLabl(String value) {
        this.labl = value;
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
