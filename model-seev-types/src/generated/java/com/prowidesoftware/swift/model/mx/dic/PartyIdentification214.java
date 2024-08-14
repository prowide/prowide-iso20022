
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
 * Identification of a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification214", propOrder = {
    "id",
    "rcptNm",
    "rspnRcptAdr"
})
public class PartyIdentification214 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification203Choice id;
    @XmlElement(name = "RcptNm", required = true)
    protected String rcptNm;
    @XmlElement(name = "RspnRcptAdr", required = true)
    protected PartyAddress1 rspnRcptAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification203Choice }
     *     
     */
    public PartyIdentification203Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification203Choice }
     *     
     */
    public PartyIdentification214 setId(PartyIdentification203Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rcptNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptNm() {
        return rcptNm;
    }

    /**
     * Sets the value of the rcptNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyIdentification214 setRcptNm(String value) {
        this.rcptNm = value;
        return this;
    }

    /**
     * Gets the value of the rspnRcptAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAddress1 }
     *     
     */
    public PartyAddress1 getRspnRcptAdr() {
        return rspnRcptAdr;
    }

    /**
     * Sets the value of the rspnRcptAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAddress1 }
     *     
     */
    public PartyIdentification214 setRspnRcptAdr(PartyAddress1 value) {
        this.rspnRcptAdr = value;
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
