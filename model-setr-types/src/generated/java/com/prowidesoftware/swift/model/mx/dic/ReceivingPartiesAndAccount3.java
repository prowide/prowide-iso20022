
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount3", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmyDtls",
    "rcvgAgtDtls"
})
public class ReceivingPartiesAndAccount3 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount3 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmyDtls")
    protected PartyIdentificationAndAccount3 rcvrsIntrmyDtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount3 rcvgAgtDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public ReceivingPartiesAndAccount3 setRcvrsCtdnDtls(PartyIdentificationAndAccount3 value) {
        this.rcvrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getRcvrsIntrmyDtls() {
        return rcvrsIntrmyDtls;
    }

    /**
     * Sets the value of the rcvrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public ReceivingPartiesAndAccount3 setRcvrsIntrmyDtls(PartyIdentificationAndAccount3 value) {
        this.rcvrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public ReceivingPartiesAndAccount3 setRcvgAgtDtls(PartyIdentificationAndAccount3 value) {
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
