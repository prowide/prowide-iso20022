
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
 * The PaymentStatusTrackerUpdate message is sent by an agent to a tracking facility to monitor the progress of a business transaction, and to update the status of this business transaction for obtaining tracking and transparency purpose.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusTrackerUpdateV01", propOrder = {
    "grpHdr",
    "trckrStsAndTx"
})
public class PaymentStatusTrackerUpdateV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected TrackerHeader3 grpHdr;
    @XmlElement(name = "TrckrStsAndTx", required = true)
    protected TrackerStatusAndTransaction3 trckrStsAndTx;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerHeader3 }
     *     
     */
    public TrackerHeader3 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerHeader3 }
     *     
     */
    public PaymentStatusTrackerUpdateV01 setGrpHdr(TrackerHeader3 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the trckrStsAndTx property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerStatusAndTransaction3 }
     *     
     */
    public TrackerStatusAndTransaction3 getTrckrStsAndTx() {
        return trckrStsAndTx;
    }

    /**
     * Sets the value of the trckrStsAndTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerStatusAndTransaction3 }
     *     
     */
    public PaymentStatusTrackerUpdateV01 setTrckrStsAndTx(TrackerStatusAndTransaction3 value) {
        this.trckrStsAndTx = value;
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
