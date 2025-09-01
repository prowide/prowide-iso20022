
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Physical and logical characteristics of a POI component (Point of Interaction).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentCharacteristics3", propOrder = {
    "mmry",
    "com",
    "sctyAccsMdls",
    "sbcbrIdntyMdls",
    "keyChckVal",
    "keyChrtc",
    "ncrptdKey"
})
public class PointOfInteractionComponentCharacteristics3 {

    @XmlElement(name = "Mmry")
    protected List<MemoryCharacteristics1> mmry;
    @XmlElement(name = "Com")
    protected List<CommunicationCharacteristics3> com;
    @XmlElement(name = "SctyAccsMdls")
    protected BigDecimal sctyAccsMdls;
    @XmlElement(name = "SbcbrIdntyMdls")
    protected BigDecimal sbcbrIdntyMdls;
    @XmlElement(name = "KeyChckVal")
    protected byte[] keyChckVal;
    @XmlElement(name = "KeyChrtc")
    protected KEKIdentifier5 keyChrtc;
    @XmlElement(name = "NcrptdKey")
    protected byte[] ncrptdKey;

    /**
     * Gets the value of the mmry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mmry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryCharacteristics1 }
     * 
     * 
     */
    public List<MemoryCharacteristics1> getMmry() {
        if (mmry == null) {
            mmry = new ArrayList<MemoryCharacteristics1>();
        }
        return this.mmry;
    }

    /**
     * Gets the value of the com property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the com property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationCharacteristics3 }
     * 
     * 
     */
    public List<CommunicationCharacteristics3> getCom() {
        if (com == null) {
            com = new ArrayList<CommunicationCharacteristics3>();
        }
        return this.com;
    }

    /**
     * Gets the value of the sctyAccsMdls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSctyAccsMdls() {
        return sctyAccsMdls;
    }

    /**
     * Sets the value of the sctyAccsMdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PointOfInteractionComponentCharacteristics3 setSctyAccsMdls(BigDecimal value) {
        this.sctyAccsMdls = value;
        return this;
    }

    /**
     * Gets the value of the sbcbrIdntyMdls property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbcbrIdntyMdls() {
        return sbcbrIdntyMdls;
    }

    /**
     * Sets the value of the sbcbrIdntyMdls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PointOfInteractionComponentCharacteristics3 setSbcbrIdntyMdls(BigDecimal value) {
        this.sbcbrIdntyMdls = value;
        return this;
    }

    /**
     * Gets the value of the keyChckVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyChckVal() {
        return keyChckVal;
    }

    /**
     * Sets the value of the keyChckVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PointOfInteractionComponentCharacteristics3 setKeyChckVal(byte[] value) {
        this.keyChckVal = value;
        return this;
    }

    /**
     * Gets the value of the keyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier5 }
     *     
     */
    public KEKIdentifier5 getKeyChrtc() {
        return keyChrtc;
    }

    /**
     * Sets the value of the keyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier5 }
     *     
     */
    public PointOfInteractionComponentCharacteristics3 setKeyChrtc(KEKIdentifier5 value) {
        this.keyChrtc = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Sets the value of the ncrptdKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PointOfInteractionComponentCharacteristics3 setNcrptdKey(byte[] value) {
        this.ncrptdKey = value;
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
     * Adds a new item to the mmry list.
     * @see #getMmry()
     * 
     */
    public PointOfInteractionComponentCharacteristics3 addMmry(MemoryCharacteristics1 mmry) {
        getMmry().add(mmry);
        return this;
    }

    /**
     * Adds a new item to the com list.
     * @see #getCom()
     * 
     */
    public PointOfInteractionComponentCharacteristics3 addCom(CommunicationCharacteristics3 com) {
        getCom().add(com);
        return this;
    }

}
