
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
 * Sale context in which the transaction is performed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext3", propOrder = {
    "saleId",
    "saleRefNb",
    "saleRcncltnId",
    "cshrId",
    "cshrLang",
    "shftNb",
    "cstmrOrdrReqFlg",
    "purchsOrdrNb",
    "invcNb",
    "dlvryNoteNb",
    "spnsrdMrchnt",
    "spltPmt",
    "rmngAmt",
    "forceOnlnFlg",
    "reuseCardDataFlg",
    "allwdNtryMd",
    "saleTknScp",
    "addtlSaleData"
})
public class SaleContext3 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "CshrLang")
    protected List<String> cshrLang;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "CstmrOrdrReqFlg")
    protected Boolean cstmrOrdrReqFlg;
    @XmlElement(name = "PurchsOrdrNb")
    protected String purchsOrdrNb;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<Organisation26> spnsrdMrchnt;
    @XmlElement(name = "SpltPmt")
    protected Boolean spltPmt;
    @XmlElement(name = "RmngAmt")
    protected BigDecimal rmngAmt;
    @XmlElement(name = "ForceOnlnFlg")
    protected Boolean forceOnlnFlg;
    @XmlElement(name = "ReuseCardDataFlg")
    protected Boolean reuseCardDataFlg;
    @XmlElement(name = "AllwdNtryMd")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading6Code> allwdNtryMd;
    @XmlElement(name = "SaleTknScp")
    @XmlSchemaType(name = "string")
    protected SaleTokenScope1Code saleTknScp;
    @XmlElement(name = "AddtlSaleData")
    protected String addtlSaleData;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setSaleId(String value) {
        this.saleId = value;
        return this;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setSaleRefNb(String value) {
        this.saleRefNb = value;
        return this;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
        return this;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setCshrId(String value) {
        this.cshrId = value;
        return this;
    }

    /**
     * Gets the value of the cshrLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshrLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshrLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCshrLang() {
        if (cshrLang == null) {
            cshrLang = new ArrayList<String>();
        }
        return this.cshrLang;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setShftNb(String value) {
        this.shftNb = value;
        return this;
    }

    /**
     * Gets the value of the cstmrOrdrReqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrOrdrReqFlg() {
        return cstmrOrdrReqFlg;
    }

    /**
     * Sets the value of the cstmrOrdrReqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext3 setCstmrOrdrReqFlg(Boolean value) {
        this.cstmrOrdrReqFlg = value;
        return this;
    }

    /**
     * Gets the value of the purchsOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsOrdrNb() {
        return purchsOrdrNb;
    }

    /**
     * Sets the value of the purchsOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setPurchsOrdrNb(String value) {
        this.purchsOrdrNb = value;
        return this;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setInvcNb(String value) {
        this.invcNb = value;
        return this;
    }

    /**
     * Gets the value of the dlvryNoteNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryNoteNb() {
        return dlvryNoteNb;
    }

    /**
     * Sets the value of the dlvryNoteNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
        return this;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation26 }
     * 
     * 
     */
    public List<Organisation26> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<Organisation26>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Gets the value of the spltPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmt() {
        return spltPmt;
    }

    /**
     * Sets the value of the spltPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext3 setSpltPmt(Boolean value) {
        this.spltPmt = value;
        return this;
    }

    /**
     * Gets the value of the rmngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngAmt() {
        return rmngAmt;
    }

    /**
     * Sets the value of the rmngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SaleContext3 setRmngAmt(BigDecimal value) {
        this.rmngAmt = value;
        return this;
    }

    /**
     * Gets the value of the forceOnlnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceOnlnFlg() {
        return forceOnlnFlg;
    }

    /**
     * Sets the value of the forceOnlnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext3 setForceOnlnFlg(Boolean value) {
        this.forceOnlnFlg = value;
        return this;
    }

    /**
     * Gets the value of the reuseCardDataFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReuseCardDataFlg() {
        return reuseCardDataFlg;
    }

    /**
     * Sets the value of the reuseCardDataFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SaleContext3 setReuseCardDataFlg(Boolean value) {
        this.reuseCardDataFlg = value;
        return this;
    }

    /**
     * Gets the value of the allwdNtryMd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allwdNtryMd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdNtryMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading6Code }
     * 
     * 
     */
    public List<CardDataReading6Code> getAllwdNtryMd() {
        if (allwdNtryMd == null) {
            allwdNtryMd = new ArrayList<CardDataReading6Code>();
        }
        return this.allwdNtryMd;
    }

    /**
     * Gets the value of the saleTknScp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleTokenScope1Code getSaleTknScp() {
        return saleTknScp;
    }

    /**
     * Sets the value of the saleTknScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleContext3 setSaleTknScp(SaleTokenScope1Code value) {
        this.saleTknScp = value;
        return this;
    }

    /**
     * Gets the value of the addtlSaleData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlSaleData() {
        return addtlSaleData;
    }

    /**
     * Sets the value of the addtlSaleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleContext3 setAddtlSaleData(String value) {
        this.addtlSaleData = value;
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
     * Adds a new item to the cshrLang list.
     * @see #getCshrLang()
     * 
     */
    public SaleContext3 addCshrLang(String cshrLang) {
        getCshrLang().add(cshrLang);
        return this;
    }

    /**
     * Adds a new item to the spnsrdMrchnt list.
     * @see #getSpnsrdMrchnt()
     * 
     */
    public SaleContext3 addSpnsrdMrchnt(Organisation26 spnsrdMrchnt) {
        getSpnsrdMrchnt().add(spnsrdMrchnt);
        return this;
    }

    /**
     * Adds a new item to the allwdNtryMd list.
     * @see #getAllwdNtryMd()
     * 
     */
    public SaleContext3 addAllwdNtryMd(CardDataReading6Code allwdNtryMd) {
        getAllwdNtryMd().add(allwdNtryMd);
        return this;
    }

}
