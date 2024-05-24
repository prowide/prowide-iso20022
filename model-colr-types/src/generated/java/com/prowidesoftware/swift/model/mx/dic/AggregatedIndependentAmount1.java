
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
 * Independent amount could be defined at a trade level or portfolio level. It is assumed that their treatment will be based on the exposure convention that is whether netted together or treated on a gross basis.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedIndependentAmount1", propOrder = {
    "trad",
    "valAtRsk",
    "netOpnPos",
    "othrAmt"
})
public class AggregatedIndependentAmount1 {

    @XmlElement(name = "Trad")
    protected IndependentAmount1 trad;
    @XmlElement(name = "ValAtRsk")
    protected IndependentAmount1 valAtRsk;
    @XmlElement(name = "NetOpnPos")
    protected IndependentAmount1 netOpnPos;
    @XmlElement(name = "OthrAmt")
    protected List<IndependentAmount2> othrAmt;

    /**
     * Gets the value of the trad property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getTrad() {
        return trad;
    }

    /**
     * Sets the value of the trad property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 setTrad(IndependentAmount1 value) {
        this.trad = value;
        return this;
    }

    /**
     * Gets the value of the valAtRsk property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getValAtRsk() {
        return valAtRsk;
    }

    /**
     * Sets the value of the valAtRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 setValAtRsk(IndependentAmount1 value) {
        this.valAtRsk = value;
        return this;
    }

    /**
     * Gets the value of the netOpnPos property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getNetOpnPos() {
        return netOpnPos;
    }

    /**
     * Sets the value of the netOpnPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 setNetOpnPos(IndependentAmount1 value) {
        this.netOpnPos = value;
        return this;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmount2 }
     * 
     * 
     * @return
     *     The value of the othrAmt property.
     */
    public List<IndependentAmount2> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<>();
        }
        return this.othrAmt;
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
     * Adds a new item to the othrAmt list.
     * @see #getOthrAmt()
     * 
     */
    public AggregatedIndependentAmount1 addOthrAmt(IndependentAmount2 othrAmt) {
        getOthrAmt().add(othrAmt);
        return this;
    }

}
