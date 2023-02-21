
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
 * Valuation information of the portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPortfolioValuation1", propOrder = {
    "ttlPrtflVal",
    "prvsTtlPrtflVal",
    "ttlPrtflValChng",
    "ttlBookVal",
    "prvsTtlBookVal",
    "ttlBookValChng",
    "ttlRcts",
    "ttlDsbrsmnts",
    "incmRcvd",
    "expnssPd",
    "urlsdGnOrLoss",
    "realsdGnOrLoss",
    "acrdIncm",
    "invstmtFndDtls"
})
public class TotalPortfolioValuation1 {

    @XmlElement(name = "TtlPrtflVal", required = true)
    protected AmountAndDirection30 ttlPrtflVal;
    @XmlElement(name = "PrvsTtlPrtflVal")
    protected AmountAndDirection30 prvsTtlPrtflVal;
    @XmlElement(name = "TtlPrtflValChng")
    protected AmountAndRate2 ttlPrtflValChng;
    @XmlElement(name = "TtlBookVal", required = true)
    protected AmountAndDirection30 ttlBookVal;
    @XmlElement(name = "PrvsTtlBookVal")
    protected AmountAndDirection30 prvsTtlBookVal;
    @XmlElement(name = "TtlBookValChng")
    protected AmountAndRate2 ttlBookValChng;
    @XmlElement(name = "TtlRcts")
    protected AmountAndDirection30 ttlRcts;
    @XmlElement(name = "TtlDsbrsmnts")
    protected AmountAndDirection30 ttlDsbrsmnts;
    @XmlElement(name = "IncmRcvd")
    protected AmountAndDirection30 incmRcvd;
    @XmlElement(name = "ExpnssPd")
    protected AmountAndDirection30 expnssPd;
    @XmlElement(name = "UrlsdGnOrLoss")
    protected AmountAndDirection31 urlsdGnOrLoss;
    @XmlElement(name = "RealsdGnOrLoss")
    protected AmountAndDirection31 realsdGnOrLoss;
    @XmlElement(name = "AcrdIncm")
    protected AmountAndDirection30 acrdIncm;
    @XmlElement(name = "InvstmtFndDtls")
    protected List<InvestmentFund1> invstmtFndDtls;

    /**
     * Gets the value of the ttlPrtflVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getTtlPrtflVal() {
        return ttlPrtflVal;
    }

    /**
     * Sets the value of the ttlPrtflVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setTtlPrtflVal(AmountAndDirection30 value) {
        this.ttlPrtflVal = value;
        return this;
    }

    /**
     * Gets the value of the prvsTtlPrtflVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getPrvsTtlPrtflVal() {
        return prvsTtlPrtflVal;
    }

    /**
     * Sets the value of the prvsTtlPrtflVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setPrvsTtlPrtflVal(AmountAndDirection30 value) {
        this.prvsTtlPrtflVal = value;
        return this;
    }

    /**
     * Gets the value of the ttlPrtflValChng property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRate2 }
     *     
     */
    public AmountAndRate2 getTtlPrtflValChng() {
        return ttlPrtflValChng;
    }

    /**
     * Sets the value of the ttlPrtflValChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRate2 }
     *     
     */
    public TotalPortfolioValuation1 setTtlPrtflValChng(AmountAndRate2 value) {
        this.ttlPrtflValChng = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getTtlBookVal() {
        return ttlBookVal;
    }

    /**
     * Sets the value of the ttlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setTtlBookVal(AmountAndDirection30 value) {
        this.ttlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the prvsTtlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getPrvsTtlBookVal() {
        return prvsTtlBookVal;
    }

    /**
     * Sets the value of the prvsTtlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setPrvsTtlBookVal(AmountAndDirection30 value) {
        this.prvsTtlBookVal = value;
        return this;
    }

    /**
     * Gets the value of the ttlBookValChng property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRate2 }
     *     
     */
    public AmountAndRate2 getTtlBookValChng() {
        return ttlBookValChng;
    }

    /**
     * Sets the value of the ttlBookValChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRate2 }
     *     
     */
    public TotalPortfolioValuation1 setTtlBookValChng(AmountAndRate2 value) {
        this.ttlBookValChng = value;
        return this;
    }

    /**
     * Gets the value of the ttlRcts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getTtlRcts() {
        return ttlRcts;
    }

    /**
     * Sets the value of the ttlRcts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setTtlRcts(AmountAndDirection30 value) {
        this.ttlRcts = value;
        return this;
    }

    /**
     * Gets the value of the ttlDsbrsmnts property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getTtlDsbrsmnts() {
        return ttlDsbrsmnts;
    }

    /**
     * Sets the value of the ttlDsbrsmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setTtlDsbrsmnts(AmountAndDirection30 value) {
        this.ttlDsbrsmnts = value;
        return this;
    }

    /**
     * Gets the value of the incmRcvd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getIncmRcvd() {
        return incmRcvd;
    }

    /**
     * Sets the value of the incmRcvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setIncmRcvd(AmountAndDirection30 value) {
        this.incmRcvd = value;
        return this;
    }

    /**
     * Gets the value of the expnssPd property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getExpnssPd() {
        return expnssPd;
    }

    /**
     * Sets the value of the expnssPd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setExpnssPd(AmountAndDirection30 value) {
        this.expnssPd = value;
        return this;
    }

    /**
     * Gets the value of the urlsdGnOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public AmountAndDirection31 getUrlsdGnOrLoss() {
        return urlsdGnOrLoss;
    }

    /**
     * Sets the value of the urlsdGnOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public TotalPortfolioValuation1 setUrlsdGnOrLoss(AmountAndDirection31 value) {
        this.urlsdGnOrLoss = value;
        return this;
    }

    /**
     * Gets the value of the realsdGnOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public AmountAndDirection31 getRealsdGnOrLoss() {
        return realsdGnOrLoss;
    }

    /**
     * Sets the value of the realsdGnOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public TotalPortfolioValuation1 setRealsdGnOrLoss(AmountAndDirection31 value) {
        this.realsdGnOrLoss = value;
        return this;
    }

    /**
     * Gets the value of the acrdIncm property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public AmountAndDirection30 getAcrdIncm() {
        return acrdIncm;
    }

    /**
     * Sets the value of the acrdIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection30 }
     *     
     */
    public TotalPortfolioValuation1 setAcrdIncm(AmountAndDirection30 value) {
        this.acrdIncm = value;
        return this;
    }

    /**
     * Gets the value of the invstmtFndDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstmtFndDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstmtFndDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFund1 }
     * 
     * 
     */
    public List<InvestmentFund1> getInvstmtFndDtls() {
        if (invstmtFndDtls == null) {
            invstmtFndDtls = new ArrayList<InvestmentFund1>();
        }
        return this.invstmtFndDtls;
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
     * Adds a new item to the invstmtFndDtls list.
     * @see #getInvstmtFndDtls()
     * 
     */
    public TotalPortfolioValuation1 addInvstmtFndDtls(InvestmentFund1 invstmtFndDtls) {
        getInvstmtFndDtls().add(invstmtFndDtls);
        return this;
    }

}
