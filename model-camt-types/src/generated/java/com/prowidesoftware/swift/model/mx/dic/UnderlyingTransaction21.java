
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
 * Identifies the underlying (group of) transaction(s) to which the investigation applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction21", propOrder = {
    "orgnlGrpInfAndCxl",
    "orgnlPmtInfAndCxl"
})
public class UnderlyingTransaction21 {

    @XmlElement(name = "OrgnlGrpInfAndCxl")
    protected OriginalGroupHeader10 orgnlGrpInfAndCxl;
    @XmlElement(name = "OrgnlPmtInfAndCxl")
    protected List<OriginalPaymentInstruction29> orgnlPmtInfAndCxl;

    /**
     * Gets the value of the orgnlGrpInfAndCxl property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader10 }
     *     
     */
    public OriginalGroupHeader10 getOrgnlGrpInfAndCxl() {
        return orgnlGrpInfAndCxl;
    }

    /**
     * Sets the value of the orgnlGrpInfAndCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader10 }
     *     
     */
    public UnderlyingTransaction21 setOrgnlGrpInfAndCxl(OriginalGroupHeader10 value) {
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
     * {@link OriginalPaymentInstruction29 }
     * 
     * 
     */
    public List<OriginalPaymentInstruction29> getOrgnlPmtInfAndCxl() {
        if (orgnlPmtInfAndCxl == null) {
            orgnlPmtInfAndCxl = new ArrayList<OriginalPaymentInstruction29>();
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
    public UnderlyingTransaction21 addOrgnlPmtInfAndCxl(OriginalPaymentInstruction29 orgnlPmtInfAndCxl) {
        getOrgnlPmtInfAndCxl().add(orgnlPmtInfAndCxl);
        return this;
    }

}
