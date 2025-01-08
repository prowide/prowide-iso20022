
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
 * Indication whether the reconciliation is required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatus8Choice", propOrder = {
    "noRcncltnReqrd",
    "rptgData"
})
public class ReconciliationStatus8Choice {

    @XmlElement(name = "NoRcncltnReqrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noRcncltnReqrd;
    @XmlElement(name = "RptgData")
    protected ReconciliationMatchedStatus9Choice rptgData;

    /**
     * Gets the value of the noRcncltnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoRcncltnReqrd() {
        return noRcncltnReqrd;
    }

    /**
     * Sets the value of the noRcncltnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public ReconciliationStatus8Choice setNoRcncltnReqrd(NoReasonCode value) {
        this.noRcncltnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the rptgData property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationMatchedStatus9Choice }
     *     
     */
    public ReconciliationMatchedStatus9Choice getRptgData() {
        return rptgData;
    }

    /**
     * Sets the value of the rptgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationMatchedStatus9Choice }
     *     
     */
    public ReconciliationStatus8Choice setRptgData(ReconciliationMatchedStatus9Choice value) {
        this.rptgData = value;
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
