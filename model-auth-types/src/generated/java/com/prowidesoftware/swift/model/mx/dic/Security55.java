
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
 * Data specific to securities being subject to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security55", propOrder = {
    "id",
    "clssfctnTp",
    "qtyOrNmnlVal",
    "unitPric",
    "mktVal",
    "qlty",
    "mtrty",
    "issr",
    "tp",
    "exclsvArrgmnt",
    "avlblForCollReuse",
    "hrcutOrMrgn"
})
public class Security55 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ClssfctnTp")
    protected String clssfctnTp;
    @XmlElement(name = "QtyOrNmnlVal")
    protected QuantityNominalValue2Choice qtyOrNmnlVal;
    @XmlElement(name = "UnitPric")
    protected SecuritiesTransactionPrice19Choice unitPric;
    @XmlElement(name = "MktVal")
    protected AmountAndDirection53 mktVal;
    @XmlElement(name = "Qlty")
    @XmlSchemaType(name = "string")
    protected CollateralQualityType1Code qlty;
    @XmlElement(name = "Mtrty", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrty;
    @XmlElement(name = "Issr")
    protected SecurityIssuer4 issr;
    @XmlElement(name = "Tp")
    protected List<SecuritiesLendingType3Choice> tp;
    @XmlElement(name = "ExclsvArrgmnt")
    protected Boolean exclsvArrgmnt;
    @XmlElement(name = "AvlblForCollReuse")
    protected Boolean avlblForCollReuse;
    @XmlElement(name = "HrcutOrMrgn")
    protected BigDecimal hrcutOrMrgn;

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
    public Security55 setId(String value) {
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
    public Security55 setClssfctnTp(String value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the qtyOrNmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public QuantityNominalValue2Choice getQtyOrNmnlVal() {
        return qtyOrNmnlVal;
    }

    /**
     * Sets the value of the qtyOrNmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityNominalValue2Choice }
     *     
     */
    public Security55 setQtyOrNmnlVal(QuantityNominalValue2Choice value) {
        this.qtyOrNmnlVal = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public SecuritiesTransactionPrice19Choice getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice19Choice }
     *     
     */
    public Security55 setUnitPric(SecuritiesTransactionPrice19Choice value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public Security55 setMktVal(AmountAndDirection53 value) {
        this.mktVal = value;
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
    public Security55 setQlty(CollateralQualityType1Code value) {
        this.qlty = value;
        return this;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Security55 setMtrty(LocalDate value) {
        this.mtrty = value;
        return this;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIssuer4 }
     *     
     */
    public SecurityIssuer4 getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIssuer4 }
     *     
     */
    public Security55 setIssr(SecurityIssuer4 value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesLendingType3Choice }
     * 
     * 
     * @return
     *     The value of the tp property.
     */
    public List<SecuritiesLendingType3Choice> getTp() {
        if (tp == null) {
            tp = new ArrayList<>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Security55 setExclsvArrgmnt(Boolean value) {
        this.exclsvArrgmnt = value;
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
    public Security55 setAvlblForCollReuse(Boolean value) {
        this.avlblForCollReuse = value;
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
    public Security55 setHrcutOrMrgn(BigDecimal value) {
        this.hrcutOrMrgn = value;
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
     * Adds a new item to the tp list.
     * @see #getTp()
     * 
     */
    public Security55 addTp(SecuritiesLendingType3Choice tp) {
        getTp().add(tp);
        return this;
    }

}
