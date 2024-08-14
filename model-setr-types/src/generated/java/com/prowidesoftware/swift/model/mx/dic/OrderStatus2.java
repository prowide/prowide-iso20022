
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Status and reason of an instructed order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatus2", propOrder = {
    "listId",
    "listStsTp",
    "listOrdrSts",
    "ttlNbOfRpts",
    "rptSeqNb",
    "ttlNbOfOrdrs",
    "rjctnRsn",
    "snglOrdrDtls"
})
public class OrderStatus2 {

    @XmlElement(name = "ListId", required = true)
    protected String listId;
    @XmlElement(name = "ListStsTp", required = true)
    @XmlSchemaType(name = "string")
    protected ListStatusType1Code listStsTp;
    @XmlElement(name = "ListOrdrSts", required = true)
    @XmlSchemaType(name = "string")
    protected OrderStatus6Code listOrdrSts;
    @XmlElement(name = "TtlNbOfRpts", required = true)
    protected BigDecimal ttlNbOfRpts;
    @XmlElement(name = "RptSeqNb", required = true)
    protected BigDecimal rptSeqNb;
    @XmlElement(name = "TtlNbOfOrdrs", required = true)
    protected BigDecimal ttlNbOfOrdrs;
    @XmlElement(name = "RjctnRsn")
    protected RejectionReason3Choice rjctnRsn;
    @XmlElement(name = "SnglOrdrDtls")
    protected List<OrderStatus3> snglOrdrDtls;

    /**
     * Gets the value of the listId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListId() {
        return listId;
    }

    /**
     * Sets the value of the listId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderStatus2 setListId(String value) {
        this.listId = value;
        return this;
    }

    /**
     * Gets the value of the listStsTp property.
     * 
     * @return
     *     possible object is
     *     {@link ListStatusType1Code }
     *     
     */
    public ListStatusType1Code getListStsTp() {
        return listStsTp;
    }

    /**
     * Sets the value of the listStsTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListStatusType1Code }
     *     
     */
    public OrderStatus2 setListStsTp(ListStatusType1Code value) {
        this.listStsTp = value;
        return this;
    }

    /**
     * Gets the value of the listOrdrSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus6Code }
     *     
     */
    public OrderStatus6Code getListOrdrSts() {
        return listOrdrSts;
    }

    /**
     * Sets the value of the listOrdrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus6Code }
     *     
     */
    public OrderStatus2 setListOrdrSts(OrderStatus6Code value) {
        this.listOrdrSts = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfRpts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfRpts() {
        return ttlNbOfRpts;
    }

    /**
     * Sets the value of the ttlNbOfRpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderStatus2 setTtlNbOfRpts(BigDecimal value) {
        this.ttlNbOfRpts = value;
        return this;
    }

    /**
     * Gets the value of the rptSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptSeqNb() {
        return rptSeqNb;
    }

    /**
     * Sets the value of the rptSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderStatus2 setRptSeqNb(BigDecimal value) {
        this.rptSeqNb = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfOrdrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfOrdrs() {
        return ttlNbOfOrdrs;
    }

    /**
     * Sets the value of the ttlNbOfOrdrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderStatus2 setTtlNbOfOrdrs(BigDecimal value) {
        this.ttlNbOfOrdrs = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason3Choice }
     *     
     */
    public RejectionReason3Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason3Choice }
     *     
     */
    public OrderStatus2 setRjctnRsn(RejectionReason3Choice value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the snglOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the snglOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSnglOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatus3 }
     * 
     * 
     * @return
     *     The value of the snglOrdrDtls property.
     */
    public List<OrderStatus3> getSnglOrdrDtls() {
        if (snglOrdrDtls == null) {
            snglOrdrDtls = new ArrayList<>();
        }
        return this.snglOrdrDtls;
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
     * Adds a new item to the snglOrdrDtls list.
     * @see #getSnglOrdrDtls()
     * 
     */
    public OrderStatus2 addSnglOrdrDtls(OrderStatus3 snglOrdrDtls) {
        getSnglOrdrDtls().add(snglOrdrDtls);
        return this;
    }

}
