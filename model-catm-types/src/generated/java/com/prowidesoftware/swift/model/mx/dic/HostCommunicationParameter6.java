
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "HostCommunicationParameter6", propOrder = {
    "actnTp",
    "hstId",
    "adr",
    "key",
    "ntwkSvcPrvdr",
    "physIntrfc"
})
public class HostCommunicationParameter6 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "HstId", required = true)
    protected String hstId;
    @XmlElement(name = "Adr")
    protected NetworkParameters7 adr;
    @XmlElement(name = "Key")
    protected List<KEKIdentifier5> key;
    @XmlElement(name = "NtwkSvcPrvdr")
    protected NetworkParameters7 ntwkSvcPrvdr;
    @XmlElement(name = "PhysIntrfc")
    protected PhysicalInterfaceParameter1 physIntrfc;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public HostCommunicationParameter6 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

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
    public HostCommunicationParameter6 setHstId(String value) {
        this.hstId = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public HostCommunicationParameter6 setAdr(NetworkParameters7 value) {
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
     * {@link KEKIdentifier5 }
     * 
     * 
     */
    public List<KEKIdentifier5> getKey() {
        if (key == null) {
            key = new ArrayList<KEKIdentifier5>();
        }
        return this.key;
    }

    /**
     * Gets the value of the ntwkSvcPrvdr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getNtwkSvcPrvdr() {
        return ntwkSvcPrvdr;
    }

    /**
     * Sets the value of the ntwkSvcPrvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public HostCommunicationParameter6 setNtwkSvcPrvdr(NetworkParameters7 value) {
        this.ntwkSvcPrvdr = value;
        return this;
    }

    /**
     * Gets the value of the physIntrfc property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalInterfaceParameter1 }
     *     
     */
    public PhysicalInterfaceParameter1 getPhysIntrfc() {
        return physIntrfc;
    }

    /**
     * Sets the value of the physIntrfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalInterfaceParameter1 }
     *     
     */
    public HostCommunicationParameter6 setPhysIntrfc(PhysicalInterfaceParameter1 value) {
        this.physIntrfc = value;
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
     * Adds a new item to the key list.
     * @see #getKey()
     * 
     */
    public HostCommunicationParameter6 addKey(KEKIdentifier5 key) {
        getKey().add(key);
        return this;
    }

}
