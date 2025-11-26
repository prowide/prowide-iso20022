
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
 * Data related to a component of the POI (Point Of Interaction) performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent17", propOrder = {
    "tp",
    "subTpInf",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt",
    "packg",
    "prbVal"
})
public class PointOfInteractionComponent17 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType7Code tp;
    @XmlElement(name = "SubTpInf")
    protected String subTpInf;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification2 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus3 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics10 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentAssessment1> assmnt;
    @XmlElement(name = "Packg")
    protected List<PackageType5> packg;
    @XmlElement(name = "PrbVal")
    protected byte[] prbVal;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType7Code }
     *     
     */
    public POIComponentType7Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType7Code }
     *     
     */
    public PointOfInteractionComponent17 setTp(POIComponentType7Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the subTpInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTpInf() {
        return subTpInf;
    }

    /**
     * Sets the value of the subTpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponent17 setSubTpInf(String value) {
        this.subTpInf = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public PointOfInteractionComponentIdentification2 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification2 }
     *     
     */
    public PointOfInteractionComponent17 setId(PointOfInteractionComponentIdentification2 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public PointOfInteractionComponentStatus3 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public PointOfInteractionComponent17 setSts(PointOfInteractionComponentStatus3 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stdCmplc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stdCmplc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdCmplc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification48 }
     * 
     * 
     * @return
     *     The value of the stdCmplc property.
     */
    public List<GenericIdentification48> getStdCmplc() {
        if (stdCmplc == null) {
            stdCmplc = new ArrayList<>();
        }
        return this.stdCmplc;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentCharacteristics10 }
     *     
     */
    public PointOfInteractionComponentCharacteristics10 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics10 }
     *     
     */
    public PointOfInteractionComponent17 setChrtcs(PointOfInteractionComponentCharacteristics10 value) {
        this.chrtcs = value;
        return this;
    }

    /**
     * Gets the value of the assmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponentAssessment1 }
     * 
     * 
     * @return
     *     The value of the assmnt property.
     */
    public List<PointOfInteractionComponentAssessment1> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<>();
        }
        return this.assmnt;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType5 }
     * 
     * 
     * @return
     *     The value of the packg property.
     */
    public List<PackageType5> getPackg() {
        if (packg == null) {
            packg = new ArrayList<>();
        }
        return this.packg;
    }

    /**
     * Gets the value of the prbVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrbVal() {
        return prbVal;
    }

    /**
     * Sets the value of the prbVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public PointOfInteractionComponent17 setPrbVal(byte[] value) {
        this.prbVal = value;
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
     * Adds a new item to the stdCmplc list.
     * @see #getStdCmplc()
     * 
     */
    public PointOfInteractionComponent17 addStdCmplc(GenericIdentification48 stdCmplc) {
        getStdCmplc().add(stdCmplc);
        return this;
    }

    /**
     * Adds a new item to the assmnt list.
     * @see #getAssmnt()
     * 
     */
    public PointOfInteractionComponent17 addAssmnt(PointOfInteractionComponentAssessment1 assmnt) {
        getAssmnt().add(assmnt);
        return this;
    }

    /**
     * Adds a new item to the packg list.
     * @see #getPackg()
     * 
     */
    public PointOfInteractionComponent17 addPackg(PackageType5 packg) {
        getPackg().add(packg);
        return this;
    }

}
