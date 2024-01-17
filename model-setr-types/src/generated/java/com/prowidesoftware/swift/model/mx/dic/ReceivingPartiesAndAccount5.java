
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount5", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmyDtls",
    "rcvgAgtDtls"
})
public class ReceivingPartiesAndAccount5 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount13 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmyDtls")
    protected PartyIdentificationAndAccount13 rcvrsIntrmyDtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount13 rcvgAgtDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public ReceivingPartiesAndAccount5 setRcvrsCtdnDtls(PartyIdentificationAndAccount13 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getRcvrsIntrmyDtls() {
        return rcvrsIntrmyDtls;
    }

    /**
     * Sets the value of the rcvrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public ReceivingPartiesAndAccount5 setRcvrsIntrmyDtls(PartyIdentificationAndAccount13 value) {
        this.rcvrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public PartyIdentificationAndAccount13 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount13 }
     *     
     */
    public ReceivingPartiesAndAccount5 setRcvgAgtDtls(PartyIdentificationAndAccount13 value) {
        this.rcvgAgtDtls = value;
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
