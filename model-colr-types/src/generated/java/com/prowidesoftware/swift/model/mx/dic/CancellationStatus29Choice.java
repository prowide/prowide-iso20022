
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
 * Instruction/Request has been cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationStatus29Choice", propOrder = {
    "noSpcfdRsn",
    "rsn"
})
public class CancellationStatus29Choice {

    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;
    @XmlElement(name = "Rsn")
    protected List<CancellationReason29> rsn;

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public CancellationStatus29Choice setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsn property.
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
     * {@link CancellationReason29 }
     * 
     * 
     * @return
     *     The value of the rsn property.
     */
    public List<CancellationReason29> getRsn() {
        if (rsn == null) {
            rsn = new ArrayList<>();
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
    public CancellationStatus29Choice addRsn(CancellationReason29 rsn) {
        getRsn().add(rsn);
        return this;
    }

}
