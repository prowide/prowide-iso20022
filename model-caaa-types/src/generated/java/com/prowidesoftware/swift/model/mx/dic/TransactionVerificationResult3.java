
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
 * Result of performed verifications for the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionVerificationResult3", propOrder = {
    "mtd",
    "vrfctnNtty",
    "rslt",
    "addtlRslt"
})
public class TransactionVerificationResult3 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod4Code mtd;
    @XmlElement(name = "VrfctnNtty")
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity2Code vrfctnNtty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification1Code rslt;
    @XmlElement(name = "AddtlRslt")
    protected String addtlRslt;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod4Code }
     *     
     */
    public AuthenticationMethod4Code getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod4Code }
     *     
     */
    public TransactionVerificationResult3 setMtd(AuthenticationMethod4Code value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the vrfctnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public AuthenticationEntity2Code getVrfctnNtty() {
        return vrfctnNtty;
    }

    /**
     * Sets the value of the vrfctnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public TransactionVerificationResult3 setVrfctnNtty(AuthenticationEntity2Code value) {
        this.vrfctnNtty = value;
        return this;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Verification1Code }
     *     
     */
    public Verification1Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification1Code }
     *     
     */
    public TransactionVerificationResult3 setRslt(Verification1Code value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRslt() {
        return addtlRslt;
    }

    /**
     * Sets the value of the addtlRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionVerificationResult3 setAddtlRslt(String value) {
        this.addtlRslt = value;
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
