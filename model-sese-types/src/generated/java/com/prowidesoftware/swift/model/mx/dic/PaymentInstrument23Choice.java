
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
 * Choice between types of payment instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument23Choice", propOrder = {
    "cdtTrfDtls",
    "chqDtls"
})
public class PaymentInstrument23Choice {

    @XmlElement(name = "CdtTrfDtls")
    protected CreditTransfer9 cdtTrfDtls;
    @XmlElement(name = "ChqDtls")
    protected Cheque10 chqDtls;

    /**
     * Gets the value of the cdtTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransfer9 }
     *     
     */
    public CreditTransfer9 getCdtTrfDtls() {
        return cdtTrfDtls;
    }

    /**
     * Sets the value of the cdtTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransfer9 }
     *     
     */
    public PaymentInstrument23Choice setCdtTrfDtls(CreditTransfer9 value) {
        this.cdtTrfDtls = value;
        return this;
    }

    /**
     * Gets the value of the chqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Cheque10 }
     *     
     */
    public Cheque10 getChqDtls() {
        return chqDtls;
    }

    /**
     * Sets the value of the chqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cheque10 }
     *     
     */
    public PaymentInstrument23Choice setChqDtls(Cheque10 value) {
        this.chqDtls = value;
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
