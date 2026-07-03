
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
 * Code of the underlying bank transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure2", propOrder = {
    "cd",
    "fmly"
})
public class BankTransactionCodeStructure2 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "Fmly", required = true)
    protected BankTransactionCodeStructure3 fmly;

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
    public BankTransactionCodeStructure2 setCd(String value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the fmly property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure3 }
     *     
     */
    public BankTransactionCodeStructure3 getFmly() {
        return fmly;
    }

    /**
     * Sets the value of the fmly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure3 }
     *     
     */
    public BankTransactionCodeStructure2 setFmly(BankTransactionCodeStructure3 value) {
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
