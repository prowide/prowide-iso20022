
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
 * Information about how an order is to be processed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderWaiver1", propOrder = {
    "ordrWvrRsn",
    "infVal"
})
public class OrderWaiver1 {

    @XmlElement(name = "OrdrWvrRsn")
    protected List<OrderWaiverReason3Choice> ordrWvrRsn;
    @XmlElement(name = "InfVal")
    protected String infVal;

    /**
     * Gets the value of the ordrWvrRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordrWvrRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrWvrRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderWaiverReason3Choice }
     * 
     * 
     */
    public List<OrderWaiverReason3Choice> getOrdrWvrRsn() {
        if (ordrWvrRsn == null) {
            ordrWvrRsn = new ArrayList<OrderWaiverReason3Choice>();
        }
        return this.ordrWvrRsn;
    }

    /**
     * Gets the value of the infVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfVal() {
        return infVal;
    }

    /**
     * Sets the value of the infVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderWaiver1 setInfVal(String value) {
        this.infVal = value;
        return this;
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
     * Adds a new item to the ordrWvrRsn list.
     * @see #getOrdrWvrRsn()
     * 
     */
    public OrderWaiver1 addOrdrWvrRsn(OrderWaiverReason3Choice ordrWvrRsn) {
        getOrdrWvrRsn().add(ordrWvrRsn);
        return this;
    }

}
