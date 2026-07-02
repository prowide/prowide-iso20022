
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the agreed amount for the variation margin and the segregated independent amount, or the segregated independent amount only.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreedAmount1Choice", propOrder = {
    "agrdAmtDtls",
    "sgrtdIndpdntAmt"
})
public class AgreedAmount1Choice {

    @XmlElement(name = "AgrdAmtDtls")
    protected AgreedAmount1 agrdAmtDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected Amount1 sgrtdIndpdntAmt;

    /**
     * Gets the value of the agrdAmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedAmount1 }
     *     
     */
    public AgreedAmount1 getAgrdAmtDtls() {
        return agrdAmtDtls;
    }

    /**
     * Sets the value of the agrdAmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedAmount1 }
     *     
     */
    public AgreedAmount1Choice setAgrdAmtDtls(AgreedAmount1 value) {
        this.agrdAmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount1 }
     *     
     */
    public Amount1 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount1 }
     *     
     */
    public AgreedAmount1Choice setSgrtdIndpdntAmt(Amount1 value) {
        this.sgrtdIndpdntAmt = value;
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
