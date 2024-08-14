
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
 * Information related for the transportation of goods by sea.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportBySea2", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm"
})
public class TransportBySea2 {

    @XmlElement(name = "PortOfLoadng", required = true)
    protected String portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected String portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfLoadng() {
        return portOfLoadng;
    }

    /**
     * Sets the value of the portOfLoadng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea2 setPortOfLoadng(String value) {
        this.portOfLoadng = value;
        return this;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfDschrge() {
        return portOfDschrge;
    }

    /**
     * Sets the value of the portOfDschrge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea2 setPortOfDschrge(String value) {
        this.portOfDschrge = value;
        return this;
    }

    /**
     * Gets the value of the vsslNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVsslNm() {
        return vsslNm;
    }

    /**
     * Sets the value of the vsslNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea2 setVsslNm(String value) {
        this.vsslNm = value;
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
