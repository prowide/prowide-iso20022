
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
 * Information related to the non financial request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialRequestComponent2", propOrder = {
    "envt",
    "cntxt",
    "nonFinReqCntt",
    "splmtryData"
})
public class NonFinancialRequestComponent2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment78 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext29 cntxt;
    @XmlElement(name = "NonFinReqCntt", required = true)
    protected NonFinancialRequestContentComponent2 nonFinReqCntt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public CardPaymentEnvironment78 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public NonFinancialRequestComponent2 setEnvt(CardPaymentEnvironment78 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public CardPaymentContext29 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public NonFinancialRequestComponent2 setCntxt(CardPaymentContext29 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the nonFinReqCntt property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialRequestContentComponent2 }
     *     
     */
    public NonFinancialRequestContentComponent2 getNonFinReqCntt() {
        return nonFinReqCntt;
    }

    /**
     * Sets the value of the nonFinReqCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialRequestContentComponent2 }
     *     
     */
    public NonFinancialRequestComponent2 setNonFinReqCntt(NonFinancialRequestContentComponent2 value) {
        this.nonFinReqCntt = value;
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
    public NonFinancialRequestComponent2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
