
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
 * Contains the details of the labour performed and associated duration and billing rate. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemporaryServicesLabor1", propOrder = {
    "tmSheetNb",
    "wkEndg",
    "chrg"
})
public class TemporaryServicesLabor1 {

    @XmlElement(name = "TmSheetNb")
    protected String tmSheetNb;
    @XmlElement(name = "WkEndg")
    protected String wkEndg;
    @XmlElement(name = "Chrg")
    protected List<Amount12> chrg;

    /**
     * Gets the value of the tmSheetNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmSheetNb() {
        return tmSheetNb;
    }

    /**
     * Sets the value of the tmSheetNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServicesLabor1 setTmSheetNb(String value) {
        this.tmSheetNb = value;
        return this;
    }

    /**
     * Gets the value of the wkEndg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWkEndg() {
        return wkEndg;
    }

    /**
     * Sets the value of the wkEndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TemporaryServicesLabor1 setWkEndg(String value) {
        this.wkEndg = value;
        return this;
    }

    /**
     * Gets the value of the chrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Amount12 }
     * 
     * 
     */
    public List<Amount12> getChrg() {
        if (chrg == null) {
            chrg = new ArrayList<Amount12>();
        }
        return this.chrg;
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
     * Adds a new item to the chrg list.
     * @see #getChrg()
     * 
     */
    public TemporaryServicesLabor1 addChrg(Amount12 chrg) {
        getChrg().add(chrg);
        return this;
    }

}
