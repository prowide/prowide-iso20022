
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
 * Information related to the transportation of goods by road.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByRoad2", propOrder = {
    "plcOfRct",
    "plcOfDlvry",
    "roadCrrierNm"
})
public class TransportByRoad2 {

    @XmlElement(name = "PlcOfRct", required = true)
    protected String plcOfRct;
    @XmlElement(name = "PlcOfDlvry", required = true)
    protected String plcOfDlvry;
    @XmlElement(name = "RoadCrrierNm")
    protected String roadCrrierNm;

    /**
     * Gets the value of the plcOfRct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfRct() {
        return plcOfRct;
    }

    /**
     * Sets the value of the plcOfRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByRoad2 setPlcOfRct(String value) {
        this.plcOfRct = value;
        return this;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfDlvry() {
        return plcOfDlvry;
    }

    /**
     * Sets the value of the plcOfDlvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByRoad2 setPlcOfDlvry(String value) {
        this.plcOfDlvry = value;
        return this;
    }

    /**
     * Gets the value of the roadCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadCrrierNm() {
        return roadCrrierNm;
    }

    /**
     * Sets the value of the roadCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByRoad2 setRoadCrrierNm(String value) {
        this.roadCrrierNm = value;
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
