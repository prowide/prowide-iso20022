
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
 * Indication whether the reconciliation is required.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationStatus3Choice", propOrder = {
    "noRcncltnReqrd",
    "rptgData"
})
public class ReconciliationStatus3Choice {

    @XmlElement(name = "NoRcncltnReqrd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noRcncltnReqrd;
    @XmlElement(name = "RptgData")
    protected ReconciliationMatchedStatus3Choice rptgData;

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
    public ReconciliationStatus3Choice setNoRcncltnReqrd(NoReasonCode value) {
        this.noRcncltnReqrd = value;
        return this;
    }

    /**
     * Gets the value of the rptgData property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationMatchedStatus3Choice }
     *     
     */
    public ReconciliationMatchedStatus3Choice getRptgData() {
        return rptgData;
    }

    /**
     * Sets the value of the rptgData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationMatchedStatus3Choice }
     *     
     */
    public ReconciliationStatus3Choice setRptgData(ReconciliationMatchedStatus3Choice value) {
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
