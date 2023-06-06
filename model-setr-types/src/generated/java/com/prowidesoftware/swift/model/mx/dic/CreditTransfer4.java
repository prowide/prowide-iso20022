
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
 * Payment instrument between a debtor and a creditor, which flows through one or more financial institutions or systems.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransfer4", propOrder = {
    "ref",
    "cdtrDtls",
    "dbtrDtls"
})
public class CreditTransfer4 {

    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "CdtrDtls")
    protected Creditor2 cdtrDtls;
    @XmlElement(name = "DbtrDtls", required = true)
    protected Debtor2 dbtrDtls;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CreditTransfer4 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the cdtrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor2 }
     *     
     */
    public Creditor2 getCdtrDtls() {
        return cdtrDtls;
    }

    /**
     * Sets the value of the cdtrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor2 }
     *     
     */
    public CreditTransfer4 setCdtrDtls(Creditor2 value) {
        this.cdtrDtls = value;
        return this;
    }

    /**
     * Gets the value of the dbtrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor2 }
     *     
     */
    public Debtor2 getDbtrDtls() {
        return dbtrDtls;
    }

    /**
     * Sets the value of the dbtrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor2 }
     *     
     */
    public CreditTransfer4 setDbtrDtls(Debtor2 value) {
        this.dbtrDtls = value;
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
