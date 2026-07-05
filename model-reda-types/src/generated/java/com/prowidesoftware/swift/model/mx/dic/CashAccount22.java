
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
 * Account to or from which a cash entry is made.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashAccount22", propOrder = {
    "ccy",
    "svcr",
    "id",
    "scndryAcct",
    "acctTpDesc"
})
public class CashAccount22 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Svcr", required = true)
    protected String svcr;
    @XmlElement(name = "Id", required = true)
    protected AccountIdentification5Choice id;
    @XmlElement(name = "ScndryAcct")
    protected CashAccount21 scndryAcct;
    @XmlElement(name = "AcctTpDesc", required = true)
    protected String acctTpDesc;

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
    public CashAccount22 setCcy(String value) {
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
    public CashAccount22 setSvcr(String value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification5Choice }
     *     
     */
    public AccountIdentification5Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification5Choice }
     *     
     */
    public CashAccount22 setId(AccountIdentification5Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the scndryAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount21 }
     *     
     */
    public CashAccount21 getScndryAcct() {
        return scndryAcct;
    }

    /**
     * Sets the value of the scndryAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount21 }
     *     
     */
    public CashAccount22 setScndryAcct(CashAccount21 value) {
        this.scndryAcct = value;
        return this;
    }

    /**
     * Gets the value of the acctTpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctTpDesc() {
        return acctTpDesc;
    }

    /**
     * Sets the value of the acctTpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashAccount22 setAcctTpDesc(String value) {
        this.acctTpDesc = value;
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
