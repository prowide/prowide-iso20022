
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
 * Provides details on the calculation of the margin.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Margin3", propOrder = {
    "initlMrgn",
    "vartnMrgn",
    "othrMrgn"
})
public class Margin3 {

    @XmlElement(name = "InitlMrgn")
    protected Amount2 initlMrgn;
    @XmlElement(name = "VartnMrgn")
    protected List<VariationMargin3> vartnMrgn;
    @XmlElement(name = "OthrMrgn")
    protected List<Margin4> othrMrgn;

    /**
     * Gets the value of the initlMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2 }
     *     
     */
    public Amount2 getInitlMrgn() {
        return initlMrgn;
    }

    /**
     * Sets the value of the initlMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2 }
     *     
     */
    public Margin3 setInitlMrgn(Amount2 value) {
        this.initlMrgn = value;
        return this;
    }

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vartnMrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVartnMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariationMargin3 }
     * 
     * 
     */
    public List<VariationMargin3> getVartnMrgn() {
        if (vartnMrgn == null) {
            vartnMrgn = new ArrayList<VariationMargin3>();
        }
        return this.vartnMrgn;
    }

    /**
     * Gets the value of the othrMrgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrMrgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrMrgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Margin4 }
     * 
     * 
     */
    public List<Margin4> getOthrMrgn() {
        if (othrMrgn == null) {
            othrMrgn = new ArrayList<Margin4>();
        }
        return this.othrMrgn;
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
     * Adds a new item to the vartnMrgn list.
     * @see #getVartnMrgn()
     * 
     */
    public Margin3 addVartnMrgn(VariationMargin3 vartnMrgn) {
        getVartnMrgn().add(vartnMrgn);
        return this;
    }

    /**
     * Adds a new item to the othrMrgn list.
     * @see #getOthrMrgn()
     * 
     */
    public Margin3 addOthrMrgn(Margin4 othrMrgn) {
        getOthrMrgn().add(othrMrgn);
        return this;
    }

}
