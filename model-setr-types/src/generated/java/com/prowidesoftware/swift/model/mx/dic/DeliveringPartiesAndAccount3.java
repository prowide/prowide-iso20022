
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
@XmlType(name = "DeliveringPartiesAndAccount3", propOrder = {
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmyDtls",
    "dlvrgAgtDtls"
})
public class DeliveringPartiesAndAccount3 {

    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount3 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmyDtls")
    protected PartyIdentificationAndAccount3 dlvrrsIntrmyDtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount3 dlvrgAgtDtls;

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public DeliveringPartiesAndAccount3 setDlvrrsCtdnDtls(PartyIdentificationAndAccount3 value) {
        this.dlvrrsCtdnDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrrsIntrmyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getDlvrrsIntrmyDtls() {
        return dlvrrsIntrmyDtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public DeliveringPartiesAndAccount3 setDlvrrsIntrmyDtls(PartyIdentificationAndAccount3 value) {
        this.dlvrrsIntrmyDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public PartyIdentificationAndAccount3 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount3 }
     *     
     */
    public DeliveringPartiesAndAccount3 setDlvrgAgtDtls(PartyIdentificationAndAccount3 value) {
        this.dlvrgAgtDtls = value;
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
