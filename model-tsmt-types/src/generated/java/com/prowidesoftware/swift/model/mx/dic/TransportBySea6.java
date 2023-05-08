
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
@XmlType(name = "TransportBySea6", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "vsslNm",
    "seaCrrierNm",
    "seaCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportBySea6 {

    @XmlElement(name = "PortOfLoadng")
    protected List<String> portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected List<String> portOfDschrge;
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

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the portOfLoadng property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfLoadng().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the portOfLoadng property.
     */
    public List<String> getPortOfLoadng() {
        if (portOfLoadng == null) {
            portOfLoadng = new ArrayList<>();
        }
        return this.portOfLoadng;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the portOfDschrge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortOfDschrge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the portOfDschrge property.
     */
    public List<String> getPortOfDschrge() {
        if (portOfDschrge == null) {
            portOfDschrge = new ArrayList<>();
        }
        return this.portOfDschrge;
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
    public TransportBySea6 setVsslNm(String value) {
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
    public TransportBySea6 setSeaCrrierNm(String value) {
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
    public TransportBySea6 setSeaCrrierCtry(String value) {
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
    public TransportBySea6 setCrrierAgtNm(String value) {
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
    public TransportBySea6 setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
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

    /**
     * Adds a new item to the portOfLoadng list.
     * @see #getPortOfLoadng()
     * 
     */
    public TransportBySea6 addPortOfLoadng(String portOfLoadng) {
        getPortOfLoadng().add(portOfLoadng);
        return this;
    }

    /**
     * Adds a new item to the portOfDschrge list.
     * @see #getPortOfDschrge()
     * 
     */
    public TransportBySea6 addPortOfDschrge(String portOfDschrge) {
        getPortOfDschrge().add(portOfDschrge);
        return this;
    }

}
