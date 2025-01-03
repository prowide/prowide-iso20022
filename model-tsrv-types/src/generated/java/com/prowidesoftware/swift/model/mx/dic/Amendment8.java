
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
 * Amendment identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment8", propOrder = {
    "id",
    "seqNb",
    "bnfcryRefNb",
    "issr"
})
public class Amendment8 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SeqNb", required = true)
    protected String seqNb;
    @XmlElement(name = "BnfcryRefNb")
    protected String bnfcryRefNb;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment8 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment8 setSeqNb(String value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryRefNb() {
        return bnfcryRefNb;
    }

    /**
     * Sets the value of the bnfcryRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Amendment8 setBnfcryRefNb(String value) {
        this.bnfcryRefNb = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Amendment8 setIssr(PartyIdentification43 value) {
        this.issr = value;
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
