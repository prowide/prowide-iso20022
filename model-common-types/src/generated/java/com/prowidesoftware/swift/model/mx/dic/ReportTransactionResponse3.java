
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Content of the Transaction Report Response message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportTransactionResponse3", propOrder = {
    "rptFullSz",
    "blckStart",
    "blckStop",
    "txRpt"
})
public class ReportTransactionResponse3 {

    @XmlElement(name = "RptFullSz", required = true)
    protected BigDecimal rptFullSz;
    @XmlElement(name = "BlckStart", required = true)
    protected BigDecimal blckStart;
    @XmlElement(name = "BlckStop", required = true)
    protected BigDecimal blckStop;
    @XmlElement(name = "TxRpt")
    protected List<PointOfInteractionTransactionReport3> txRpt;

    /**
     * Gets the value of the rptFullSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRptFullSz() {
        return rptFullSz;
    }

    /**
     * Sets the value of the rptFullSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportTransactionResponse3 setRptFullSz(BigDecimal value) {
        this.rptFullSz = value;
        return this;
    }

    /**
     * Gets the value of the blckStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStart() {
        return blckStart;
    }

    /**
     * Sets the value of the blckStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportTransactionResponse3 setBlckStart(BigDecimal value) {
        this.blckStart = value;
        return this;
    }

    /**
     * Gets the value of the blckStop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlckStop() {
        return blckStop;
    }

    /**
     * Sets the value of the blckStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ReportTransactionResponse3 setBlckStop(BigDecimal value) {
        this.blckStop = value;
        return this;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionTransactionReport3 }
     * 
     * 
     */
    public List<PointOfInteractionTransactionReport3> getTxRpt() {
        if (txRpt == null) {
            txRpt = new ArrayList<PointOfInteractionTransactionReport3>();
        }
        return this.txRpt;
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
     * Adds a new item to the txRpt list.
     * @see #getTxRpt()
     * 
     */
    public ReportTransactionResponse3 addTxRpt(PointOfInteractionTransactionReport3 txRpt) {
        getTxRpt().add(txRpt);
        return this;
    }

}
