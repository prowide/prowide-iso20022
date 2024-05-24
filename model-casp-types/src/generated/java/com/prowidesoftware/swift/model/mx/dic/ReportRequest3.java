
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * This component define the environment, the context and the services to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest3", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "rptTxReq",
    "rptGetTtlsReq",
    "splmtryData"
})
public class ReportRequest3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment75 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext28 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService6Code svcCntt;
    @XmlElement(name = "RptTxReq")
    protected ReportTransactionRequest1 rptTxReq;
    @XmlElement(name = "RptGetTtlsReq")
    protected ReportGetTotalsRequest1 rptGetTtlsReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public CardPaymentEnvironment75 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public ReportRequest3 setEnvt(CardPaymentEnvironment75 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public CardPaymentContext28 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public ReportRequest3 setCntxt(CardPaymentContext28 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService6Code }
     *     
     */
    public RetailerService6Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService6Code }
     *     
     */
    public ReportRequest3 setSvcCntt(RetailerService6Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the rptTxReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTransactionRequest1 }
     *     
     */
    public ReportTransactionRequest1 getRptTxReq() {
        return rptTxReq;
    }

    /**
     * Sets the value of the rptTxReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTransactionRequest1 }
     *     
     */
    public ReportRequest3 setRptTxReq(ReportTransactionRequest1 value) {
        this.rptTxReq = value;
        return this;
    }

    /**
     * Gets the value of the rptGetTtlsReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportGetTotalsRequest1 }
     *     
     */
    public ReportGetTotalsRequest1 getRptGetTtlsReq() {
        return rptGetTtlsReq;
    }

    /**
     * Sets the value of the rptGetTtlsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportGetTotalsRequest1 }
     *     
     */
    public ReportRequest3 setRptGetTtlsReq(ReportGetTotalsRequest1 value) {
        this.rptGetTtlsReq = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public ReportRequest3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
