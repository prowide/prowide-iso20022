
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
 * Reports either on the reservation or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationOrError9Choice", propOrder = {
    "rsvatn",
    "bizErr"
})
public class ReservationOrError9Choice {

    @XmlElement(name = "Rsvatn")
    protected Reservation3 rsvatn;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling5> bizErr;

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link Reservation3 }
     *     
     */
    public Reservation3 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation3 }
     *     
     */
    public ReservationOrError9Choice setRsvatn(Reservation3 value) {
        this.rsvatn = value;
        return this;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling5 }
     * 
     * 
     */
    public List<ErrorHandling5> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<ErrorHandling5>();
        }
        return this.bizErr;
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
     * Adds a new item to the bizErr list.
     * @see #getBizErr()
     * 
     */
    public ReservationOrError9Choice addBizErr(ErrorHandling5 bizErr) {
        getBizErr().add(bizErr);
        return this;
    }

}
