
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status26Choice", propOrder = {
    "cxlStsRpt",
    "indvCxlStsRpt"
})
public class Status26Choice {

    @XmlElement(name = "CxlStsRpt")
    protected OrderStatusAndReason9 cxlStsRpt;
    @XmlElement(name = "IndvCxlStsRpt")
    protected List<IndividualOrderStatusAndReason8> indvCxlStsRpt;

    /**
     * Gets the value of the cxlStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason9 }
     *     
     */
    public OrderStatusAndReason9 getCxlStsRpt() {
        return cxlStsRpt;
    }

    /**
     * Sets the value of the cxlStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason9 }
     *     
     */
    public Status26Choice setCxlStsRpt(OrderStatusAndReason9 value) {
        this.cxlStsRpt = value;
        return this;
    }

    /**
     * Gets the value of the indvCxlStsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indvCxlStsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvCxlStsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason8 }
     * 
     * 
     */
    public List<IndividualOrderStatusAndReason8> getIndvCxlStsRpt() {
        if (indvCxlStsRpt == null) {
            indvCxlStsRpt = new ArrayList<IndividualOrderStatusAndReason8>();
        }
        return this.indvCxlStsRpt;
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
     * Adds a new item to the indvCxlStsRpt list.
     * @see #getIndvCxlStsRpt()
     * 
     */
    public Status26Choice addIndvCxlStsRpt(IndividualOrderStatusAndReason8 indvCxlStsRpt) {
        getIndvCxlStsRpt().add(indvCxlStsRpt);
        return this;
    }

}
