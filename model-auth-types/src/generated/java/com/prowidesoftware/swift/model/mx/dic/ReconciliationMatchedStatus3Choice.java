
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data to be reconciled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationMatchedStatus3Choice", propOrder = {
    "mtchgNotStartd",
    "mtchd",
    "notMtchd"
})
public class ReconciliationMatchedStatus3Choice {

    @XmlElement(name = "MtchgNotStartd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode mtchgNotStartd;
    @XmlElement(name = "Mtchd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode mtchd;
    @XmlElement(name = "NotMtchd")
    protected ReconciliationResult4 notMtchd;

    /**
     * Gets the value of the mtchgNotStartd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getMtchgNotStartd() {
        return mtchgNotStartd;
    }

    /**
     * Sets the value of the mtchgNotStartd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public ReconciliationMatchedStatus3Choice setMtchgNotStartd(NoReasonCode value) {
        this.mtchgNotStartd = value;
        return this;
    }

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public ReconciliationMatchedStatus3Choice setMtchd(NoReasonCode value) {
        this.mtchd = value;
        return this;
    }

    /**
     * Gets the value of the notMtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationResult4 }
     *     
     */
    public ReconciliationResult4 getNotMtchd() {
        return notMtchd;
    }

    /**
     * Sets the value of the notMtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationResult4 }
     *     
     */
    public ReconciliationMatchedStatus3Choice setNotMtchd(ReconciliationResult4 value) {
        this.notMtchd = value;
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
