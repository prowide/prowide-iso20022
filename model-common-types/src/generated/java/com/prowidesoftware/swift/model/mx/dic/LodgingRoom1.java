
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Room details
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingRoom1", propOrder = {
    "roomTp",
    "roomLctn",
    "bedTp",
    "gstsPerRoom",
    "adltsInRoom",
    "chldrnInRoom",
    "dalyRoomRate"
})
public class LodgingRoom1 {

    @XmlElement(name = "RoomTp")
    protected String roomTp;
    @XmlElement(name = "RoomLctn")
    protected String roomLctn;
    @XmlElement(name = "BedTp")
    protected String bedTp;
    @XmlElement(name = "GstsPerRoom")
    protected String gstsPerRoom;
    @XmlElement(name = "AdltsInRoom")
    protected String adltsInRoom;
    @XmlElement(name = "ChldrnInRoom")
    protected String chldrnInRoom;
    @XmlElement(name = "DalyRoomRate")
    protected BigDecimal dalyRoomRate;

    /**
     * Gets the value of the roomTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTp() {
        return roomTp;
    }

    /**
     * Sets the value of the roomTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setRoomTp(String value) {
        this.roomTp = value;
        return this;
    }

    /**
     * Gets the value of the roomLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomLctn() {
        return roomLctn;
    }

    /**
     * Sets the value of the roomLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setRoomLctn(String value) {
        this.roomLctn = value;
        return this;
    }

    /**
     * Gets the value of the bedTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedTp() {
        return bedTp;
    }

    /**
     * Sets the value of the bedTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setBedTp(String value) {
        this.bedTp = value;
        return this;
    }

    /**
     * Gets the value of the gstsPerRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGstsPerRoom() {
        return gstsPerRoom;
    }

    /**
     * Sets the value of the gstsPerRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setGstsPerRoom(String value) {
        this.gstsPerRoom = value;
        return this;
    }

    /**
     * Gets the value of the adltsInRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdltsInRoom() {
        return adltsInRoom;
    }

    /**
     * Sets the value of the adltsInRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setAdltsInRoom(String value) {
        this.adltsInRoom = value;
        return this;
    }

    /**
     * Gets the value of the chldrnInRoom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChldrnInRoom() {
        return chldrnInRoom;
    }

    /**
     * Sets the value of the chldrnInRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingRoom1 setChldrnInRoom(String value) {
        this.chldrnInRoom = value;
        return this;
    }

    /**
     * Gets the value of the dalyRoomRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDalyRoomRate() {
        return dalyRoomRate;
    }

    /**
     * Sets the value of the dalyRoomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LodgingRoom1 setDalyRoomRate(BigDecimal value) {
        this.dalyRoomRate = value;
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
