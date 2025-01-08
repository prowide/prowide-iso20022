
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
 * Diagnostic request from an acceptor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorDiagnosticRequest8", propOrder = {
    "envt",
    "acqrrAvlbtyReqd"
})
public class AcceptorDiagnosticRequest8 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment74 envt;
    @XmlElement(name = "AcqrrAvlbtyReqd")
    protected Boolean acqrrAvlbtyReqd;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment74 }
     *     
     */
    public CardPaymentEnvironment74 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment74 }
     *     
     */
    public AcceptorDiagnosticRequest8 setEnvt(CardPaymentEnvironment74 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the acqrrAvlbtyReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcqrrAvlbtyReqd() {
        return acqrrAvlbtyReqd;
    }

    /**
     * Sets the value of the acqrrAvlbtyReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcceptorDiagnosticRequest8 setAcqrrAvlbtyReqd(Boolean value) {
        this.acqrrAvlbtyReqd = value;
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
