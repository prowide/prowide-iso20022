
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "LoginResponse1", propOrder = {
    "poiDtTm",
    "poiSftwr",
    "poiCpblties"
})
public class LoginResponse1 {

    @XmlElement(name = "POIDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar poiDtTm;
    @XmlElement(name = "POISftwr", required = true)
    protected List<PointOfInteractionComponent9> poiSftwr;
    @XmlElement(name = "POICpblties")
    protected PointOfInteractionCapabilities8 poiCpblties;

    /**
     * Gets the value of the poiDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPOIDtTm() {
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
    public LoginResponse1 setPOIDtTm(XMLGregorianCalendar value) {
        this.poiDtTm = value;
        return this;
    }

    /**
     * Gets the value of the poiSftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poiSftwr property.
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
     * {@link PointOfInteractionComponent9 }
     * 
     * 
     */
    public List<PointOfInteractionComponent9> getPOISftwr() {
        if (poiSftwr == null) {
            poiSftwr = new ArrayList<PointOfInteractionComponent9>();
        }
        return this.poiSftwr;
    }

    /**
     * Gets the value of the poiCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities8 }
     *     
     */
    public PointOfInteractionCapabilities8 getPOICpblties() {
        return poiCpblties;
    }

    /**
     * Sets the value of the poiCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities8 }
     *     
     */
    public LoginResponse1 setPOICpblties(PointOfInteractionCapabilities8 value) {
        this.poiCpblties = value;
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
    public LoginResponse1 addPOISftwr(PointOfInteractionComponent9 pOISftwr) {
        getPOISftwr().add(pOISftwr);
        return this;
    }

}
