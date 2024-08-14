
package com.prowidesoftware.swift.model.mx.dic;

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
 * Specifies the withdrawal reason code and optionally a withdrawal reason sub code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawalReason1", propOrder = {
    "wdrwlRsnCd",
    "wdrwlRsnSubCd"
})
public class WithdrawalReason1 {

    @XmlElement(name = "WdrwlRsnCd", required = true)
    @XmlSchemaType(name = "string")
    protected WithdrawalReason1Code wdrwlRsnCd;
    @XmlElement(name = "WdrwlRsnSubCd")
    protected String wdrwlRsnSubCd;

    /**
     * Gets the value of the wdrwlRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawalReason1Code }
     *     
     */
    public WithdrawalReason1Code getWdrwlRsnCd() {
        return wdrwlRsnCd;
    }

    /**
     * Sets the value of the wdrwlRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawalReason1Code }
     *     
     */
    public WithdrawalReason1 setWdrwlRsnCd(WithdrawalReason1Code value) {
        this.wdrwlRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the wdrwlRsnSubCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWdrwlRsnSubCd() {
        return wdrwlRsnSubCd;
    }

    /**
     * Sets the value of the wdrwlRsnSubCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public WithdrawalReason1 setWdrwlRsnSubCd(String value) {
        this.wdrwlRsnSubCd = value;
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
