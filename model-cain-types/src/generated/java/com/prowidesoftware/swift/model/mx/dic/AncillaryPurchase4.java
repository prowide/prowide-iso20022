
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
 * Contains additional charges related to or during transit (e.g., baggage fee, in-flight purchase). These are separate from the original ticket purchase.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryPurchase4", propOrder = {
    "docNb",
    "rltdDocNb",
    "svcCtgyCd",
    "svcSubCtgyCd",
    "svcPrvdrSvcTp",
    "cdtRsnCd",
    "summryCmmdtyId",
    "amt",
    "cdtDbt",
    "fee",
    "tax",
    "prvtData",
    "ntlData"
})
public class AncillaryPurchase4 {

    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "RltdDocNb")
    protected String rltdDocNb;
    @XmlElement(name = "SvcCtgyCd")
    protected String svcCtgyCd;
    @XmlElement(name = "SvcSubCtgyCd")
    protected String svcSubCtgyCd;
    @XmlElement(name = "SvcPrvdrSvcTp")
    protected String svcPrvdrSvcTp;
    @XmlElement(name = "CdtRsnCd")
    protected String cdtRsnCd;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setDocNb(String value) {
        this.docNb = value;
        return this;
    }

    /**
     * Gets the value of the rltdDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdDocNb() {
        return rltdDocNb;
    }

    /**
     * Sets the value of the rltdDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setRltdDocNb(String value) {
        this.rltdDocNb = value;
        return this;
    }

    /**
     * Gets the value of the svcCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCtgyCd() {
        return svcCtgyCd;
    }

    /**
     * Sets the value of the svcCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setSvcCtgyCd(String value) {
        this.svcCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the svcSubCtgyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcSubCtgyCd() {
        return svcSubCtgyCd;
    }

    /**
     * Sets the value of the svcSubCtgyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setSvcSubCtgyCd(String value) {
        this.svcSubCtgyCd = value;
        return this;
    }

    /**
     * Gets the value of the svcPrvdrSvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPrvdrSvcTp() {
        return svcPrvdrSvcTp;
    }

    /**
     * Sets the value of the svcPrvdrSvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setSvcPrvdrSvcTp(String value) {
        this.svcPrvdrSvcTp = value;
        return this;
    }

    /**
     * Gets the value of the cdtRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRsnCd() {
        return cdtRsnCd;
    }

    /**
     * Sets the value of the cdtRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setCdtRsnCd(String value) {
        this.cdtRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase4 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AncillaryPurchase4 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public AncillaryPurchase4 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the fee property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * Sets the value of the fee property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public AncillaryPurchase4 setFee(BigDecimal value) {
        this.fee = value;
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
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
    public AncillaryPurchase4 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public AncillaryPurchase4 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public AncillaryPurchase4 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
