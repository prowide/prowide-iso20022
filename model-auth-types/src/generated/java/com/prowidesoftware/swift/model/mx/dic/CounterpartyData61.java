
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
 * Data related specifically to counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData61", propOrder = {
    "rptgCtrPty",
    "othrCtrPty"
})
public class CounterpartyData61 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected CounterpartyIdentification4 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected CounterpartyIdentification2 othrCtrPty;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification4 }
     *     
     */
    public CounterpartyIdentification4 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification4 }
     *     
     */
    public CounterpartyData61 setRptgCtrPty(CounterpartyIdentification4 value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification2 }
     *     
     */
    public CounterpartyIdentification2 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification2 }
     *     
     */
    public CounterpartyData61 setOthrCtrPty(CounterpartyIdentification2 value) {
        this.othrCtrPty = value;
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
