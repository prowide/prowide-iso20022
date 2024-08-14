
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy6", propOrder = {
    "prxyTp",
    "prsnDtls",
    "voteInstrForAgndRsltn"
})
public class Proxy6 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProxyType2Code prxyTp;
    @XmlElement(name = "PrsnDtls")
    protected IndividualPerson26 prsnDtls;
    @XmlElement(name = "VoteInstrForAgndRsltn")
    protected Vote3Choice voteInstrForAgndRsltn;

    /**
     * Gets the value of the prxyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyType2Code }
     *     
     */
    public ProxyType2Code getPrxyTp() {
        return prxyTp;
    }

    /**
     * Sets the value of the prxyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyType2Code }
     *     
     */
    public Proxy6 setPrxyTp(ProxyType2Code value) {
        this.prxyTp = value;
        return this;
    }

    /**
     * Gets the value of the prsnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson26 }
     *     
     */
    public IndividualPerson26 getPrsnDtls() {
        return prsnDtls;
    }

    /**
     * Sets the value of the prsnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson26 }
     *     
     */
    public Proxy6 setPrsnDtls(IndividualPerson26 value) {
        this.prsnDtls = value;
        return this;
    }

    /**
     * Gets the value of the voteInstrForAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote3Choice }
     *     
     */
    public Vote3Choice getVoteInstrForAgndRsltn() {
        return voteInstrForAgndRsltn;
    }

    /**
     * Sets the value of the voteInstrForAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote3Choice }
     *     
     */
    public Proxy6 setVoteInstrForAgndRsltn(Vote3Choice value) {
        this.voteInstrForAgndRsltn = value;
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
