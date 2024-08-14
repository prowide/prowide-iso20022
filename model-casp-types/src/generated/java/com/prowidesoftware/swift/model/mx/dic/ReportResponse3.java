
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "ReportResponse3", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "rptTxRspn",
    "rptGetTtlsRspn",
    "rspn",
    "splmtryData"
})
public class ReportResponse3 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment75 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext28 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService7Code svcCntt;
    @XmlElement(name = "RptTxRspn")
    protected ReportTransactionResponse2 rptTxRspn;
    @XmlElement(name = "RptGetTtlsRspn")
    protected ReportGetTotalsResponse1 rptGetTtlsRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
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
    public ReportResponse3 setEnvt(CardPaymentEnvironment75 value) {
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
    public ReportResponse3 setCntxt(CardPaymentContext28 value) {
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
    public ReportResponse3 setSvcCntt(RetailerService7Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the rptTxRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTransactionResponse2 }
     *     
     */
    public ReportTransactionResponse2 getRptTxRspn() {
        return rptTxRspn;
    }

    /**
     * Sets the value of the rptTxRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTransactionResponse2 }
     *     
     */
    public ReportResponse3 setRptTxRspn(ReportTransactionResponse2 value) {
        this.rptTxRspn = value;
        return this;
    }

    /**
     * Gets the value of the rptGetTtlsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportGetTotalsResponse1 }
     *     
     */
    public ReportGetTotalsResponse1 getRptGetTtlsRspn() {
        return rptGetTtlsRspn;
    }

    /**
     * Sets the value of the rptGetTtlsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportGetTotalsResponse1 }
     *     
     */
    public ReportResponse3 setRptGetTtlsRspn(ReportGetTotalsResponse1 value) {
        this.rptGetTtlsRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public ReportResponse3 setRspn(ResponseType9 value) {
        this.rspn = value;
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
    public ReportResponse3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
