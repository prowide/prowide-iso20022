
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
 * Choice between formats for account identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationFormatChoice", propOrder = {
    "smplId",
    "idAndPurp",
    "idAsDSS"
})
public class AccountIdentificationFormatChoice {

    @XmlElement(name = "SmplId")
    protected AccountIdentification1 smplId;
    @XmlElement(name = "IdAndPurp")
    protected AccountIdentificationAndPurpose idAndPurp;
    @XmlElement(name = "IdAsDSS")
    protected AccountIdentification3 idAsDSS;

    /**
     * Gets the value of the smplId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentification1 getSmplId() {
        return smplId;
    }

    /**
     * Sets the value of the smplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification1 }
     *     
     */
    public AccountIdentificationFormatChoice setSmplId(AccountIdentification1 value) {
        this.smplId = value;
        return this;
    }

    /**
     * Gets the value of the idAndPurp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndPurpose }
     *     
     */
    public AccountIdentificationAndPurpose getIdAndPurp() {
        return idAndPurp;
    }

    /**
     * Sets the value of the idAndPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndPurpose }
     *     
     */
    public AccountIdentificationFormatChoice setIdAndPurp(AccountIdentificationAndPurpose value) {
        this.idAndPurp = value;
        return this;
    }

    /**
     * Gets the value of the idAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification3 }
     *     
     */
    public AccountIdentification3 getIdAsDSS() {
        return idAsDSS;
    }

    /**
     * Sets the value of the idAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification3 }
     *     
     */
    public AccountIdentificationFormatChoice setIdAsDSS(AccountIdentification3 value) {
        this.idAsDSS = value;
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
