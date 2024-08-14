
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Purchased item.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product6", propOrder = {
    "itmId",
    "pdctCd",
    "addtlPdctCd",
    "unitOfMeasr",
    "pdctQty",
    "unitPric",
    "unitPricSgn",
    "pdctAmt",
    "pdctAmtSgn",
    "valAddedTax",
    "taxTp",
    "pdctDesc",
    "dlvryLctn",
    "dlvrySvc",
    "saleChanl",
    "addtlPdctDesc"
})
public class Product6 {

    @XmlElement(name = "ItmId")
    protected String itmId;
    @XmlElement(name = "PdctCd", required = true)
    protected String pdctCd;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure6Code unitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "UnitPricSgn")
    protected Boolean unitPricSgn;
    @XmlElement(name = "PdctAmt", required = true)
    protected BigDecimal pdctAmt;
    @XmlElement(name = "PdctAmtSgn")
    protected Boolean pdctAmtSgn;
    @XmlElement(name = "ValAddedTax")
    protected BigDecimal valAddedTax;
    @XmlElement(name = "TaxTp")
    protected String taxTp;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;
    @XmlElement(name = "DlvryLctn")
    protected String dlvryLctn;
    @XmlElement(name = "DlvrySvc")
    @XmlSchemaType(name = "string")
    protected AttendanceContext2Code dlvrySvc;
    @XmlElement(name = "SaleChanl")
    protected String saleChanl;
    @XmlElement(name = "AddtlPdctDesc")
    protected String addtlPdctDesc;

    /**
     * Gets the value of the itmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmId() {
        return itmId;
    }

    /**
     * Sets the value of the itmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setItmId(String value) {
        this.itmId = value;
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
    public Product6 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlPdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctCd() {
        return addtlPdctCd;
    }

    /**
     * Sets the value of the addtlPdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setAddtlPdctCd(String value) {
        this.addtlPdctCd = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure6Code }
     *     
     */
    public UnitOfMeasure6Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure6Code }
     *     
     */
    public Product6 setUnitOfMeasr(UnitOfMeasure6Code value) {
        this.unitOfMeasr = value;
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
    public Product6 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
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
    public Product6 setUnitPric(BigDecimal value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the unitPricSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitPricSgn() {
        return unitPricSgn;
    }

    /**
     * Sets the value of the unitPricSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Product6 setUnitPricSgn(Boolean value) {
        this.unitPricSgn = value;
        return this;
    }

    /**
     * Gets the value of the pdctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctAmt() {
        return pdctAmt;
    }

    /**
     * Sets the value of the pdctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Product6 setPdctAmt(BigDecimal value) {
        this.pdctAmt = value;
        return this;
    }

    /**
     * Gets the value of the pdctAmtSgn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdctAmtSgn() {
        return pdctAmtSgn;
    }

    /**
     * Sets the value of the pdctAmtSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Product6 setPdctAmtSgn(Boolean value) {
        this.pdctAmtSgn = value;
        return this;
    }

    /**
     * Gets the value of the valAddedTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValAddedTax() {
        return valAddedTax;
    }

    /**
     * Sets the value of the valAddedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Product6 setValAddedTax(BigDecimal value) {
        this.valAddedTax = value;
        return this;
    }

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setTaxTp(String value) {
        this.taxTp = value;
        return this;
    }

    /**
     * Gets the value of the pdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctDesc() {
        return pdctDesc;
    }

    /**
     * Sets the value of the pdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setPdctDesc(String value) {
        this.pdctDesc = value;
        return this;
    }

    /**
     * Gets the value of the dlvryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryLctn() {
        return dlvryLctn;
    }

    /**
     * Sets the value of the dlvryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setDlvryLctn(String value) {
        this.dlvryLctn = value;
        return this;
    }

    /**
     * Gets the value of the dlvrySvc property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext2Code }
     *     
     */
    public AttendanceContext2Code getDlvrySvc() {
        return dlvrySvc;
    }

    /**
     * Sets the value of the dlvrySvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext2Code }
     *     
     */
    public Product6 setDlvrySvc(AttendanceContext2Code value) {
        this.dlvrySvc = value;
        return this;
    }

    /**
     * Gets the value of the saleChanl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleChanl() {
        return saleChanl;
    }

    /**
     * Sets the value of the saleChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setSaleChanl(String value) {
        this.saleChanl = value;
        return this;
    }

    /**
     * Gets the value of the addtlPdctDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctDesc() {
        return addtlPdctDesc;
    }

    /**
     * Sets the value of the addtlPdctDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Product6 setAddtlPdctDesc(String value) {
        this.addtlPdctDesc = value;
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

}
