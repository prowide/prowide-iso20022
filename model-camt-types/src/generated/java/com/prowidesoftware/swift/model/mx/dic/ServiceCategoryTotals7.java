
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
 * Specifies totals related to the invoice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategoryTotals7", propOrder = {
    "blldCstmrId",
    "tax",
    "ttlInvcAmt",
    "svcCtgy",
    "svcItmTtls",
    "svcItmCrrctn"
})
public class ServiceCategoryTotals7 {

    @XmlElement(name = "BlldCstmrId")
    protected PartyIdentification136 blldCstmrId;
    @XmlElement(name = "Tax")
    protected List<BillingTaxRecord2> tax;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected AmountAndForeignExchange1 ttlInvcAmt;
    @XmlElement(name = "SvcCtgy", required = true)
    protected ServiceCategory1Choice svcCtgy;
    @XmlElement(name = "SvcItmTtls")
    protected List<ServiceItemTotals10> svcItmTtls;
    @XmlElement(name = "SvcItmCrrctn")
    protected List<ServiceItemTotals11> svcItmCrrctn;

    /**
     * Gets the value of the blldCstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getBlldCstmrId() {
        return blldCstmrId;
    }

    /**
     * Sets the value of the blldCstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public ServiceCategoryTotals7 setBlldCstmrId(PartyIdentification136 value) {
        this.blldCstmrId = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTaxRecord2 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<BillingTaxRecord2> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public AmountAndForeignExchange1 getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndForeignExchange1 }
     *     
     */
    public ServiceCategoryTotals7 setTtlInvcAmt(AmountAndForeignExchange1 value) {
        this.ttlInvcAmt = value;
        return this;
    }

    /**
     * Gets the value of the svcCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCategory1Choice }
     *     
     */
    public ServiceCategory1Choice getSvcCtgy() {
        return svcCtgy;
    }

    /**
     * Sets the value of the svcCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCategory1Choice }
     *     
     */
    public ServiceCategoryTotals7 setSvcCtgy(ServiceCategory1Choice value) {
        this.svcCtgy = value;
        return this;
    }

    /**
     * Gets the value of the svcItmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcItmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcItmTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceItemTotals10 }
     * 
     * 
     * @return
     *     The value of the svcItmTtls property.
     */
    public List<ServiceItemTotals10> getSvcItmTtls() {
        if (svcItmTtls == null) {
            svcItmTtls = new ArrayList<>();
        }
        return this.svcItmTtls;
    }

    /**
     * Gets the value of the svcItmCrrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcItmCrrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcItmCrrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceItemTotals11 }
     * 
     * 
     * @return
     *     The value of the svcItmCrrctn property.
     */
    public List<ServiceItemTotals11> getSvcItmCrrctn() {
        if (svcItmCrrctn == null) {
            svcItmCrrctn = new ArrayList<>();
        }
        return this.svcItmCrrctn;
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
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public ServiceCategoryTotals7 addTax(BillingTaxRecord2 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the svcItmTtls list.
     * @see #getSvcItmTtls()
     * 
     */
    public ServiceCategoryTotals7 addSvcItmTtls(ServiceItemTotals10 svcItmTtls) {
        getSvcItmTtls().add(svcItmTtls);
        return this;
    }

    /**
     * Adds a new item to the svcItmCrrctn list.
     * @see #getSvcItmCrrctn()
     * 
     */
    public ServiceCategoryTotals7 addSvcItmCrrctn(ServiceItemTotals11 svcItmCrrctn) {
        getSvcItmCrrctn().add(svcItmCrrctn);
        return this;
    }

}
