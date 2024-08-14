
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
 * Specifies individually each leg of a transport of goods.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleTransport3", propOrder = {
    "trnsprtByAir",
    "trnsprtBySea",
    "trnsprtByRoad",
    "trnsprtByRail"
})
public class SingleTransport3 {

    @XmlElement(name = "TrnsprtByAir")
    protected TransportByAir2 trnsprtByAir;
    @XmlElement(name = "TrnsprtBySea")
    protected TransportBySea4 trnsprtBySea;
    @XmlElement(name = "TrnsprtByRoad")
    protected TransportByRoad2 trnsprtByRoad;
    @XmlElement(name = "TrnsprtByRail")
    protected TransportByRail2 trnsprtByRail;

    /**
     * Gets the value of the trnsprtByAir property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByAir2 }
     *     
     */
    public TransportByAir2 getTrnsprtByAir() {
        return trnsprtByAir;
    }

    /**
     * Sets the value of the trnsprtByAir property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByAir2 }
     *     
     */
    public SingleTransport3 setTrnsprtByAir(TransportByAir2 value) {
        this.trnsprtByAir = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtBySea property.
     * 
     * @return
     *     possible object is
     *     {@link TransportBySea4 }
     *     
     */
    public TransportBySea4 getTrnsprtBySea() {
        return trnsprtBySea;
    }

    /**
     * Sets the value of the trnsprtBySea property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportBySea4 }
     *     
     */
    public SingleTransport3 setTrnsprtBySea(TransportBySea4 value) {
        this.trnsprtBySea = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtByRoad property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByRoad2 }
     *     
     */
    public TransportByRoad2 getTrnsprtByRoad() {
        return trnsprtByRoad;
    }

    /**
     * Sets the value of the trnsprtByRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByRoad2 }
     *     
     */
    public SingleTransport3 setTrnsprtByRoad(TransportByRoad2 value) {
        this.trnsprtByRoad = value;
        return this;
    }

    /**
     * Gets the value of the trnsprtByRail property.
     * 
     * @return
     *     possible object is
     *     {@link TransportByRail2 }
     *     
     */
    public TransportByRail2 getTrnsprtByRail() {
        return trnsprtByRail;
    }

    /**
     * Sets the value of the trnsprtByRail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportByRail2 }
     *     
     */
    public SingleTransport3 setTrnsprtByRail(TransportByRail2 value) {
        this.trnsprtByRail = value;
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
