
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
@XmlType(name = "HostCommunicationParameter7", propOrder = {
    "actnTp",
    "hstId",
    "adr",
    "key",
    "ntwkSvcPrvdr",
    "physIntrfc",
    "xchgMd",
    "ncodgMd"
})
public class HostCommunicationParameter7 {

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
    @XmlElement(name = "XchgMd")
    @XmlSchemaType(name = "string")
    protected CAPEExchangeMode1Code xchgMd;
    @XmlElement(name = "NcodgMd")
    @XmlSchemaType(name = "string")
    protected CAPEEncodingMode1Code ncodgMd;

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
    public HostCommunicationParameter7 setActnTp(TerminalManagementAction3Code value) {
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
    public HostCommunicationParameter7 setHstId(String value) {
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
    public HostCommunicationParameter7 setAdr(NetworkParameters7 value) {
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
    public HostCommunicationParameter7 setNtwkSvcPrvdr(NetworkParameters7 value) {
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
    public HostCommunicationParameter7 setPhysIntrfc(PhysicalInterfaceParameter1 value) {
        this.physIntrfc = value;
        return this;
    }

    /**
     * Gets the value of the xchgMd property.
     * 
     * @return
     *     possible object is
     *     {@link CAPEExchangeMode1Code }
     *     
     */
    public CAPEExchangeMode1Code getXchgMd() {
        return xchgMd;
    }

    /**
     * Sets the value of the xchgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPEExchangeMode1Code }
     *     
     */
    public HostCommunicationParameter7 setXchgMd(CAPEExchangeMode1Code value) {
        this.xchgMd = value;
        return this;
    }

    /**
     * Gets the value of the ncodgMd property.
     * 
     * @return
     *     possible object is
     *     {@link CAPEEncodingMode1Code }
     *     
     */
    public CAPEEncodingMode1Code getNcodgMd() {
        return ncodgMd;
    }

    /**
     * Sets the value of the ncodgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPEEncodingMode1Code }
     *     
     */
    public HostCommunicationParameter7 setNcodgMd(CAPEEncodingMode1Code value) {
        this.ncodgMd = value;
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
    public HostCommunicationParameter7 addKey(KEKIdentifier5 key) {
        getKey().add(key);
        return this;
    }

}
