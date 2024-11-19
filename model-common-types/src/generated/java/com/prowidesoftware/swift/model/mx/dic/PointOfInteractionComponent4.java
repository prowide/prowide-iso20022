
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
@XmlType(name = "PointOfInteractionComponent4", propOrder = {
    "tp",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt"
})
public class PointOfInteractionComponent4 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType3Code tp;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification1 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus1 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics2 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentAssessment1> assmnt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType3Code }
     *     
     */
    public POIComponentType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType3Code }
     *     
     */
    public PointOfInteractionComponent4 setTp(POIComponentType3Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification1 }
     *     
     */
    public PointOfInteractionComponentIdentification1 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification1 }
     *     
     */
    public PointOfInteractionComponent4 setId(PointOfInteractionComponentIdentification1 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentStatus1 }
     *     
     */
    public PointOfInteractionComponentStatus1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentStatus1 }
     *     
     */
    public PointOfInteractionComponent4 setSts(PointOfInteractionComponentStatus1 value) {
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
     *     {@link PointOfInteractionComponentCharacteristics2 }
     *     
     */
    public PointOfInteractionComponentCharacteristics2 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics2 }
     *     
     */
    public PointOfInteractionComponent4 setChrtcs(PointOfInteractionComponentCharacteristics2 value) {
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
    public PointOfInteractionComponent4 addStdCmplc(GenericIdentification48 stdCmplc) {
        getStdCmplc().add(stdCmplc);
        return this;
    }

    /**
     * Adds a new item to the assmnt list.
     * @see #getAssmnt()
     * 
     */
    public PointOfInteractionComponent4 addAssmnt(PointOfInteractionComponentAssessment1 assmnt) {
        getAssmnt().add(assmnt);
        return this;
    }

}
