
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identification of security used as collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security3", propOrder = {
    "id",
    "clssfctnTp",
    "qtyOrNmnlVal",
    "unitPric",
    "mktVal",
    "hrcutOrMrgn",
    "qlty",
    "mtrty",
    "issr",
    "tp",
    "avlblForCollReuse"
})
public class Security3 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ClssfctnTp")
    protected String clssfctnTp;
    @XmlElement(name = "QtyOrNmnlVal")
    protected QuantityNominalValue1Choice qtyOrNmnlVal;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice2Choice unitPric;
    @XmlElement(name = "MktVal")
    protected BigDecimal mktVal;
    @XmlElement(name = "HrcutOrMrgn")
    protected BigDecimal hrcutOrMrgn;
    @XmlElement(name = "Qlty")
    @XmlSchemaType(name = "string")
    protected CollateralQualityType1Code qlty;
    @XmlElement(name = "Mtrty")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrty;
    @XmlElement(name = "Issr")
    protected SecurityIssuer1 issr;
    @XmlElement(name = "Tp")
    protected SecuritiesLendingType3Choice tp;
    @XmlElement(name = "AvlblForCollReuse")
    protected Boolean avlblForCollReuse;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Security3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Security3 setClssfctnTp(String value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the qtyOrNmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNominalValue1Choice }
     *     
     */
    public QuantityNominalValue1Choice getQtyOrNmnlVal() {
        return qtyOrNmnlVal;
    }

    /**
     * Sets the value of the qtyOrNmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNominalValue1Choice }
     *     
     */
    public Security3 setQtyOrNmnlVal(QuantityNominalValue1Choice value) {
        this.qtyOrNmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public Security3 setUnitPric(SecuritiesTransactionPrice2Choice value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Security3 setMktVal(BigDecimal value) {
        this.mktVal = value;
        return this;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Security3 setHrcutOrMrgn(BigDecimal value) {
        this.hrcutOrMrgn = value;
        return this;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public CollateralQualityType1Code getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralQualityType1Code }
     *     
     */
    public Security3 setQlty(CollateralQualityType1Code value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Security3 setMtrty(XMLGregorianCalendar value) {
        this.mtrty = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIssuer1 }
     *     
     */
    public SecurityIssuer1 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIssuer1 }
     *     
     */
    public Security3 setIssr(SecurityIssuer1 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public SecuritiesLendingType3Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesLendingType3Choice }
     *     
     */
    public Security3 setTp(SecuritiesLendingType3Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the avlblForCollReuse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvlblForCollReuse() {
        return avlblForCollReuse;
    }

    /**
     * Sets the value of the avlblForCollReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Security3 setAvlblForCollReuse(Boolean value) {
        this.avlblForCollReuse = value;
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
