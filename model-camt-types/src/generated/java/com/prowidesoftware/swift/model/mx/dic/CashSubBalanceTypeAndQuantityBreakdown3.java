
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
 * Quantity breakdown information for a specific securities balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashSubBalanceTypeAndQuantityBreakdown3", propOrder = {
    "tp",
    "qtyBrkdwn"
})
public class CashSubBalanceTypeAndQuantityBreakdown3 {

    @XmlElement(name = "Tp", required = true)
    protected CashBalanceType3Choice tp;
    @XmlElement(name = "QtyBrkdwn")
    protected List<AmountAndQuantityBreakdown1> qtyBrkdwn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashBalanceType3Choice }
     *     
     */
    public CashBalanceType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashBalanceType3Choice }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 setTp(CashBalanceType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qtyBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQtyBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AmountAndQuantityBreakdown1 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<AmountAndQuantityBreakdown1> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<>();
        }
        return this.qtyBrkdwn;
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
     * Adds a new item to the qtyBrkdwn list.
     * @see #getQtyBrkdwn()
     * 
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 addQtyBrkdwn(AmountAndQuantityBreakdown1 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}
