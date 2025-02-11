
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
 * Information about outstanding derivatives, outstanding derivatives with no valuation and outstanding derivatives with outdated valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics27", propOrder = {
    "nbOfOutsdngDerivs",
    "nbOfOutsdngDerivsWthNoValtn",
    "nbOfOutsdngDerivsWthOutdtdValtn",
    "wrnngs"
})
public class DetailedTransactionStatistics27 {

    @XmlElement(name = "NbOfOutsdngDerivs", required = true)
    protected BigDecimal nbOfOutsdngDerivs;
    @XmlElement(name = "NbOfOutsdngDerivsWthNoValtn", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthNoValtn;
    @XmlElement(name = "NbOfOutsdngDerivsWthOutdtdValtn", required = true)
    protected BigDecimal nbOfOutsdngDerivsWthOutdtdValtn;
    @XmlElement(name = "Wrnngs", required = true)
    protected List<MissingValuationsData2> wrnngs;

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
    public DetailedTransactionStatistics27 setNbOfOutsdngDerivs(BigDecimal value) {
        this.nbOfOutsdngDerivs = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthNoValtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthNoValtn() {
        return nbOfOutsdngDerivsWthNoValtn;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthNoValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics27 setNbOfOutsdngDerivsWthNoValtn(BigDecimal value) {
        this.nbOfOutsdngDerivsWthNoValtn = value;
        return this;
    }

    /**
     * Gets the value of the nbOfOutsdngDerivsWthOutdtdValtn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOutsdngDerivsWthOutdtdValtn() {
        return nbOfOutsdngDerivsWthOutdtdValtn;
    }

    /**
     * Sets the value of the nbOfOutsdngDerivsWthOutdtdValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics27 setNbOfOutsdngDerivsWthOutdtdValtn(BigDecimal value) {
        this.nbOfOutsdngDerivsWthOutdtdValtn = value;
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
     * {@link MissingValuationsData2 }
     * 
     * 
     * @return
     *     The value of the wrnngs property.
     */
    public List<MissingValuationsData2> getWrnngs() {
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
    public DetailedTransactionStatistics27 addWrnngs(MissingValuationsData2 wrnngs) {
        getWrnngs().add(wrnngs);
        return this;
    }

}
