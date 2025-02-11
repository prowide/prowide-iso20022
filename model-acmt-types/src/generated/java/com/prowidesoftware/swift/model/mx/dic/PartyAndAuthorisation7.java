
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
 * Party and related authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndAuthorisation7", propOrder = {
    "ptyOrGrp",
    "sgntrOrdr",
    "authstn"
})
public class PartyAndAuthorisation7 {

    @XmlElement(name = "PtyOrGrp", required = true)
    protected PartyOrGroup3Choice ptyOrGrp;
    @XmlElement(name = "SgntrOrdr")
    protected String sgntrOrdr;
    @XmlElement(name = "Authstn", required = true)
    protected Authorisation2 authstn;

    /**
     * Gets the value of the ptyOrGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrGroup3Choice }
     *     
     */
    public PartyOrGroup3Choice getPtyOrGrp() {
        return ptyOrGrp;
    }

    /**
     * Sets the value of the ptyOrGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrGroup3Choice }
     *     
     */
    public PartyAndAuthorisation7 setPtyOrGrp(PartyOrGroup3Choice value) {
        this.ptyOrGrp = value;
        return this;
    }

    /**
     * Gets the value of the sgntrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSgntrOrdr() {
        return sgntrOrdr;
    }

    /**
     * Sets the value of the sgntrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyAndAuthorisation7 setSgntrOrdr(String value) {
        this.sgntrOrdr = value;
        return this;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * @return
     *     possible object is
     *     {@link Authorisation2 }
     *     
     */
    public Authorisation2 getAuthstn() {
        return authstn;
    }

    /**
     * Sets the value of the authstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authorisation2 }
     *     
     */
    public PartyAndAuthorisation7 setAuthstn(Authorisation2 value) {
        this.authstn = value;
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
