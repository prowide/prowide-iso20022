
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
@XmlType(name = "PointOfInteractionComponentCharacteristics8", propOrder = {
    "mmry",
    "com",
    "sctyAccsMdls",
    "sbcbrIdntyMdls",
    "sctyElmt"
})
public class PointOfInteractionComponentCharacteristics8 {

    @XmlElement(name = "Mmry")
    protected List<MemoryCharacteristics1> mmry;
    @XmlElement(name = "Com")
    protected List<CommunicationCharacteristics5> com;
    @XmlElement(name = "SctyAccsMdls")
    protected BigDecimal sctyAccsMdls;
    @XmlElement(name = "SbcbrIdntyMdls")
    protected BigDecimal sbcbrIdntyMdls;
    @XmlElement(name = "SctyElmt")
    protected List<CryptographicKey16> sctyElmt;

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
     * {@link CommunicationCharacteristics5 }
     * 
     * 
     */
    public List<CommunicationCharacteristics5> getCom() {
        if (com == null) {
            com = new ArrayList<CommunicationCharacteristics5>();
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
    public PointOfInteractionComponentCharacteristics8 setSctyAccsMdls(BigDecimal value) {
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
    public PointOfInteractionComponentCharacteristics8 setSbcbrIdntyMdls(BigDecimal value) {
        this.sbcbrIdntyMdls = value;
        return this;
    }

    /**
     * Gets the value of the sctyElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey16 }
     * 
     * 
     */
    public List<CryptographicKey16> getSctyElmt() {
        if (sctyElmt == null) {
            sctyElmt = new ArrayList<CryptographicKey16>();
        }
        return this.sctyElmt;
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
    public PointOfInteractionComponentCharacteristics8 addMmry(MemoryCharacteristics1 mmry) {
        getMmry().add(mmry);
        return this;
    }

    /**
     * Adds a new item to the com list.
     * @see #getCom()
     * 
     */
    public PointOfInteractionComponentCharacteristics8 addCom(CommunicationCharacteristics5 com) {
        getCom().add(com);
        return this;
    }

    /**
     * Adds a new item to the sctyElmt list.
     * @see #getSctyElmt()
     * 
     */
    public PointOfInteractionComponentCharacteristics8 addSctyElmt(CryptographicKey16 sctyElmt) {
        getSctyElmt().add(sctyElmt);
        return this;
    }

}
