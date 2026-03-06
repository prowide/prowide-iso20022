
package com.prowidesoftware.swift.model.mx.dic;

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
 * The IntraPositionMovementQueryResponse message is sent from a settlement infrastructure to an account owner/requestor to provide all intra-position movement instructions satisfying the selection criteria, as defined within the query, returning current attributes and latest status.
 * The message may also be used to: 
 * - re-send a message sent by the account owner to the account servicer (the sub-function of the message is "Duplicate") 
 * - provide a third party with a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy") 
 * - re-send to a third party a copy of a message being sent by the account owner for information (the sub-function of the message is "Copy Duplicate").
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovementQueryResponseV01", propOrder = {
    "pgntn",
    "rptGnlDtls",
    "mvmnts"
})
public class IntraPositionMovementQueryResponseV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RptGnlDtls", required = true)
    protected IntraPositionReport41 rptGnlDtls;
    @XmlElement(name = "Mvmnts")
    protected List<IntraPositionMovements41> mvmnts;

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
    public IntraPositionMovementQueryResponseV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the rptGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionReport41 }
     *     
     */
    public IntraPositionReport41 getRptGnlDtls() {
        return rptGnlDtls;
    }

    /**
     * Sets the value of the rptGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionReport41 }
     *     
     */
    public IntraPositionMovementQueryResponseV01 setRptGnlDtls(IntraPositionReport41 value) {
        this.rptGnlDtls = value;
        return this;
    }

    /**
     * Gets the value of the mvmnts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mvmnts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmnts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntraPositionMovements41 }
     * 
     * 
     * @return
     *     The value of the mvmnts property.
     */
    public List<IntraPositionMovements41> getMvmnts() {
        if (mvmnts == null) {
            mvmnts = new ArrayList<>();
        }
        return this.mvmnts;
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
     * Adds a new item to the mvmnts list.
     * @see #getMvmnts()
     * 
     */
    public IntraPositionMovementQueryResponseV01 addMvmnts(IntraPositionMovements41 mvmnts) {
        getMvmnts().add(mvmnts);
        return this;
    }

}
