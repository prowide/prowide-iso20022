
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
 * Specifies the status of an investigation case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationStatus6Choice", propOrder = {
    "conf",
    "rjctdMod",
    "dplctOf",
    "assgnmtCxlConf"
})
public class InvestigationStatus6Choice {

    @XmlElement(name = "Conf")
    protected String conf;
    @XmlElement(name = "RjctdMod")
    protected List<ModificationStatusReason1Choice> rjctdMod;
    @XmlElement(name = "DplctOf")
    protected Case6 dplctOf;
    @XmlElement(name = "AssgnmtCxlConf")
    protected Boolean assgnmtCxlConf;

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationStatus6Choice setConf(String value) {
        this.conf = value;
        return this;
    }

    /**
     * Gets the value of the rjctdMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rjctdMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationStatusReason1Choice }
     * 
     * 
     */
    public List<ModificationStatusReason1Choice> getRjctdMod() {
        if (rjctdMod == null) {
            rjctdMod = new ArrayList<ModificationStatusReason1Choice>();
        }
        return this.rjctdMod;
    }

    /**
     * Gets the value of the dplctOf property.
     * 
     * @return
     *     possible object is
     *     {@link Case6 }
     *     
     */
    public Case6 getDplctOf() {
        return dplctOf;
    }

    /**
     * Sets the value of the dplctOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case6 }
     *     
     */
    public InvestigationStatus6Choice setDplctOf(Case6 value) {
        this.dplctOf = value;
        return this;
    }

    /**
     * Gets the value of the assgnmtCxlConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssgnmtCxlConf() {
        return assgnmtCxlConf;
    }

    /**
     * Sets the value of the assgnmtCxlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestigationStatus6Choice setAssgnmtCxlConf(Boolean value) {
        this.assgnmtCxlConf = value;
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
     * Adds a new item to the rjctdMod list.
     * @see #getRjctdMod()
     * 
     */
    public InvestigationStatus6Choice addRjctdMod(ModificationStatusReason1Choice rjctdMod) {
        getRjctdMod().add(rjctdMod);
        return this;
    }

}
