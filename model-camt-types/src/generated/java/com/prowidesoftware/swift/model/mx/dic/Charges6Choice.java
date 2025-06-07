
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
 * Provides information on the charges to be paid by the charge bearer(s) related to the processing of the underlying transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges6Choice", propOrder = {
    "sngl",
    "perTx",
    "perTp"
})
public class Charges6Choice {

    @XmlElement(name = "Sngl")
    protected ChargesRecord12 sngl;
    @XmlElement(name = "PerTx")
    protected ChargesPerTransaction6 perTx;
    @XmlElement(name = "PerTp")
    protected List<ChargesPerType6> perTp;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRecord12 }
     *     
     */
    public ChargesRecord12 getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRecord12 }
     *     
     */
    public Charges6Choice setSngl(ChargesRecord12 value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the perTx property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesPerTransaction6 }
     *     
     */
    public ChargesPerTransaction6 getPerTx() {
        return perTx;
    }

    /**
     * Sets the value of the perTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesPerTransaction6 }
     *     
     */
    public Charges6Choice setPerTx(ChargesPerTransaction6 value) {
        this.perTx = value;
        return this;
    }

    /**
     * Gets the value of the perTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the perTp property.
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
     * {@link ChargesPerType6 }
     * 
     * 
     */
    public List<ChargesPerType6> getPerTp() {
        if (perTp == null) {
            perTp = new ArrayList<ChargesPerType6>();
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
    public Charges6Choice addPerTp(ChargesPerType6 perTp) {
        getPerTp().add(perTp);
        return this;
    }

}
