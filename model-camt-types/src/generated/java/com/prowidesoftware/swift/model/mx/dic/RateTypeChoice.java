
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
 * Rate is expressed as a percentage or a text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeChoice", propOrder = {
    "pctgRate",
    "txtlRate"
})
public class RateTypeChoice {

    @XmlElement(name = "PctgRate")
    protected BigDecimal pctgRate;
    @XmlElement(name = "TxtlRate")
    protected String txtlRate;

    /**
     * Gets the value of the pctgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgRate() {
        return pctgRate;
    }

    /**
     * Sets the value of the pctgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RateTypeChoice setPctgRate(BigDecimal value) {
        this.pctgRate = value;
        return this;
    }

    /**
     * Gets the value of the txtlRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtlRate() {
        return txtlRate;
    }

    /**
     * Sets the value of the txtlRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RateTypeChoice setTxtlRate(String value) {
        this.txtlRate = value;
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
