
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
 * Specifies the status of an investigation case.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationStatus3Choice", propOrder = {
    "conf",
    "rjctdMod",
    "dplctOf",
    "assgnmtCxlConf"
})
public class InvestigationStatus3Choice {

    @XmlElement(name = "Conf")
    @XmlSchemaType(name = "string")
    protected InvestigationExecutionConfirmation3Code conf;
    @XmlElement(name = "RjctdMod")
    @XmlSchemaType(name = "string")
    protected List<ModificationRejection2Code> rjctdMod;
    @XmlElement(name = "DplctOf")
    protected Case3 dplctOf;
    @XmlElement(name = "AssgnmtCxlConf")
    protected Boolean assgnmtCxlConf;

    /**
     * Gets the value of the conf property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationExecutionConfirmation3Code }
     *     
     */
    public InvestigationExecutionConfirmation3Code getConf() {
        return conf;
    }

    /**
     * Sets the value of the conf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationExecutionConfirmation3Code }
     *     
     */
    public InvestigationStatus3Choice setConf(InvestigationExecutionConfirmation3Code value) {
        this.conf = value;
        return this;
    }

    /**
     * Gets the value of the rjctdMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdMod property.
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
     * {@link ModificationRejection2Code }
     * 
     * 
     * @return
     *     The value of the rjctdMod property.
     */
    public List<ModificationRejection2Code> getRjctdMod() {
        if (rjctdMod == null) {
            rjctdMod = new ArrayList<>();
        }
        return this.rjctdMod;
    }

    /**
     * Gets the value of the dplctOf property.
     * 
     * @return
     *     possible object is
     *     {@link Case3 }
     *     
     */
    public Case3 getDplctOf() {
        return dplctOf;
    }

    /**
     * Sets the value of the dplctOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case3 }
     *     
     */
    public InvestigationStatus3Choice setDplctOf(Case3 value) {
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
    public InvestigationStatus3Choice setAssgnmtCxlConf(Boolean value) {
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
    public InvestigationStatus3Choice addRjctdMod(ModificationRejection2Code rjctdMod) {
        getRjctdMod().add(rjctdMod);
        return this;
    }

}
