
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
 * Construct used by a central counterparty to define the size of the aggregate quantum of resources available from a clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvailableFinancialResourcesAmount2", propOrder = {
    "ttlInitlMrgn",
    "ttlPrfnddDfltFnd",
    "ccpSkinInTheGame",
    "othrDfltFndCntrbtn",
    "ufnddMmbCmmtmnt",
    "ufnddThrdPtyCmmtmnt"
})
public class AvailableFinancialResourcesAmount2 {

    @XmlElement(name = "TtlInitlMrgn", required = true)
    protected ActiveCurrencyAndAmount ttlInitlMrgn;
    @XmlElement(name = "TtlPrfnddDfltFnd", required = true)
    protected ActiveCurrencyAndAmount ttlPrfnddDfltFnd;
    @XmlElement(name = "CCPSkinInTheGame", required = true)
    protected List<ReportingAssetBreakdown2> ccpSkinInTheGame;
    @XmlElement(name = "OthrDfltFndCntrbtn", required = true)
    protected ActiveCurrencyAndAmount othrDfltFndCntrbtn;
    @XmlElement(name = "UfnddMmbCmmtmnt", required = true)
    protected ActiveCurrencyAndAmount ufnddMmbCmmtmnt;
    @XmlElement(name = "UfnddThrdPtyCmmtmnt", required = true)
    protected ActiveCurrencyAndAmount ufnddThrdPtyCmmtmnt;

    /**
     * Gets the value of the ttlInitlMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInitlMrgn() {
        return ttlInitlMrgn;
    }

    /**
     * Sets the value of the ttlInitlMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AvailableFinancialResourcesAmount2 setTtlInitlMrgn(ActiveCurrencyAndAmount value) {
        this.ttlInitlMrgn = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrfnddDfltFnd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlPrfnddDfltFnd() {
        return ttlPrfnddDfltFnd;
    }

    /**
     * Sets the value of the ttlPrfnddDfltFnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AvailableFinancialResourcesAmount2 setTtlPrfnddDfltFnd(ActiveCurrencyAndAmount value) {
        this.ttlPrfnddDfltFnd = value;
        return this;
    }

    /**
     * Gets the value of the ccpSkinInTheGame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccpSkinInTheGame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCCPSkinInTheGame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportingAssetBreakdown2 }
     * 
     * 
     */
    public List<ReportingAssetBreakdown2> getCCPSkinInTheGame() {
        if (ccpSkinInTheGame == null) {
            ccpSkinInTheGame = new ArrayList<ReportingAssetBreakdown2>();
        }
        return this.ccpSkinInTheGame;
    }

    /**
     * Gets the value of the othrDfltFndCntrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrDfltFndCntrbtn() {
        return othrDfltFndCntrbtn;
    }

    /**
     * Sets the value of the othrDfltFndCntrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AvailableFinancialResourcesAmount2 setOthrDfltFndCntrbtn(ActiveCurrencyAndAmount value) {
        this.othrDfltFndCntrbtn = value;
        return this;
    }

    /**
     * Gets the value of the ufnddMmbCmmtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfnddMmbCmmtmnt() {
        return ufnddMmbCmmtmnt;
    }

    /**
     * Sets the value of the ufnddMmbCmmtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AvailableFinancialResourcesAmount2 setUfnddMmbCmmtmnt(ActiveCurrencyAndAmount value) {
        this.ufnddMmbCmmtmnt = value;
        return this;
    }

    /**
     * Gets the value of the ufnddThrdPtyCmmtmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getUfnddThrdPtyCmmtmnt() {
        return ufnddThrdPtyCmmtmnt;
    }

    /**
     * Sets the value of the ufnddThrdPtyCmmtmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public AvailableFinancialResourcesAmount2 setUfnddThrdPtyCmmtmnt(ActiveCurrencyAndAmount value) {
        this.ufnddThrdPtyCmmtmnt = value;
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
     * Adds a new item to the cCPSkinInTheGame list.
     * @see #getCCPSkinInTheGame()
     * 
     */
    public AvailableFinancialResourcesAmount2 addCCPSkinInTheGame(ReportingAssetBreakdown2 cCPSkinInTheGame) {
        getCCPSkinInTheGame().add(cCPSkinInTheGame);
        return this;
    }

}
