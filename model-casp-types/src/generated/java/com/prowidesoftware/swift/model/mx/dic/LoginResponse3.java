
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Login Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse3", propOrder = {
    "poiDtTm",
    "poiSftwr",
    "poiCpblties",
    "outptDisp"
})
public class LoginResponse3 {

    @XmlElement(name = "POIDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar poiDtTm;
    @XmlElement(name = "POISftwr", required = true)
    protected List<PointOfInteractionComponent11> poiSftwr;
    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities9 poiCpblties;
    @XmlElement(name = "OutptDisp")
    protected ActionMessage8 outptDisp;

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getPOIDtTm() {
        return poiDtTm;
    }

    /**
     * Sets the value of the poiDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoginResponse3 setPOIDtTm(Calendar value) {
        this.poiDtTm = value;
        return this;
    }

    /**
     * Gets the value of the poiSftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the poiSftwr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOISftwr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent11 }
     * 
     * 
     * @return
     *     The value of the poiSftwr property.
     */
    public List<PointOfInteractionComponent11> getPOISftwr() {
        if (poiSftwr == null) {
            poiSftwr = new ArrayList<>();
        }
        return this.poiSftwr;
    }

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public LoginResponse3 setPOICpblties(PointOfInteractionCapabilities9 value) {
        this.poiCpblties = value;
        return this;
    }

    /**
     * Gets the value of the outptDisp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage8 }
     *     
     */
    public ActionMessage8 getOutptDisp() {
        return outptDisp;
    }

    /**
     * Sets the value of the outptDisp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage8 }
     *     
     */
    public LoginResponse3 setOutptDisp(ActionMessage8 value) {
        this.outptDisp = value;
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
     * Adds a new item to the pOISftwr list.
     * @see #getPOISftwr()
     * 
     */
    public LoginResponse3 addPOISftwr(PointOfInteractionComponent11 pOISftwr) {
        getPOISftwr().add(pOISftwr);
        return this;
    }

}
