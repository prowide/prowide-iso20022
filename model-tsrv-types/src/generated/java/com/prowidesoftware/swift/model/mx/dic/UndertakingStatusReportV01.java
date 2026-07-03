
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
 * The UndertakingStatusReport message is exchanged between parties that have an interest in the referenced undertaking transaction. It notifies the recipient of the status of the transaction, such as acceptance or rejection, withdrawal, or non-conformation. The sender may add additional information, as appropriate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusReportV01", propOrder = {
    "udrtkgStsRptDtls",
    "dgtlSgntr"
})
public class UndertakingStatusReportV01 {

    @XmlElement(name = "UdrtkgStsRptDtls", required = true)
    protected UndertakingStatusAdvice1 udrtkgStsRptDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgStsRptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public UndertakingStatusAdvice1 getUdrtkgStsRptDtls() {
        return udrtkgStsRptDtls;
    }

    /**
     * Sets the value of the udrtkgStsRptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public UndertakingStatusReportV01 setUdrtkgStsRptDtls(UndertakingStatusAdvice1 value) {
        this.udrtkgStsRptDtls = value;
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
    public UndertakingStatusReportV01 setDgtlSgntr(PartyAndSignature2 value) {
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
