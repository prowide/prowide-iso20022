
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
 * The ExtendOrPayResponse message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking, in response to the issuer's request for the applicant's response to the beneficiary’s request to extend or pay.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendOrPayResponseV01", propOrder = {
    "xtndOrPayRspnDtls",
    "dgtlSgntr"
})
public class ExtendOrPayResponseV01 {

    @XmlElement(name = "XtndOrPayRspnDtls", required = true)
    protected ExtendOrPayQuery2 xtndOrPayRspnDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the xtndOrPayRspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendOrPayQuery2 }
     *     
     */
    public ExtendOrPayQuery2 getXtndOrPayRspnDtls() {
        return xtndOrPayRspnDtls;
    }

    /**
     * Sets the value of the xtndOrPayRspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendOrPayQuery2 }
     *     
     */
    public ExtendOrPayResponseV01 setXtndOrPayRspnDtls(ExtendOrPayQuery2 value) {
        this.xtndOrPayRspnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public ExtendOrPayResponseV01 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
