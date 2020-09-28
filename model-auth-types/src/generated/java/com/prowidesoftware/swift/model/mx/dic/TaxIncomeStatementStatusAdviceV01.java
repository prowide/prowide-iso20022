
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
 * The TaxIncomeStatementStatusAdvice message is sent by the participant to the market infrastructure to provide the status of the tax income statement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeStatementStatusAdviceV01", propOrder = {
    "hdr",
    "orgnlBizRpt",
    "sts",
    "splmtryData"
})
public class TaxIncomeStatementStatusAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected TaxIncomeHeader1 hdr;
    @XmlElement(name = "OrgnlBizRpt", required = true)
    protected OriginalBusinessReport1 orgnlBizRpt;
    @XmlElement(name = "Sts", required = true)
    protected TaxIncomeStatus1Choice sts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeHeader1 }
     *     
     */
    public TaxIncomeHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeHeader1 }
     *     
     */
    public TaxIncomeStatementStatusAdviceV01 setHdr(TaxIncomeHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBizRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessReport1 }
     *     
     */
    public OriginalBusinessReport1 getOrgnlBizRpt() {
        return orgnlBizRpt;
    }

    /**
     * Sets the value of the orgnlBizRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessReport1 }
     *     
     */
    public TaxIncomeStatementStatusAdviceV01 setOrgnlBizRpt(OriginalBusinessReport1 value) {
        this.orgnlBizRpt = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIncomeStatus1Choice }
     *     
     */
    public TaxIncomeStatus1Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIncomeStatus1Choice }
     *     
     */
    public TaxIncomeStatementStatusAdviceV01 setSts(TaxIncomeStatus1Choice value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TaxIncomeStatementStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
