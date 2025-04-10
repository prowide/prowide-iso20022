
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Item purchased with the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleItem2", propOrder = {
    "pdctTp",
    "pdctCd",
    "pdctCdTp",
    "addtlPdctCd",
    "addtlPdctCdTp",
    "pdctCdModfr",
    "pdctDesc",
    "unitOfMeasr",
    "othrUnitOfMeasr",
    "pdctQty",
    "nonAdjstdUnitPric",
    "nonAdjstdTtlAmt",
    "adjstmnt",
    "adjstdAmt",
    "insrncInd",
    "insrncAmt",
    "tax",
    "ttlAmt"
})
public class SaleItem2 {

    @XmlElement(name = "PdctTp")
    protected String pdctTp;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "PdctCdTp")
    @XmlSchemaType(name = "string")
    protected ProductCodeType1Code pdctCdTp;
    @XmlElement(name = "AddtlPdctCd")
    protected String addtlPdctCd;
    @XmlElement(name = "AddtlPdctCdTp")
    protected String addtlPdctCdTp;
    @XmlElement(name = "PdctCdModfr")
    protected BigDecimal pdctCdModfr;
    @XmlElement(name = "PdctDesc")
    protected String pdctDesc;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "NonAdjstdUnitPric")
    protected BigDecimal nonAdjstdUnitPric;
    @XmlElement(name = "NonAdjstdTtlAmt")
    protected BigDecimal nonAdjstdTtlAmt;
    @XmlElement(name = "Adjstmnt")
    protected List<Adjustment10> adjstmnt;
    @XmlElement(name = "AdjstdAmt")
    protected BigDecimal adjstdAmt;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "Tax")
    protected List<Tax33> tax;
    @XmlElement(name = "TtlAmt")
    protected BigDecimal ttlAmt;

    /**
     * Gets the value of the pdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctTp() {
        return pdctTp;
    }

    /**
     * Sets the value of the pdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleItem2 setPdctTp(String value) {
        this.pdctTp = value;
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
    public SaleItem2 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctCdTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCodeType1Code }
     *     
     */
    public ProductCodeType1Code getPdctCdTp() {
        return pdctCdTp;
    }

    /**
     * Sets the value of the pdctCdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCodeType1Code }
     *     
     */
    public SaleItem2 setPdctCdTp(ProductCodeType1Code value) {
        this.pdctCdTp = value;
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
    public SaleItem2 setAddtlPdctCd(String value) {
        this.addtlPdctCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlPdctCdTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlPdctCdTp() {
        return addtlPdctCdTp;
    }

    /**
     * Sets the value of the addtlPdctCdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SaleItem2 setAddtlPdctCdTp(String value) {
        this.addtlPdctCdTp = value;
        return this;
    }

    /**
     * Gets the value of the pdctCdModfr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctCdModfr() {
        return pdctCdModfr;
    }

    /**
     * Sets the value of the pdctCdModfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SaleItem2 setPdctCdModfr(BigDecimal value) {
        this.pdctCdModfr = value;
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
    public SaleItem2 setPdctDesc(String value) {
        this.pdctDesc = value;
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
    public SaleItem2 setUnitOfMeasr(UnitOfMeasure1Code value) {
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
    public SaleItem2 setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
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
    public SaleItem2 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the nonAdjstdUnitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAdjstdUnitPric() {
        return nonAdjstdUnitPric;
    }

    /**
     * Sets the value of the nonAdjstdUnitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SaleItem2 setNonAdjstdUnitPric(BigDecimal value) {
        this.nonAdjstdUnitPric = value;
        return this;
    }

    /**
     * Gets the value of the nonAdjstdTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNonAdjstdTtlAmt() {
        return nonAdjstdTtlAmt;
    }

    /**
     * Sets the value of the nonAdjstdTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SaleItem2 setNonAdjstdTtlAmt(BigDecimal value) {
        this.nonAdjstdTtlAmt = value;
        return this;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Adjustment10 }
     * 
     * 
     */
    public List<Adjustment10> getAdjstmnt() {
        if (adjstmnt == null) {
            adjstmnt = new ArrayList<Adjustment10>();
        }
        return this.adjstmnt;
    }

    /**
     * Gets the value of the adjstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstdAmt() {
        return adjstdAmt;
    }

    /**
     * Sets the value of the adjstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public SaleItem2 setAdjstdAmt(BigDecimal value) {
        this.adjstdAmt = value;
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
    public SaleItem2 setInsrncInd(Boolean value) {
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
    public SaleItem2 setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
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
     */
    public List<Tax33> getTax() {
        if (tax == null) {
            tax = new ArrayList<Tax33>();
        }
        return this.tax;
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
    public SaleItem2 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
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
     * Adds a new item to the adjstmnt list.
     * @see #getAdjstmnt()
     * 
     */
    public SaleItem2 addAdjstmnt(Adjustment10 adjstmnt) {
        getAdjstmnt().add(adjstmnt);
        return this;
    }

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public SaleItem2 addTax(Tax33 tax) {
        getTax().add(tax);
        return this;
    }

}
