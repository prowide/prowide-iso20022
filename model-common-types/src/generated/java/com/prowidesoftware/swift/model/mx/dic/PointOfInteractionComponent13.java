
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
 * Data related to a component of the POI (Point Of Interaction) performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent13", propOrder = {
    "tp",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt"
})
public class PointOfInteractionComponent13 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType5Code tp;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification3 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus3 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics4 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentIdentification3> assmnt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType5Code }
     *     
     */
    public POIComponentType5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType5Code }
     *     
     */
    public PointOfInteractionComponent13 setTp(POIComponentType5Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public PointOfInteractionComponentIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public PointOfInteractionComponent13 setId(PointOfInteractionComponentIdentification3 value) {
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
    public PointOfInteractionComponent13 setSts(PointOfInteractionComponentStatus3 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stdCmplc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stdCmplc property.
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
     */
    public List<GenericIdentification48> getStdCmplc() {
        if (stdCmplc == null) {
            stdCmplc = new ArrayList<GenericIdentification48>();
        }
        return this.stdCmplc;
    }

    /**
     * Gets the value of the chrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public PointOfInteractionComponentCharacteristics4 getChrtcs() {
        return chrtcs;
    }

    /**
     * Sets the value of the chrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public PointOfInteractionComponent13 setChrtcs(PointOfInteractionComponentCharacteristics4 value) {
        this.chrtcs = value;
        return this;
    }

    /**
     * Gets the value of the assmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assmnt property.
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
     * {@link PointOfInteractionComponentIdentification3 }
     * 
     * 
     */
    public List<PointOfInteractionComponentIdentification3> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<PointOfInteractionComponentIdentification3>();
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
    public PointOfInteractionComponent13 addStdCmplc(GenericIdentification48 stdCmplc) {
        getStdCmplc().add(stdCmplc);
        return this;
    }

    /**
     * Adds a new item to the assmnt list.
     * @see #getAssmnt()
     * 
     */
    public PointOfInteractionComponent13 addAssmnt(PointOfInteractionComponentIdentification3 assmnt) {
        getAssmnt().add(assmnt);
        return this;
    }

}
