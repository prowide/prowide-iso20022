
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
 * The SettlementReportingInitiation message is usually sent by an agent (processor, clearing or settlement agent) to an acquirer, agent or issuer to inform about financial totals already settled or to be settled issued as an outcome of the clearing process.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementReportingInitiationV02", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class SettlementReportingInitiationV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header66 hdr;
    @XmlElement(name = "Body", required = true)
    protected SettlementReportingInitiation2 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header66 }
     *     
     */
    public Header66 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header66 }
     *     
     */
    public SettlementReportingInitiationV02 setHdr(Header66 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingInitiation2 }
     *     
     */
    public SettlementReportingInitiation2 getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingInitiation2 }
     *     
     */
    public SettlementReportingInitiationV02 setBody(SettlementReportingInitiation2 value) {
        this.body = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType20 }
     *     
     */
    public ContentInformationType20 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType20 }
     *     
     */
    public SettlementReportingInitiationV02 setSctyTrlr(ContentInformationType20 value) {
        this.sctyTrlr = value;
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
