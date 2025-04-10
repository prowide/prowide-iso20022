
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
 * Specifies the type of session management service to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionManagementRequest7", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "lgnReq",
    "lgtReq",
    "dgnssReq",
    "splmtryData"
})
public class SessionManagementRequest7 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment80 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService4Code svcCntt;
    @XmlElement(name = "LgnReq")
    protected LoginRequest6 lgnReq;
    @XmlElement(name = "LgtReq")
    protected LogoutRequest1 lgtReq;
    @XmlElement(name = "DgnssReq")
    protected DiagnosisRequest1 dgnssReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CardPaymentEnvironment80 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public SessionManagementRequest7 setEnvt(CardPaymentEnvironment80 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public SessionManagementRequest7 setCntxt(CardPaymentContext30 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService4Code }
     *     
     */
    public RetailerService4Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService4Code }
     *     
     */
    public SessionManagementRequest7 setSvcCntt(RetailerService4Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the lgnReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoginRequest6 }
     *     
     */
    public LoginRequest6 getLgnReq() {
        return lgnReq;
    }

    /**
     * Sets the value of the lgnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginRequest6 }
     *     
     */
    public SessionManagementRequest7 setLgnReq(LoginRequest6 value) {
        this.lgnReq = value;
        return this;
    }

    /**
     * Gets the value of the lgtReq property.
     * 
     * @return
     *     possible object is
     *     {@link LogoutRequest1 }
     *     
     */
    public LogoutRequest1 getLgtReq() {
        return lgtReq;
    }

    /**
     * Sets the value of the lgtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LogoutRequest1 }
     *     
     */
    public SessionManagementRequest7 setLgtReq(LogoutRequest1 value) {
        this.lgtReq = value;
        return this;
    }

    /**
     * Gets the value of the dgnssReq property.
     * 
     * @return
     *     possible object is
     *     {@link DiagnosisRequest1 }
     *     
     */
    public DiagnosisRequest1 getDgnssReq() {
        return dgnssReq;
    }

    /**
     * Sets the value of the dgnssReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosisRequest1 }
     *     
     */
    public SessionManagementRequest7 setDgnssReq(DiagnosisRequest1 value) {
        this.dgnssReq = value;
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
    public SessionManagementRequest7 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
