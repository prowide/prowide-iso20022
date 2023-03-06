
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
 * Data related to a component of the POI.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent2", propOrder = {
    "poiCmpntTp",
    "manfctrId",
    "mdl",
    "vrsnNb",
    "srlNb",
    "apprvlNb"
})
public class PointOfInteractionComponent2 {

    @XmlElement(name = "POICmpntTp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType2Code poiCmpntTp;
    @XmlElement(name = "ManfctrId")
    protected String manfctrId;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "VrsnNb")
    protected String vrsnNb;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ApprvlNb")
    protected List<String> apprvlNb;

    /**
     * Gets the value of the poiCmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType2Code }
     *     
     */
    public POIComponentType2Code getPOICmpntTp() {
        return poiCmpntTp;
    }

    /**
     * Sets the value of the poiCmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType2Code }
     *     
     */
    public PointOfInteractionComponent2 setPOICmpntTp(POIComponentType2Code value) {
        this.poiCmpntTp = value;
        return this;
    }

    /**
     * Gets the value of the manfctrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrId() {
        return manfctrId;
    }

    /**
     * Sets the value of the manfctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponent2 setManfctrId(String value) {
        this.manfctrId = value;
        return this;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponent2 setMdl(String value) {
        this.mdl = value;
        return this;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponent2 setVrsnNb(String value) {
        this.vrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfInteractionComponent2 setSrlNb(String value) {
        this.srlNb = value;
        return this;
    }

    /**
     * Gets the value of the apprvlNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apprvlNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprvlNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApprvlNb() {
        if (apprvlNb == null) {
            apprvlNb = new ArrayList<String>();
        }
        return this.apprvlNb;
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
     * Adds a new item to the apprvlNb list.
     * @see #getApprvlNb()
     * 
     */
    public PointOfInteractionComponent2 addApprvlNb(String apprvlNb) {
        getApprvlNb().add(apprvlNb);
        return this;
    }

}
