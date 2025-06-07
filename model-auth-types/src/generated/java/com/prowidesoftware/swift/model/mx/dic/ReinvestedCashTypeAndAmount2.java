
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
 * Provides details on the type and amount of the cash reinvestment in a given currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReinvestedCashTypeAndAmount2", propOrder = {
    "tp",
    "rinvstdCshCcy"
})
public class ReinvestedCashTypeAndAmount2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ReinvestmentType1Code tp;
    @XmlElement(name = "RinvstdCshCcy", required = true)
    protected String rinvstdCshCcy;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public ReinvestmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReinvestmentType1Code }
     *     
     */
    public ReinvestedCashTypeAndAmount2 setTp(ReinvestmentType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rinvstdCshCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRinvstdCshCcy() {
        return rinvstdCshCcy;
    }

    /**
     * Sets the value of the rinvstdCshCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReinvestedCashTypeAndAmount2 setRinvstdCshCcy(String value) {
        this.rinvstdCshCcy = value;
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
