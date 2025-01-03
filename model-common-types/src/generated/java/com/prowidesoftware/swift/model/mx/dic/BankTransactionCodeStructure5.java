
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Set of elements used to identify the type or operations code of a transaction entry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure5", propOrder = {
    "cd",
    "fmly"
})
public class BankTransactionCodeStructure5 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "Fmly", required = true)
    protected BankTransactionCodeStructure6 fmly;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BankTransactionCodeStructure5 setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the fmly property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure6 }
     *     
     */
    public BankTransactionCodeStructure6 getFmly() {
        return fmly;
    }

    /**
     * Sets the value of the fmly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure6 }
     *     
     */
    public BankTransactionCodeStructure5 setFmly(BankTransactionCodeStructure6 value) {
        this.fmly = value;
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
