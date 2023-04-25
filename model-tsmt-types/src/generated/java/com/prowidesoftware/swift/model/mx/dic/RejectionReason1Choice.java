
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Allows the sender of the rejection message to indicate only one rejection reason that applies to the entire rejected message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason1Choice", propOrder = {
    "gblRjctnRsn",
    "rjctdElmt"
})
public class RejectionReason1Choice {

    @XmlElement(name = "GblRjctnRsn")
    protected Reason2 gblRjctnRsn;
    @XmlElement(name = "RjctdElmt")
    protected List<RejectedElement1> rjctdElmt;

    /**
     * Gets the value of the gblRjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getGblRjctnRsn() {
        return gblRjctnRsn;
    }

    /**
     * Sets the value of the gblRjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public RejectionReason1Choice setGblRjctnRsn(Reason2 value) {
        this.gblRjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctdElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectedElement1 }
     * 
     * 
     * @return
     *     The value of the rjctdElmt property.
     */
    public List<RejectedElement1> getRjctdElmt() {
        if (rjctdElmt == null) {
            rjctdElmt = new ArrayList<>();
        }
        return this.rjctdElmt;
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
     * Adds a new item to the rjctdElmt list.
     * @see #getRjctdElmt()
     * 
     */
    public RejectionReason1Choice addRjctdElmt(RejectedElement1 rjctdElmt) {
        getRjctdElmt().add(rjctdElmt);
        return this;
    }

}
