
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
 * Attributes of a settlement service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementService1", propOrder = {
    "sttlmSvcPropsd",
    "sttlmSvcApld",
    "sttlmSvcDts",
    "sttlmRptgNtty"
})
public class SettlementService1 {

    @XmlElement(name = "SttlmSvcPropsd")
    protected SettlementServiceMode1 sttlmSvcPropsd;
    @XmlElement(name = "SttlmSvcApld")
    protected SettlementServiceMode1 sttlmSvcApld;
    @XmlElement(name = "SttlmSvcDts")
    protected SettlementServiceDate1 sttlmSvcDts;
    @XmlElement(name = "SttlmRptgNtty")
    protected SettlementReportingEntity1 sttlmRptgNtty;

    /**
     * Gets the value of the sttlmSvcPropsd property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcPropsd() {
        return sttlmSvcPropsd;
    }

    /**
     * Sets the value of the sttlmSvcPropsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementService1 setSttlmSvcPropsd(SettlementServiceMode1 value) {
        this.sttlmSvcPropsd = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvcApld property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcApld() {
        return sttlmSvcApld;
    }

    /**
     * Sets the value of the sttlmSvcApld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementService1 setSttlmSvcApld(SettlementServiceMode1 value) {
        this.sttlmSvcApld = value;
        return this;
    }

    /**
     * Gets the value of the sttlmSvcDts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceDate1 }
     *     
     */
    public SettlementServiceDate1 getSttlmSvcDts() {
        return sttlmSvcDts;
    }

    /**
     * Sets the value of the sttlmSvcDts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceDate1 }
     *     
     */
    public SettlementService1 setSttlmSvcDts(SettlementServiceDate1 value) {
        this.sttlmSvcDts = value;
        return this;
    }

    /**
     * Gets the value of the sttlmRptgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementReportingEntity1 getSttlmRptgNtty() {
        return sttlmRptgNtty;
    }

    /**
     * Sets the value of the sttlmRptgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementService1 setSttlmRptgNtty(SettlementReportingEntity1 value) {
        this.sttlmRptgNtty = value;
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
