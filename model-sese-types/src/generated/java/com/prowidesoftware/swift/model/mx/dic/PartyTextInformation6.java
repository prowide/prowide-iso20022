
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
 * Provides additional information regarding the party, for example, the contact unit or person responsible for the transaction identified in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTextInformation6", propOrder = {
    "dclrtnDtls",
    "ptyCtctDtls",
    "regnDtls",
    "regnAdr"
})
public class PartyTextInformation6 {

    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;
    @XmlElement(name = "PtyCtctDtls")
    protected String ptyCtctDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;
    @XmlElement(name = "RegnAdr")
    protected PostalAddress1 regnAdr;

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyTextInformation6 setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
        return this;
    }

    /**
     * Gets the value of the ptyCtctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyCtctDtls() {
        return ptyCtctDtls;
    }

    /**
     * Sets the value of the ptyCtctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyTextInformation6 setPtyCtctDtls(String value) {
        this.ptyCtctDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyTextInformation6 setRegnDtls(String value) {
        this.regnDtls = value;
        return this;
    }

    /**
     * Gets the value of the regnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress1 }
     *     
     */
    public PostalAddress1 getRegnAdr() {
        return regnAdr;
    }

    /**
     * Sets the value of the regnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress1 }
     *     
     */
    public PartyTextInformation6 setRegnAdr(PostalAddress1 value) {
        this.regnAdr = value;
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
