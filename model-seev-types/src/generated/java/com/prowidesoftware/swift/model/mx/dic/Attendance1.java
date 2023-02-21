
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information and conditions provided for the physical attendance to the meeting.  
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attendance1", propOrder = {
    "admssnConds",
    "confInf",
    "confDdln",
    "confMktDdln"
})
public class Attendance1 {

    @XmlElement(name = "AdmssnConds")
    protected List<AttendanceAdmissionConditions1> admssnConds;
    @XmlElement(name = "ConfInf")
    protected String confInf;
    @XmlElement(name = "ConfDdln")
    protected DateFormat58Choice confDdln;
    @XmlElement(name = "ConfMktDdln")
    protected DateFormat58Choice confMktDdln;

    /**
     * Gets the value of the admssnConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the admssnConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdmssnConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendanceAdmissionConditions1 }
     * 
     * 
     */
    public List<AttendanceAdmissionConditions1> getAdmssnConds() {
        if (admssnConds == null) {
            admssnConds = new ArrayList<AttendanceAdmissionConditions1>();
        }
        return this.admssnConds;
    }

    /**
     * Gets the value of the confInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfInf() {
        return confInf;
    }

    /**
     * Sets the value of the confInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Attendance1 setConfInf(String value) {
        this.confInf = value;
        return this;
    }

    /**
     * Gets the value of the confDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getConfDdln() {
        return confDdln;
    }

    /**
     * Sets the value of the confDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public Attendance1 setConfDdln(DateFormat58Choice value) {
        this.confDdln = value;
        return this;
    }

    /**
     * Gets the value of the confMktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat58Choice }
     *     
     */
    public DateFormat58Choice getConfMktDdln() {
        return confMktDdln;
    }

    /**
     * Sets the value of the confMktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat58Choice }
     *     
     */
    public Attendance1 setConfMktDdln(DateFormat58Choice value) {
        this.confMktDdln = value;
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
     * Adds a new item to the admssnConds list.
     * @see #getAdmssnConds()
     * 
     */
    public Attendance1 addAdmssnConds(AttendanceAdmissionConditions1 admssnConds) {
        getAdmssnConds().add(admssnConds);
        return this;
    }

}
