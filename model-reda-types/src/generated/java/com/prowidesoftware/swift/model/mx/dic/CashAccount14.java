
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount14", propOrder = {
    "ccy",
    "svcr",
    "id",
    "scndryAcct"
})
public class CashAccount14 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "Svcr", required = true)
    protected String svcr;
    @XmlElement(name = "Id", required = true)
    protected AccountIdentification1Choice id;
    @XmlElement(name = "ScndryAcct")
    protected CashAccount15 scndryAcct;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount14 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount14 setSvcr(String value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public AccountIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1Choice }
     *     
     */
    public CashAccount14 setId(AccountIdentification1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the scndryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount15 }
     *     
     */
    public CashAccount15 getScndryAcct() {
        return scndryAcct;
    }

    /**
     * Sets the value of the scndryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount15 }
     *     
     */
    public CashAccount14 setScndryAcct(CashAccount15 value) {
        this.scndryAcct = value;
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
