
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
 * Choice between netting group identification of an individual trading party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NettingIdentification1Choice", propOrder = {
    "tradPty",
    "netgGrpId"
})
public class NettingIdentification1Choice {

    @XmlElement(name = "TradPty")
    protected PartyIdentification73Choice tradPty;
    @XmlElement(name = "NetgGrpId")
    protected String netgGrpId;

    /**
     * Gets the value of the tradPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getTradPty() {
        return tradPty;
    }

    /**
     * Sets the value of the tradPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NettingIdentification1Choice setTradPty(PartyIdentification73Choice value) {
        this.tradPty = value;
        return this;
    }

    /**
     * Gets the value of the netgGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetgGrpId() {
        return netgGrpId;
    }

    /**
     * Sets the value of the netgGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NettingIdentification1Choice setNetgGrpId(String value) {
        this.netgGrpId = value;
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
