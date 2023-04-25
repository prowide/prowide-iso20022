
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
 * Subbalances providing additional information on a specific position but that is not to be accounted for in the building of the aggregate balance, for example, registered.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBalanceInformation19", propOrder = {
    "subBalTp",
    "qty",
    "subBalAddtlDtls",
    "qtyBrkdwn"
})
public class AdditionalBalanceInformation19 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType14Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected Balance13 qty;
    @XmlElement(name = "SubBalAddtlDtls")
    protected String subBalAddtlDtls;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown56> qtyBrkdwn;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType14Choice }
     *     
     */
    public SubBalanceType14Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType14Choice }
     *     
     */
    public AdditionalBalanceInformation19 setSubBalTp(SubBalanceType14Choice value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance13 }
     *     
     */
    public Balance13 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance13 }
     *     
     */
    public AdditionalBalanceInformation19 setQty(Balance13 value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the subBalAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubBalAddtlDtls() {
        return subBalAddtlDtls;
    }

    /**
     * Sets the value of the subBalAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalBalanceInformation19 setSubBalAddtlDtls(String value) {
        this.subBalAddtlDtls = value;
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
     * {@link QuantityBreakdown56 }
     * 
     * 
     * @return
     *     The value of the qtyBrkdwn property.
     */
    public List<QuantityBreakdown56> getQtyBrkdwn() {
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
    public AdditionalBalanceInformation19 addQtyBrkdwn(QuantityBreakdown56 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

}
