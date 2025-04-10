
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
 * Provides the details of the header for a trade transaction query message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReportHeader4", propOrder = {
    "rptExctnDt",
    "msgPgntn",
    "nbRcrds",
    "cmptntAuthrty",
    "newTradRpstryIdr",
    "rptgPurp"
})
public class TradeReportHeader4 {

    @XmlElement(name = "RptExctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rptExctnDt;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;
    @XmlElement(name = "NbRcrds", required = true)
    protected BigDecimal nbRcrds;
    @XmlElement(name = "CmptntAuthrty")
    protected List<String> cmptntAuthrty;
    @XmlElement(name = "NewTradRpstryIdr")
    protected OrganisationIdentification15Choice newTradRpstryIdr;
    @XmlElement(name = "RptgPurp")
    protected List<String> rptgPurp;

    /**
     * Gets the value of the rptExctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRptExctnDt() {
        return rptExctnDt;
    }

    /**
     * Sets the value of the rptExctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeReportHeader4 setRptExctnDt(LocalDate value) {
        this.rptExctnDt = value;
        return this;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public TradeReportHeader4 setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
        return this;
    }

    /**
     * Gets the value of the nbRcrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbRcrds() {
        return nbRcrds;
    }

    /**
     * Sets the value of the nbRcrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TradeReportHeader4 setNbRcrds(BigDecimal value) {
        this.nbRcrds = value;
        return this;
    }

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmptntAuthrty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmptntAuthrty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cmptntAuthrty property.
     */
    public List<String> getCmptntAuthrty() {
        if (cmptntAuthrty == null) {
            cmptntAuthrty = new ArrayList<>();
        }
        return this.cmptntAuthrty;
    }

    /**
     * Gets the value of the newTradRpstryIdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNewTradRpstryIdr() {
        return newTradRpstryIdr;
    }

    /**
     * Sets the value of the newTradRpstryIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeReportHeader4 setNewTradRpstryIdr(OrganisationIdentification15Choice value) {
        this.newTradRpstryIdr = value;
        return this;
    }

    /**
     * Gets the value of the rptgPurp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptgPurp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptgPurp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rptgPurp property.
     */
    public List<String> getRptgPurp() {
        if (rptgPurp == null) {
            rptgPurp = new ArrayList<>();
        }
        return this.rptgPurp;
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
     * Adds a new item to the cmptntAuthrty list.
     * @see #getCmptntAuthrty()
     * 
     */
    public TradeReportHeader4 addCmptntAuthrty(String cmptntAuthrty) {
        getCmptntAuthrty().add(cmptntAuthrty);
        return this;
    }

    /**
     * Adds a new item to the rptgPurp list.
     * @see #getRptgPurp()
     * 
     */
    public TradeReportHeader4 addRptgPurp(String rptgPurp) {
        getRptgPurp().add(rptgPurp);
        return this;
    }

}
