
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
 * Specifies the identification of a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification272", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls"
})
public class PartyIdentification272 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress27 pstlAdr;
    @XmlElement(name = "Id")
    protected Party52Choice id;
    @XmlElement(name = "CtryOfRes")
    protected String ctryOfRes;
    @XmlElement(name = "CtctDtls")
    protected Contact13 ctctDtls;

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
    public PartyIdentification272 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress27 }
     *     
     */
    public PostalAddress27 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress27 }
     *     
     */
    public PartyIdentification272 setPstlAdr(PostalAddress27 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Party52Choice }
     *     
     */
    public Party52Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party52Choice }
     *     
     */
    public PartyIdentification272 setId(Party52Choice value) {
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
    public PartyIdentification272 setCtryOfRes(String value) {
        this.ctryOfRes = value;
        return this;
    }

    /**
     * Gets the value of the ctctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Contact13 }
     *     
     */
    public Contact13 getCtctDtls() {
        return ctctDtls;
    }

    /**
     * Sets the value of the ctctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact13 }
     *     
     */
    public PartyIdentification272 setCtctDtls(Contact13 value) {
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
