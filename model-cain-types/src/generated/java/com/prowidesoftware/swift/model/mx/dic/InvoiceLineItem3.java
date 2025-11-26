
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Item purchased with the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLineItem3", propOrder = {
    "dt",
    "ordrDt",
    "ctrctNb",
    "shppgDt",
    "rbllg",
    "mdclSvcs",
    "shipToIndstryCd",
    "pdctCd",
    "pdctQlfr",
    "desc",
    "tpOfSpply",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "unitPric",
    "pdctQty",
    "adjstmntAmt",
    "adjstmntCdtDbt",
    "adjstmntRsn",
    "insrnc",
    "insrncAmt",
    "tax",
    "vatInvcRef",
    "ttlAmt",
    "cdtDbt",
    "zeroCostToCstmr",
    "addtlData"
})
public class InvoiceLineItem3 {

    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "OrdrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate ordrDt;
    @XmlElement(name = "CtrctNb")
    protected String ctrctNb;
    @XmlElement(name = "ShppgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate shppgDt;
    @XmlElement(name = "Rbllg")
    protected Boolean rbllg;
    @XmlElement(name = "MdclSvcs")
    protected Boolean mdclSvcs;
    @XmlElement(name = "ShipToIndstryCd")
    protected String shipToIndstryCd;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "PdctQlfr")
    protected String pdctQlfr;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TpOfSpply")
    protected String tpOfSpply;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "AdjstmntAmt")
    protected BigDecimal adjstmntAmt;
    @XmlElement(name = "AdjstmntCdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code adjstmntCdtDbt;
    @XmlElement(name = "AdjstmntRsn")
    protected String adjstmntRsn;
    @XmlElement(name = "Insrnc")
    protected Boolean insrnc;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Tax")
    protected List<Tax41> tax;
    @XmlElement(name = "VATInvcRef")
    protected String vatInvcRef;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "ZeroCostToCstmr")
    protected Boolean zeroCostToCstmr;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the ordrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getOrdrDt() {
        return ordrDt;
    }

    /**
     * Sets the value of the ordrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setOrdrDt(LocalDate value) {
        this.ordrDt = value;
        return this;
    }

    /**
     * Gets the value of the ctrctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctNb() {
        return ctrctNb;
    }

    /**
     * Sets the value of the ctrctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setCtrctNb(String value) {
        this.ctrctNb = value;
        return this;
    }

    /**
     * Gets the value of the shppgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getShppgDt() {
        return shppgDt;
    }

    /**
     * Sets the value of the shppgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setShppgDt(LocalDate value) {
        this.shppgDt = value;
        return this;
    }

    /**
     * Gets the value of the rbllg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRbllg() {
        return rbllg;
    }

    /**
     * Sets the value of the rbllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem3 setRbllg(Boolean value) {
        this.rbllg = value;
        return this;
    }

    /**
     * Gets the value of the mdclSvcs property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMdclSvcs() {
        return mdclSvcs;
    }

    /**
     * Sets the value of the mdclSvcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem3 setMdclSvcs(Boolean value) {
        this.mdclSvcs = value;
        return this;
    }

    /**
     * Gets the value of the shipToIndstryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToIndstryCd() {
        return shipToIndstryCd;
    }

    /**
     * Sets the value of the shipToIndstryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setShipToIndstryCd(String value) {
        this.shipToIndstryCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctQlfr() {
        return pdctQlfr;
    }

    /**
     * Sets the value of the pdctQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setPdctQlfr(String value) {
        this.pdctQlfr = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the tpOfSpply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOfSpply() {
        return tpOfSpply;
    }

    /**
     * Sets the value of the tpOfSpply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setTpOfSpply(String value) {
        this.tpOfSpply = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    public InvoiceLineItem3 setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceLineItem3 setUnitPric(BigDecimal value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceLineItem3 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstmntAmt() {
        return adjstmntAmt;
    }

    /**
     * Sets the value of the adjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceLineItem3 setAdjstmntAmt(BigDecimal value) {
        this.adjstmntAmt = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntCdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getAdjstmntCdtDbt() {
        return adjstmntCdtDbt;
    }

    /**
     * Sets the value of the adjstmntCdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public InvoiceLineItem3 setAdjstmntCdtDbt(CreditDebit3Code value) {
        this.adjstmntCdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjstmntRsn() {
        return adjstmntRsn;
    }

    /**
     * Sets the value of the adjstmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setAdjstmntRsn(String value) {
        this.adjstmntRsn = value;
        return this;
    }

    /**
     * Gets the value of the insrnc property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrnc() {
        return insrnc;
    }

    /**
     * Sets the value of the insrnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem3 setInsrnc(Boolean value) {
        this.insrnc = value;
        return this;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceLineItem3 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
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
     * {@link Tax41 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax41> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the vatInvcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVATInvcRef() {
        return vatInvcRef;
    }

    /**
     * Sets the value of the vatInvcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem3 setVATInvcRef(String value) {
        this.vatInvcRef = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceLineItem3 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
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
    public InvoiceLineItem3 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
        return this;
    }

    /**
     * Gets the value of the zeroCostToCstmr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroCostToCstmr() {
        return zeroCostToCstmr;
    }

    /**
     * Sets the value of the zeroCostToCstmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem3 setZeroCostToCstmr(Boolean value) {
        this.zeroCostToCstmr = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
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
    public InvoiceLineItem3 addTax(Tax41 tax) {
        getTax().add(tax);
        return this;
    }

    /**
     * Adds a new item to the addtlData list.
     * @see #getAddtlData()
     * 
     */
    public InvoiceLineItem3 addAddtlData(AdditionalData1 addtlData) {
        getAddtlData().add(addtlData);
        return this;
    }

}
