
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Report on specific billing data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingReport6", propOrder = {
    "rgltryData",
    "svc",
    "invcDt",
    "bllgId",
    "bllgPrd",
    "rspnsblPtyId",
    "ptyId",
    "acctInvcTtls",
    "invcTtls",
    "svcCtgyTtls"
})
public class BillingReport6 {

    @XmlElement(name = "RgltryData", required = true)
    protected InvoiceLegalIssue5 rgltryData;
    @XmlElement(name = "Svc")
    protected SystemAndCurrency1 svc;
    @XmlElement(name = "InvcDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate invcDt;
    @XmlElement(name = "BllgId", required = true)
    protected String bllgId;
    @XmlElement(name = "BllgPrd", required = true)
    protected DatePeriod2 bllgPrd;
    @XmlElement(name = "RspnsblPtyId")
    protected PartyIdentification136 rspnsblPtyId;
    @XmlElement(name = "PtyId")
    protected PartyIdentification136 ptyId;
    @XmlElement(name = "AcctInvcTtls")
    protected List<InvoiceTotals8> acctInvcTtls;
    @XmlElement(name = "InvcTtls")
    protected InvoiceTotals7 invcTtls;
    @XmlElement(name = "SvcCtgyTtls")
    protected List<ServiceCategoryTotals8> svcCtgyTtls;

    /**
     * Gets the value of the rgltryData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLegalIssue5 }
     *     
     */
    public InvoiceLegalIssue5 getRgltryData() {
        return rgltryData;
    }

    /**
     * Sets the value of the rgltryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLegalIssue5 }
     *     
     */
    public BillingReport6 setRgltryData(InvoiceLegalIssue5 value) {
        this.rgltryData = value;
        return this;
    }

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public SystemAndCurrency1 getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemAndCurrency1 }
     *     
     */
    public BillingReport6 setSvc(SystemAndCurrency1 value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the invcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getInvcDt() {
        return invcDt;
    }

    /**
     * Sets the value of the invcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingReport6 setInvcDt(LocalDate value) {
        this.invcDt = value;
        return this;
    }

    /**
     * Gets the value of the bllgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBllgId() {
        return bllgId;
    }

    /**
     * Sets the value of the bllgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingReport6 setBllgId(String value) {
        this.bllgId = value;
        return this;
    }

    /**
     * Gets the value of the bllgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getBllgPrd() {
        return bllgPrd;
    }

    /**
     * Sets the value of the bllgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public BillingReport6 setBllgPrd(DatePeriod2 value) {
        this.bllgPrd = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRspnsblPtyId() {
        return rspnsblPtyId;
    }

    /**
     * Sets the value of the rspnsblPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public BillingReport6 setRspnsblPtyId(PartyIdentification136 value) {
        this.rspnsblPtyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public BillingReport6 setPtyId(PartyIdentification136 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the acctInvcTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctInvcTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInvcTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceTotals8 }
     * 
     * 
     * @return
     *     The value of the acctInvcTtls property.
     */
    public List<InvoiceTotals8> getAcctInvcTtls() {
        if (acctInvcTtls == null) {
            acctInvcTtls = new ArrayList<>();
        }
        return this.acctInvcTtls;
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
    public BillingReport6 setInvcTtls(InvoiceTotals7 value) {
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
     * {@link ServiceCategoryTotals8 }
     * 
     * 
     * @return
     *     The value of the svcCtgyTtls property.
     */
    public List<ServiceCategoryTotals8> getSvcCtgyTtls() {
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
     * Adds a new item to the acctInvcTtls list.
     * @see #getAcctInvcTtls()
     * 
     */
    public BillingReport6 addAcctInvcTtls(InvoiceTotals8 acctInvcTtls) {
        getAcctInvcTtls().add(acctInvcTtls);
        return this;
    }

    /**
     * Adds a new item to the svcCtgyTtls list.
     * @see #getSvcCtgyTtls()
     * 
     */
    public BillingReport6 addSvcCtgyTtls(ServiceCategoryTotals8 svcCtgyTtls) {
        getSvcCtgyTtls().add(svcCtgyTtls);
        return this;
    }

}
