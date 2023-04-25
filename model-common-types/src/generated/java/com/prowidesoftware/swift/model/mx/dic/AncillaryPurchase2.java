
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Contains additional charges related to or during transit (e.g., baggage fee, in-flight purchase). These are separate from the original ticket purchase.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryPurchase2", propOrder = {
    "ancllryDocNb",
    "rltdDocNb",
    "svcCtgyCd",
    "svcSubCtgyCd",
    "svcPrvdrSvcTp",
    "cdtRsnCd",
    "summryCmmdtyId",
    "amt",
    "fee",
    "tax",
    "addtlData"
})
public class AncillaryPurchase2 {

    @XmlElement(name = "AncllryDocNb")
    protected String ancllryDocNb;
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
    protected Amount16 amt;
    @XmlElement(name = "Fee")
    protected BigDecimal fee;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the ancllryDocNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncllryDocNb() {
        return ancllryDocNb;
    }

    /**
     * Sets the value of the ancllryDocNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase2 setAncllryDocNb(String value) {
        this.ancllryDocNb = value;
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
    public AncillaryPurchase2 setRltdDocNb(String value) {
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
    public AncillaryPurchase2 setSvcCtgyCd(String value) {
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
    public AncillaryPurchase2 setSvcSubCtgyCd(String value) {
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
    public AncillaryPurchase2 setSvcPrvdrSvcTp(String value) {
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
    public AncillaryPurchase2 setCdtRsnCd(String value) {
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
    public AncillaryPurchase2 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount16 }
     *     
     */
    public Amount16 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount16 }
     *     
     */
    public AncillaryPurchase2 setAmt(Amount16 value) {
        this.amt = value;
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
    public AncillaryPurchase2 setFee(BigDecimal value) {
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
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AncillaryPurchase2 setAddtlData(String value) {
        this.addtlData = value;
        return this;
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
    public AncillaryPurchase2 addTax(Tax39 tax) {
        getTax().add(tax);
        return this;
    }

}
