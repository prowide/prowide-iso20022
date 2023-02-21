
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
@XmlType(name = "TransportBySea3", propOrder = {
    "portOfLoadng",
    "portOfDschrge",
    "seaCrrierNm"
})
public class TransportBySea3 {

    @XmlElement(name = "PortOfLoadng")
    protected List<String> portOfLoadng;
    @XmlElement(name = "PortOfDschrge", required = true)
    protected List<String> portOfDschrge;
    @XmlElement(name = "SeaCrrierNm")
    protected String seaCrrierNm;

    /**
     * Gets the value of the portOfLoadng property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portOfLoadng property.
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
     */
    public List<String> getPortOfLoadng() {
        if (portOfLoadng == null) {
            portOfLoadng = new ArrayList<String>();
        }
        return this.portOfLoadng;
    }

    /**
     * Gets the value of the portOfDschrge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portOfDschrge property.
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
     */
    public List<String> getPortOfDschrge() {
        if (portOfDschrge == null) {
            portOfDschrge = new ArrayList<String>();
        }
        return this.portOfDschrge;
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
    public TransportBySea3 setSeaCrrierNm(String value) {
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

    /**
     * Adds a new item to the portOfLoadng list.
     * @see #getPortOfLoadng()
     * 
     */
    public TransportBySea3 addPortOfLoadng(String portOfLoadng) {
        getPortOfLoadng().add(portOfLoadng);
        return this;
    }

    /**
     * Adds a new item to the portOfDschrge list.
     * @see #getPortOfDschrge()
     * 
     */
    public TransportBySea3 addPortOfDschrge(String portOfDschrge) {
        getPortOfDschrge().add(portOfDschrge);
        return this;
    }

}
