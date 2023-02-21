
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Choice between a reason or no reason for the corporate action instruction cancellation pending cancellation status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingCancellationStatus1Choice", propOrder = {
    "notSpcfdRsn",
    "rsn"
})
public class PendingCancellationStatus1Choice {

    @XmlElement(name = "NotSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode notSpcfdRsn;
    @XmlElement(name = "Rsn")
    protected List<PendingCancellationStatusReason1> rsn;

    /**
     * Gets the value of the notSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNotSpcfdRsn() {
        return notSpcfdRsn;
    }

    /**
     * Sets the value of the notSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public PendingCancellationStatus1Choice setNotSpcfdRsn(NoReasonCode value) {
        this.notSpcfdRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PendingCancellationStatusReason1 }
     * 
     * 
     */
    public List<PendingCancellationStatusReason1> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<PendingCancellationStatusReason1>();
        }
        return this.rsn;
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

    /**
     * Adds a new item to the rsn list.
     * @see #getRsn()
     * 
     */
    public PendingCancellationStatus1Choice addRsn(PendingCancellationStatusReason1 rsn) {
        getRsn().add(rsn);
        return this;
    }

}
