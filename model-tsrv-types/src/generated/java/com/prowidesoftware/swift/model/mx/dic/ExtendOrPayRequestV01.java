
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
 * The ExtendOrPayRequest message is sent by the party that issued the undertaking to the party that requested issuance of the undertaking (applicant or obligor), to request the applicant's response to a beneficiary request to extend or pay.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendOrPayRequestV01", propOrder = {
    "xtndOrPayReqDtls",
    "dgtlSgntr"
})
public class ExtendOrPayRequestV01 {

    @XmlElement(name = "XtndOrPayReqDtls", required = true)
    protected ExtendOrPayQuery1 xtndOrPayReqDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the xtndOrPayReqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendOrPayQuery1 }
     *     
     */
    public ExtendOrPayQuery1 getXtndOrPayReqDtls() {
        return xtndOrPayReqDtls;
    }

    /**
     * Sets the value of the xtndOrPayReqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendOrPayQuery1 }
     *     
     */
    public ExtendOrPayRequestV01 setXtndOrPayReqDtls(ExtendOrPayQuery1 value) {
        this.xtndOrPayReqDtls = value;
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
    public ExtendOrPayRequestV01 setDgtlSgntr(PartyAndSignature2 value) {
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
