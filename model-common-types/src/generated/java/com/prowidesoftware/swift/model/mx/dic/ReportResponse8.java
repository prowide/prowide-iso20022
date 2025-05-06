
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
 * Specifies the environment, the context and the services to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResponse8", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "rptTxRspn",
    "rptGetTtlsRspn",
    "rspn",
    "splmtryData"
})
public class ReportResponse8 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment81 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected PaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService7Code svcCntt;
    @XmlElement(name = "RptTxRspn")
    protected ReportTransactionResponse7 rptTxRspn;
    @XmlElement(name = "RptGetTtlsRspn")
    protected ReportGetTotalsResponse2 rptGetTtlsRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment81 }
     *     
     */
    public CardPaymentEnvironment81 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment81 }
     *     
     */
    public ReportResponse8 setEnvt(CardPaymentEnvironment81 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext30 }
     *     
     */
    public PaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext30 }
     *     
     */
    public ReportResponse8 setCntxt(PaymentContext30 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService7Code }
     *     
     */
    public RetailerService7Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService7Code }
     *     
     */
    public ReportResponse8 setSvcCntt(RetailerService7Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the rptTxRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTransactionResponse7 }
     *     
     */
    public ReportTransactionResponse7 getRptTxRspn() {
        return rptTxRspn;
    }

    /**
     * Sets the value of the rptTxRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTransactionResponse7 }
     *     
     */
    public ReportResponse8 setRptTxRspn(ReportTransactionResponse7 value) {
        this.rptTxRspn = value;
        return this;
    }

    /**
     * Gets the value of the rptGetTtlsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportGetTotalsResponse2 }
     *     
     */
    public ReportGetTotalsResponse2 getRptGetTtlsRspn() {
        return rptGetTtlsRspn;
    }

    /**
     * Sets the value of the rptGetTtlsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportGetTotalsResponse2 }
     *     
     */
    public ReportResponse8 setRptGetTtlsRspn(ReportGetTotalsResponse2 value) {
        this.rptGetTtlsRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public ReportResponse8 setRspn(ResponseType11 value) {
        this.rspn = value;
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
    public ReportResponse8 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
