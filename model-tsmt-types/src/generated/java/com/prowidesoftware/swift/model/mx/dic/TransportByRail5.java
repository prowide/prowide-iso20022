
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
 * Information related to the transportation of goods by rail.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByRail5", propOrder = {
    "plcOfRct",
    "plcOfDlvry",
    "railCrrierNm",
    "railCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportByRail5 {

    @XmlElement(name = "PlcOfRct")
    protected List<String> plcOfRct;
    @XmlElement(name = "PlcOfDlvry", required = true)
    protected List<String> plcOfDlvry;
    @XmlElement(name = "RailCrrierNm")
    protected String railCrrierNm;
    @XmlElement(name = "RailCrrierCtry")
    protected String railCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;

    /**
     * Gets the value of the plcOfRct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfRct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfRct property.
     */
    public List<String> getPlcOfRct() {
        if (plcOfRct == null) {
            plcOfRct = new ArrayList<>();
        }
        return this.plcOfRct;
    }

    /**
     * Gets the value of the plcOfDlvry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfDlvry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfDlvry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfDlvry property.
     */
    public List<String> getPlcOfDlvry() {
        if (plcOfDlvry == null) {
            plcOfDlvry = new ArrayList<>();
        }
        return this.plcOfDlvry;
    }

    /**
     * Gets the value of the railCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCrrierNm() {
        return railCrrierNm;
    }

    /**
     * Sets the value of the railCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByRail5 setRailCrrierNm(String value) {
        this.railCrrierNm = value;
        return this;
    }

    /**
     * Gets the value of the railCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCrrierCtry() {
        return railCrrierCtry;
    }

    /**
     * Sets the value of the railCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransportByRail5 setRailCrrierCtry(String value) {
        this.railCrrierCtry = value;
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
    public TransportByRail5 setCrrierAgtNm(String value) {
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
    public TransportByRail5 setCrrierAgtCtry(String value) {
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
     * Adds a new item to the plcOfRct list.
     * @see #getPlcOfRct()
     * 
     */
    public TransportByRail5 addPlcOfRct(String plcOfRct) {
        getPlcOfRct().add(plcOfRct);
        return this;
    }

    /**
     * Adds a new item to the plcOfDlvry list.
     * @see #getPlcOfDlvry()
     * 
     */
    public TransportByRail5 addPlcOfDlvry(String plcOfDlvry) {
        getPlcOfDlvry().add(plcOfDlvry);
        return this;
    }

}
