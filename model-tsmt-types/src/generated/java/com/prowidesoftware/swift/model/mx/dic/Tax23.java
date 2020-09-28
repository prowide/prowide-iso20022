
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
 * Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax23", propOrder = {
    "tp",
    "amtOrPctg"
})
public class Tax23 {

    @XmlElement(name = "Tp", required = true)
    protected TaxType2Choice tp;
    @XmlElement(name = "AmtOrPctg", required = true)
    protected AmountOrPercentage2Choice amtOrPctg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType2Choice }
     *     
     */
    public TaxType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType2Choice }
     *     
     */
    public Tax23 setTp(TaxType2Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the amtOrPctg property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public AmountOrPercentage2Choice getAmtOrPctg() {
        return amtOrPctg;
    }

    /**
     * Sets the value of the amtOrPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrPercentage2Choice }
     *     
     */
    public Tax23 setAmtOrPctg(AmountOrPercentage2Choice value) {
        this.amtOrPctg = value;
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
