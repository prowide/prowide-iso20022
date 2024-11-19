
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
@XmlType(name = "TransportBySea5", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm",
    "seaCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry",
    "mstrNm",
    "chrtrrNm",
    "ownrNm",
    "imoNb",
    "vygNb"
})
public class TransportBySea5 {

    @XmlElement(name = "PortOfLoadng", required = true)
    protected String portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected String portOfDschrge;
    @XmlElement(name = "VsslNm")
    protected String vsslNm;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;
    @XmlElement(name = "SeaCrrierCtry")
    protected String seaCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;
    @XmlElement(name = "MstrNm")
    protected String mstrNm;
    @XmlElement(name = "ChrtrrNm")
    protected String chrtrrNm;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "IMONb")
    protected String imoNb;
    @XmlElement(name = "VygNb")
    protected String vygNb;

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
    public TransportBySea5 setPortOfLoadng(String value) {
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
    public TransportBySea5 setPortOfDschrge(String value) {
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
    public TransportBySea5 setVsslNm(String value) {
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
    public TransportBySea5 setSeaCrrierNm(String value) {
        this.seaCrrierNm = value;
        return this;
    }

    /**
     * Gets the value of the seaCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaCrrierCtry() {
        return seaCrrierCtry;
    }

    /**
     * Sets the value of the seaCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setSeaCrrierCtry(String value) {
        this.seaCrrierCtry = value;
        return this;
    }

    /**
     * Gets the value of the crrierAgtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtNm() {
        return crrierAgtNm;
    }

    /**
     * Sets the value of the crrierAgtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setCrrierAgtNm(String value) {
        this.crrierAgtNm = value;
        return this;
    }

    /**
     * Gets the value of the crrierAgtCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtCtry() {
        return crrierAgtCtry;
    }

    /**
     * Sets the value of the crrierAgtCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
        return this;
    }

    /**
     * Gets the value of the mstrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrNm() {
        return mstrNm;
    }

    /**
     * Sets the value of the mstrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setMstrNm(String value) {
        this.mstrNm = value;
        return this;
    }

    /**
     * Gets the value of the chrtrrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtrrNm() {
        return chrtrrNm;
    }

    /**
     * Sets the value of the chrtrrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setChrtrrNm(String value) {
        this.chrtrrNm = value;
        return this;
    }

    /**
     * Gets the value of the ownrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Sets the value of the ownrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setOwnrNm(String value) {
        this.ownrNm = value;
        return this;
    }

    /**
     * Gets the value of the imoNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMONb() {
        return imoNb;
    }

    /**
     * Sets the value of the imoNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setIMONb(String value) {
        this.imoNb = value;
        return this;
    }

    /**
     * Gets the value of the vygNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVygNb() {
        return vygNb;
    }

    /**
     * Sets the value of the vygNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportBySea5 setVygNb(String value) {
        this.vygNb = value;
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
