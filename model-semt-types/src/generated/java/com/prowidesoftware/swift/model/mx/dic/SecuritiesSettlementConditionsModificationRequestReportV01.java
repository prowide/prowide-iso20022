
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The SecuritiesSettlementConditionsModificationRequestReport message is sent from a settlement infrastructure to an account owner/requestor to provide full details or current status values of the settlement or intra-position movement modification request(s), as defined within the query. 
 * 
 * The message may also be used to: 
 * - re-send a message previously sent (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementConditionsModificationRequestReportV01", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "mods"
})
public class SecuritiesSettlementConditionsModificationRequestReportV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected SecuritiesTransactionReport51 rptGnlDtls;
    @XmlElement(name = "Mods")
    protected List<SecuritiesModification11> mods;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequestReportV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReport51 }
     *     
     */
    public SecuritiesTransactionReport51 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReport51 }
     *     
     */
    public SecuritiesSettlementConditionsModificationRequestReportV01 setRptGnlDtls(SecuritiesTransactionReport51 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the mods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesModification11 }
     * 
     * 
     * @return
     *     The value of the mods property.
     */
    public List<SecuritiesModification11> getMods() {
        if (mods == null) {
            mods = new ArrayList<>();
        }
        return this.mods;
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
     * Adds a new item to the mods list.
     * @see #getMods()
     * 
     */
    public SecuritiesSettlementConditionsModificationRequestReportV01 addMods(SecuritiesModification11 mods) {
        getMods().add(mods);
        return this;
    }

}
