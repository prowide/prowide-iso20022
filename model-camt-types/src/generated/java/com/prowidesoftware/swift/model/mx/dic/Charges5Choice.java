
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
 * Specifies the choice between single transaction charges, consolidated charges per transaction or per charge type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charges5Choice", propOrder = {
    "sngl",
    "perTx",
    "perTp"
})
public class Charges5Choice {

    @XmlElement(name = "Sngl")
    protected ChargesRecord11 sngl;
    @XmlElement(name = "PerTx")
    protected ChargesPerTransaction5 perTx;
    @XmlElement(name = "PerTp")
    protected List<ChargesPerType5> perTp;

    /**
     * Gets the value of the sngl property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesRecord11 }
     *     
     */
    public ChargesRecord11 getSngl() {
        return sngl;
    }

    /**
     * Sets the value of the sngl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesRecord11 }
     *     
     */
    public Charges5Choice setSngl(ChargesRecord11 value) {
        this.sngl = value;
        return this;
    }

    /**
     * Gets the value of the perTx property.
     * 
     * @return
     *     possible object is
     *     {@link ChargesPerTransaction5 }
     *     
     */
    public ChargesPerTransaction5 getPerTx() {
        return perTx;
    }

    /**
     * Sets the value of the perTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesPerTransaction5 }
     *     
     */
    public Charges5Choice setPerTx(ChargesPerTransaction5 value) {
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
     * {@link ChargesPerType5 }
     * 
     * 
     */
    public List<ChargesPerType5> getPerTp() {
        if (perTp == null) {
            perTp = new ArrayList<ChargesPerType5>();
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
    public Charges5Choice addPerTp(ChargesPerType5 perTp) {
        getPerTp().add(perTp);
        return this;
    }

}
