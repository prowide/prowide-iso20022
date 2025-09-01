
package com.prowidesoftware.swift.model.mx.dic;

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
 * Information about a document.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document8", propOrder = {
    "tp",
    "wrdg",
    "elctrncDtls"
})
public class Document8 {

    @XmlElement(name = "Tp", required = true)
    protected PresentationDocumentFormat1Choice tp;
    @XmlElement(name = "Wrdg")
    protected String wrdg;
    @XmlElement(name = "ElctrncDtls")
    protected List<Presentation3> elctrncDtls;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationDocumentFormat1Choice }
     *     
     */
    public PresentationDocumentFormat1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationDocumentFormat1Choice }
     *     
     */
    public Document8 setTp(PresentationDocumentFormat1Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the wrdg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrdg() {
        return wrdg;
    }

    /**
     * Sets the value of the wrdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Document8 setWrdg(String value) {
        this.wrdg = value;
        return this;
    }

    /**
     * Gets the value of the elctrncDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elctrncDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElctrncDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Presentation3 }
     * 
     * 
     */
    public List<Presentation3> getElctrncDtls() {
        if (elctrncDtls == null) {
            elctrncDtls = new ArrayList<Presentation3>();
        }
        return this.elctrncDtls;
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
     * Adds a new item to the elctrncDtls list.
     * @see #getElctrncDtls()
     * 
     */
    public Document8 addElctrncDtls(Presentation3 elctrncDtls) {
        getElctrncDtls().add(elctrncDtls);
        return this;
    }

}
