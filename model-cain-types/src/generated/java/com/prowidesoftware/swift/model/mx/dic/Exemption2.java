
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
 * Strong Customer Authentication exemption details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exemption2", propOrder = {
    "tp",
    "val",
    "rsnNotHnrd"
})
public class Exemption2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected Exemption2Code tp;
    @XmlElement(name = "Val", required = true)
    @XmlSchemaType(name = "string")
    protected AttestationValue1Code val;
    @XmlElement(name = "RsnNotHnrd")
    protected List<String> rsnNotHnrd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Exemption2Code }
     *     
     */
    public Exemption2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemption2Code }
     *     
     */
    public Exemption2 setTp(Exemption2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link AttestationValue1Code }
     *     
     */
    public AttestationValue1Code getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttestationValue1Code }
     *     
     */
    public Exemption2 setVal(AttestationValue1Code value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the rsnNotHnrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsnNotHnrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsnNotHnrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rsnNotHnrd property.
     */
    public List<String> getRsnNotHnrd() {
        if (rsnNotHnrd == null) {
            rsnNotHnrd = new ArrayList<>();
        }
        return this.rsnNotHnrd;
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
     * Adds a new item to the rsnNotHnrd list.
     * @see #getRsnNotHnrd()
     * 
     */
    public Exemption2 addRsnNotHnrd(String rsnNotHnrd) {
        getRsnNotHnrd().add(rsnNotHnrd);
        return this;
    }

}
