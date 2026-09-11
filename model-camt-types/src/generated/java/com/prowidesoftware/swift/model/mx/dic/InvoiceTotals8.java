
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
@XmlType(name = "InvoiceTotals8", propOrder = {
    "acctId",
    "invcTtls",
    "svcCtgyTtls"
})
public class InvoiceTotals8 {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentification38Choice acctId;
    @XmlElement(name = "InvcTtls", required = true)
    protected InvoiceTotals7 invcTtls;
    @XmlElement(name = "SvcCtgyTtls", required = true)
    protected List<ServiceCategoryTotals7> svcCtgyTtls;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification38Choice }
     *     
     */
    public AccountIdentification38Choice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification38Choice }
     *     
     */
    public InvoiceTotals8 setAcctId(AccountIdentification38Choice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the invcTtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals7 }
     *     
     */
    public InvoiceTotals7 getInvcTtls() {
        return invcTtls;
    }

    /**
     * Sets the value of the invcTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals7 }
     *     
     */
    public InvoiceTotals8 setInvcTtls(InvoiceTotals7 value) {
        this.invcTtls = value;
        return this;
    }

    /**
     * Gets the value of the svcCtgyTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcCtgyTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcCtgyTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCategoryTotals7 }
     * 
     * 
     * @return
     *     The value of the svcCtgyTtls property.
     */
    public List<ServiceCategoryTotals7> getSvcCtgyTtls() {
        if (svcCtgyTtls == null) {
            svcCtgyTtls = new ArrayList<>();
        }
        return this.svcCtgyTtls;
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
     * Adds a new item to the svcCtgyTtls list.
     * @see #getSvcCtgyTtls()
     * 
     */
    public InvoiceTotals8 addSvcCtgyTtls(ServiceCategoryTotals7 svcCtgyTtls) {
        getSvcCtgyTtls().add(svcCtgyTtls);
        return this;
    }

}
