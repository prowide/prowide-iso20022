
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Configuration parameters to communicate with a host.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCommunicationParameter1", propOrder = {
    "hstId",
    "adr",
    "key"
})
public class HostCommunicationParameter1 {

    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "Adr")
    protected NetworkParameters1 adr;
    @XmlElement(name = "Key")
    protected List<CryptographicKey1> key;

    /**
     * Gets the value of the hstId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstId() {
        return hstId;
    }

    /**
     * Sets the value of the hstId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HostCommunicationParameter1 setHstId(String value) {
        this.hstId = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters1 }
     *     
     */
    public NetworkParameters1 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters1 }
     *     
     */
    public HostCommunicationParameter1 setAdr(NetworkParameters1 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey1 }
     * 
     * 
     */
    public List<CryptographicKey1> getKey() {
        if (key == null) {
            key = new ArrayList<CryptographicKey1>();
        }
        return this.key;
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
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public HostCommunicationParameter1 addKey(CryptographicKey1 key) {
        getKey().add(key);
        return this;
    }

}
