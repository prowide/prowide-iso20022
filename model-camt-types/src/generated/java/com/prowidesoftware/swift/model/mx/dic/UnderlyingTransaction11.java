
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
 * Identifies the underlying (group of) transaction(s) to which the investigation applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction11", propOrder = {
    "orgnlGrpInfAndCxl",
    "orgnlPmtInfAndCxl"
})
public class UnderlyingTransaction11 {

    @XmlElement(name = "OrgnlGrpInfAndCxl")
    protected OriginalGroupHeader4 orgnlGrpInfAndCxl;
    @XmlElement(name = "OrgnlPmtInfAndCxl")
    protected List<OriginalPaymentInstruction13> orgnlPmtInfAndCxl;

    /**
     * Gets the value of the orgnlGrpInfAndCxl property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader4 }
     *     
     */
    public OriginalGroupHeader4 getOrgnlGrpInfAndCxl() {
        return orgnlGrpInfAndCxl;
    }

    /**
     * Sets the value of the orgnlGrpInfAndCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader4 }
     *     
     */
    public UnderlyingTransaction11 setOrgnlGrpInfAndCxl(OriginalGroupHeader4 value) {
        this.orgnlGrpInfAndCxl = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfAndCxl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgnlPmtInfAndCxl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlPmtInfAndCxl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalPaymentInstruction13 }
     * 
     * 
     */
    public List<OriginalPaymentInstruction13> getOrgnlPmtInfAndCxl() {
        if (orgnlPmtInfAndCxl == null) {
            orgnlPmtInfAndCxl = new ArrayList<OriginalPaymentInstruction13>();
        }
        return this.orgnlPmtInfAndCxl;
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
     * Adds a new item to the orgnlPmtInfAndCxl list.
     * @see #getOrgnlPmtInfAndCxl()
     * 
     */
    public UnderlyingTransaction11 addOrgnlPmtInfAndCxl(OriginalPaymentInstruction13 orgnlPmtInfAndCxl) {
        getOrgnlPmtInfAndCxl().add(orgnlPmtInfAndCxl);
        return this;
    }

}
