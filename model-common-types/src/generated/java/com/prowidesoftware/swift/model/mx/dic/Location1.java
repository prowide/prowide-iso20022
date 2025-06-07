
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
 * Location information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location1", propOrder = {
    "ctry",
    "ctrySubDvsn",
    "txt"
})
public class Location1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsn")
    protected CountrySubdivision1Choice ctrySubDvsn;
    @XmlElement(name = "Txt")
    protected List<String> txt;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Location1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public CountrySubdivision1Choice getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Sets the value of the ctrySubDvsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public Location1 setCtrySubDvsn(CountrySubdivision1Choice value) {
        this.ctrySubDvsn = value;
        return this;
    }

    /**
     * Gets the value of the txt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxt() {
        if (txt == null) {
            txt = new ArrayList<String>();
        }
        return this.txt;
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
     * Adds a new item to the txt list.
     * @see #getTxt()
     * 
     */
    public Location1 addTxt(String txt) {
        getTxt().add(txt);
        return this;
    }

}
