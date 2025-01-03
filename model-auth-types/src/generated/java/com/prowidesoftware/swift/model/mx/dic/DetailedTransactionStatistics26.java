
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
 * Information about outstanding derivatives, outstanding derivatives with no margin and outstanding derivatives with outdated margin.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics26", propOrder = {
    "nbOfOutsdngDerivs",
    "nbOfOutsdngDerivsWthNoMrgnInf",
    "nbOfOutsdngDerivsWthOutdtdMrgnInf",
    "wrnngs"
})
public class DetailedTransactionStatistics26 {

    @XmlElement(name = "NbOfOutsdngDerivs", required = true)
    protected BigDecimal nbOfOutsdngDerivs;
    @XmlElement(name = "NbOfOutsdngDerivsWthNoMrgnInf", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthNoMrgnInf;
    @XmlElement(name = "NbOfOutsdngDerivsWthOutdtdMrgnInf", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthOutdtdMrgnInf;
    @XmlElement(name = "Wrnngs", required = true)
    protected List<MissingMarginData2> wrnngs;

    /**
     * Gets the value of the nbOfOutsdngDerivs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivs() {
        return nbOfOutsdngDerivs;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics26 setNbOfOutsdngDerivs(BigDecimal value) {
        this.nbOfOutsdngDerivs = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthNoMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthNoMrgnInf() {
        return nbOfOutsdngDerivsWthNoMrgnInf;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthNoMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics26 setNbOfOutsdngDerivsWthNoMrgnInf(BigDecimal value) {
        this.nbOfOutsdngDerivsWthNoMrgnInf = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthOutdtdMrgnInf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthOutdtdMrgnInf() {
        return nbOfOutsdngDerivsWthOutdtdMrgnInf;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthOutdtdMrgnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics26 setNbOfOutsdngDerivsWthOutdtdMrgnInf(BigDecimal value) {
        this.nbOfOutsdngDerivsWthOutdtdMrgnInf = value;
        return this;
    }

    /**
     * Gets the value of the wrnngs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrnngs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrnngs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingMarginData2 }
     * 
     * 
     * @return
     *     The value of the wrnngs property.
     */
    public List<MissingMarginData2> getWrnngs() {
        if (wrnngs == null) {
            wrnngs = new ArrayList<>();
        }
        return this.wrnngs;
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
     * Adds a new item to the wrnngs list.
     * @see #getWrnngs()
     * 
     */
    public DetailedTransactionStatistics26 addWrnngs(MissingMarginData2 wrnngs) {
        getWrnngs().add(wrnngs);
        return this;
    }

}
