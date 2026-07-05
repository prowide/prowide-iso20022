
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
 * Extends the ATICA message set to address the requirement of the European Banking Authority (EBA) related to the Regulatory Technical Standard (RTS) on Strong Customer Authentication (SCA) imposed by the EU regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EUPSD2SCADataSD1V01", propOrder = {
    "strngCstmrAuthntcn"
})
public class EUPSD2SCADataSD1V01 {

    @XmlElement(name = "StrngCstmrAuthntcn", required = true)
    protected StrongCustomerAuthentication1 strngCstmrAuthntcn;

    /**
     * Gets the value of the strngCstmrAuthntcn property.
     * 
     * @return
     *     possible object is
     *     {@link StrongCustomerAuthentication1 }
     *     
     */
    public StrongCustomerAuthentication1 getStrngCstmrAuthntcn() {
        return strngCstmrAuthntcn;
    }

    /**
     * Sets the value of the strngCstmrAuthntcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrongCustomerAuthentication1 }
     *     
     */
    public EUPSD2SCADataSD1V01 setStrngCstmrAuthntcn(StrongCustomerAuthentication1 value) {
        this.strngCstmrAuthntcn = value;
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
