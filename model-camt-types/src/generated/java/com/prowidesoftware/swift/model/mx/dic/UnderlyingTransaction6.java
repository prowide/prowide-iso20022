
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
@XmlType(name = "UnderlyingTransaction6", propOrder = {
    "orgnlGrpInfAndCxl",
    "orgnlPmtInfAndCxl"
})
public class UnderlyingTransaction6 {

    @XmlElement(name = "OrgnlGrpInfAndCxl")
    protected OriginalGroupHeader4 orgnlGrpInfAndCxl;
    @XmlElement(name = "OrgnlPmtInfAndCxl")
    protected List<OriginalPaymentInstruction4> orgnlPmtInfAndCxl;

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
    public UnderlyingTransaction6 setOrgnlGrpInfAndCxl(OriginalGroupHeader4 value) {
        this.orgnlGrpInfAndCxl = value;
        return this;
    }

    /**
     * Gets the value of the orgnlPmtInfAndCxl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlPmtInfAndCxl property.
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
     * {@link OriginalPaymentInstruction4 }
     * 
     * 
     * @return
     *     The value of the orgnlPmtInfAndCxl property.
     */
    public List<OriginalPaymentInstruction4> getOrgnlPmtInfAndCxl() {
        if (orgnlPmtInfAndCxl == null) {
            orgnlPmtInfAndCxl = new ArrayList<>();
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
    public UnderlyingTransaction6 addOrgnlPmtInfAndCxl(OriginalPaymentInstruction4 orgnlPmtInfAndCxl) {
        getOrgnlPmtInfAndCxl().add(orgnlPmtInfAndCxl);
        return this;
    }

}
