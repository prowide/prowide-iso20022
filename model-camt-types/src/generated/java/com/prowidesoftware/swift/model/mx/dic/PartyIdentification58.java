
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
 * Describes the details of an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification58", propOrder = {
    "nm",
    "lglNm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls"
})
public class PartyIdentification58 {

    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "LglNm")
    protected String lglNm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress11 pstlAdr;
    @XmlElement(name = "Id", required = true)
    protected Party13Choice id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;
    @XmlElement(name = "CtctDtls")
    protected ContactDetails3 ctctDtls;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification58 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the lglNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNm() {
        return lglNm;
    }

    /**
     * Sets the value of the lglNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification58 setLglNm(String value) {
        this.lglNm = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress11 }
     *     
     */
    public PostalAddress11 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress11 }
     *     
     */
    public PartyIdentification58 setPstlAdr(PostalAddress11 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Party13Choice }
     *     
     */
    public Party13Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party13Choice }
     *     
     */
    public PartyIdentification58 setId(Party13Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfRes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfRes() {
        return ctryOfRes;
    }

    /**
     * Sets the value of the ctryOfRes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification58 setCtryOfRes(String value) {
        this.ctryOfRes = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails3 }
     *     
     */
    public ContactDetails3 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails3 }
     *     
     */
    public PartyIdentification58 setCtctDtls(ContactDetails3 value) {
        this.ctctDtls = value;
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
