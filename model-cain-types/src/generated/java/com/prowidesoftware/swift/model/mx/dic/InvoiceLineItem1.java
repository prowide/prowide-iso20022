
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
@XmlType(name = "InvoiceLineItem1", propOrder = {
    "dt",
    "ordrDt",
    "ctrctNb",
    "shppgDt",
    "rbllgInd",
    "mdclSvcsInd",
    "shipToIndstryCd",
    "pdctCd",
    "pdctQlfr",
    "desc",
    "tpOfSpply",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "unitPric",
    "pdctQty",
    "adjstmnt",
    "insrncInd",
    "insrncAmt",
    "tax",
    "unqVATInvcRef",
    "ttlAmt",
    "cdtInd",
    "zeroCostToCstmrInd",
    "addtlData"
})
public class InvoiceLineItem1 {

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
    @XmlElement(name = "RbllgInd")
    protected Boolean rbllgInd;
    @XmlElement(name = "MdclSvcsInd")
    protected Boolean mdclSvcsInd;
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
    @XmlElement(name = "Adjstmnt")
    protected Adjustment11 adjstmnt;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Tax")
    protected List<Tax33> tax;
    @XmlElement(name = "UnqVATInvcRef")
    protected String unqVATInvcRef;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;
    @XmlElement(name = "CdtInd")
    protected Boolean cdtInd;
    @XmlElement(name = "ZeroCostToCstmrInd")
    protected Boolean zeroCostToCstmrInd;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

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
    public InvoiceLineItem1 setDt(LocalDate value) {
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
    public InvoiceLineItem1 setOrdrDt(LocalDate value) {
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
    public InvoiceLineItem1 setCtrctNb(String value) {
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
    public InvoiceLineItem1 setShppgDt(LocalDate value) {
        this.shppgDt = value;
        return this;
    }

    /**
     * Gets the value of the rbllgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRbllgInd() {
        return rbllgInd;
    }

    /**
     * Sets the value of the rbllgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem1 setRbllgInd(Boolean value) {
        this.rbllgInd = value;
        return this;
    }

    /**
     * Gets the value of the mdclSvcsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMdclSvcsInd() {
        return mdclSvcsInd;
    }

    /**
     * Sets the value of the mdclSvcsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem1 setMdclSvcsInd(Boolean value) {
        this.mdclSvcsInd = value;
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
    public InvoiceLineItem1 setShipToIndstryCd(String value) {
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
    public InvoiceLineItem1 setPdctCd(String value) {
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
    public InvoiceLineItem1 setPdctQlfr(String value) {
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
    public InvoiceLineItem1 setDesc(String value) {
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
    public InvoiceLineItem1 setTpOfSpply(String value) {
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
    public InvoiceLineItem1 setUnitOfMeasr(UnitOfMeasure1Code value) {
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
    public InvoiceLineItem1 setOthrUnitOfMeasr(String value) {
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
    public InvoiceLineItem1 setUnitPric(BigDecimal value) {
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
    public InvoiceLineItem1 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment11 }
     *     
     */
    public Adjustment11 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Sets the value of the adjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment11 }
     *     
     */
    public InvoiceLineItem1 setAdjstmnt(Adjustment11 value) {
        this.adjstmnt = value;
        return this;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem1 setInsrncInd(Boolean value) {
        this.insrncInd = value;
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
    public InvoiceLineItem1 setInsrncAmt(BigDecimal value) {
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
     * {@link Tax33 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax33> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the unqVATInvcRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqVATInvcRef() {
        return unqVATInvcRef;
    }

    /**
     * Sets the value of the unqVATInvcRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceLineItem1 setUnqVATInvcRef(String value) {
        this.unqVATInvcRef = value;
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
    public InvoiceLineItem1 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the cdtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtInd() {
        return cdtInd;
    }

    /**
     * Sets the value of the cdtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem1 setCdtInd(Boolean value) {
        this.cdtInd = value;
        return this;
    }

    /**
     * Gets the value of the zeroCostToCstmrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZeroCostToCstmrInd() {
        return zeroCostToCstmrInd;
    }

    /**
     * Sets the value of the zeroCostToCstmrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvoiceLineItem1 setZeroCostToCstmrInd(Boolean value) {
        this.zeroCostToCstmrInd = value;
        return this;
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
    public InvoiceLineItem1 setAddtlData(String value) {
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
    public InvoiceLineItem1 addTax(Tax33 tax) {
        getTax().add(tax);
        return this;
    }

}
