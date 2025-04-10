
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
 * Quantity breakdown information for a specific securities balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSubBalanceTypeAndQuantityBreakdown3", propOrder = {
    "tp",
    "qtyBrkdwn"
})
public class SecuritiesSubBalanceTypeAndQuantityBreakdown3 {

    @XmlElement(name = "Tp", required = true)
    protected SecuritiesBalanceType6Choice tp;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown32> qtyBrkdwn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType6Choice }
     *     
     */
    public SecuritiesBalanceType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType6Choice }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown3 setTp(SecuritiesBalanceType6Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the qtyBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qtyBrkdwn property.
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
     * {@link QuantityBreakdown32 }
     * 
     * 
     */
    public List<QuantityBreakdown32> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown32>();
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
    public SecuritiesSubBalanceTypeAndQuantityBreakdown3 addQtyBrkdwn(QuantityBreakdown32 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}
