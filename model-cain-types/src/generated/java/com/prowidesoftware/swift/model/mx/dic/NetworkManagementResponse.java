
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
 * The NetworkManagementResponse message is sent by an acquirer, an issuer or an agent to answer to an NetworkManagementInitiation message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementResponse", propOrder = {
    "hdr",
    "ntwkMgmtRspn",
    "sctyTrlr"
})
public class NetworkManagementResponse {

    @XmlElement(name = "Hdr", required = true)
    protected Header17 hdr;
    @XmlElement(name = "NtwkMgmtRspn", required = true)
    protected AcquirerNetworkManagementResponse1 ntwkMgmtRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header17 }
     *     
     */
    public Header17 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header17 }
     *     
     */
    public NetworkManagementResponse setHdr(Header17 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the ntwkMgmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerNetworkManagementResponse1 }
     *     
     */
    public AcquirerNetworkManagementResponse1 getNtwkMgmtRspn() {
        return ntwkMgmtRspn;
    }

    /**
     * Sets the value of the ntwkMgmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerNetworkManagementResponse1 }
     *     
     */
    public NetworkManagementResponse setNtwkMgmtRspn(AcquirerNetworkManagementResponse1 value) {
        this.ntwkMgmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public NetworkManagementResponse setSctyTrlr(ContentInformationType15 value) {
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
