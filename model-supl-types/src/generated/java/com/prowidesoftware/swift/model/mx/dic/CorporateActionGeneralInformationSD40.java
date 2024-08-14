
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
 * Provides additional information regarding corporate action general information details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformationSD40", propOrder = {
    "plcAndNm",
    "evtTp",
    "subEvtTp",
    "evtGrp"
})
public class CorporateActionGeneralInformationSD40 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "EvtTp")
    @XmlSchemaType(name = "string")
    protected ExtendedEventType6Code evtTp;
    @XmlElement(name = "SubEvtTp")
    @XmlSchemaType(name = "string")
    protected DTCCSubEventType8Code subEvtTp;
    @XmlElement(name = "EvtGrp")
    @XmlSchemaType(name = "string")
    protected EventGroup4Code evtGrp;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionGeneralInformationSD40 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedEventType6Code }
     *     
     */
    public ExtendedEventType6Code getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedEventType6Code }
     *     
     */
    public CorporateActionGeneralInformationSD40 setEvtTp(ExtendedEventType6Code value) {
        this.evtTp = value;
        return this;
    }

    /**
     * Gets the value of the subEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DTCCSubEventType8Code }
     *     
     */
    public DTCCSubEventType8Code getSubEvtTp() {
        return subEvtTp;
    }

    /**
     * Sets the value of the subEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTCCSubEventType8Code }
     *     
     */
    public CorporateActionGeneralInformationSD40 setSubEvtTp(DTCCSubEventType8Code value) {
        this.subEvtTp = value;
        return this;
    }

    /**
     * Gets the value of the evtGrp property.
     * 
     * @return
     *     possible object is
     *     {@link EventGroup4Code }
     *     
     */
    public EventGroup4Code getEvtGrp() {
        return evtGrp;
    }

    /**
     * Sets the value of the evtGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventGroup4Code }
     *     
     */
    public CorporateActionGeneralInformationSD40 setEvtGrp(EventGroup4Code value) {
        this.evtGrp = value;
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
