
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
 * Information related for the transportation of goods by sea.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportBySea4", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm"
})
public class TransportBySea4 {

    @XmlElement(name = "PortOfLoadng", required = true)
    protected String portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected String portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;

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
    public TransportBySea4 setPortOfLoadng(String value) {
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
    public TransportBySea4 setPortOfDschrge(String value) {
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
    public TransportBySea4 setVsslNm(String value) {
        this.vsslNm = value;
        return this;
    }

    /**
     * Gets the value of the seaCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierNm() {
        return seaCrrierNm;
    }

    /**
     * Sets the value of the seaCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea4 setSeaCrrierNm(String value) {
        this.seaCrrierNm = value;
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
