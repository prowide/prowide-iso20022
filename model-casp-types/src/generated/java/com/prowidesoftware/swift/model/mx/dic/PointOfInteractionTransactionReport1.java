
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
 * Transaction Report information for one transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionTransactionReport1", propOrder = {
    "rspn",
    "pmtRspn"
})
public class PointOfInteractionTransactionReport1 {

    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
    @XmlElement(name = "PmtRspn")
    protected PaymentResponse1 pmtRspn;

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public PointOfInteractionTransactionReport1 setRspn(ResponseType9 value) {
        this.rspn = value;
        return this;
    }

    /**
     * Gets the value of the pmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse1 }
     *     
     */
    public PaymentResponse1 getPmtRspn() {
        return pmtRspn;
    }

    /**
     * Sets the value of the pmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse1 }
     *     
     */
    public PointOfInteractionTransactionReport1 setPmtRspn(PaymentResponse1 value) {
        this.pmtRspn = value;
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
