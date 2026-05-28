
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
 * Choice of status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status40Choice", propOrder = {
    "ordrDtlsRpt",
    "indvOrdrDtlsRpt",
    "swtchOrdrDtlsRpt"
})
public class Status40Choice {

    @XmlElement(name = "OrdrDtlsRpt")
    protected OrderStatusAndReason11 ordrDtlsRpt;
    @XmlElement(name = "IndvOrdrDtlsRpt")
    protected List<IndividualOrderStatusAndReason9> indvOrdrDtlsRpt;
    @XmlElement(name = "SwtchOrdrDtlsRpt")
    protected List<SwitchOrderStatusAndReason3> swtchOrdrDtlsRpt;

    /**
     * Gets the value of the ordrDtlsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusAndReason11 }
     *     
     */
    public OrderStatusAndReason11 getOrdrDtlsRpt() {
        return ordrDtlsRpt;
    }

    /**
     * Sets the value of the ordrDtlsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusAndReason11 }
     *     
     */
    public Status40Choice setOrdrDtlsRpt(OrderStatusAndReason11 value) {
        this.ordrDtlsRpt = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualOrderStatusAndReason9 }
     * 
     * 
     * @return
     *     The value of the indvOrdrDtlsRpt property.
     */
    public List<IndividualOrderStatusAndReason9> getIndvOrdrDtlsRpt() {
        if (indvOrdrDtlsRpt == null) {
            indvOrdrDtlsRpt = new ArrayList<>();
        }
        return this.indvOrdrDtlsRpt;
    }

    /**
     * Gets the value of the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swtchOrdrDtlsRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwtchOrdrDtlsRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwitchOrderStatusAndReason3 }
     * 
     * 
     * @return
     *     The value of the swtchOrdrDtlsRpt property.
     */
    public List<SwitchOrderStatusAndReason3> getSwtchOrdrDtlsRpt() {
        if (swtchOrdrDtlsRpt == null) {
            swtchOrdrDtlsRpt = new ArrayList<>();
        }
        return this.swtchOrdrDtlsRpt;
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
     * Adds a new item to the indvOrdrDtlsRpt list.
     * @see #getIndvOrdrDtlsRpt()
     * 
     */
    public Status40Choice addIndvOrdrDtlsRpt(IndividualOrderStatusAndReason9 indvOrdrDtlsRpt) {
        getIndvOrdrDtlsRpt().add(indvOrdrDtlsRpt);
        return this;
    }

    /**
     * Adds a new item to the swtchOrdrDtlsRpt list.
     * @see #getSwtchOrdrDtlsRpt()
     * 
     */
    public Status40Choice addSwtchOrdrDtlsRpt(SwitchOrderStatusAndReason3 swtchOrdrDtlsRpt) {
        getSwtchOrdrDtlsRpt().add(swtchOrdrDtlsRpt);
        return this;
    }

}
