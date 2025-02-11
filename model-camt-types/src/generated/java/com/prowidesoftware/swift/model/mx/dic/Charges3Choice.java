
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
 * Provides information on the charges to be paid by the charge bearer(s) related to the processing of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges3Choice", propOrder = {
    "sngl",
    "perTx",
    "perTp"
})
public class Charges3Choice {

    @XmlElement(name = "Sngl")
    protected ChargesRecord9 sngl;
    @XmlElement(name = "PerTx")
    protected ChargesPerTransaction3 perTx;
    @XmlElement(name = "PerTp")
    protected List<ChargesPerType3> perTp;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRecord9 }
     *     
     */
    public ChargesRecord9 getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRecord9 }
     *     
     */
    public Charges3Choice setSngl(ChargesRecord9 value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the perTx property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesPerTransaction3 }
     *     
     */
    public ChargesPerTransaction3 getPerTx() {
        return perTx;
    }

    /**
     * Sets the value of the perTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesPerTransaction3 }
     *     
     */
    public Charges3Choice setPerTx(ChargesPerTransaction3 value) {
        this.perTx = value;
        return this;
    }

    /**
     * Gets the value of the perTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the perTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesPerType3 }
     * 
     * 
     * @return
     *     The value of the perTp property.
     */
    public List<ChargesPerType3> getPerTp() {
        if (perTp == null) {
            perTp = new ArrayList<>();
        }
        return this.perTp;
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
     * Adds a new item to the perTp list.
     * @see #getPerTp()
     * 
     */
    public Charges3Choice addPerTp(ChargesPerType3 perTp) {
        getPerTp().add(perTp);
        return this;
    }

}
