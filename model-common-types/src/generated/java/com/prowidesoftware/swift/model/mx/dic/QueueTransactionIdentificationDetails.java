
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
 * Identification of a payment instruction by its relative position in a queue of payment transactions managed by the clearing agent.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueTransactionIdentificationDetails", propOrder = {
    "qId",
    "posInQ"
})
public class QueueTransactionIdentificationDetails {

    @XmlElement(name = "QId", required = true)
    protected String qId;
    @XmlElement(name = "PosInQ", required = true)
    protected String posInQ;

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueTransactionIdentificationDetails setQId(String value) {
        this.qId = value;
        return this;
    }

    /**
     * Gets the value of the posInQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosInQ() {
        return posInQ;
    }

    /**
     * Sets the value of the posInQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueTransactionIdentificationDetails setPosInQ(String value) {
        this.posInQ = value;
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
