
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
 * Provides transaction type and identification information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTypeAndAdditionalParameters7", propOrder = {
    "cmonId",
    "corpActnEvtId",
    "rcncltnInd"
})
public class SettlementTypeAndAdditionalParameters7 {

    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "CorpActnEvtId")
    protected String corpActnEvtId;
    @XmlElement(name = "RcncltnInd")
    protected Boolean rcncltnInd;

    /**
     * Gets the value of the cmonId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Sets the value of the cmonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTypeAndAdditionalParameters7 setCmonId(String value) {
        this.cmonId = value;
        return this;
    }

    /**
     * Gets the value of the corpActnEvtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Sets the value of the corpActnEvtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementTypeAndAdditionalParameters7 setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnInd() {
        return rcncltnInd;
    }

    /**
     * Sets the value of the rcncltnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementTypeAndAdditionalParameters7 setRcncltnInd(Boolean value) {
        this.rcncltnInd = value;
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
