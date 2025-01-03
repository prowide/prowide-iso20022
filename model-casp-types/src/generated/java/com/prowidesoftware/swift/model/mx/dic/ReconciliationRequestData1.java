
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
 * Content of the Reconciliation Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationRequestData1", propOrder = {
    "rcncltnTp",
    "acqrrId",
    "poiRcncltnId"
})
public class ReconciliationRequestData1 {

    @XmlElement(name = "RcncltnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReconciliationType1Code rcncltnTp;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "POIRcncltnId")
    protected String poiRcncltnId;

    /**
     * Gets the value of the rcncltnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationType1Code }
     *     
     */
    public ReconciliationType1Code getRcncltnTp() {
        return rcncltnTp;
    }

    /**
     * Sets the value of the rcncltnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationType1Code }
     *     
     */
    public ReconciliationRequestData1 setRcncltnTp(ReconciliationType1Code value) {
        this.rcncltnTp = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Sets the value of the acqrrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationRequestData1 setAcqrrId(String value) {
        this.acqrrId = value;
        return this;
    }

    /**
     * Gets the value of the poiRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIRcncltnId() {
        return poiRcncltnId;
    }

    /**
     * Sets the value of the poiRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReconciliationRequestData1 setPOIRcncltnId(String value) {
        this.poiRcncltnId = value;
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
