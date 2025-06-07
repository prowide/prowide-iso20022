
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Contains amount details for a specific type of charge.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amount11", propOrder = {
    "tpOfChrg",
    "othrTpOfChrg",
    "amt",
    "cdtInd"
})
public class Amount11 {

    @XmlElement(name = "TpOfChrg")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount19Code tpOfChrg;
    @XmlElement(name = "OthrTpOfChrg")
    protected String othrTpOfChrg;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CdtInd")
    protected Boolean cdtInd;

    /**
     * Gets the value of the tpOfChrg property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount19Code }
     *     
     */
    public TypeOfAmount19Code getTpOfChrg() {
        return tpOfChrg;
    }

    /**
     * Sets the value of the tpOfChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount19Code }
     *     
     */
    public Amount11 setTpOfChrg(TypeOfAmount19Code value) {
        this.tpOfChrg = value;
        return this;
    }

    /**
     * Gets the value of the othrTpOfChrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTpOfChrg() {
        return othrTpOfChrg;
    }

    /**
     * Sets the value of the othrTpOfChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amount11 setOthrTpOfChrg(String value) {
        this.othrTpOfChrg = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Amount11 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtInd() {
        return cdtInd;
    }

    /**
     * Sets the value of the cdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Amount11 setCdtInd(Boolean value) {
        this.cdtInd = value;
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
