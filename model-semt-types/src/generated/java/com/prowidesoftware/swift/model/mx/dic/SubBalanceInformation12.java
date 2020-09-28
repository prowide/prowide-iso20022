
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
 * Net position of a segregated holding of a single security within the overall position held in the securities account, eg, sub-balance per status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubBalanceInformation12", propOrder = {
    "subBalTp",
    "qty",
    "subBalAddtlDtls",
    "qtyBrkdwn",
    "addtlBalBrkdwnDtls"
})
public class SubBalanceInformation12 {

    @XmlElement(name = "SubBalTp", required = true)
    protected SubBalanceType7Choice subBalTp;
    @XmlElement(name = "Qty", required = true)
    protected SubBalanceQuantity4Choice qty;
    @XmlElement(name = "SubBalAddtlDtls")
    protected String subBalAddtlDtls;
    @XmlElement(name = "QtyBrkdwn")
    protected List<QuantityBreakdown26> qtyBrkdwn;
    @XmlElement(name = "AddtlBalBrkdwnDtls")
    protected List<AdditionalBalanceInformation12> addtlBalBrkdwnDtls;

    /**
     * Gets the value of the subBalTp property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceType7Choice }
     *     
     */
    public SubBalanceType7Choice getSubBalTp() {
        return subBalTp;
    }

    /**
     * Sets the value of the subBalTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceType7Choice }
     *     
     */
    public SubBalanceInformation12 setSubBalTp(SubBalanceType7Choice value) {
        this.subBalTp = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link SubBalanceQuantity4Choice }
     *     
     */
    public SubBalanceQuantity4Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubBalanceQuantity4Choice }
     *     
     */
    public SubBalanceInformation12 setQty(SubBalanceQuantity4Choice value) {
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
    public SubBalanceInformation12 setSubBalAddtlDtls(String value) {
        this.subBalAddtlDtls = value;
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
     * {@link QuantityBreakdown26 }
     * 
     * 
     */
    public List<QuantityBreakdown26> getQtyBrkdwn() {
        if (qtyBrkdwn == null) {
            qtyBrkdwn = new ArrayList<QuantityBreakdown26>();
        }
        return this.qtyBrkdwn;
    }

    /**
     * Gets the value of the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlBalBrkdwnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlBalBrkdwnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalBalanceInformation12 }
     * 
     * 
     */
    public List<AdditionalBalanceInformation12> getAddtlBalBrkdwnDtls() {
        if (addtlBalBrkdwnDtls == null) {
            addtlBalBrkdwnDtls = new ArrayList<AdditionalBalanceInformation12>();
        }
        return this.addtlBalBrkdwnDtls;
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
    public SubBalanceInformation12 addQtyBrkdwn(QuantityBreakdown26 qtyBrkdwn) {
        getQtyBrkdwn().add(qtyBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the addtlBalBrkdwnDtls list.
     * @see #getAddtlBalBrkdwnDtls()
     * 
     */
    public SubBalanceInformation12 addAddtlBalBrkdwnDtls(AdditionalBalanceInformation12 addtlBalBrkdwnDtls) {
        getAddtlBalBrkdwnDtls().add(addtlBalBrkdwnDtls);
        return this;
    }

}
