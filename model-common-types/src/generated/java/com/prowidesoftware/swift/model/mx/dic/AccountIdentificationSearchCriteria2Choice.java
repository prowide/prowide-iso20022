
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
 * Choice between the different options to search for an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationSearchCriteria2Choice", propOrder = {
    "eq",
    "ctTxt",
    "nctTxt"
})
public class AccountIdentificationSearchCriteria2Choice {

    @XmlElement(name = "EQ")
    protected AccountIdentification4Choice eq;
    @XmlElement(name = "CTTxt")
    protected String ctTxt;
    @XmlElement(name = "NCTTxt")
    protected String nctTxt;

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentificationSearchCriteria2Choice setEQ(AccountIdentification4Choice value) {
        this.eq = value;
        return this;
    }

    /**
     * Gets the value of the ctTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTTxt() {
        return ctTxt;
    }

    /**
     * Sets the value of the ctTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentificationSearchCriteria2Choice setCTTxt(String value) {
        this.ctTxt = value;
        return this;
    }

    /**
     * Gets the value of the nctTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCTTxt() {
        return nctTxt;
    }

    /**
     * Sets the value of the nctTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountIdentificationSearchCriteria2Choice setNCTTxt(String value) {
        this.nctTxt = value;
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
