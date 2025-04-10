
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Conditions to be met by the holder.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionConditions1", propOrder = {
    "condNb",
    "condTxt",
    "condReqrdFlg"
})
public class OptionConditions1 {

    @XmlElement(name = "CondNb", required = true)
    protected BigDecimal condNb;
    @XmlElement(name = "CondTxt", required = true)
    protected String condTxt;
    @XmlElement(name = "CondReqrdFlg")
    protected boolean condReqrdFlg;

    /**
     * Gets the value of the condNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCondNb() {
        return condNb;
    }

    /**
     * Sets the value of the condNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OptionConditions1 setCondNb(BigDecimal value) {
        this.condNb = value;
        return this;
    }

    /**
     * Gets the value of the condTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondTxt() {
        return condTxt;
    }

    /**
     * Sets the value of the condTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OptionConditions1 setCondTxt(String value) {
        this.condTxt = value;
        return this;
    }

    /**
     * Gets the value of the condReqrdFlg property.
     * 
     */
    public boolean isCondReqrdFlg() {
        return condReqrdFlg;
    }

    /**
     * Sets the value of the condReqrdFlg property.
     * 
     */
    public OptionConditions1 setCondReqrdFlg(boolean value) {
        this.condReqrdFlg = value;
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
