
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
 * Choice between a list of pending statuses or final statuses.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCode2Choice", propOrder = {
    "pdgSts",
    "fnlSts"
})
public class PaymentStatusCode2Choice {

    @XmlElement(name = "PdgSts")
    @XmlSchemaType(name = "string")
    protected PendingStatus3Code pdgSts;
    @XmlElement(name = "FnlSts")
    @XmlSchemaType(name = "string")
    protected FinalStatusCode fnlSts;

    /**
     * Gets the value of the pdgSts property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus3Code }
     *     
     */
    public PendingStatus3Code getPdgSts() {
        return pdgSts;
    }

    /**
     * Sets the value of the pdgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus3Code }
     *     
     */
    public PaymentStatusCode2Choice setPdgSts(PendingStatus3Code value) {
        this.pdgSts = value;
        return this;
    }

    /**
     * Gets the value of the fnlSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinalStatusCode }
     *     
     */
    public FinalStatusCode getFnlSts() {
        return fnlSts;
    }

    /**
     * Sets the value of the fnlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalStatusCode }
     *     
     */
    public PaymentStatusCode2Choice setFnlSts(FinalStatusCode value) {
        this.fnlSts = value;
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
