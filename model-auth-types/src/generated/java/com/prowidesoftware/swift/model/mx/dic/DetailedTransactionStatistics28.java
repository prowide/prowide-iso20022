
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
 * Information about reported derivatives and reported derivatives with outliers.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics28", propOrder = {
    "nbOfDerivsRptd",
    "nbOfDerivsRptdWthOtlrs",
    "wrnngs"
})
public class DetailedTransactionStatistics28 {

    @XmlElement(name = "NbOfDerivsRptd", required = true)
    protected BigDecimal nbOfDerivsRptd;
    @XmlElement(name = "NbOfDerivsRptdWthOtlrs", required = true)
    protected BigDecimal nbOfDerivsRptdWthOtlrs;
    @XmlElement(name = "Wrnngs", required = true)
    protected List<AbnormalValuesData4> wrnngs;

    /**
     * Gets the value of the nbOfDerivsRptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptd() {
        return nbOfDerivsRptd;
    }

    /**
     * Sets the value of the nbOfDerivsRptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics28 setNbOfDerivsRptd(BigDecimal value) {
        this.nbOfDerivsRptd = value;
        return this;
    }

    /**
     * Gets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDerivsRptdWthOtlrs() {
        return nbOfDerivsRptdWthOtlrs;
    }

    /**
     * Sets the value of the nbOfDerivsRptdWthOtlrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DetailedTransactionStatistics28 setNbOfDerivsRptdWthOtlrs(BigDecimal value) {
        this.nbOfDerivsRptdWthOtlrs = value;
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
     * {@link AbnormalValuesData4 }
     * 
     * 
     * @return
     *     The value of the wrnngs property.
     */
    public List<AbnormalValuesData4> getWrnngs() {
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
    public DetailedTransactionStatistics28 addWrnngs(AbnormalValuesData4 wrnngs) {
        getWrnngs().add(wrnngs);
        return this;
    }

}
