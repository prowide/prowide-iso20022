
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
 * Specifies the choice between single transaction charges, consolidated charges per transaction or per charge type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges4Choice", propOrder = {
    "sngl",
    "perTx",
    "perTp"
})
public class Charges4Choice {

    @XmlElement(name = "Sngl")
    protected ChargesRecord10 sngl;
    @XmlElement(name = "PerTx")
    protected ChargesPerTransaction4 perTx;
    @XmlElement(name = "PerTp")
    protected List<ChargesPerType4> perTp;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRecord10 }
     *     
     */
    public ChargesRecord10 getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRecord10 }
     *     
     */
    public Charges4Choice setSngl(ChargesRecord10 value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the perTx property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesPerTransaction4 }
     *     
     */
    public ChargesPerTransaction4 getPerTx() {
        return perTx;
    }

    /**
     * Sets the value of the perTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesPerTransaction4 }
     *     
     */
    public Charges4Choice setPerTx(ChargesPerTransaction4 value) {
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
     * {@link ChargesPerType4 }
     * 
     * 
     * @return
     *     The value of the perTp property.
     */
    public List<ChargesPerType4> getPerTp() {
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
    public Charges4Choice addPerTp(ChargesPerType4 perTp) {
        getPerTp().add(perTp);
        return this;
    }

}
