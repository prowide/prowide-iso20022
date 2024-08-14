
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
 * Set of elements used to identify a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification274", propOrder = {
    "nm",
    "pstlAdr",
    "id",
    "ctryOfRes",
    "ctctDtls"
})
public class PartyIdentification274 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress27 pstlAdr;
    @XmlElement(name = "Id")
    protected PersonIdentification18 id;
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
    public PartyIdentification274 setNm(String value) {
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
    public PartyIdentification274 setPstlAdr(PostalAddress27 value) {
        this.pstlAdr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification18 }
     *     
     */
    public PersonIdentification18 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification18 }
     *     
     */
    public PartyIdentification274 setId(PersonIdentification18 value) {
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
    public PartyIdentification274 setCtryOfRes(String value) {
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
    public PartyIdentification274 setCtctDtls(Contact13 value) {
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
